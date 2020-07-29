/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WENDY
 */
public class Seat {
    
    private int row;
    private String col;
    Passenger passenger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }

    public boolean isFree() {
        boolean free = false;
        if (passenger == null) {
            free = true;
        }
        return free;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Seat)) {
            return false;
        }
        Seat comparedSeat = (Seat) compared;
        if (this.row == comparedSeat.row
                && this.col.equals(comparedSeat.col)) {
            return true;
        }
        return false;
    }
    
    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        if(true)
         return "Asiento: " + row + col + ", ocupado. Pasajero: " + col;
        else
        return "Asiento: " + row + col + ", libre.";
    }

}
