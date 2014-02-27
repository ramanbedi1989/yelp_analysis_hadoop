package yelpanalysishadoop;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FetchYelpData {

    public static int MERCHANT_NAME = 0;
    public static int MERCHANT_ADDRESS = 1;
    public static int MERCHANT_CITY = 2;
    public static int MERCHANT_STATE = 3;
    public static int MERCHANT_ZIPCODE = 4;
    public static int MERCHANT_PHONE_NO = 5;
    public static int MERCHANT_WEBSITE = 6;
    public static int AVERAGE_RATING = 7;
    public static int REVIEW_COUNT = 8;
    public static int HOURS = 9;
    public static int GOOD_FOR_GROUPS = 10;
    public static int ACCEPT_CREDIT_CARDS = 11;
    public static int PARKING = 12;
    public static int ATTIRE = 13;
    public static int PRICE_RANGE = 14;
    public static int GOOD_FOR_KIDS = 15;
    public static int TAKE_RESERVATION = 16;
    public static int DELIVERY = 17;
    public static int TAKE_OUT = 18;
    public static int WAITER_SERVICES = 19;
    public static int OUTDOOR_SEATS = 20;
    public static int WIFI = 21;
    public static int GOOD_FOR = 22;
    public static int ALCOHOL = 23;
    public static int NOISE_LEVEL = 24;
    public static int AMBIENCE = 25;
    public static int HAS_TV = 26;
    public static int CATERS = 27;
    public static int WHEELCHAIR_ACCESSIBLE = 28;
    public static int MEAN = 29;
    public static int MEDIAN = 30;
    public static int VARIANCE = 31;
    public static int DAYS_BETWEEN = 32;
    public static int MEAN_30 = 33;
    public static int MEAN_60 = 34;
    public static int MEAN_90 = 35;
    public static int MEAN_120 = 36;
    public static int MEAN_150 = 37;
    public static int MEAN_180 = 38;
    public static int MEAN_210 = 39;
    public static int MEAN_210_PLUS = 40;
    public static int MUSIC = 41;
    public static int GOOD_FOR_DANCING = 42;
    public static int HAPPY_HOUR = 43;
    public static int BEST_NIGHTS = 44;
    public static int COAT_CHECK = 45;
    public static int SMOKING = 46;
    public static int REVIEW_DATE_PUBLISHED = 0;
    public static int REVIEW_USER_NAME = 1;
    public static int REVIEW_CITY = 2;
    public static int REVIEW_DESCRIPTION = 3;
    public static int REVIEW_RATING = 4;

    public HashMap<Object[], ArrayList<String[]>> yelpdatafetch(String url) throws IOException {
        Document document = null;
        Elements top_shelf_elements = null;
        Elements container_elements = null;
        int index = 1;
        String desc_url = url;
        while (top_shelf_elements == null) {
            document = Jsoup.connect(desc_url).timeout(0).get();
            top_shelf_elements = document.getElementsByClass("top-shelf");
            if (index == 10) {
                break;
            }
            index++;
        }
        Object[] data = new Object[100];
        data[MERCHANT_NAME] = top_shelf_elements.select(".biz-page-header-left>h1[itemprop=name]").text();
        data[MERCHANT_ADDRESS] = top_shelf_elements.select(".mapbox>.mapbox-text>ul>.address>.street-address>address>span[itemprop=streetAddress]").text();
        data[MERCHANT_CITY] = top_shelf_elements.select(".mapbox>.mapbox-text>ul>.address>.street-address>address>span[itemprop=addressLocality]").text();
        data[MERCHANT_STATE] = top_shelf_elements.select(".mapbox>.mapbox-text>ul>.address>.street-address>address>span[itemprop=addressRegion]").text();
        data[MERCHANT_ZIPCODE] = top_shelf_elements.select(".mapbox>.mapbox-text>ul>.address>.street-address>address>span[itemprop=postalCode]").text();
        data[MERCHANT_PHONE_NO] = top_shelf_elements.select(".mapbox>.mapbox-text>ul>li>span>span[itemprop=telephone]").text();
        data[MERCHANT_WEBSITE] = top_shelf_elements.select(".mapbox>.mapbox-text>ul>li>span>.biz-website>a").text();
        data[AVERAGE_RATING] = Float.parseFloat(top_shelf_elements.select(".biz-page-header-left>.biz-main-info>.rating-info>.biz-rating>.rating-very-large>meta").attr("content"));
        data[REVIEW_COUNT] = Integer.parseInt(top_shelf_elements.select(".biz-page-header-left>.biz-main-info>.rating-info>.biz-rating>.review-count>span[itemprop=reviewCount]").text());

        index = 1;
        while (container_elements == null) {
            document = Jsoup.connect(url).timeout(0).get();
            container_elements = document.getElementsByClass("container");
            if (index == 10) {
                break;
            }
            index++;
        }
        data[HOURS] = container_elements.select(".column.column-beta.sidebar>.bordered-rail>.ysection.biz-hours>.table>tbody").text();       
        Elements additional_info = container_elements.select(".column.column-beta.sidebar>.bordered-rail>.ysection>ul>li>.short-def-list>dl");

        for (Element element : additional_info) {
            if ((element.select("dt").text().toLowerCase()).contains("takes reservations")) {
                data[TAKE_RESERVATION] = element.select("dd").text().toLowerCase().equals("yes");               
            }
            if ((element.select("dt").text().toLowerCase()).contains("delivery")) {
                data[DELIVERY] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("take-out")) {
                data[TAKE_OUT] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("accepts credit cards")) {
                data[ACCEPT_CREDIT_CARDS] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("good for")) {
                data[GOOD_FOR] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("parking")) {
                data[PARKING] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("wheelchair accessible")) {
                data[WHEELCHAIR_ACCESSIBLE] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("good for kids")) {
                data[GOOD_FOR_KIDS] = element.select("dd").text().toLowerCase().equals("yes");               
            }
            if ((element.select("dt").text().toLowerCase()).contains("good for groups")) {
                data[GOOD_FOR_GROUPS] = element.select("dd").text().toLowerCase().equals("yes");               
            }
            if ((element.select("dt").text().toLowerCase()).contains("attire")) {
                data[ATTIRE] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("ambience")) {
                data[AMBIENCE] = element.select("dd").text().toLowerCase();               
            }
            if ((element.select("dt").text().toLowerCase()).contains("noise level")) {
                data[NOISE_LEVEL] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("music")) {
                data[MUSIC] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("good for dancing")) {
                data[GOOD_FOR_DANCING] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("alcohol")) {
                data[ALCOHOL] = element.select("dd").text().toLowerCase();               
            }
            if ((element.select("dt").text().toLowerCase()).contains("happy hour")) {
                data[HAPPY_HOUR] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("best nights")) {
                data[BEST_NIGHTS] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("coat check")) {
                data[COAT_CHECK] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("smoking")) {
                data[SMOKING] = element.select("dd").text().toLowerCase();                
            }
            if ((element.select("dt").text().toLowerCase()).contains("outdoor seating")) {
                data[OUTDOOR_SEATS] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("wi-fi")) {
                data[WIFI] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("has tv")) {
                data[HAS_TV] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("waiter service")) {
                data[WAITER_SERVICES] = element.select("dd").text().toLowerCase().equals("yes");                
            }
            if ((element.select("dt").text().toLowerCase()).contains("caters")) {
                data[CATERS] = element.select("dd").text().toLowerCase().equals("yes");
            }
        }
        int reviews_count = Integer.parseInt(data[REVIEW_COUNT].toString());
        int page_count;
        if (reviews_count % 40 == 0) {
            page_count = reviews_count / 40;
        } else {
            page_count = reviews_count / 40 + 1;
        }

        int temp = 0;

        ArrayList<Float> rating = new ArrayList();
        ArrayList<String[]> reviewer_details = new ArrayList();

        for (int count = 0; count < page_count; count++) {
            String url1 = desc_url+"?start="+temp+"&sort_by=date_desc";
            Elements reviews;
            Document doc1 = Jsoup.connect(url1).timeout(0).get();
            reviews = doc1.select(".column-alpha.main-section>div>.feed>.review-list>ul>li");
            temp += 40;
            while (reviews == null || reviews.isEmpty()) {
                doc1 = Jsoup.connect(url1).timeout(0).get();
                reviews = doc1.select(".column-alpha.main-section>div>.feed>.review-list>ul>li.review.review-with-no-actions");
            }
                for(Element rating_element:reviews){
                    
                    Elements star_rating_element=rating_element.select(".review-wrapper>.review-content>.biz-rating.biz-rating-very-large.clearfix>div>.rating-very-large>meta");
                    Float rating_star = Float.parseFloat(star_rating_element.attr("content").trim());                  
                    rating.add(rating_star);
                    Elements date_rating_element=rating_element.select(".review-content>.biz-rating.biz-rating-very-large.clearfix>.rating-qualifier>meta");
                    String date_publish=date_rating_element.attr("content").trim();                    
                    String user_name=rating_element.select(".review-sidebar>.review-sidebar-content>.ypassport.media-block.clearfix>.media-story>ul>.user-name>a").text();
                    String user_info=rating_element.select(".review-sidebar>.review-sidebar-content>.ypassport.media-block.clearfix>.media-story>ul>.user-location>b").text();                    
                    String desc_info=rating_element.select(".review-wrapper>.review-content>p").text();
                    reviewer_details.add(new String []{date_publish,user_name,user_info,desc_info,rating_star.toString()}); 
               }
        }
        Date first_review_date = null;
        float rating_total = 0.0f;
        float mean_30 = 0.0f, mean_60 = 0.0f, mean_90 = 0.0f, mean_120 = 0.0f, mean_150 = 0.0f, mean_180 = 0.0f, mean_210 = 0.0f;
        try {
            first_review_date = new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(0)[0]);
        } catch (ParseException ex) {
            Logger.getLogger(FetchYelpData.class.getName()).log(Level.SEVERE, null, ex);
        }

        float mean = 0;
        try {
            for (int i = 0; i < rating.size(); i++) {
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 30 && mean_30 == 0.0) {
                    mean_30 = rating_total / i;
                    data[MEAN_30] = mean_30;
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 60 && mean_60 == 0.0) {
                    mean_60 = rating_total / i;
                    data[MEAN_60] = mean_60;
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 90 && mean_90 == 0.0) {
                    mean_90 = rating_total / i;
                    data[MEAN_90] = mean_90;
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 120 && mean_120 == 0.0) {
                    mean_120 = rating_total / i;
                    data[MEAN_120] = mean_120;
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 150 && mean_150 == 0.0) {
                    mean_150 = rating_total / i;
                    data[MEAN_150] = mean_150;
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 180 && mean_180 == 0.0) {
                    mean_180 = rating_total / i;
                    data[MEAN_180] = mean_180;
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 210 && mean_210 == 0.0) {
                    mean_210 = rating_total / i;
                    data[MEAN_210] = mean_210;
                }

                rating_total += (float) rating.get(i);
            }
            mean = (rating_total / rating.size());
            int days_diff = Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(reviewer_details.size() - 1)[0])), new DateTime(first_review_date)).getDays();
            if (days_diff > 210) {
                data[MEAN_210_PLUS] = mean;
            }

            switch (days_diff) {
                case 30:
                    data[MEAN_30] = mean;
                    break;
                case 60:
                    data[MEAN_60] = mean;
                    break;
                case 90:
                    data[MEAN_90] = mean;
                    break;
                case 120:
                    data[MEAN_120] = mean;
                    break;
                case 150:
                    data[MEAN_150] = mean;
                    break;
                case 180:
                    data[MEAN_180] = mean;
                    break;
                case 210:
                    data[MEAN_210] = mean;
                    break;
            }
        } catch (ParseException ex) {
            Logger.getLogger(FetchYelpData.class.getName()).log(Level.SEVERE, null, ex);
        }
        float deviation_total = 0.0f;
        for (int i = 0; i < rating.size(); i++) {

            float deviation = mean - rating.get(i);
            deviation_total += Math.pow(deviation, 2);

        }
        float variance = (float) Math.sqrt(deviation_total / rating.size());

        Collections.sort(rating);
        float median = 0.0f;
        if ((rating.size() % 2) == 0) {
            int middle = rating.size() / 2;
            median = (rating.get(middle) + rating.get(middle - 1)) / 2;
        } else {
            int middle = rating.size() / 2;
            median = rating.get(middle - 1);
        }
        data[MEAN] = mean;
        data[MEDIAN] = median;
        data[VARIANCE] = variance;
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(0)[0]);
        } catch (ParseException ex) {
            Logger.getLogger(FetchYelpData.class.getName()).log(Level.SEVERE, null, ex);
        }
        int days_between = Days.daysBetween(new DateTime(date), new DateTime(new Date())).getDays();
        data[DAYS_BETWEEN] = days_between;
        HashMap<Object[], ArrayList<String[]>> all_data = new HashMap<Object[], ArrayList<String[]>>();
        all_data.put(data, reviewer_details);
        return all_data;
    }

    public static void main(String[] args) throws IOException {
        FetchYelpData fetchdata = new FetchYelpData();
        //fetchdata.yelpdatafetch("http://www.yelp.com/biz/san-pedro-brewing-company-san-pedro");
        fetchdata.yelpdatafetch("http://www.yelp.com/biz/tribu-grill-union-city");

    }
}
