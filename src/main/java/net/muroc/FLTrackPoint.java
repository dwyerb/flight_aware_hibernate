package net.muroc;

/**
 * Created by Brendan on 7/31/2017.
 */
import org.json.JSONException;
import org.json.JSONObject;

public class FLTrackPoint {

    private String flightUID;
    private String hex;

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }


    private String squawk;

    public String getSquawk() {
        return squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    private String flight;

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }


    private double lat;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }


    private double lon;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }


    private double nucp;

    public double getNucp() {
        return nucp;
    }

    public void setNucp(double nucp) {
        this.nucp = nucp;
    }


    private int seen_pos;

    public int getSeen_pos() {
        return seen_pos;
    }

    public void setSeen_pos(int seen_pos) {
        this.seen_pos = seen_pos;
    }


    private int altitude;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }


    private int vert_rate;

    public int getVert_rate() {
        return vert_rate;
    }

    public void setVert_rate(int vert_rate) {
        this.vert_rate = vert_rate;
    }


    private int track;

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }



    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    private String category;
    private String Omlat;
    private String Otisb;
    private int messages;

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }



    private int seen;

    public int getSeen() {
        return seen;
    }

    public void setSeen(int seen) {
        this.seen = seen;
    }


    private double rssi;

    public double getRssi() {
        return rssi;
    }

    public void setRssi(double rssi) {
        this.rssi = rssi;
    }


    public FLTrackPoint() {

    }
}