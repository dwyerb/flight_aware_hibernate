package net.muroc;

/**
 * Created by Brendan on 7/31/2017.
 */
import org.json.JSONException;
import org.json.JSONObject;

public class FLTrackPoint {

    private String flightUID;
    private String hex;

    public String gethex() {
        return hex;
    }

    public void sethex(String hex) {
        this.hex = hex;
    }

    private String squawk;

    public String getsquawk() {
        return squawk;
    }

    public void setsquawk(String squawk) {
        this.squawk = squawk;
    }

    private String flight;

    public String getflight() {
        return flight;
    }

    public void setflight(String flight) {
        this.flight = flight;
    }

    private double lat;

    public double getlat() {
        return lat;
    }

    public void setlat(double lat) {
        this.lat = lat;
    }

    private double lon;

    public double getlon() {
        return lon;
    }

    public void setlon(double lon) {
        this.lon = lon;
    }

    private Double nucp;

    public double getnucp() {
        return nucp;
    }

    public void setnucp(double nucp) {
        this.nucp = nucp;
    }

    private double seen_pos;

    public double getseen_pos() {
        return seen_pos;
    }

    public void setseen_pos(double seen_pos) {
        this.seen_pos = seen_pos;
    }

    private int altitude;

    public int getaltitude() {
        return altitude;
    }

    public void setaltitude(int altitude) {
        this.altitude = altitude;
    }

    private int vert_rate;

    public int getvert_rate() {
        return vert_rate;
    }

    public void setvert_rate(int vert_rate) {
        this.vert_rate = vert_rate;
    }

    private int track;

    public int gettrack() {
        return track;
    }

    public void settrack(int track) {
        this.track = track;
    }

    private int speed;

    public int getspeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    private String category;
    private String Omlat;
    private String Otisb;
    private int messages;

    public int getmessages() {
        return messages;
    }

    public void setmessages(int messages) {
        this.messages = messages;
    }

    private double seen;

    public double getseen() {
        return seen;
    }

    public void setseen(int seen) {
        this.seen = seen;
    }

    private double rssi;

    public double getrssi() {
        return rssi;
    }

    public void setrssi(double rssi) {
        this.rssi = rssi;
    }

    public FLTrackPoint() {

    }
}