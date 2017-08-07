package net.muroc;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brendan on 8/6/2017.
 */
public class FlightAwarePersistance {

    public static void main(String[] args) throws Exception
    {
        String url = "http://192.168.0.6:8080/data/aircraft.json";
        InputStream source = retrieveStream(url);

        Gson gson = new Gson();
        Reader reader = new InputStreamReader(source);
        Messages messages = gson.fromJson(reader, Messages.class);
        List<FLTrackPoint> results = messages.aircraft;
        System.out.println("test");




        /*JSONObject json = JsonReader.readJsonFromUrl("http://192.168.0.6:8080/data/aircraft.json");
        JSONArray flightAircraft = json.getJSONArray("aircraft");
        ArrayList<FLTrackPoint> trackList=new ArrayList<FLTrackPoint>();

        for(int i = 0; i < flightAircraft.length(); i++)
        {
            JSONObject flightObj = flightAircraft.getJSONObject(i);
            if (flightObj.has("squawk") && flightObj.has("flight"))
            {
                FLTrackPoint currentTrackPoint = new FLTrackPoint(flightObj);
                //System.out.println("Squawk: " + flightObj.get("squawk"));
                System.out.println("Squawk: " + flightObj.get("squawk"));
            }
        }*/

        //Gson gson = new Gson();
        /*Messages messages = null;
        String json = readUrl("http://192.168.0.6:8080/data/aircraft.json" );
        System.out.println( json );
        Gson gson = new GsonBuilder().create();
        messages = gson.fromJson(json, Messages.class);
        System.out.println("test");*/



    }
    private static InputStream retrieveStream(String url) {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(url);
        try {
            HttpResponse getResponse = client.execute(getRequest);
            final int statusCode = getResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                //Log.w(getClass().getSimpleName(),
                 //       "Error " + statusCode + " for URL " + url);
                return null;
            }
            HttpEntity getResponseEntity = getResponse.getEntity();
            return getResponseEntity.getContent();
        }
        catch (IOException e) {
            getRequest.abort();
            //Log.w(getClass().getSimpleName(), "Error for URL " + url, e);
        }
        return null;
    }
}