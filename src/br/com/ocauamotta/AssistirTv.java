package br.com.ocauamotta;

public class AssistirTv {

    public static void main(String[] args) {
        Televisao tv = new Televisao();

        tv.ligarTv();

        for (int i = 0; i < 91; i++) {
            tv.aumentarVolume();
        }
        for (int i = 0; i < 99; i++) {
            tv.avancarCanal();
        }

        tv.desligarTv();

        tv.avancarCanal();
        tv.exibeCanal();

        tv.diminuirVolume();
        tv.exibeVolume();

    }
}
