package utilerias;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {
    int opcionElegida;
    ArrayList<String>opcionesMenu=new ArrayList<>();//notacion de diamante

    public Menu() {
        init();
    }

    //public void execute(int opcionElegida);

    @Override
    public String toString() {
        String cad = "";
     for (String op : opcionesMenu) {
            cad += op+"\n";
        }
        return cad;
    }
    /**
    Este metodo muestra en a¿la consola el menu y solicita una opcion. Si el usuario eleige una opcion incorrecta 
    se vuelve a presentar el menu
    El metodo regresa la opcion elegida (un int).
     */
    
    public int askInConsole() {
        //java.util.Scanner tec = new java.util.Scanner(System.in);
        do{
            presentar();
            String leido = JOptionPane.showInputDialog("opcion elegida :");
            //String leido = tec.nextLine();
           /* try{
                opcionElegida = Integer.parseInt(leido);
            } catch (java.lang.NumberFormaException e) {
                System.out.println("Solo numeros porfa va?");
                opcionElegida = 0;
            }*/

        }while(opcionElegida <=0 || opcionElegida >= 5);
        return opcionElegida;
    }

    private void init() {
        opcionesMenu.add(") Elige un personaje");
        opcionesMenu.add("1) Elegir a Superman");
        opcionesMenu.add("2) Elegir a Canario");
        opcionesMenu.add("2) Elegir a Sirenoman");
        opcionesMenu.add("4) Desplegar poder");
        opcionesMenu.add("5) Salir");
        opcionesMenu.add("Opcion");
        
    }

    public void presentar() {
        for(String op : opcionesMenu){
            System.out.println(op);

        }
    }

    public static void main(String[]args) {
        Menu m = new Menu();
        m.askInConsole();
    }
}
