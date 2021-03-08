package com.ada;

import java.util.List;

public abstract class Seccional {
    private List<Registro> registros;
    private Registro registro;


    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
        registros.add(registro);
    }
}
