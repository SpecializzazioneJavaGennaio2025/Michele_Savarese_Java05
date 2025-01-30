public class SensorTempGetter implements PropertyGetter{
@Override

public double getDoubleProperty(Object o){
    TempSensor sensor =(TempSensor) o;
    return sensor.getTemperature();
}


}
