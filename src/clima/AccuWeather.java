package clima;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class AccuWeather  {
	public static String doHttpGet() {

		String url = "https://dataservice.accuweather.com/forecasts/v1/daily/5day/7894?apikey=IHmW1Jrc45MgjeO4CnKxsWVJPVcUpHJh&language=en-us";

		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		CloseableHttpResponse resp;
		try {
			resp = client.execute(get);
			HttpEntity entity = resp.getEntity();
			return EntityUtils.toString(entity);

		} catch (IOException ioe) {
			System.err.println("Error al obtener el clima: ");
			ioe.printStackTrace();
		}
		return null;
	}
	
}
