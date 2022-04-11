package spacecrafts;
import java.util.Scanner;

/**
 * clase abstracta que ejecuta sistema de impresión de información de naves espaciales y recolecta información de naves nuevas por parte del usuario.
 * @author Michael Florez Rico
 */
public class SpacecraftMain {
    public static void main(String[] args) {
        /**
         * creación e impresión de nave lanzadera.
         */
        ShuttleShips saturnoV = new ShuttleShips(2900,"EE.UU","Querosene+O (liq)",1967,3500,118,100,160000);
        System.out.println("Shuttle spacecraft SaturnoV. Information: \n" + saturnoV);
        saturnoV.launch();
        saturnoV.release();
        System.out.println();

        /**
         * creación e impresión de nave no tripulada.
         */
        UnmannedShips pioneroXI = new UnmannedShips(258,"EE.UU","NO4+MMH",1973,26);
        System.out.println("Unmainned spacecraft Pionero XI. Information: \n" + pioneroXI);
        pioneroXI.turnon();
        System.out.println();

        /**
         * Creación e impresión de nave tripulada.
         */
        MannedShips salyut = new MannedShips(20,"Russia", "N2O4+UDMH", 1982,249,3);
        System.out.println("Mainned spacecraft Salyut. Information: \n" + salyut);
        salyut.launch();
        salyut.turnOnZGS();
        System.out.println();

        /**
         * Pregunta al usuario si desea crear una nueva nave.
         */
        boolean addNewSpacecraft;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDo you want to create a new Spacecraft?. Please reply 1 for 'Yes' or 2 for 'No'.");
        int newShip = scanner.nextInt();

        switch (newShip) {
            case 1 -> addNewSpacecraft = true;
            case 2 -> addNewSpacecraft = false;
            default -> {
                System.out.println("Input out of limits. Process has stopped.");
                addNewSpacecraft = false;
            }
        }

        /**
         * Ciclo while para recolectar la información de la nave a crear.
         */
        while (addNewSpacecraft){
            System.out.println("Please select the spacecraft number:\n1. Shuttle.\n2. Unmanned. \n3. Mainned \n4. Combined.");
            int shipType = scanner.nextInt();
            if(shipType == 1){
                System.out.println("Insert Spacecraft's name: ");
                String name = scanner.next();
                ShuttleShips ship1 = new ShuttleShips();
                System.out.println("Insert Spacecraft's weight in kg: ");
                ship1.setWeight(scanner.nextInt());
                System.out.println("Insert Spacecraft's country: ");
                ship1.setCountry(scanner.next());
                System.out.println("Insert Spacecraft's fuel: ");
                ship1.setFuel(scanner.next());
                System.out.println("Insert Spacecraft's launching year: ");
                ship1.setLaunchDate(scanner.nextInt());
                System.out.println("Insert Spacecraft's push value in kg: ");
                ship1.setPush(scanner.nextInt());
                System.out.println("Insert Spacecraft's loading capacity in kg: ");
                ship1.setLoadingCapacity(scanner.nextInt());
                System.out.println("Insert Spacecraft's height in m: ");
                ship1.setHeight(scanner.nextInt());
                System.out.println("Insert Spacecraft's power in HP: ");
                ship1.setPower(scanner.nextInt());

                System.out.println("---Shuttle spacecraft "+name+ " Information: ---" );
                System.out.println(ship1);

            }else if (shipType == 2){
                System.out.println("Insert Spacecraft's name: ");
                String name = scanner.next();
                UnmannedShips ship2 = new UnmannedShips();
                System.out.println("Insert Spacecraft's weight in kg: ");
                ship2.setWeight(scanner.nextInt());
                System.out.println("Insert Spacecraft's country: ");
                ship2.setCountry(scanner.next());
                System.out.println("Insert Spacecraft's fuel: ");
                ship2.setFuel(scanner.next());
                System.out.println("Insert Spacecraft's launching year: ");
                ship2.setLaunchDate(scanner.nextInt());
                System.out.println("Insert Spacecraft's push value in kg: ");
                ship2.setPush(scanner.nextInt());

                System.out.println("---Unmanned spacecraft " +name+ " Information: ---" );
                System.out.println(ship2);

            }else if(shipType == 3){
                System.out.println("Insert Spacecraft's name: ");
                String name = scanner.next();
                MannedShips ship3 = new MannedShips();
                System.out.println("Insert Spacecraft's weight in kg: ");
                ship3.setWeight(scanner.nextInt());
                System.out.println("Insert Spacecraft's country: ");
                ship3.setCountry(scanner.next());
                System.out.println("Insert Spacecraft's fuel: ");
                ship3.setFuel(scanner.next());
                System.out.println("Insert Spacecraft's launching year: ");
                ship3.setLaunchDate(scanner.nextInt());
                System.out.println("Insert Spacecraft's speed value in kg: ");
                ship3.setSpeed(scanner.nextInt());
                System.out.println("Insert Spacecraft's crew capacity value in kg: ");
                ship3.setCrewCapacity(scanner.nextInt());

                System.out.println("---Manned spacecraft " +name+ " Information: ---" );
                System.out.println(ship3);

            }else if (shipType == 4){
                System.out.println("Insert Spacecraft's name: ");
                String name = scanner.next();
                CombinedShips ship4 = new CombinedShips();
                System.out.println("Insert Spacecraft's weight in kg: ");
                ship4.setWeight(scanner.nextInt());
                System.out.println("Insert Spacecraft's country: ");
                ship4.setCountry(scanner.next());
                System.out.println("Insert Spacecraft's fuel: ");
                ship4.setFuel(scanner.next());
                System.out.println("Insert Spacecraft's launching year: ");
                ship4.setLaunchDate(scanner.nextInt());

                System.out.println("---Combined spacecraft " +name+ " Information: ---" );
                System.out.println(ship4);
            }else{
                System.out.println("Input out of limits.");

            }

            /**
             * Corte del ciclo infinito mediante pregunta al usuario si desea crear otra nave.
             */
            scanner = new Scanner(System.in);
            System.out.println("\nDo you want to create a new Spacecraft?. Please reply 1 for 'Yes' or 2 for 'No'.");
            newShip = scanner.nextInt();

            switch (newShip) {
                case 1 -> addNewSpacecraft = true;
                case 2 -> addNewSpacecraft = false;
                default -> {
                    System.out.println("Input out of limits. Process has stopped.");
                    addNewSpacecraft = false;
                }
            }
        }


    }
}
