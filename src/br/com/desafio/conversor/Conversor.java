package br.com.desafio.conversor;

import br.com.desafio.conversor.modelos.Moedas;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Conversor {

    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;
    private String endereco = "https://v6.exchangerate-api.com/v6/492f01dd757848ff453d0472/latest/";

    private Moedas conexao(String meuValor) throws IOException, InterruptedException {

        ///  Montando a URI
        String uri = endereco + meuValor;

        // executando a request
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        response = client.send(request, HttpResponse.BodyHandlers.ofString());


        // Gson para transformar a resposta
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        // hashMap com a resposta da api
        String json = response.body();
        Map<String, Object> map = gson.fromJson(json, new TypeToken<HashMap<String, Object>>(){}.getType());

        // hashMap com os valores das moedas
        String valores = String.valueOf(map.get("conversion_rates"));
        Map<String, Object> mapMo = gson.fromJson(json, new TypeToken<HashMap<String, Object>>(){}.getType());

        //Passando os valores necessarios para um Record
        Moedas moedas = gson.fromJson(valores, Moedas.class);


        /*for (String key : map.keySet()) {
            System.out.println("Chave: [" + key + "]");
        }*/
        System.out.println(moedas);
        return moedas;
    }


    public double converterValor (double valor, String meuValor, String novoValor) throws IOException, InterruptedException {

        Moedas moedas = conexao(meuValor);

        if (novoValor.equals("BRL")) {
            return valor * moedas.BRL();

        } else if (novoValor.equals("USD")) {
            return valor * moedas.USD();

        } else if (novoValor.equals("ARS")) {
            return valor * moedas.ARS();

        } else if (novoValor.equals("JPY")) {
            return valor * moedas.JPY();

        } else if (novoValor.equals("EUR")) {
            return valor * moedas.EUR();

        } else {
            return valor;
        }

    }




}
