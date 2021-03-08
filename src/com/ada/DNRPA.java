package com.ada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DNRPA {

    public static void main(String[] args) {
        List<Seccional> Seccionales;

        // agrego propietarios
        Propietario maria = new Propietario("maria","89999999","pancho villa 771");
        Propietario liliana = new Propietario("liliana","79999999","carlos villa 771");
        Propietario cristina = new Propietario("cristina","69999999","jose villa 771");
        Propietario marta = new Propietario("marta","59999999","admin villa 771");
        Propietario jessica = new Propietario("jessica","49999999","juancho villa 771");

        //agrego autorizados
        Autorizado pedro = new Autorizado("pedro","39999999","pancho villa 771");
        Autorizado juan = new Autorizado("juan","29999999","lulo villa 771");
        Autorizado andres = new Autorizado("andres","19999999","pinia villa 771");
        Autorizado eduardo = new Autorizado("eduardo","34999999","mango villa 771");
        Autorizado pablo = new Autorizado("pablo","3599999","fresa villa 771");

        List<Autorizado> autorizadosMaria = new ArrayList<>(Arrays.asList(
                new Autorizado("pedro","39999999","pancho villa 771"),
                new Autorizado("juan","29999999","lulo villa 771"),
                new Autorizado("andres","19999999","pinia villa 771")

        ));

        List<Autorizado> autorizadosLiliana = new ArrayList<>(Arrays.asList(
                new Autorizado("eduardo","34999999","mango villa 771"),
                new Autorizado("pablo","3599999","fresa villa 771"),
                new Autorizado("andres","19999999","pinia villa 771")
        ));

        List<Autorizado> autorizadosCristina = new ArrayList<>(Arrays.asList(
                pedro,
                pablo,
                juan
        ));
        // agrego autos
        //Automotor camion = new Automotor("particular",maria,"camion",);

        Camion camion_maria = new Camion(Boolean.TRUE);

        Registro reg_ped = new Registro(camion_maria);
    }
}


