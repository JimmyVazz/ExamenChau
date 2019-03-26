import java.util.ArrayList;
import java.util.Scanner;

/* Universidad Autonoma del Estado de México
Carlos Jimmy Vasquez Fuentes   51%
Jose Luis Ruiz Chavez          49%
Lunes 25 de marzo del 2019
Examen del Primer Parcial

*/
public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Contacto contact  = new Contacto();
        Scanner tec = new Scanner(System.in);
        ArrayList<Contacto> agendaContact = new ArrayList<Contacto>();
        do{
            System.out.println("Elige una opcion");
            System.out.println(") Elige una opcion");
            System.out.println("1) Agregar contacto");
            System.out.println("2) Eliminar contacto");
            System.out.println("3) Mostrar contactos");
            System.out.println("4) Buscar contacto");
            System.out.println("5) Salir");
            System.out.println("Opcion");
            opcion = tec.nextInt();
            switch(opcion) {
                case 1:
                    contact.addContact(contact, );
                    break;
                case 2:
                    contact.deleteContact(contact);
                    break;
                case 3:
                    contact.showContacts(contact);
                    break;
                case 4:
                    contact.searchContact(contact);
                    break;
                case 5:
                    System.out.println("Bai alv!");
                    //Syatem.exit(0);
                    break;
            }

        }while(opcion!=5);


    }
    
}