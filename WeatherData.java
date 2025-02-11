public class WeatherData {
    public int T;
    public int H;
    public int V;

    public void getTemperature() {
        System.out.println(T);
    }

    public void getHumidity() {
        System.out.println(H);
    }

    public void getMeasurements() {
        System.out.println(V);
    }

    public void setTemperature(int T) {
        this.T = T;
    }

    public void setHumidity(int H) {
        this.H = H;
    }

    public void setMeasurements(int V) {
        this.V = V;
    }

}
