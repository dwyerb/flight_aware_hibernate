package net.muroc;

/**
 * Created by Brendan on 8/13/2017.
 */
public class Flight_Track {
    private String hex;
    private String squawk;
    private String flight;

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getSquawk() {
        return squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
