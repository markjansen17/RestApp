package jru.restaurantapp.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.String;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jansen on 6/29/2017.
 */

public class Restaurant extends RealmObject{

    @SerializedName("rest_id")
    @Expose
    @PrimaryKey
    private Integer restId;
    @SerializedName("rest_name")
    @Expose
    private String restName;
    @SerializedName("rest_add")
    @Expose
    private String restAdd;

    @SerializedName("rest_category")
    @Expose
    private String restCategory;

    @SerializedName("rest_contact")
    @Expose
    private String restContact;

    @SerializedName("rest_hours")
    @Expose
    private String restHours;
    @SerializedName("rest_hours_open")
    @Expose
    private String restHoursOpen;

    @SerializedName("rest_hours_close")
    @Expose
    private String restHoursClose;
    @SerializedName("rest_lat")
    @Expose
    private Double restLat;
    @SerializedName("rest_lng")
    @Expose
    private Double restLng;
    @SerializedName("rest_slot_left")
    @Expose
    private Integer restSlotLeft;
    @SerializedName("rest_slot_max")
    @Expose
    private Integer restSlotMax;
    @SerializedName("rest_image")
    @Expose
    private String restImage;
    @SerializedName("rest_username")
    @Expose
    private String restUsername;
    @SerializedName("rest_password")
    @Expose
    private String restPassword;

    @SerializedName("products")
    @Expose
    private RealmList<Product> products;

    @SerializedName("reservations_today")
    @Expose
    private RealmList<Reservation> reservationsToday;


    @SerializedName("reservations_tomorrow")
    @Expose
    private RealmList<Reservation> reservationsTomorrow;

    private double distance;

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestAdd() {
        return restAdd;
    }

    public void setRestAdd(String restAdd) {
        this.restAdd = restAdd;
    }

    public String getRestContact() {
        return restContact;
    }

    public void setRestContact(String restContact) {
        this.restContact = restContact;
    }

    public String getRestHours() {
        return restHours;
    }

    public void setRestHours(String restHours) {
        this.restHours = restHours;
    }

    public String getRestHoursOpen() {
        return restHoursOpen;
    }

    public void setRestHoursOpen(String restHoursOpen) {
        this.restHoursOpen = restHoursOpen;
    }

    public String getRestHoursClose() {
        return restHoursClose;
    }

    public void setRestHoursClose(String restHoursClose) {
        this.restHoursClose = restHoursClose;
    }

    public Double getRestLat() {
        return restLat;
    }

    public void setRestLat(Double restLat) {
        this.restLat = restLat;
    }

    public Double getRestLng() {
        return restLng;
    }

    public void setRestLng(Double restLng) {
        this.restLng = restLng;
    }

    public Integer getRestSlotLeft() {
        return restSlotLeft;
    }

    public void setRestSlotLeft(Integer restSlotLeft) {
        this.restSlotLeft = restSlotLeft;
    }

    public Integer getRestSlotMax() {
        return restSlotMax;
    }

    public void setRestSlotMax(Integer restSlotMax) {
        this.restSlotMax = restSlotMax;
    }

    public String getRestImage() {
        return restImage;
    }

    public void setRestImage(String restImage) {
        this.restImage = restImage;
    }

    public String getRestUsername() {
        return restUsername;
    }

    public void setRestUsername(String restUsername) {
        this.restUsername = restUsername;
    }

    public String getRestPassword() {
        return restPassword;
    }

    public void setRestPassword(String restPassword) {
        this.restPassword = restPassword;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public String getRestCategory() {
        return restCategory;
    }

    public void setRestCategory(String restCategory) {
        this.restCategory = restCategory;
    }

    public RealmList<Product> getProducts() {
        return products;
    }

    public void setProducts(RealmList<Product> products) {
        this.products = products;
    }

    public RealmList<Reservation> getReservationsToday() {
        return reservationsToday;
    }

    public void setReservationsToday(RealmList<Reservation> reservationsToday) {
        this.reservationsToday = reservationsToday;
    }

    public RealmList<Reservation> getReservationsTomorrow() {
        return reservationsTomorrow;
    }

    public void setReservationsTomorrow(RealmList<Reservation> reservationsTomorrow) {
        this.reservationsTomorrow = reservationsTomorrow;
    }
}