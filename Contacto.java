import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Contacto extends Persona {
    private String email;
    private String phone;

public String getEmail(){
    return email; 
}

public String getPhone(){  
    return phone;
}
    //Metodos set
public void setEmail(String email) {

     this.email = email;
    }
    
public void setPhone(String phone) {
    phone = testPhone(phone);
        if(phone == ""){
            System.out.println("No se acepta ese numero, deben ser 10 numeros");        
        }else{
        this.phone = phone;
    }
}

public void addContact(Contacto contacto, ArrayList<Contacto> agendaContact){
    String tecladito;

    Scanner tec = new Scanner(System.in);
    System.out.println("Ingresa nombre:");
    tecladito = tec.nextLine();
    contacto.setNombre(tecladito);
    System.out.println("Ingresa apellido paterno: ");
    tecladito = tec.nextLine();
    contacto.setPaterno(tecladito);
    System.out.println("Ingresa apellido materno: ");
    tecladito = tec.nextLine();
    contacto.setMaterno(tecladito);
    System.out.println("Ingresa correo electronico:");
    tecladito = tec.nextLine();
    contacto.setEmail(tecladito);
    System.out.println("Ingresa numero telefonico: ");
    tecladito = tec.nextLine();
    contacto.setPhone(tecladito);

    agendaContact.add(contacto);
    


}
public void searchContact(Contacto contacto){
    String tecladito;
    Scanner tec = new Scanner(System.in);
}
public void showContacts(Contacto contacto, ArrayList<Contacto> agendaContact){
//System.out.println(contacto);

}
public void deleteContact(Contacto contacto, ArrayList<Contacto> agendaContact){
    String tecladito;
    Scanner tec = new Scanner(System.in);
}

@Override
public String toString(){
    return super.toString() + " Email: "+email+" Telefono: "+phone;
    
}

private String testPhone(String phone) {
    for(int i=0;i<phone.length();i++) {
        if( phone.length() == 10) {

        } else {
            return "";
               
        }

    }
    return phone;
}


}

