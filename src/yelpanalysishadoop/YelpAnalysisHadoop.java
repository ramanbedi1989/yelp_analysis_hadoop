/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yelpanalysishadoop;

import com.cloudera.sqoop.lib.RecordParser.ParseError;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.String;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author raman
 */
public class YelpAnalysisHadoop {

    /**
     * @param args the command line arguments
     */ 
    
    public static class MapYelpAnalysis extends Mapper<LongWritable, Text, NullWritable, Text>{
    @Override
        public void setup(Context context) throws IOException, InterruptedException {
            
        }

        @Override
        public void map(LongWritable key, Text value, Context context) throws IOException {
           inputs input=new inputs();
            try {
                input.parse(value);
            } catch (ParseError ex) {
                Logger.getLogger(YelpAnalysisHadoop.class.getName()).log(Level.SEVERE, null, ex);
            }
           FetchYelpData fetchyelpdata=new FetchYelpData();
           HashMap<Object[], ArrayList<String[]>> all_data=fetchyelpdata.yelpdatafetch(input.get_url());
           Set<Object[]> all_data_keys = all_data.keySet();
           NullWritable nw = NullWritable.get();
           for(Object[] all_data_key : all_data_keys){
              ArrayList<String[]> review_details = all_data.get(all_data_key);
              outputs out = new outputs();
              for(String[] reviews : review_details){
                  out.set_accept_credit_card((Boolean)all_data_key[FetchYelpData.ACCEPT_CREDIT_CARDS]);
                  out.set_address((String)all_data_key[FetchYelpData.MERCHANT_ADDRESS]);
                  out.set_alcohol((String)all_data_key[FetchYelpData.ALCOHOL]);
                  out.set_average_rating((Float)all_data_key[FetchYelpData.AVERAGE_RATING]);
                  out.set_caters((Boolean)all_data_key[FetchYelpData.CATERS]);
                  out.set_created_at(new Timestamp(new Date().getTime()));
                  out.set_city((String)all_data_key[FetchYelpData.MERCHANT_CITY]);
                  out.set_days_since_last_review((Integer)all_data_key[FetchYelpData.DAYS_BETWEEN]);
                  out.set_delivery((Boolean)all_data_key[FetchYelpData.DELIVERY]);
                  out.set_dress_code((String)all_data_key[FetchYelpData.ATTIRE]);
                  out.set_good_for_groups((Boolean)all_data_key[FetchYelpData.GOOD_FOR_GROUPS]);
                  out.set_good_for_kids((Boolean)all_data_key[FetchYelpData.GOOD_FOR_KIDS]);
                  out.set_has_tv((Boolean)all_data_key[FetchYelpData.HAS_TV]);
                  out.set_hours((String)all_data_key[FetchYelpData.HOURS]);
                  out.set_input_id(input.get_id());
                  out.set_menu_price((String)all_data_key[FetchYelpData.PRICE_RANGE]);
                  out.set_merchant_name((String)all_data_key[FetchYelpData.MERCHANT_NAME]);
                  out.set_noise_level((String)all_data_key[FetchYelpData.NOISE_LEVEL]);
                  out.set_outdoor_sitting((Boolean)all_data_key[FetchYelpData.OUTDOOR_SEATS]);
                  out.set_parking((String)all_data_key[FetchYelpData.PARKING]);
                  out.set_phone_no((String)all_data_key[FetchYelpData.MERCHANT_PHONE_NO]);
                  out.set_rating_mean((Float)all_data_key[FetchYelpData.MEAN]);
                  out.set_rating_mean_120((Float)all_data_key[FetchYelpData.MEAN_120]);
                  out.set_rating_mean_150((Float)all_data_key[FetchYelpData.MEAN_150]);
                  out.set_rating_mean_180((Float)all_data_key[FetchYelpData.MEAN_180]);
                  out.set_rating_mean_210((Float)all_data_key[FetchYelpData.MEAN_210]);
                  out.set_rating_mean_210_plus((Float)all_data_key[FetchYelpData.MEAN_210_PLUS]);
                  out.set_rating_mean_30((Float)all_data_key[FetchYelpData.MEAN_30]);
                  out.set_rating_mean_60((Float)all_data_key[FetchYelpData.MEAN_60]);
                  out.set_rating_mean_90((Float)all_data_key[FetchYelpData.MEAN_90]);
                  out.set_rating_median((Float)all_data_key[FetchYelpData.MEDIAN]);
                  out.set_rating_variance((Float)all_data_key[FetchYelpData.VARIANCE]);
                  out.set_reservation((Boolean)all_data_key[FetchYelpData.TAKE_RESERVATION]);
                  out.set_review_city((String)reviews[FetchYelpData.REVIEW_CITY]);
                  out.set_review_count((Integer)all_data_key[FetchYelpData.REVIEW_COUNT]);
                  Date review_date = null;
                    try {
                        review_date = new SimpleDateFormat("yyyy-MM-dd").parse((String)reviews[FetchYelpData.REVIEW_DATE_PUBLISHED]);
                    } catch (ParseException ex) {
                        Logger.getLogger(YelpAnalysisHadoop.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 out.set_review_date(new Timestamp(review_date.getTime()));
                 out.set_review_description((String)reviews[FetchYelpData.REVIEW_DESCRIPTION]);
                 out.set_review_rating(Float.parseFloat(reviews[FetchYelpData.REVIEW_RATING]));
                 out.set_review_user_name((String)reviews[FetchYelpData.REVIEW_USER_NAME]);
                 out.set_state((String)all_data_key[FetchYelpData.MERCHANT_STATE]);
                 out.set_take_out((Boolean)all_data_key[FetchYelpData.TAKE_OUT]);
                 out.set_updated_at(new Timestamp(new Date().getTime()));
                 out.set_waiter_service((Boolean)all_data_key[FetchYelpData.WAITER_SERVICES]);
                 out.set_website_address((String)all_data_key[FetchYelpData.MERCHANT_WEBSITE]);
                 out.set_zipcode((String)all_data_key[FetchYelpData.MERCHANT_ZIPCODE]);
                    try {
                        context.write(nw, new Text(out.toString()));
                    } catch (InterruptedException ex) {
                        Logger.getLogger(YelpAnalysisHadoop.class.getName()).log(Level.SEVERE, null, ex);
                    }
              }
           }
        }
    }
    
//    public static class ReduceYelpAnalysis extends Reducer<LongWritable, Text, NullWritable, Text>{
//        @Override
//        public void reduce(LongWritable key, Iterable<Text> value, Context context) throws IOException {
//            Iterator<Text> t = value.iterator();
//            NullWritable nw = NullWritable.get();
//            while (t.hasNext()) {
//               /* try {
//                    SetNews sn = t.next();
//                    context.write(nw, new Text(sn.getJson()));
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(NewsHunter.class.getName()).log(Level.SEVERE, null, ex);
//                }*/
//            }
//        }
//    }
    
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        Configuration conf = new Configuration();
        // DBConfiguration.configureDB(conf, "com.mysql.jdbc.Driver", "jdbc:mysql://localhost/db_news_grinder_dev", "root", "root"); //Specifies the DB configuration   jdbc:mysql://172.31.45.64/db_news_grinder
        conf.set("io.serializations", "org.apache.hadoop.io.serializer.JavaSerialization,org.apache.hadoop.io.serializer.WritableSerialization");
        Job job = new Job(conf);
        job.setJarByClass(YelpAnalysisHadoop.class);
        job.setJobName("NewsHunter");

        job.setMapOutputKeyClass(NullWritable.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(Text.class);

        job.setMapperClass(MapYelpAnalysis.class);
        job.setNumReduceTasks(0);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        //job.setOutputFormatClass(FileOutputFormat.class);

        // String[] fields_input = {"id", "client_id", "ref_id", "news_url", "news_type", "keyword", "created_at", "updated_at", "extras","is_exhausted","previous_source"}; //Specifies the Fields to be fetched from DB
        // DBInputFormat.setInput(job, GetNews.class, "news_sources", null /* conditions */, "id", fields_input); // Specifies the DB table and fields
        FileInputFormat.addInputPath(job, new Path(args[1]));
        FileOutputFormat.setOutputPath(job, new Path(args[2]));
        //DBOutputFormat.setOutput(job, "news_output", fields_output);
        job.waitForCompletion(true);
    }
}
