
public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        var sensors = new TempSensor[]{
            new TempSensor(10),
            new TempSensor(20),
            new TempSensor(30)

        };

        ExternalThermomether[] therms = new ExternalThermomether[]{
            new ExternalThermomether(45),
            new ExternalThermomether(4),
            new ExternalThermomether(30),
            new ExternalThermomether(25),
            new ExternalThermomether(19)
        };

        CpuSensor[] hotness = new CpuSensor[]{
            new CpuSensor(15),
            new CpuSensor(20),
            new CpuSensor(99)

        };

        // double sum = 0;
        // for (TempSensor sensor : sensors){
        //     sum+=sensor.getTemperature();
        // }
// PropertyGetter getter = (Object o) ->((TempSensor) o).getTemperature();
// PropertyGetter exGetter = (Object o) ->((ExternalThermomether) o).getExternalTemp();
        System.out.println("La temperatura media della cpu è di " + averageTemp(hotness, (Object o) -> ((CpuSensor) o).getTemperature()) + " gradi!.");

        System.out.println("La temperatura media dei sensori esterni è di " + averageTemp(therms, (Object o) -> ((ExternalThermomether) o).getExternalTemp()) + " gradi!.");

        System.out.println("La temperatura media dei sensori è di " + averageTemp(therms, (Object o) -> ((ExternalThermomether) o).getExternalTemp()) + " gradi!.");
    }

    // public static double averageTemp(TempSensor[] sensors) {
    //     double sum = 0;
    //     for (TempSensor tempSensor : sensors) {
    //         sum += tempSensor.getTemperature();
    //     }
    //     return (sum / sensors.length);
    // }
//     public static double averageTemp(TempSensor[] sensors, PropertyGetter pGetter) {
// //! return as soon as possible
//         if (sensors.length == 0) {
//             return 0;
//         }
//                 double sum = 0;
//         for (TempSensor tempSensor : sensors) {
//             // sum += tempSensor.getTemperature();
//             sum+= pGetter.getDoubleProperty(tempSensor);
//         }
//         return (sum / sensors.length);
//     }
//     public static double averageTemp(ExternalThermomether[] sensors, PropertyGetter pGetter) {
//         //! return as soon as possible
//                 if (sensors.length == 0) {
//                     return 0;
//                 }
//                         double sum = 0;
//                 for (ExternalThermomether ExternaltempSensor : sensors) {
//                     // sum += ExternaltempSensor.getTemperature();
//                     sum+= pGetter.getDoubleProperty(ExternaltempSensor);
//                 }
//                 return (sum / sensors.length);
//             }
//! metodo generico
    public static <T> double averageTemp(T[] sensors, PropertyGetter pGetter) {

        //         //! return as soon as possible
        if (sensors.length == 0) {
            return 0;
        }

        double sum = 0;
        for (T sensor : sensors) {
            sum
                    += pGetter.getDoubleProperty(sensor);

        }
        return (sum / sensors.length);
    }

}
