package pe.edu.pe.entidad;

public class Persona {
    private int id;
    private String nombres;
    private String ap_paterno;
    private String ap_materno;
    private String sexo;
    public int getID(){ 
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
    public String getNombres(){
        return nombres;
    }
    public void setNombres(String Nombres){
        this.nombres = Nombres;
    }
    public String getAp_paterno(){
        return ap_paterno;
    }
    public void setAp_paterno(String Ap_paterno){
        this.ap_paterno = Ap_paterno;
    }   
    public String getAp_materno(){
        return ap_materno;
    }
    public void setAp_materno(String Ap_materno){
        this.ap_materno = Ap_materno;
    }  
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String Sexo){
        this.sexo = Sexo;
    }          
}
