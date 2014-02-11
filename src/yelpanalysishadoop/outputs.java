package yelpanalysishadoop;

// ORM class for table 'outputs'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Feb 06 22:09:42 IST 2014
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class outputs extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public outputs with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer merchant_id;
  public Integer get_merchant_id() {
    return merchant_id;
  }
  public void set_merchant_id(Integer merchant_id) {
    this.merchant_id = merchant_id;
  }
  public outputs with_merchant_id(Integer merchant_id) {
    this.merchant_id = merchant_id;
    return this;
  }
  private String contract_id;
  public String get_contract_id() {
    return contract_id;
  }
  public void set_contract_id(String contract_id) {
    this.contract_id = contract_id;
  }
  public outputs with_contract_id(String contract_id) {
    this.contract_id = contract_id;
    return this;
  }
  private String merchant_name;
  public String get_merchant_name() {
    return merchant_name;
  }
  public void set_merchant_name(String merchant_name) {
    this.merchant_name = merchant_name;
  }
  public outputs with_merchant_name(String merchant_name) {
    this.merchant_name = merchant_name;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public outputs with_address(String address) {
    this.address = address;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public outputs with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public outputs with_state(String state) {
    this.state = state;
    return this;
  }
  private String zipcode;
  public String get_zipcode() {
    return zipcode;
  }
  public void set_zipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  public outputs with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private String phone_no;
  public String get_phone_no() {
    return phone_no;
  }
  public void set_phone_no(String phone_no) {
    this.phone_no = phone_no;
  }
  public outputs with_phone_no(String phone_no) {
    this.phone_no = phone_no;
    return this;
  }
  private Float funded_amount;
  public Float get_funded_amount() {
    return funded_amount;
  }
  public void set_funded_amount(Float funded_amount) {
    this.funded_amount = funded_amount;
  }
  public outputs with_funded_amount(Float funded_amount) {
    this.funded_amount = funded_amount;
    return this;
  }
  private Integer fico;
  public Integer get_fico() {
    return fico;
  }
  public void set_fico(Integer fico) {
    this.fico = fico;
  }
  public outputs with_fico(Integer fico) {
    this.fico = fico;
    return this;
  }
  private Integer sc3score;
  public Integer get_sc3score() {
    return sc3score;
  }
  public void set_sc3score(Integer sc3score) {
    this.sc3score = sc3score;
  }
  public outputs with_sc3score(Integer sc3score) {
    this.sc3score = sc3score;
    return this;
  }
  private Boolean nopo_flag;
  public Boolean get_nopo_flag() {
    return nopo_flag;
  }
  public void set_nopo_flag(Boolean nopo_flag) {
    this.nopo_flag = nopo_flag;
  }
  public outputs with_nopo_flag(Boolean nopo_flag) {
    this.nopo_flag = nopo_flag;
    return this;
  }
  private Float annual_sales;
  public Float get_annual_sales() {
    return annual_sales;
  }
  public void set_annual_sales(Float annual_sales) {
    this.annual_sales = annual_sales;
  }
  public outputs with_annual_sales(Float annual_sales) {
    this.annual_sales = annual_sales;
    return this;
  }
  private String sic_code;
  public String get_sic_code() {
    return sic_code;
  }
  public void set_sic_code(String sic_code) {
    this.sic_code = sic_code;
  }
  public outputs with_sic_code(String sic_code) {
    this.sic_code = sic_code;
    return this;
  }
  private String restaurant_category;
  public String get_restaurant_category() {
    return restaurant_category;
  }
  public void set_restaurant_category(String restaurant_category) {
    this.restaurant_category = restaurant_category;
  }
  public outputs with_restaurant_category(String restaurant_category) {
    this.restaurant_category = restaurant_category;
    return this;
  }
  private String website_address;
  public String get_website_address() {
    return website_address;
  }
  public void set_website_address(String website_address) {
    this.website_address = website_address;
  }
  public outputs with_website_address(String website_address) {
    this.website_address = website_address;
    return this;
  }
  private String hours;
  public String get_hours() {
    return hours;
  }
  public void set_hours(String hours) {
    this.hours = hours;
  }
  public outputs with_hours(String hours) {
    this.hours = hours;
    return this;
  }
  private String parking;
  public String get_parking() {
    return parking;
  }
  public void set_parking(String parking) {
    this.parking = parking;
  }
  public outputs with_parking(String parking) {
    this.parking = parking;
    return this;
  }
  private Integer review_count;
  public Integer get_review_count() {
    return review_count;
  }
  public void set_review_count(Integer review_count) {
    this.review_count = review_count;
  }
  public outputs with_review_count(Integer review_count) {
    this.review_count = review_count;
    return this;
  }
  private Float average_rating;
  public Float get_average_rating() {
    return average_rating;
  }
  public void set_average_rating(Float average_rating) {
    this.average_rating = average_rating;
  }
  public outputs with_average_rating(Float average_rating) {
    this.average_rating = average_rating;
    return this;
  }
  private String menu_price;
  public String get_menu_price() {
    return menu_price;
  }
  public void set_menu_price(String menu_price) {
    this.menu_price = menu_price;
  }
  public outputs with_menu_price(String menu_price) {
    this.menu_price = menu_price;
    return this;
  }
  private Boolean accept_credit_card;
  public Boolean get_accept_credit_card() {
    return accept_credit_card;
  }
  public void set_accept_credit_card(Boolean accept_credit_card) {
    this.accept_credit_card = accept_credit_card;
  }
  public outputs with_accept_credit_card(Boolean accept_credit_card) {
    this.accept_credit_card = accept_credit_card;
    return this;
  }
  private String dress_code;
  public String get_dress_code() {
    return dress_code;
  }
  public void set_dress_code(String dress_code) {
    this.dress_code = dress_code;
  }
  public outputs with_dress_code(String dress_code) {
    this.dress_code = dress_code;
    return this;
  }
  private Boolean reservation;
  public Boolean get_reservation() {
    return reservation;
  }
  public void set_reservation(Boolean reservation) {
    this.reservation = reservation;
  }
  public outputs with_reservation(Boolean reservation) {
    this.reservation = reservation;
    return this;
  }
  private Boolean take_out;
  public Boolean get_take_out() {
    return take_out;
  }
  public void set_take_out(Boolean take_out) {
    this.take_out = take_out;
  }
  public outputs with_take_out(Boolean take_out) {
    this.take_out = take_out;
    return this;
  }
  private Boolean delivery;
  public Boolean get_delivery() {
    return delivery;
  }
  public void set_delivery(Boolean delivery) {
    this.delivery = delivery;
  }
  public outputs with_delivery(Boolean delivery) {
    this.delivery = delivery;
    return this;
  }
  private Boolean caters;
  public Boolean get_caters() {
    return caters;
  }
  public void set_caters(Boolean caters) {
    this.caters = caters;
  }
  public outputs with_caters(Boolean caters) {
    this.caters = caters;
    return this;
  }
  private Boolean has_tv;
  public Boolean get_has_tv() {
    return has_tv;
  }
  public void set_has_tv(Boolean has_tv) {
    this.has_tv = has_tv;
  }
  public outputs with_has_tv(Boolean has_tv) {
    this.has_tv = has_tv;
    return this;
  }
  private String noise_level;
  public String get_noise_level() {
    return noise_level;
  }
  public void set_noise_level(String noise_level) {
    this.noise_level = noise_level;
  }
  public outputs with_noise_level(String noise_level) {
    this.noise_level = noise_level;
    return this;
  }
  private String alcohol;
  public String get_alcohol() {
    return alcohol;
  }
  public void set_alcohol(String alcohol) {
    this.alcohol = alcohol;
  }
  public outputs with_alcohol(String alcohol) {
    this.alcohol = alcohol;
    return this;
  }
  private Boolean outdoor_sitting;
  public Boolean get_outdoor_sitting() {
    return outdoor_sitting;
  }
  public void set_outdoor_sitting(Boolean outdoor_sitting) {
    this.outdoor_sitting = outdoor_sitting;
  }
  public outputs with_outdoor_sitting(Boolean outdoor_sitting) {
    this.outdoor_sitting = outdoor_sitting;
    return this;
  }
  private Boolean waiter_service;
  public Boolean get_waiter_service() {
    return waiter_service;
  }
  public void set_waiter_service(Boolean waiter_service) {
    this.waiter_service = waiter_service;
  }
  public outputs with_waiter_service(Boolean waiter_service) {
    this.waiter_service = waiter_service;
    return this;
  }
  private Boolean good_for_groups;
  public Boolean get_good_for_groups() {
    return good_for_groups;
  }
  public void set_good_for_groups(Boolean good_for_groups) {
    this.good_for_groups = good_for_groups;
  }
  public outputs with_good_for_groups(Boolean good_for_groups) {
    this.good_for_groups = good_for_groups;
    return this;
  }
  private Boolean good_for_kids;
  public Boolean get_good_for_kids() {
    return good_for_kids;
  }
  public void set_good_for_kids(Boolean good_for_kids) {
    this.good_for_kids = good_for_kids;
  }
  public outputs with_good_for_kids(Boolean good_for_kids) {
    this.good_for_kids = good_for_kids;
    return this;
  }
  private Float rating_median;
  public Float get_rating_median() {
    return rating_median;
  }
  public void set_rating_median(Float rating_median) {
    this.rating_median = rating_median;
  }
  public outputs with_rating_median(Float rating_median) {
    this.rating_median = rating_median;
    return this;
  }
  private Float rating_mean;
  public Float get_rating_mean() {
    return rating_mean;
  }
  public void set_rating_mean(Float rating_mean) {
    this.rating_mean = rating_mean;
  }
  public outputs with_rating_mean(Float rating_mean) {
    this.rating_mean = rating_mean;
    return this;
  }
  private Integer days_since_last_review;
  public Integer get_days_since_last_review() {
    return days_since_last_review;
  }
  public void set_days_since_last_review(Integer days_since_last_review) {
    this.days_since_last_review = days_since_last_review;
  }
  public outputs with_days_since_last_review(Integer days_since_last_review) {
    this.days_since_last_review = days_since_last_review;
    return this;
  }
  private Float last3_over_mean;
  public Float get_last3_over_mean() {
    return last3_over_mean;
  }
  public void set_last3_over_mean(Float last3_over_mean) {
    this.last3_over_mean = last3_over_mean;
  }
  public outputs with_last3_over_mean(Float last3_over_mean) {
    this.last3_over_mean = last3_over_mean;
    return this;
  }
  private Float median_review_frequency;
  public Float get_median_review_frequency() {
    return median_review_frequency;
  }
  public void set_median_review_frequency(Float median_review_frequency) {
    this.median_review_frequency = median_review_frequency;
  }
  public outputs with_median_review_frequency(Float median_review_frequency) {
    this.median_review_frequency = median_review_frequency;
    return this;
  }
  private Integer range_review_dates;
  public Integer get_range_review_dates() {
    return range_review_dates;
  }
  public void set_range_review_dates(Integer range_review_dates) {
    this.range_review_dates = range_review_dates;
  }
  public outputs with_range_review_dates(Integer range_review_dates) {
    this.range_review_dates = range_review_dates;
    return this;
  }
  private Float rating_variance;
  public Float get_rating_variance() {
    return rating_variance;
  }
  public void set_rating_variance(Float rating_variance) {
    this.rating_variance = rating_variance;
  }
  public outputs with_rating_variance(Float rating_variance) {
    this.rating_variance = rating_variance;
    return this;
  }
  private Integer rating_iqr;
  public Integer get_rating_iqr() {
    return rating_iqr;
  }
  public void set_rating_iqr(Integer rating_iqr) {
    this.rating_iqr = rating_iqr;
  }
  public outputs with_rating_iqr(Integer rating_iqr) {
    this.rating_iqr = rating_iqr;
    return this;
  }
  private Integer review_frequency_iqr;
  public Integer get_review_frequency_iqr() {
    return review_frequency_iqr;
  }
  public void set_review_frequency_iqr(Integer review_frequency_iqr) {
    this.review_frequency_iqr = review_frequency_iqr;
  }
  public outputs with_review_frequency_iqr(Integer review_frequency_iqr) {
    this.review_frequency_iqr = review_frequency_iqr;
    return this;
  }
  private Integer rating_mad;
  public Integer get_rating_mad() {
    return rating_mad;
  }
  public void set_rating_mad(Integer rating_mad) {
    this.rating_mad = rating_mad;
  }
  public outputs with_rating_mad(Integer rating_mad) {
    this.rating_mad = rating_mad;
    return this;
  }
  private Integer review_frequency_mad;
  public Integer get_review_frequency_mad() {
    return review_frequency_mad;
  }
  public void set_review_frequency_mad(Integer review_frequency_mad) {
    this.review_frequency_mad = review_frequency_mad;
  }
  public outputs with_review_frequency_mad(Integer review_frequency_mad) {
    this.review_frequency_mad = review_frequency_mad;
    return this;
  }
  private Float rating_mean_30;
  public Float get_rating_mean_30() {
    return rating_mean_30;
  }
  public void set_rating_mean_30(Float rating_mean_30) {
    this.rating_mean_30 = rating_mean_30;
  }
  public outputs with_rating_mean_30(Float rating_mean_30) {
    this.rating_mean_30 = rating_mean_30;
    return this;
  }
  private Float rating_mean_60;
  public Float get_rating_mean_60() {
    return rating_mean_60;
  }
  public void set_rating_mean_60(Float rating_mean_60) {
    this.rating_mean_60 = rating_mean_60;
  }
  public outputs with_rating_mean_60(Float rating_mean_60) {
    this.rating_mean_60 = rating_mean_60;
    return this;
  }
  private Float rating_mean_90;
  public Float get_rating_mean_90() {
    return rating_mean_90;
  }
  public void set_rating_mean_90(Float rating_mean_90) {
    this.rating_mean_90 = rating_mean_90;
  }
  public outputs with_rating_mean_90(Float rating_mean_90) {
    this.rating_mean_90 = rating_mean_90;
    return this;
  }
  private Float rating_mean_120;
  public Float get_rating_mean_120() {
    return rating_mean_120;
  }
  public void set_rating_mean_120(Float rating_mean_120) {
    this.rating_mean_120 = rating_mean_120;
  }
  public outputs with_rating_mean_120(Float rating_mean_120) {
    this.rating_mean_120 = rating_mean_120;
    return this;
  }
  private Float rating_mean_150;
  public Float get_rating_mean_150() {
    return rating_mean_150;
  }
  public void set_rating_mean_150(Float rating_mean_150) {
    this.rating_mean_150 = rating_mean_150;
  }
  public outputs with_rating_mean_150(Float rating_mean_150) {
    this.rating_mean_150 = rating_mean_150;
    return this;
  }
  private Float rating_mean_180;
  public Float get_rating_mean_180() {
    return rating_mean_180;
  }
  public void set_rating_mean_180(Float rating_mean_180) {
    this.rating_mean_180 = rating_mean_180;
  }
  public outputs with_rating_mean_180(Float rating_mean_180) {
    this.rating_mean_180 = rating_mean_180;
    return this;
  }
  private Float rating_mean_210;
  public Float get_rating_mean_210() {
    return rating_mean_210;
  }
  public void set_rating_mean_210(Float rating_mean_210) {
    this.rating_mean_210 = rating_mean_210;
  }
  public outputs with_rating_mean_210(Float rating_mean_210) {
    this.rating_mean_210 = rating_mean_210;
    return this;
  }
  private Float rating_mean_210_plus;
  public Float get_rating_mean_210_plus() {
    return rating_mean_210_plus;
  }
  public void set_rating_mean_210_plus(Float rating_mean_210_plus) {
    this.rating_mean_210_plus = rating_mean_210_plus;
  }
  public outputs with_rating_mean_210_plus(Float rating_mean_210_plus) {
    this.rating_mean_210_plus = rating_mean_210_plus;
    return this;
  }
  private java.sql.Timestamp review_date;
  public java.sql.Timestamp get_review_date() {
    return review_date;
  }
  public void set_review_date(java.sql.Timestamp review_date) {
    this.review_date = review_date;
  }
  public outputs with_review_date(java.sql.Timestamp review_date) {
    this.review_date = review_date;
    return this;
  }
  private String review_user_name;
  public String get_review_user_name() {
    return review_user_name;
  }
  public void set_review_user_name(String review_user_name) {
    this.review_user_name = review_user_name;
  }
  public outputs with_review_user_name(String review_user_name) {
    this.review_user_name = review_user_name;
    return this;
  }
  private String review_city;
  public String get_review_city() {
    return review_city;
  }
  public void set_review_city(String review_city) {
    this.review_city = review_city;
  }
  public outputs with_review_city(String review_city) {
    this.review_city = review_city;
    return this;
  }
  private String review_description;
  public String get_review_description() {
    return review_description;
  }
  public void set_review_description(String review_description) {
    this.review_description = review_description;
  }
  public outputs with_review_description(String review_description) {
    this.review_description = review_description;
    return this;
  }
  private Float review_rating;
  public Float get_review_rating() {
    return review_rating;
  }
  public void set_review_rating(Float review_rating) {
    this.review_rating = review_rating;
  }
  public outputs with_review_rating(Float review_rating) {
    this.review_rating = review_rating;
    return this;
  }
  private Integer input_id;
  public Integer get_input_id() {
    return input_id;
  }
  public void set_input_id(Integer input_id) {
    this.input_id = input_id;
  }
  public outputs with_input_id(Integer input_id) {
    this.input_id = input_id;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public outputs with_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
    return this;
  }
  private java.sql.Timestamp updated_at;
  public java.sql.Timestamp get_updated_at() {
    return updated_at;
  }
  public void set_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
  }
  public outputs with_updated_at(java.sql.Timestamp updated_at) {
    this.updated_at = updated_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof outputs)) {
      return false;
    }
    outputs that = (outputs) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.merchant_id == null ? that.merchant_id == null : this.merchant_id.equals(that.merchant_id));
    equal = equal && (this.contract_id == null ? that.contract_id == null : this.contract_id.equals(that.contract_id));
    equal = equal && (this.merchant_name == null ? that.merchant_name == null : this.merchant_name.equals(that.merchant_name));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.phone_no == null ? that.phone_no == null : this.phone_no.equals(that.phone_no));
    equal = equal && (this.funded_amount == null ? that.funded_amount == null : this.funded_amount.equals(that.funded_amount));
    equal = equal && (this.fico == null ? that.fico == null : this.fico.equals(that.fico));
    equal = equal && (this.sc3score == null ? that.sc3score == null : this.sc3score.equals(that.sc3score));
    equal = equal && (this.nopo_flag == null ? that.nopo_flag == null : this.nopo_flag.equals(that.nopo_flag));
    equal = equal && (this.annual_sales == null ? that.annual_sales == null : this.annual_sales.equals(that.annual_sales));
    equal = equal && (this.sic_code == null ? that.sic_code == null : this.sic_code.equals(that.sic_code));
    equal = equal && (this.restaurant_category == null ? that.restaurant_category == null : this.restaurant_category.equals(that.restaurant_category));
    equal = equal && (this.website_address == null ? that.website_address == null : this.website_address.equals(that.website_address));
    equal = equal && (this.hours == null ? that.hours == null : this.hours.equals(that.hours));
    equal = equal && (this.parking == null ? that.parking == null : this.parking.equals(that.parking));
    equal = equal && (this.review_count == null ? that.review_count == null : this.review_count.equals(that.review_count));
    equal = equal && (this.average_rating == null ? that.average_rating == null : this.average_rating.equals(that.average_rating));
    equal = equal && (this.menu_price == null ? that.menu_price == null : this.menu_price.equals(that.menu_price));
    equal = equal && (this.accept_credit_card == null ? that.accept_credit_card == null : this.accept_credit_card.equals(that.accept_credit_card));
    equal = equal && (this.dress_code == null ? that.dress_code == null : this.dress_code.equals(that.dress_code));
    equal = equal && (this.reservation == null ? that.reservation == null : this.reservation.equals(that.reservation));
    equal = equal && (this.take_out == null ? that.take_out == null : this.take_out.equals(that.take_out));
    equal = equal && (this.delivery == null ? that.delivery == null : this.delivery.equals(that.delivery));
    equal = equal && (this.caters == null ? that.caters == null : this.caters.equals(that.caters));
    equal = equal && (this.has_tv == null ? that.has_tv == null : this.has_tv.equals(that.has_tv));
    equal = equal && (this.noise_level == null ? that.noise_level == null : this.noise_level.equals(that.noise_level));
    equal = equal && (this.alcohol == null ? that.alcohol == null : this.alcohol.equals(that.alcohol));
    equal = equal && (this.outdoor_sitting == null ? that.outdoor_sitting == null : this.outdoor_sitting.equals(that.outdoor_sitting));
    equal = equal && (this.waiter_service == null ? that.waiter_service == null : this.waiter_service.equals(that.waiter_service));
    equal = equal && (this.good_for_groups == null ? that.good_for_groups == null : this.good_for_groups.equals(that.good_for_groups));
    equal = equal && (this.good_for_kids == null ? that.good_for_kids == null : this.good_for_kids.equals(that.good_for_kids));
    equal = equal && (this.rating_median == null ? that.rating_median == null : this.rating_median.equals(that.rating_median));
    equal = equal && (this.rating_mean == null ? that.rating_mean == null : this.rating_mean.equals(that.rating_mean));
    equal = equal && (this.days_since_last_review == null ? that.days_since_last_review == null : this.days_since_last_review.equals(that.days_since_last_review));
    equal = equal && (this.last3_over_mean == null ? that.last3_over_mean == null : this.last3_over_mean.equals(that.last3_over_mean));
    equal = equal && (this.median_review_frequency == null ? that.median_review_frequency == null : this.median_review_frequency.equals(that.median_review_frequency));
    equal = equal && (this.range_review_dates == null ? that.range_review_dates == null : this.range_review_dates.equals(that.range_review_dates));
    equal = equal && (this.rating_variance == null ? that.rating_variance == null : this.rating_variance.equals(that.rating_variance));
    equal = equal && (this.rating_iqr == null ? that.rating_iqr == null : this.rating_iqr.equals(that.rating_iqr));
    equal = equal && (this.review_frequency_iqr == null ? that.review_frequency_iqr == null : this.review_frequency_iqr.equals(that.review_frequency_iqr));
    equal = equal && (this.rating_mad == null ? that.rating_mad == null : this.rating_mad.equals(that.rating_mad));
    equal = equal && (this.review_frequency_mad == null ? that.review_frequency_mad == null : this.review_frequency_mad.equals(that.review_frequency_mad));
    equal = equal && (this.rating_mean_30 == null ? that.rating_mean_30 == null : this.rating_mean_30.equals(that.rating_mean_30));
    equal = equal && (this.rating_mean_60 == null ? that.rating_mean_60 == null : this.rating_mean_60.equals(that.rating_mean_60));
    equal = equal && (this.rating_mean_90 == null ? that.rating_mean_90 == null : this.rating_mean_90.equals(that.rating_mean_90));
    equal = equal && (this.rating_mean_120 == null ? that.rating_mean_120 == null : this.rating_mean_120.equals(that.rating_mean_120));
    equal = equal && (this.rating_mean_150 == null ? that.rating_mean_150 == null : this.rating_mean_150.equals(that.rating_mean_150));
    equal = equal && (this.rating_mean_180 == null ? that.rating_mean_180 == null : this.rating_mean_180.equals(that.rating_mean_180));
    equal = equal && (this.rating_mean_210 == null ? that.rating_mean_210 == null : this.rating_mean_210.equals(that.rating_mean_210));
    equal = equal && (this.rating_mean_210_plus == null ? that.rating_mean_210_plus == null : this.rating_mean_210_plus.equals(that.rating_mean_210_plus));
    equal = equal && (this.review_date == null ? that.review_date == null : this.review_date.equals(that.review_date));
    equal = equal && (this.review_user_name == null ? that.review_user_name == null : this.review_user_name.equals(that.review_user_name));
    equal = equal && (this.review_city == null ? that.review_city == null : this.review_city.equals(that.review_city));
    equal = equal && (this.review_description == null ? that.review_description == null : this.review_description.equals(that.review_description));
    equal = equal && (this.review_rating == null ? that.review_rating == null : this.review_rating.equals(that.review_rating));
    equal = equal && (this.input_id == null ? that.input_id == null : this.input_id.equals(that.input_id));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.updated_at == null ? that.updated_at == null : this.updated_at.equals(that.updated_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.merchant_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.contract_id = JdbcWritableBridge.readString(3, __dbResults);
    this.merchant_name = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.state = JdbcWritableBridge.readString(7, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(8, __dbResults);
    this.phone_no = JdbcWritableBridge.readString(9, __dbResults);
    this.funded_amount = JdbcWritableBridge.readFloat(10, __dbResults);
    this.fico = JdbcWritableBridge.readInteger(11, __dbResults);
    this.sc3score = JdbcWritableBridge.readInteger(12, __dbResults);
    this.nopo_flag = JdbcWritableBridge.readBoolean(13, __dbResults);
    this.annual_sales = JdbcWritableBridge.readFloat(14, __dbResults);
    this.sic_code = JdbcWritableBridge.readString(15, __dbResults);
    this.restaurant_category = JdbcWritableBridge.readString(16, __dbResults);
    this.website_address = JdbcWritableBridge.readString(17, __dbResults);
    this.hours = JdbcWritableBridge.readString(18, __dbResults);
    this.parking = JdbcWritableBridge.readString(19, __dbResults);
    this.review_count = JdbcWritableBridge.readInteger(20, __dbResults);
    this.average_rating = JdbcWritableBridge.readFloat(21, __dbResults);
    this.menu_price = JdbcWritableBridge.readString(22, __dbResults);
    this.accept_credit_card = JdbcWritableBridge.readBoolean(23, __dbResults);
    this.dress_code = JdbcWritableBridge.readString(24, __dbResults);
    this.reservation = JdbcWritableBridge.readBoolean(25, __dbResults);
    this.take_out = JdbcWritableBridge.readBoolean(26, __dbResults);
    this.delivery = JdbcWritableBridge.readBoolean(27, __dbResults);
    this.caters = JdbcWritableBridge.readBoolean(28, __dbResults);
    this.has_tv = JdbcWritableBridge.readBoolean(29, __dbResults);
    this.noise_level = JdbcWritableBridge.readString(30, __dbResults);
    this.alcohol = JdbcWritableBridge.readString(31, __dbResults);
    this.outdoor_sitting = JdbcWritableBridge.readBoolean(32, __dbResults);
    this.waiter_service = JdbcWritableBridge.readBoolean(33, __dbResults);
    this.good_for_groups = JdbcWritableBridge.readBoolean(34, __dbResults);
    this.good_for_kids = JdbcWritableBridge.readBoolean(35, __dbResults);
    this.rating_median = JdbcWritableBridge.readFloat(36, __dbResults);
    this.rating_mean = JdbcWritableBridge.readFloat(37, __dbResults);
    this.days_since_last_review = JdbcWritableBridge.readInteger(38, __dbResults);
    this.last3_over_mean = JdbcWritableBridge.readFloat(39, __dbResults);
    this.median_review_frequency = JdbcWritableBridge.readFloat(40, __dbResults);
    this.range_review_dates = JdbcWritableBridge.readInteger(41, __dbResults);
    this.rating_variance = JdbcWritableBridge.readFloat(42, __dbResults);
    this.rating_iqr = JdbcWritableBridge.readInteger(43, __dbResults);
    this.review_frequency_iqr = JdbcWritableBridge.readInteger(44, __dbResults);
    this.rating_mad = JdbcWritableBridge.readInteger(45, __dbResults);
    this.review_frequency_mad = JdbcWritableBridge.readInteger(46, __dbResults);
    this.rating_mean_30 = JdbcWritableBridge.readFloat(47, __dbResults);
    this.rating_mean_60 = JdbcWritableBridge.readFloat(48, __dbResults);
    this.rating_mean_90 = JdbcWritableBridge.readFloat(49, __dbResults);
    this.rating_mean_120 = JdbcWritableBridge.readFloat(50, __dbResults);
    this.rating_mean_150 = JdbcWritableBridge.readFloat(51, __dbResults);
    this.rating_mean_180 = JdbcWritableBridge.readFloat(52, __dbResults);
    this.rating_mean_210 = JdbcWritableBridge.readFloat(53, __dbResults);
    this.rating_mean_210_plus = JdbcWritableBridge.readFloat(54, __dbResults);
    this.review_date = JdbcWritableBridge.readTimestamp(55, __dbResults);
    this.review_user_name = JdbcWritableBridge.readString(56, __dbResults);
    this.review_city = JdbcWritableBridge.readString(57, __dbResults);
    this.review_description = JdbcWritableBridge.readString(58, __dbResults);
    this.review_rating = JdbcWritableBridge.readFloat(59, __dbResults);
    this.input_id = JdbcWritableBridge.readInteger(60, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(61, __dbResults);
    this.updated_at = JdbcWritableBridge.readTimestamp(62, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(merchant_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(contract_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(merchant_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(phone_no, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(funded_amount, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(fico, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(sc3score, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(nopo_flag, 13 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeFloat(annual_sales, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(sic_code, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(restaurant_category, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(website_address, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(hours, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(parking, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(review_count, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(average_rating, 21 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(menu_price, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(accept_credit_card, 23 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(dress_code, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(reservation, 25 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(take_out, 26 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(delivery, 27 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(caters, 28 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(has_tv, 29 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(noise_level, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(alcohol, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(outdoor_sitting, 32 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(waiter_service, 33 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(good_for_groups, 34 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(good_for_kids, 35 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_median, 36 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean, 37 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(days_since_last_review, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(last3_over_mean, 39 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(median_review_frequency, 40 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(range_review_dates, 41 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_variance, 42 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(rating_iqr, 43 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(review_frequency_iqr, 44 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(rating_mad, 45 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(review_frequency_mad, 46 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_30, 47 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_60, 48 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_90, 49 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_120, 50 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_150, 51 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_180, 52 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_210, 53 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rating_mean_210_plus, 54 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeTimestamp(review_date, 55 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(review_user_name, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(review_city, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(review_description, 58 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeFloat(review_rating, 59 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(input_id, 60 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 61 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated_at, 62 + __off, 93, __dbStmt);
    return 62;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.merchant_id = null;
    } else {
    this.merchant_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.contract_id = null;
    } else {
    this.contract_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.merchant_name = null;
    } else {
    this.merchant_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zipcode = null;
    } else {
    this.zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.phone_no = null;
    } else {
    this.phone_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.funded_amount = null;
    } else {
    this.funded_amount = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.fico = null;
    } else {
    this.fico = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sc3score = null;
    } else {
    this.sc3score = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.nopo_flag = null;
    } else {
    this.nopo_flag = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.annual_sales = null;
    } else {
    this.annual_sales = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.sic_code = null;
    } else {
    this.sic_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.restaurant_category = null;
    } else {
    this.restaurant_category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.website_address = null;
    } else {
    this.website_address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hours = null;
    } else {
    this.hours = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.parking = null;
    } else {
    this.parking = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_count = null;
    } else {
    this.review_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.average_rating = null;
    } else {
    this.average_rating = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.menu_price = null;
    } else {
    this.menu_price = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.accept_credit_card = null;
    } else {
    this.accept_credit_card = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.dress_code = null;
    } else {
    this.dress_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reservation = null;
    } else {
    this.reservation = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.take_out = null;
    } else {
    this.take_out = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.delivery = null;
    } else {
    this.delivery = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.caters = null;
    } else {
    this.caters = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.has_tv = null;
    } else {
    this.has_tv = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.noise_level = null;
    } else {
    this.noise_level = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.alcohol = null;
    } else {
    this.alcohol = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.outdoor_sitting = null;
    } else {
    this.outdoor_sitting = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.waiter_service = null;
    } else {
    this.waiter_service = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.good_for_groups = null;
    } else {
    this.good_for_groups = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.good_for_kids = null;
    } else {
    this.good_for_kids = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_median = null;
    } else {
    this.rating_median = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean = null;
    } else {
    this.rating_mean = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.days_since_last_review = null;
    } else {
    this.days_since_last_review = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last3_over_mean = null;
    } else {
    this.last3_over_mean = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.median_review_frequency = null;
    } else {
    this.median_review_frequency = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.range_review_dates = null;
    } else {
    this.range_review_dates = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_variance = null;
    } else {
    this.rating_variance = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_iqr = null;
    } else {
    this.rating_iqr = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.review_frequency_iqr = null;
    } else {
    this.review_frequency_iqr = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mad = null;
    } else {
    this.rating_mad = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.review_frequency_mad = null;
    } else {
    this.review_frequency_mad = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_30 = null;
    } else {
    this.rating_mean_30 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_60 = null;
    } else {
    this.rating_mean_60 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_90 = null;
    } else {
    this.rating_mean_90 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_120 = null;
    } else {
    this.rating_mean_120 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_150 = null;
    } else {
    this.rating_mean_150 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_180 = null;
    } else {
    this.rating_mean_180 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_210 = null;
    } else {
    this.rating_mean_210 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rating_mean_210_plus = null;
    } else {
    this.rating_mean_210_plus = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.review_date = null;
    } else {
    this.review_date = new Timestamp(__dataIn.readLong());
    this.review_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.review_user_name = null;
    } else {
    this.review_user_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_city = null;
    } else {
    this.review_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_description = null;
    } else {
    this.review_description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.review_rating = null;
    } else {
    this.review_rating = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.input_id = null;
    } else {
    this.input_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.created_at = null;
    } else {
    this.created_at = new Timestamp(__dataIn.readLong());
    this.created_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.updated_at = null;
    } else {
    this.updated_at = new Timestamp(__dataIn.readLong());
    this.updated_at.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.merchant_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.merchant_id);
    }
    if (null == this.contract_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, contract_id);
    }
    if (null == this.merchant_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, merchant_name);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.phone_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, phone_no);
    }
    if (null == this.funded_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.funded_amount);
    }
    if (null == this.fico) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fico);
    }
    if (null == this.sc3score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sc3score);
    }
    if (null == this.nopo_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.nopo_flag);
    }
    if (null == this.annual_sales) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.annual_sales);
    }
    if (null == this.sic_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sic_code);
    }
    if (null == this.restaurant_category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, restaurant_category);
    }
    if (null == this.website_address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, website_address);
    }
    if (null == this.hours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, hours);
    }
    if (null == this.parking) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, parking);
    }
    if (null == this.review_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.review_count);
    }
    if (null == this.average_rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.average_rating);
    }
    if (null == this.menu_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, menu_price);
    }
    if (null == this.accept_credit_card) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.accept_credit_card);
    }
    if (null == this.dress_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dress_code);
    }
    if (null == this.reservation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.reservation);
    }
    if (null == this.take_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.take_out);
    }
    if (null == this.delivery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.delivery);
    }
    if (null == this.caters) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.caters);
    }
    if (null == this.has_tv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.has_tv);
    }
    if (null == this.noise_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, noise_level);
    }
    if (null == this.alcohol) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, alcohol);
    }
    if (null == this.outdoor_sitting) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.outdoor_sitting);
    }
    if (null == this.waiter_service) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.waiter_service);
    }
    if (null == this.good_for_groups) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.good_for_groups);
    }
    if (null == this.good_for_kids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.good_for_kids);
    }
    if (null == this.rating_median) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_median);
    }
    if (null == this.rating_mean) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean);
    }
    if (null == this.days_since_last_review) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_since_last_review);
    }
    if (null == this.last3_over_mean) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.last3_over_mean);
    }
    if (null == this.median_review_frequency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.median_review_frequency);
    }
    if (null == this.range_review_dates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.range_review_dates);
    }
    if (null == this.rating_variance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_variance);
    }
    if (null == this.rating_iqr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rating_iqr);
    }
    if (null == this.review_frequency_iqr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.review_frequency_iqr);
    }
    if (null == this.rating_mad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rating_mad);
    }
    if (null == this.review_frequency_mad) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.review_frequency_mad);
    }
    if (null == this.rating_mean_30) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_30);
    }
    if (null == this.rating_mean_60) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_60);
    }
    if (null == this.rating_mean_90) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_90);
    }
    if (null == this.rating_mean_120) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_120);
    }
    if (null == this.rating_mean_150) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_150);
    }
    if (null == this.rating_mean_180) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_180);
    }
    if (null == this.rating_mean_210) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_210);
    }
    if (null == this.rating_mean_210_plus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rating_mean_210_plus);
    }
    if (null == this.review_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.review_date.getTime());
    __dataOut.writeInt(this.review_date.getNanos());
    }
    if (null == this.review_user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_user_name);
    }
    if (null == this.review_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_city);
    }
    if (null == this.review_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, review_description);
    }
    if (null == this.review_rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.review_rating);
    }
    if (null == this.input_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.input_id);
    }
    if (null == this.created_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_at.getTime());
    __dataOut.writeInt(this.created_at.getNanos());
    }
    if (null == this.updated_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updated_at.getTime());
    __dataOut.writeInt(this.updated_at.getNanos());
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 32, (char) 39, (char) 92, true);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(merchant_id==null?"null":"" + merchant_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(contract_id==null?"null":contract_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(merchant_name==null?"null":merchant_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phone_no==null?"null":phone_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(funded_amount==null?"null":"" + funded_amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fico==null?"null":"" + fico, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc3score==null?"null":"" + sc3score, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nopo_flag==null?"null":"" + nopo_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(annual_sales==null?"null":"" + annual_sales, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sic_code==null?"null":sic_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(restaurant_category==null?"null":restaurant_category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(website_address==null?"null":website_address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hours==null?"null":hours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parking==null?"null":parking, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_count==null?"null":"" + review_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(average_rating==null?"null":"" + average_rating, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(menu_price==null?"null":menu_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accept_credit_card==null?"null":"" + accept_credit_card, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dress_code==null?"null":dress_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reservation==null?"null":"" + reservation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(take_out==null?"null":"" + take_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delivery==null?"null":"" + delivery, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caters==null?"null":"" + caters, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(has_tv==null?"null":"" + has_tv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(noise_level==null?"null":noise_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(alcohol==null?"null":alcohol, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(outdoor_sitting==null?"null":"" + outdoor_sitting, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(waiter_service==null?"null":"" + waiter_service, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(good_for_groups==null?"null":"" + good_for_groups, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(good_for_kids==null?"null":"" + good_for_kids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_median==null?"null":"" + rating_median, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean==null?"null":"" + rating_mean, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_since_last_review==null?"null":"" + days_since_last_review, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last3_over_mean==null?"null":"" + last3_over_mean, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(median_review_frequency==null?"null":"" + median_review_frequency, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(range_review_dates==null?"null":"" + range_review_dates, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_variance==null?"null":"" + rating_variance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_iqr==null?"null":"" + rating_iqr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_frequency_iqr==null?"null":"" + review_frequency_iqr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mad==null?"null":"" + rating_mad, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_frequency_mad==null?"null":"" + review_frequency_mad, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_30==null?"null":"" + rating_mean_30, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_60==null?"null":"" + rating_mean_60, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_90==null?"null":"" + rating_mean_90, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_120==null?"null":"" + rating_mean_120, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_150==null?"null":"" + rating_mean_150, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_180==null?"null":"" + rating_mean_180, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_210==null?"null":"" + rating_mean_210, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rating_mean_210_plus==null?"null":"" + rating_mean_210_plus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_date==null?"null":"" + review_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_user_name==null?"null":review_user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_city==null?"null":review_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_description==null?"null":review_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_rating==null?"null":"" + review_rating, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(input_id==null?"null":"" + input_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated_at==null?"null":"" + updated_at, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 32, (char) 39, (char) 92, true);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.merchant_id = null; } else {
      this.merchant_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.contract_id = null; } else {
      this.contract_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.merchant_name = null; } else {
      this.merchant_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.phone_no = null; } else {
      this.phone_no = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.funded_amount = null; } else {
      this.funded_amount = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fico = null; } else {
      this.fico = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sc3score = null; } else {
      this.sc3score = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nopo_flag = null; } else {
      this.nopo_flag = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.annual_sales = null; } else {
      this.annual_sales = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sic_code = null; } else {
      this.sic_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.restaurant_category = null; } else {
      this.restaurant_category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.website_address = null; } else {
      this.website_address = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.hours = null; } else {
      this.hours = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.parking = null; } else {
      this.parking = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_count = null; } else {
      this.review_count = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.average_rating = null; } else {
      this.average_rating = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.menu_price = null; } else {
      this.menu_price = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accept_credit_card = null; } else {
      this.accept_credit_card = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dress_code = null; } else {
      this.dress_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reservation = null; } else {
      this.reservation = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.take_out = null; } else {
      this.take_out = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delivery = null; } else {
      this.delivery = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.caters = null; } else {
      this.caters = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.has_tv = null; } else {
      this.has_tv = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.noise_level = null; } else {
      this.noise_level = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.alcohol = null; } else {
      this.alcohol = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.outdoor_sitting = null; } else {
      this.outdoor_sitting = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.waiter_service = null; } else {
      this.waiter_service = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.good_for_groups = null; } else {
      this.good_for_groups = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.good_for_kids = null; } else {
      this.good_for_kids = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_median = null; } else {
      this.rating_median = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean = null; } else {
      this.rating_mean = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_since_last_review = null; } else {
      this.days_since_last_review = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last3_over_mean = null; } else {
      this.last3_over_mean = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.median_review_frequency = null; } else {
      this.median_review_frequency = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.range_review_dates = null; } else {
      this.range_review_dates = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_variance = null; } else {
      this.rating_variance = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_iqr = null; } else {
      this.rating_iqr = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_frequency_iqr = null; } else {
      this.review_frequency_iqr = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mad = null; } else {
      this.rating_mad = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_frequency_mad = null; } else {
      this.review_frequency_mad = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_30 = null; } else {
      this.rating_mean_30 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_60 = null; } else {
      this.rating_mean_60 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_90 = null; } else {
      this.rating_mean_90 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_120 = null; } else {
      this.rating_mean_120 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_150 = null; } else {
      this.rating_mean_150 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_180 = null; } else {
      this.rating_mean_180 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_210 = null; } else {
      this.rating_mean_210 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rating_mean_210_plus = null; } else {
      this.rating_mean_210_plus = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_date = null; } else {
      this.review_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.review_user_name = null; } else {
      this.review_user_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.review_city = null; } else {
      this.review_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.review_description = null; } else {
      this.review_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_rating = null; } else {
      this.review_rating = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.input_id = null; } else {
      this.input_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_at = null; } else {
      this.created_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updated_at = null; } else {
      this.updated_at = java.sql.Timestamp.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    outputs o = (outputs) super.clone();
    o.review_date = (o.review_date != null) ? (java.sql.Timestamp) o.review_date.clone() : null;
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    o.updated_at = (o.updated_at != null) ? (java.sql.Timestamp) o.updated_at.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("merchant_id", this.merchant_id);
    __sqoop$field_map.put("contract_id", this.contract_id);
    __sqoop$field_map.put("merchant_name", this.merchant_name);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("phone_no", this.phone_no);
    __sqoop$field_map.put("funded_amount", this.funded_amount);
    __sqoop$field_map.put("fico", this.fico);
    __sqoop$field_map.put("sc3score", this.sc3score);
    __sqoop$field_map.put("nopo_flag", this.nopo_flag);
    __sqoop$field_map.put("annual_sales", this.annual_sales);
    __sqoop$field_map.put("sic_code", this.sic_code);
    __sqoop$field_map.put("restaurant_category", this.restaurant_category);
    __sqoop$field_map.put("website_address", this.website_address);
    __sqoop$field_map.put("hours", this.hours);
    __sqoop$field_map.put("parking", this.parking);
    __sqoop$field_map.put("review_count", this.review_count);
    __sqoop$field_map.put("average_rating", this.average_rating);
    __sqoop$field_map.put("menu_price", this.menu_price);
    __sqoop$field_map.put("accept_credit_card", this.accept_credit_card);
    __sqoop$field_map.put("dress_code", this.dress_code);
    __sqoop$field_map.put("reservation", this.reservation);
    __sqoop$field_map.put("take_out", this.take_out);
    __sqoop$field_map.put("delivery", this.delivery);
    __sqoop$field_map.put("caters", this.caters);
    __sqoop$field_map.put("has_tv", this.has_tv);
    __sqoop$field_map.put("noise_level", this.noise_level);
    __sqoop$field_map.put("alcohol", this.alcohol);
    __sqoop$field_map.put("outdoor_sitting", this.outdoor_sitting);
    __sqoop$field_map.put("waiter_service", this.waiter_service);
    __sqoop$field_map.put("good_for_groups", this.good_for_groups);
    __sqoop$field_map.put("good_for_kids", this.good_for_kids);
    __sqoop$field_map.put("rating_median", this.rating_median);
    __sqoop$field_map.put("rating_mean", this.rating_mean);
    __sqoop$field_map.put("days_since_last_review", this.days_since_last_review);
    __sqoop$field_map.put("last3_over_mean", this.last3_over_mean);
    __sqoop$field_map.put("median_review_frequency", this.median_review_frequency);
    __sqoop$field_map.put("range_review_dates", this.range_review_dates);
    __sqoop$field_map.put("rating_variance", this.rating_variance);
    __sqoop$field_map.put("rating_iqr", this.rating_iqr);
    __sqoop$field_map.put("review_frequency_iqr", this.review_frequency_iqr);
    __sqoop$field_map.put("rating_mad", this.rating_mad);
    __sqoop$field_map.put("review_frequency_mad", this.review_frequency_mad);
    __sqoop$field_map.put("rating_mean_30", this.rating_mean_30);
    __sqoop$field_map.put("rating_mean_60", this.rating_mean_60);
    __sqoop$field_map.put("rating_mean_90", this.rating_mean_90);
    __sqoop$field_map.put("rating_mean_120", this.rating_mean_120);
    __sqoop$field_map.put("rating_mean_150", this.rating_mean_150);
    __sqoop$field_map.put("rating_mean_180", this.rating_mean_180);
    __sqoop$field_map.put("rating_mean_210", this.rating_mean_210);
    __sqoop$field_map.put("rating_mean_210_plus", this.rating_mean_210_plus);
    __sqoop$field_map.put("review_date", this.review_date);
    __sqoop$field_map.put("review_user_name", this.review_user_name);
    __sqoop$field_map.put("review_city", this.review_city);
    __sqoop$field_map.put("review_description", this.review_description);
    __sqoop$field_map.put("review_rating", this.review_rating);
    __sqoop$field_map.put("input_id", this.input_id);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("updated_at", this.updated_at);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("merchant_id".equals(__fieldName)) {
      this.merchant_id = (Integer) __fieldVal;
    }
    else    if ("contract_id".equals(__fieldName)) {
      this.contract_id = (String) __fieldVal;
    }
    else    if ("merchant_name".equals(__fieldName)) {
      this.merchant_name = (String) __fieldVal;
    }
    else    if ("address".equals(__fieldName)) {
      this.address = (String) __fieldVal;
    }
    else    if ("city".equals(__fieldName)) {
      this.city = (String) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("zipcode".equals(__fieldName)) {
      this.zipcode = (String) __fieldVal;
    }
    else    if ("phone_no".equals(__fieldName)) {
      this.phone_no = (String) __fieldVal;
    }
    else    if ("funded_amount".equals(__fieldName)) {
      this.funded_amount = (Float) __fieldVal;
    }
    else    if ("fico".equals(__fieldName)) {
      this.fico = (Integer) __fieldVal;
    }
    else    if ("sc3score".equals(__fieldName)) {
      this.sc3score = (Integer) __fieldVal;
    }
    else    if ("nopo_flag".equals(__fieldName)) {
      this.nopo_flag = (Boolean) __fieldVal;
    }
    else    if ("annual_sales".equals(__fieldName)) {
      this.annual_sales = (Float) __fieldVal;
    }
    else    if ("sic_code".equals(__fieldName)) {
      this.sic_code = (String) __fieldVal;
    }
    else    if ("restaurant_category".equals(__fieldName)) {
      this.restaurant_category = (String) __fieldVal;
    }
    else    if ("website_address".equals(__fieldName)) {
      this.website_address = (String) __fieldVal;
    }
    else    if ("hours".equals(__fieldName)) {
      this.hours = (String) __fieldVal;
    }
    else    if ("parking".equals(__fieldName)) {
      this.parking = (String) __fieldVal;
    }
    else    if ("review_count".equals(__fieldName)) {
      this.review_count = (Integer) __fieldVal;
    }
    else    if ("average_rating".equals(__fieldName)) {
      this.average_rating = (Float) __fieldVal;
    }
    else    if ("menu_price".equals(__fieldName)) {
      this.menu_price = (String) __fieldVal;
    }
    else    if ("accept_credit_card".equals(__fieldName)) {
      this.accept_credit_card = (Boolean) __fieldVal;
    }
    else    if ("dress_code".equals(__fieldName)) {
      this.dress_code = (String) __fieldVal;
    }
    else    if ("reservation".equals(__fieldName)) {
      this.reservation = (Boolean) __fieldVal;
    }
    else    if ("take_out".equals(__fieldName)) {
      this.take_out = (Boolean) __fieldVal;
    }
    else    if ("delivery".equals(__fieldName)) {
      this.delivery = (Boolean) __fieldVal;
    }
    else    if ("caters".equals(__fieldName)) {
      this.caters = (Boolean) __fieldVal;
    }
    else    if ("has_tv".equals(__fieldName)) {
      this.has_tv = (Boolean) __fieldVal;
    }
    else    if ("noise_level".equals(__fieldName)) {
      this.noise_level = (String) __fieldVal;
    }
    else    if ("alcohol".equals(__fieldName)) {
      this.alcohol = (String) __fieldVal;
    }
    else    if ("outdoor_sitting".equals(__fieldName)) {
      this.outdoor_sitting = (Boolean) __fieldVal;
    }
    else    if ("waiter_service".equals(__fieldName)) {
      this.waiter_service = (Boolean) __fieldVal;
    }
    else    if ("good_for_groups".equals(__fieldName)) {
      this.good_for_groups = (Boolean) __fieldVal;
    }
    else    if ("good_for_kids".equals(__fieldName)) {
      this.good_for_kids = (Boolean) __fieldVal;
    }
    else    if ("rating_median".equals(__fieldName)) {
      this.rating_median = (Float) __fieldVal;
    }
    else    if ("rating_mean".equals(__fieldName)) {
      this.rating_mean = (Float) __fieldVal;
    }
    else    if ("days_since_last_review".equals(__fieldName)) {
      this.days_since_last_review = (Integer) __fieldVal;
    }
    else    if ("last3_over_mean".equals(__fieldName)) {
      this.last3_over_mean = (Float) __fieldVal;
    }
    else    if ("median_review_frequency".equals(__fieldName)) {
      this.median_review_frequency = (Float) __fieldVal;
    }
    else    if ("range_review_dates".equals(__fieldName)) {
      this.range_review_dates = (Integer) __fieldVal;
    }
    else    if ("rating_variance".equals(__fieldName)) {
      this.rating_variance = (Float) __fieldVal;
    }
    else    if ("rating_iqr".equals(__fieldName)) {
      this.rating_iqr = (Integer) __fieldVal;
    }
    else    if ("review_frequency_iqr".equals(__fieldName)) {
      this.review_frequency_iqr = (Integer) __fieldVal;
    }
    else    if ("rating_mad".equals(__fieldName)) {
      this.rating_mad = (Integer) __fieldVal;
    }
    else    if ("review_frequency_mad".equals(__fieldName)) {
      this.review_frequency_mad = (Integer) __fieldVal;
    }
    else    if ("rating_mean_30".equals(__fieldName)) {
      this.rating_mean_30 = (Float) __fieldVal;
    }
    else    if ("rating_mean_60".equals(__fieldName)) {
      this.rating_mean_60 = (Float) __fieldVal;
    }
    else    if ("rating_mean_90".equals(__fieldName)) {
      this.rating_mean_90 = (Float) __fieldVal;
    }
    else    if ("rating_mean_120".equals(__fieldName)) {
      this.rating_mean_120 = (Float) __fieldVal;
    }
    else    if ("rating_mean_150".equals(__fieldName)) {
      this.rating_mean_150 = (Float) __fieldVal;
    }
    else    if ("rating_mean_180".equals(__fieldName)) {
      this.rating_mean_180 = (Float) __fieldVal;
    }
    else    if ("rating_mean_210".equals(__fieldName)) {
      this.rating_mean_210 = (Float) __fieldVal;
    }
    else    if ("rating_mean_210_plus".equals(__fieldName)) {
      this.rating_mean_210_plus = (Float) __fieldVal;
    }
    else    if ("review_date".equals(__fieldName)) {
      this.review_date = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("review_user_name".equals(__fieldName)) {
      this.review_user_name = (String) __fieldVal;
    }
    else    if ("review_city".equals(__fieldName)) {
      this.review_city = (String) __fieldVal;
    }
    else    if ("review_description".equals(__fieldName)) {
      this.review_description = (String) __fieldVal;
    }
    else    if ("review_rating".equals(__fieldName)) {
      this.review_rating = (Float) __fieldVal;
    }
    else    if ("input_id".equals(__fieldName)) {
      this.input_id = (Integer) __fieldVal;
    }
    else    if ("created_at".equals(__fieldName)) {
      this.created_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("updated_at".equals(__fieldName)) {
      this.updated_at = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
