import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class xulyanh extends JFrame {
    private JLabel imageLabel;
    private BufferedImage image;

    public xulyanh() {
        setTitle("Image Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        JScrollPane scrollPane = new JScrollPane(imageLabel);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save As");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        JMenu viewMenu = new JMenu("View");
        JMenuItem zoomInMenuItem = new JMenuItem("Zoom In");
        JMenuItem zoomOutMenuItem = new JMenuItem("Zoom Out");

        viewMenu.add(zoomInMenuItem);
        viewMenu.add(zoomOutMenuItem);
        menuBar.add(viewMenu);

        JMenu processMenu = new JMenu("Process");
        JMenuItem edgeDetectionMenuItem = new JMenuItem("Edge Detection (Laplacian)");
        JMenuItem brightnessBalanceMenuItem = new JMenuItem("Brightness Balance");

        processMenu.add(edgeDetectionMenuItem);
        processMenu.add(brightnessBalanceMenuItem);
        menuBar.add(processMenu);

        setJMenuBar(menuBar);

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(xulyanh.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        image = ImageIO.read(selectedFile);
                        ImageIcon icon = new ImageIcon(image);
                        imageLabel.setIcon(icon);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        zoomInMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zoomImage(1.1); // Thu phóng với tỷ lệ 1.1
            }
        });

        zoomOutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zoomImage(0.9); // Thu phóng với tỷ lệ 0.9
            }
        });

        // Thêm xử lý sự kiện cho con lăn chuột
        scrollPane.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.getWheelRotation() < 0) {
                    zoomImage(1.5); // Nếu con lăn lên, thu phóng vào ảnh
                } else {
                    zoomImage(0.5); // Nếu con lăn xuống, thu phóng ra khỏi ảnh
                }
            }
        });

        edgeDetectionMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (image != null) {
                    BufferedImage resultImage = detectEdgesLaplacian(image);
                    ImageIcon icon = new ImageIcon(resultImage);
                    imageLabel.setIcon(icon);
                }
            }
        });

        brightnessBalanceMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (image != null) {
                    BufferedImage resultImage = balanceBrightness(image);
                    ImageIcon icon = new ImageIcon(resultImage);
                    imageLabel.setIcon(icon);
                }
            }
        });
    }

    private void zoomImage(double factor) {
        if (image != null) {
            int newWidth = (int) (image.getWidth() * factor);
            int newHeight = (int) (image.getHeight() * factor);
            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        }
    }

    private BufferedImage detectEdgesLaplacian(BufferedImage originalImage) {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        BufferedImage resultImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Laplacian filter
        int[][] laplacianKernel = {
                {-1, -1, -1},
                {-1, 8, -1},
                {-1, -1, -1}
        };

        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {
                int sumR = 0, sumG = 0, sumB = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        Color color = new Color(originalImage.getRGB(x + i, y + j));
                        sumR += color.getRed() * laplacianKernel[i + 1][j + 1];
                        sumG += color.getGreen() * laplacianKernel[i + 1][j + 1];
                        sumB += color.getBlue() * laplacianKernel[i + 1][j + 1];
                    }
                }

                int newR = Math.min(Math.max(sumR, 0), 255);
                int newG = Math.min(Math.max(sumG, 0), 255);
                int newB = Math.min(Math.max(sumB, 0), 255);

                int pixel = (newR << 16) | (newG << 8) | newB;
                resultImage.setRGB(x, y, pixel);
            }
        }

        return resultImage;
    }

    private BufferedImage balanceBrightness(BufferedImage originalImage) {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        BufferedImage resultImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int[] histogramR = new int[256];
        int[] histogramG = new int[256];
        int[] histogramB = new int[256];

        // Tính toán histogram
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(originalImage.getRGB(x, y));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();

                histogramR[r]++;
                histogramG[g]++;
                histogramB[b]++;
            }
        }

        // Tìm giá trị min và max của histogram
        int minR = 0, maxR = 255;
        int minG = 0, maxG = 255;
        int minB = 0, maxB = 255;

        while (histogramR[minR] == 0) minR++;
        while (histogramR[maxR] == 0) maxR--;
        while (histogramG[minG] == 0) minG++;
        while (histogramG[maxG] == 0) maxG--;
        while (histogramB[minB] == 0) minB++;
        while (histogramB[maxB] == 0) maxB--;

        // Tính toán giá trị mới cho mỗi pixel
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(originalImage.getRGB(x, y));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();

                int newR = (int) (255.0 * (r - minR) / (maxR - minR));
                int newG = (int) (255.0 * (g - minG) / (maxG - minG));
                int newB = (int) (255.0 * (b - minB) / (maxB - minB));

                newR = Math.min(Math.max(newR, 0), 255);
                newG = Math.min(Math.max(newG, 0), 255);
                newB = Math.min(Math.max(newB, 0), 255);

                int pixel = (newR << 16) | (newG << 8) | newB;
                resultImage.setRGB(x, y, pixel);
            }
        }

        return resultImage;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                xulyanh viewer = new xulyanh();
                viewer.setVisible(true);
            }
        });
    }
}

