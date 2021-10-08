package pe.edu.pe;
import java.util.List;
import java.util.Scanner;

import pe.edu.pe.Implentacion.ImplPersona;
import pe.edu.pe.entidad.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void registrarCategoria(Persona p) {
        System.out.println("------------Registro de Personas---------");
        System.out.println("IDCateg:"+p.getID()+"\tNombre:"+p.getNombres());
    }
    public static void menuMain(){
        ImplPersona ip=new ImplPersona();
        Persona p1=new Persona();
        int opt=0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("1=Crear");
            System.out.println("2=Listar");
            System.out.println("3=Eliminar");
            opt = sc.nextInt();
            switch(opt){
                case 1:
                    System.out.println("id\tNombre \t Ap_Paterno\tAp_Materno\tSexo");
                    for (Persona p : ip.list()) {
                    System.out.println(p.getID()+"\t"+ p.getNombres()+" \t "+p.getAp_paterno()+"\t         "+p.getAp_materno()+"\t"+p.getSexo());
                }    
                
                break;
                case 2:
                    Persona d= new Persona();
                    System.out.println("Ingrese nom: ");
                    d.setNombres(input.nextLine());
                    System.out.println("Ingrese Sexo: ");
                    d.setSeco(input.nextLine());
                    ip.create(d);  
                break;
                case 3:
                    System.out.println("id \t Nombre  Ap_Paterno \t Ap_Materno \t Sexo");
                    ip.delete(2);
                break;
            }
        }while(opt!=0);
    }
    public static void main( String[] args )
    {
      menuMain();//profesor seria muy amable de su parte resolver el menu en clase porfa profe
    }    
}
