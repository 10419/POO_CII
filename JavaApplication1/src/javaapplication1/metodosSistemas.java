package javaapplication1;

import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import javaapplication1.datospersona;
public class metodosSistemas {
   //public Vector lista=new Vector();// colecion 
   List<datospersona> lista= new ArrayList<>();// crear una lista de personas, lis es global
    int id=0;
    public void registrarPersona(datospersona x){
        id=id+1;
        x.setId(id);
        lista.add(x);
    }
    public List<datospersona> list() {
        return lista; // retorna la lista//vota la lista

    }
       public void delete(int id) throws Exception{   
        
        Iterator<datospersona> itr = lista.iterator();            
        while(itr.hasNext()){
            datospersona pers = itr.next();
            if(pers.getId()==(id)){
                System.out.println("Eliminando a: "+pers.getNombres());
                itr.remove();                    
            }
        }
            
            
    }
    
    
}
