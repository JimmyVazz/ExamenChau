class Examen {
    public static void main(String[] args) {
        int opcion = 0;
        Menu menu  = new Menu();
        Power power  = null;
        do{
            opcion = menu.askInConsole();
            switch(opcion) {
                case 1:
                    power = new Superman();
                    break;
                case 2:
                    power = new Canario();
                    break;
                case 3:
                    power = new Sirenoman();
                    break;
                case 4:
                    power.desplegarPoder();
                    break;
                case 5:
                    System.out.println("No me quiro ir señor Stark");
                    //Syatem.exit(0);
                    break;
            }

        }while(opcion!=5);


    }
}