package pe.edu.pe.Implentacion;
import java.util.ArrayList;
import java.util.List;
import pe.edu.pe.entidad.Persona;
public class ImplPersona {
    List<Persona> lis= new ArrayList<>();// crear una lista de personas, lis es global
    int id=0;
    public void delete(int id){
        for(Persona ps : lis){
            if(id==ps.getID()){
                System.out.print("Eliminado"+ps.getNombres());
                lis.remove(ps);
            }// elimina
    }
    }
    public void create(Persona p){
        lis.add(p);// crea lista de personas, en p veine todo dato
        id=id+1;
        p.setID(id);
        lis.add(p);
    }
    public List<Persona> list() {
        return lis; // retorna la lista//vota la lista

    }
    
}
