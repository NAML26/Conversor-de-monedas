import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiManager {         private static final String API_URL = "https://v6.exchangerate-api.com/v6/e990d5efbe317c9784d46bc9/latest/";

        public static double obtenerTasaCambio(String monedaBase, String monedaObjetivo) throws Exception {
            String urlStr = API_URL + monedaBase;
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            return jsonobj.getAsJsonObject("conversion_rates").get(monedaObjetivo).getAsDouble();
        }
    }

