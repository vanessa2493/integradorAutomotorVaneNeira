package com.ada;

import java.util.List;

public abstract class Automotor {
    private boolean uso; //particular(True) o profesional(False)
     // motos eléctricas, autos eléctricos, motocicletas y automóviles a combustión, colectivos, utilitarios y camiones

    public Automotor(Boolean uso) {
        this.uso = uso;
    }
}
