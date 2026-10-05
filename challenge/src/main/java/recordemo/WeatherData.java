package recordemo;
//
public record WeatherData(double temperatureCelsius, String conditions) {


//    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*9/5 +32;
    }
//
//    // Instance method to get a formatted summary string
    public String getSummary() {
        return ("Current weather: "+ temperatureCelsius+"°C"+" ("+this.temperatureFahrenheit()+"°F)" + conditions);
    }
//
//    // Static factory method to create a WeatherData record from Fahrenheit
//    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
//       //
//    }
//
//    public static void main(String[] args) {
//
//    }
}
