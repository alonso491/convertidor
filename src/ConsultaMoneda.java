import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    static String direccion1="";
   public TipoMoneda BuscaConsulta(String moneda, String cambio, String cantidad){
       //URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fa44bd0c9d88b4e84456b038/latest/"+ moneda);
       URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fa44bd0c9d88b4e84456b038/pair/"+ moneda +"/" + cambio + "/" + cantidad);
       direccion1= String.valueOf(direccion);
       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request = HttpRequest.newBuilder()
               .uri(direccion)
               .build();
       try {
           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());
           return  new Gson().fromJson(response.body(), TipoMoneda.class);
       }catch (Exception e) {
           throw  new RuntimeException("No encontré esta película.");
       }


   }
}

