package Weather;

public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description) {
        boolean windy = false;

        if (description.indexOf("Windy") >= 0) {
            windy = true;
        }
            if ((temperature > 100) && (description.indexOf("snow") >= 0)) {
                return ("That is illogical, it cannot snow when the temperature exceeds 100 degrees!");
            }

            //Write other conditions below this line


            //write above this
            else {
                return "Too windy or cold! Enjoy watching the weather through the window.";
            }
        }
    }