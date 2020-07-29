
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WENDY
 */
public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    int cols;
    Plane plane;
    public void enterNames() {

        System.out.println("Ingrese la cantidad de filas:");
        int rows = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese la cantidad de columnas:");
        cols = Integer.valueOf(scanner.nextLine());
        plane = new Plane(rows, cols);

    }

    public void planeMap() {
        System.out.println();
        System.out.println("Este es el mapa del avion:");
        System.out.println(plane.toString());
        

    }

    public void menu() {
        while (true) {
            System.out.println();
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            System.out.println();
            System.out.print("Ingrese la opcion: ");
            int opcion = Integer.valueOf(scanner.nextLine());
            System.out.println();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingresar un pasajero:");
                    System.out.print("Ingrese el nombre del pasajero: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese el apellido del pasajero: ");
                    String lastname = scanner.nextLine();
                    Passenger passenger = new Passenger(name, lastname);
                    System.out.print("Ingrese la fila del asiento: ");
                    int rowsPassenger = Integer.valueOf(scanner.nextLine());
                    System.out.print("Ingrese la columna del asiento: ");
                    String colsPassenger = scanner.nextLine();
                    Seat seat = new Seat(rowsPassenger, colsPassenger);

                    break;
                }
                case 2: {
                    System.out.println("Consulta del asiento.");
                    System.out.print("Ingrese la fila del asiento: ");
                    int rowsPassenger = Integer.valueOf(scanner.nextLine());
                    System.out.print("Ingrese la columna del asiento: ");
                    String colsPassenger = scanner.nextLine();
                    Seat seat = new Seat(rowsPassenger, colsPassenger);
                    System.out.println(seat.toString());

                    break;
                }
                case 3: {
                    System.out.println("Consulta de pasajero.");
                    System.out.print("Ingrese el nombre y apellido: ");
                    String name = scanner.nextLine();
                    String lastname = scanner.nextLine();
                    Passenger passenger = new Passenger(name, lastname);
                    if (passenger.equals(name) && passenger.equals(lastname)) {
                        System.out.println("El pasajero se encuentra en el avion.");
                    } else {
                        System.out.println("El pasajero no se encuentra en el avion.");
                    }
                    break;
                }

            }
        }
    }

}
