public class  ThermometherExternalTempGetter implements PropertyGetter{

    @Override
    public double getDoubleProperty(Object o) {
        ExternalThermomether thermomether = (ExternalThermomether) o;
        return thermomether.getExternalTemp();
    }

}
