public class Contacto extends Persona{
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
    
public void set(String phone) {
    phone = testPhone(phone);
        if(phone == ""){
            System.out.println("No se acepta ese numero, deben ser 10 numeros");        
        }else{
        this.phone = phone;
    }
}

public void addContact(Contacto contacto){

}
public void searchContact(Contacto contacto){

}
public void showContacts(){


}
public void deleteContact(Contacto c){
    
}

@Override
public String toString(){
    return super.toString() + "Email: "+email+" Telefono: "+phone;
    
}

private String testPhone(String phone) {
    for(int i=0;i<phone.length();i++) {
        if( (phone.charAt(i)>= 48 && phone.charAt(i)<=47) && phone.length() == 10) {
        } else {
            return "";
               
        }

    }
    return phone;
}


}

