public class Application {
    public static void main(String[] arg) {
        ConcreteStation sConcreteStation = new ConcreteStation();
        sConcreteStation.registerObs(new WeatherData());
        sConcreteStation.Update(36, 70, 776);
        sConcreteStation.notifyObs();
    }
}
