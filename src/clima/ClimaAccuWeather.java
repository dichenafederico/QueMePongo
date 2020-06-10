package clima;
import org.joda.time.DateTime;
import com.google.gson.GsonBuilder;


public class ClimaAccuWeather {


    public List<InnerDailyForecasts> DailyForecasts;

    public class InnerDailyForecasts{

        public DateTime Date;
        public innerTemperature Temperature;

        public class innerTemperature{

            public innerMinimum Minimum;

            public class innerMinimum{

                public float Value;
            }

        }

    }

}
