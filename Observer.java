public interface Observer {

    public void registerObs(WeatherData data);

    public void removeObs();
    
    public void notifyObs();
}