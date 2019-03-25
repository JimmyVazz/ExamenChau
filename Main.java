/* Universidad Autonoma del Estado de México
Carlos Jimmy Vasquez Fuentes   51%
Jose Luis Ruiz Chavez          49%
Lunes 25 de marzo del 2019
Examen del Primer Parcial

*/
public class Main {
    public static void main(String[] args) {
        
    } {
        int opcion = 0;
        Menu menu  = new Menu();
        Contacto contact  = new Contacto();
        do{
            opcion = menu.askInConsole();
            switch(opcion) {
                case 1:
                    contact.addContact(contact);
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