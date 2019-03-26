public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
 
//Metodos get    
public String getNombre(){
    return nombre;
}
public String getPaterno(){
    return paterno;
}
public String getMaterno(){
    return materno;
}

//Metodos set

public void setNombre(String nombre) {
    nombre = testCadena(nombre);
    
    this.nombre = nombre;
}
public void setPaterno(String paterno) {
    paterno = testCadena(paterno);
    this.paterno = paterno;
}
public void setMaterno(String materno) {
    materno = testCadena(materno);
    this.materno = materno;
}

@Override
public String toString(){
    return "Nombre: "+nombre+" Paterno: "+paterno+" Materno: "+materno;
    
}

private String testCadena(String cadena) {
    cadena = cadena.toUpperCase();
    for(int i=0;i<cadena.length();i++) {
        if(cadena.charAt(i)>='A' && cadena.charAt(i)<='Z' || cadena.charAt(i)=='.') {

        } else {
            return "";
               
        }

    }
    return cadena;
}
}