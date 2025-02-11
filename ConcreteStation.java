public class ConcreteStation implements Observer {
    WeatherData data;

    public void Update(int T, int M, int H) {
        data.setHumidity(H);
        data.setTemperature(T);
        data.setMeasurements(M);
    }
    @Override
    public void registerObs(WeatherData data) {
        this.data = data;
    }

    @Override
    public void removeObs() {
        data = null;
    }

    @Override
    public void notifyObs() {
        data.getMeasurements();
        data.getHumidity();
        data.getTemperature();
    }
}