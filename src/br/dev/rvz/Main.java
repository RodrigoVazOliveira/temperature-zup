package br.dev.rvz;

import br.dev.rvz.core.ConvertTemperature;
import br.dev.rvz.utils.IO;

public class Main {

    public static void main(String[] args) {
        IO io = new IO();
        io.out("Bem vindo ao programa de conversão de temperatura!");
        io.out("Por gentileza digite um valor em celsus: ");
        ConvertTemperature convertTemperature = new ConvertTemperature(
                Double.parseDouble(io.input().nextLine())
        );
        io.out("===================================");
        io.out(convertTemperature.toString());
    }
}
