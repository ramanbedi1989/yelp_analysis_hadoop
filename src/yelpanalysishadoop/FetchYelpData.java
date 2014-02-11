package yelpanalysishadoop;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    
    public static int REVIEW_DATE_PUBLISHED = 0;
    public static int REVIEW_USER_NAME = 1;
    public static int REVIEW_CITY = 2;
    public static int REVIEW_DESCRIPTION = 3;
    public static int REVIEW_RATING = 4;

    public HashMap<Object[], ArrayList<String[]>> yelpdatafetch(String url) throws IOException {
        Document document = null;
        Element element = null;
        int test = 1;
        String desc_url = url + "?sort_by=date_desc";
        while (element == null) {
            document = Jsoup.connect(desc_url).timeout(0).get();
            element = document.getElementById("bizBox");
            if (test == 5) {
                break;
            }
            test++;
        }
        //ArrayList<Object> data = new ArrayList();
        Object []data = new Object[100];
        data[MERCHANT_NAME] = element.select("#bizInfoHeader>h1[itemprop=name]").text();
        data[MERCHANT_ADDRESS] = element.select("#bizInfoContent>address>span[itemprop=streetAddress]").text();
        data[MERCHANT_CITY] = element.select("#bizInfoContent>address>span[itemprop=addressLocality]").text();
        data[MERCHANT_STATE] = element.select("#bizInfoContent>address>span[itemprop=addressRegion]").text();
        data[MERCHANT_ZIPCODE] = element.select("#bizInfoContent>address>span[itemprop=postalCode]").text();
        data[MERCHANT_PHONE_NO] = element.select("#bizInfoContent>span[itemprop=telephone]").text();
        data[MERCHANT_WEBSITE] = element.select("#bizUrl").text();
        data[AVERAGE_RATING] = Float.parseFloat(element.select("#bizRating .rating>meta").attr("content"));
        data[REVIEW_COUNT] = Integer.parseInt(element.select("#bizRating .review-count>span").text());


        data[HOURS] = element.select("#bizAdditionalInfo>.col-0>dl>dd.attr-BusinessHours").text();
        data[GOOD_FOR_GROUPS] = (element.select("#bizAdditionalInfo>.col-0>dl>dd.attr-RestaurantsGoodForGroups").text().toLowerCase()).equals("yes");
        data[ACCEPT_CREDIT_CARDS] = (element.select("#bizAdditionalInfo>.col-0>dl>dd.attr-BusinessAcceptsCreditCards").text().toLowerCase()).equals("yes");
        data[PARKING] = element.select("#bizAdditionalInfo>.col-0>dl>dd.attr-BusinessParking").text();
        data[ATTIRE] = element.select("#bizAdditionalInfo>.col-0>dl>dd.attr-RestaurantsAttire").text();

        data[PRICE_RANGE] = element.select("#price_tip").text();
        data[GOOD_FOR_KIDS] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-GoodForKids").text().toLowerCase()).equals("yes");
        data[TAKE_RESERVATION] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-RestaurantsReservations").text().toLowerCase()).equals("yes");
        data[DELIVERY] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-RestaurantsDelivery").text().toLowerCase()).equals("yes");
        data[TAKE_OUT] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-RestaurantsTakeOut").text().toLowerCase()).equals("yes");
        data[WAITER_SERVICES] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-RestaurantsTableService").text().toLowerCase()).equals("yes");
        data[OUTDOOR_SEATS] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-OutdoorSeating").text().toLowerCase()).equals("yes");
        data[WIFI] = (element.select("#bizAdditionalInfo>.col-1>dl>dd.attr-WiFi").text().toLowerCase()).equals("yes");
        data[GOOD_FOR] = element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-GoodForMeal").text();
        data[ALCOHOL] = element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-Alcohol").text();
        data[NOISE_LEVEL] = element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-NoiseLevel").text();
        data[AMBIENCE] = element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-Ambience").text();
        data[HAS_TV] = (element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-HasTV").text().toLowerCase()).equals("yes");
        data[CATERS] = (element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-Caters").text().toLowerCase()).equals("yes");
        data[WHEELCHAIR_ACCESSIBLE] = (element.select("#bizAdditionalInfo>.col-2>dl>dd.attr-WheelchairAccessible").text().toLowerCase()).equals("yes");


        Element ele = null;

        String element_text;
        ele = document.getElementById("rpp-count");

        element_text = ele.text();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(element_text);

        for (int i = 0; i < 3; i++) {
            matcher.find();
        }
        int reviews_count = Integer.parseInt(matcher.group());
        System.out.println(reviews_count);
        int page_count;
        if (reviews_count % 40 == 0) {
            page_count = reviews_count / 40;
        } else {
            page_count = reviews_count / 40 + 1;
        }
        System.out.println(page_count);

        int temp = 0;

        ArrayList<Float> rating = new ArrayList();
        ArrayList<String[]> reviewer_details = new ArrayList();

        for (int count = 0; count < page_count; count++) {
            String url1 = desc_url + "&start=" + temp;
            System.out.println("new url" + url1);
            Elements reviews;
            Document doc1 = Jsoup.connect(url1).timeout(0).get();
            reviews = doc1.select("#reviews-other>ul>li");
            temp += 40;
            while (reviews == null || reviews.size() == 0) {
                doc1 = Jsoup.connect(url1).timeout(0).get();
                reviews = doc1.select("#reviews-other>ul>li");
            }
            //System.out.println("reviews" + reviews.size());
            for (Element review : reviews) {

                Elements rating_element = review.select(".rating>meta");

                //System.out.println(rating_element.get(0).attr("content"));
                Float rating_star = Float.parseFloat(rating_element.get(0).attr("content").trim());

                rating.add(rating_star);
                // System.out.println("rating_star=" + rating_star);
                //String reviewer_name = 
                reviewer_details.add(new String[]{review.select("meta[itemprop=datePublished]").attr("content").trim(), review.select(".user-name>a").text(), review.select("p.reviewer_info").text(), review.select("p.review_comment[itemprop=description]").text(), rating_star.toString()});

            }


        }

        Date first_review_date = null;
        float rating_total = 0.0f;
        float mean_30 = 0.0f, mean_60 = 0.0f, mean_90 = 0.0f, mean_120 = 0.0f, mean_150 = 0.0f, mean_180 = 0.0f, mean_210 = 0.0f;
        try {
            first_review_date = new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(0)[0]);
            System.out.println("first_review_date" + first_review_date);
        } catch (ParseException ex) {
            Logger.getLogger(FetchYelpData.class.getName()).log(Level.SEVERE, null, ex);
        }

        float mean = 0;
        try {
            for (int i = 0; i < rating.size(); i++) {
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 30 && mean_30 == 0.0) {
                    mean_30 = rating_total / i;
                    data[MEAN_30] = mean_30;
                    System.out.println("mean_30=" + mean_30);
                    System.out.println("i=" + i);
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 60 && mean_60 == 0.0) {
                    mean_60 = rating_total / i;
                    data[MEAN_60] = mean_60;
                    System.out.println("mean_60=" + mean_60);
                    System.out.println("i=" + i);
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 90 && mean_90 == 0.0) {
                    mean_90 = rating_total / i;
                    data[MEAN_90] = mean_90;
                    System.out.println("mean_90=" + mean_90);
                    System.out.println("i=" + i);
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 120 && mean_120 == 0.0) {
                    mean_120 = rating_total / i;
                    data[MEAN_120] = mean_120;
                    System.out.println("mean_120=" + mean_120);
                    System.out.println("i=" + i);
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 150 && mean_150 == 0.0) {
                    mean_150 = rating_total / i;
                    data[MEAN_150] = mean_150;
                    System.out.println("mean_150=" + mean_150);
                    System.out.println("i=" + i);
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 180 && mean_180 == 0.0) {
                    mean_180 = rating_total / i;
                    data[MEAN_180] = mean_180;
                    System.out.println("mean_180=" + mean_180);
                    System.out.println("i=" + i);
                }
                if (Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(i)[0])), new DateTime(first_review_date)).getDays() > 210 && mean_210 == 0.0) {
                    mean_210 = rating_total / i;
                    data[MEAN_210] = mean_210;
                    System.out.println("mean_210=" + mean_210);
                    System.out.println("i=" + i);
                }

                rating_total += (float) rating.get(i);
            }
            mean = (rating_total / rating.size());
            int days_diff = Days.daysBetween(new DateTime(new SimpleDateFormat("yyyy-MM-dd").parse(reviewer_details.get(reviewer_details.size() - 1)[0])), new DateTime(first_review_date)).getDays();
            if ( days_diff > 210) {
                data[MEAN_210_PLUS] = mean;
            }
            
            switch(days_diff){
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
        float variance = (float)Math.sqrt(deviation_total / rating.size());

        Collections.sort(rating);
        float median = 0.0f;
        if ((rating.size() % 2) == 0) {
            int middle = rating.size() / 2;
            median = (rating.get(middle) + rating.get(middle - 1)) / 2;
        } else {
            int middle = rating.size() / 2;
            median = rating.get(middle - 1);
        }
        System.out.println("mean=" + mean);
        System.out.println("variance=" + variance);
        System.out.println("The median is= " + median);
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
        System.out.println("data= " + data);
        HashMap<Object[], ArrayList<String[]>> all_data = new HashMap<Object[], ArrayList<String[]>>();
        all_data.put(data, reviewer_details);
        return all_data;
    }

    public static void main(String[] args) throws IOException {
        FetchYelpData fetchdata = new FetchYelpData();
        fetchdata.yelpdatafetch("http://www.yelp.com/biz/tribu-grill-union-city");

    }
}
