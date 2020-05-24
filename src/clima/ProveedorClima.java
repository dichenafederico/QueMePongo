package clima;

import com.google.gson.GsonBuilder;
import org.joda.time.DateTime;

public class ProveedorClima implements MockClima {

	private float convertirACelsius(float temperaturaEnFahrenheit) {

		return (float) (temperaturaEnFahrenheit - 32) * 5 / 9;
	}

	private ClimaAccuWeather solicitarEstadoDelClima() {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeDeserializer());
		return gsonBuilder.create().fromJson(AccuWeather.doHttpGet(), ClimaAccuWeather.class);

	}

	@Override
	public float getCelsiusTemperatura() {

		ClimaAccuWeather estadoDelClima = solicitarEstadoDelClima();
		return convertirACelsius(estadoDelClima.DailyForecasts.get(0).Temperature.Minimum.Value);
	}
	

}
