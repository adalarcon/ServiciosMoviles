package mx.uach.newcompass3.Objects;

/**
 * Created by Alt on 09/12/2018.
 */

public class ActiveService {
    private int service;
    private int attending;
    private double originlat;
    private double originlon;
    private double destinitylat;
    private double destinitylon;
    private float distance;
    private String key;
    private String client;
    private String date;
    private String rTime;

    public ActiveService() {
    }

    public ActiveService(int service, int attending, double originlat, double originlon, double destinitylat, double destinitylon, String client, String date, String rTime) {
        this.service = service;
        this.attending = attending;
        this.originlat = originlat;
        this.originlon = originlon;
        this.destinitylat = destinitylat;
        this.destinitylon = destinitylon;
        this.client = client;
        this.date = date;
        this.rTime = rTime;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getAttending() {
        return attending;
    }

    public void setAttending(int attending) {
        this.attending = attending;
    }

    public double getOriginlat() {
        return originlat;
    }

    public void setOriginlat(double originlat) {
        this.originlat = originlat;
    }

    public double getOriginlon() {
        return originlon;
    }

    public void setOriginlon(double originlon) {
        this.originlon = originlon;
    }

    public double getDestinitylat() {
        return destinitylat;
    }

    public void setDestinitylat(double destinitylat) {
        this.destinitylat = destinitylat;
    }

    public double getDestinitylon() {
        return destinitylon;
    }

    public void setDestinitylon(double destinitylon) {
        this.destinitylon = destinitylon;
    }

    public float getDistance() {return distance;}

    public void setDistance(float distance) { this.distance = distance; }

    public String getKey() {return key;}

    public void setKey(String key) { this.key = key; }

    public String getClient() { return client; }

    public void setClient(String client) { this.client = client; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getrTime() { return rTime; }

    public void setrTime(String rTime) { this.rTime = rTime; }
}
