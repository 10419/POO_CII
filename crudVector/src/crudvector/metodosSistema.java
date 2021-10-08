package crudvector;

import java.util.*;

public class metodosSistema {
    
    public Vector lista = new Vector();
    public ArrayList<datosPersona> listaPersonas= new ArrayList<>();
    
    public void registrarPersona(Object x){
        lista.add(x);
    }
    
    public void registrarPersonaExamen(datosPersona dp){
        listaPersonas.add(dp);
    }
    
    
}
