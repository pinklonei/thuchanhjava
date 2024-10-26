import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class TienDien {
public static class AvgElectricityMapper extends Mapper<Object, Text, Text, IntWritable> {
        private Text year = new Text();
        private IntWritable avgConsumption = new IntWritable();
        public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            String[] fields = value.toString().split(",");
            year.set(fields[0]);
            int sum = 0;
            for (int i = 1; i < fields.length; i++) {
                sum += Integer.parseInt(fields[i]);
            }
            int average = sum / (fields.length - 1);
            avgConsumption.set(average);
            context.write(year, avgConsumption);
        }
    }
public static class AvgElectricityReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
        public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
            for (IntWritable val : values) {
                if (val.get() > 30) {
                    context.write(key, val);
                }
            }
        }
    }
public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Tinh trung binh tieu thu dien");
        job.setJarByClass(TienDien.class);
        job.setMapperClass(AvgElectricityMapper.class);
        job.setReducerClass(AvgElectricityReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
}
}
