
public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        var sensors = new TempSensor[]{
            new TempSensor(10),
            new TempSensor(20),
            new TempSensor(30)

        };

        // double sum = 0;
        // for (TempSensor sensor : sensors){
        //     sum+=sensor.getTemperature();
        // }
        System.out.println("La temperatura media è di " + averageTemp(sensors));
    }

    // public static double averageTemp(TempSensor[] sensors) {
    //     double sum = 0;
    //     for (TempSensor tempSensor : sensors) {
    //         sum += tempSensor.getTemperature();

    //     }
    //     return (sum / sensors.length);
    // }

    public static double averageTemp(TempSensor[] sensors, PropertyGetter getter) {
        double sum = 0;
        for (TempSensor tempSensor : sensors) {
            sum += tempSensor.getTemperature();

        }
        return (sum / sensors.length);
    }
}
