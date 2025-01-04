import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversiones {


    public void conversion(String url,int c){
        Gson gson=new GsonBuilder()
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+url+"/pair/USD/ARS/"+c);
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json=response.body();
            Resultado resultado=gson.fromJson(json, Resultado.class);
            System.out.println(
                    "El valor "+ c +" ["+resultado.base_code()+"] a ["
                            +resultado.target_code()+"] es igual a =>>>>> ["
                            +resultado.conversion_result()+"]");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void conversionArsUsd(String url, int c){
        Gson gson=new GsonBuilder()
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+url+"/pair/ARS/USD/"+c);
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(direccion)))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json=response.body();

            Resultado resultado=gson.fromJson(json, Resultado.class);
            System.out.println(
                    "El valor "+ c +" ["+resultado.base_code()+"] a ["
                            +resultado.target_code()+"] es igual a =>>>>> ["
                            +resultado.conversion_result()+"]");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void conversionUsdCop(String url, int c){
        Gson gson=new GsonBuilder()
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+url+"/pair/USD/COP/"+c);
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json=response.body();
            Resultado resultado=gson.fromJson(json, Resultado.class);
            System.out.println(
                    "El valor "+ c +" ["+resultado.base_code()+"] a ["
                            +resultado.target_code()+"] es igual a =>>>>> ["
                            +resultado.conversion_result()+"]");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void conversionCopUsd(String url, int c){
        Gson gson=new GsonBuilder()
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+url+"/pair/COP/USD/"+c);
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json=response.body();
            Resultado resultado=gson.fromJson(json, Resultado.class);
            System.out.println(
                    "El valor "+ c +" ["+resultado.base_code()+"] a ["
                            +resultado.target_code()+"] es igual a =>>>>> ["
                            +resultado.conversion_result()+"]");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void conversionUsdBrl(String url, int c){
        Gson gson=new GsonBuilder()
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+url+"/pair/USD/BRL/"+c);
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json=response.body();
            Resultado resultado=gson.fromJson(json, Resultado.class);
            System.out.println(
                    "El valor "+ c +" ["+resultado.base_code()+"] a ["
                            +resultado.target_code()+"] es igual a =>>>>> ["
                            +resultado.conversion_result()+"]");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void conversionBrlUsd(String url, int c) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + url + "/pair/BRL/USD/" + c);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Resultado resultado=gson.fromJson(json, Resultado.class);
            System.out.println(
                    "El valor "+ c +" ["+resultado.base_code()+"] a ["
                            +resultado.target_code()+"] es igual a =>>>>> ["
                            +resultado.conversion_result()+"]");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
