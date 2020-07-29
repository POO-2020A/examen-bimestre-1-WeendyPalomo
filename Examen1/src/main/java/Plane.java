
import java.util.ArrayList;

/**
 *
 * @author WENDY
 */
public class Plane {

    private Seat seat;
    private int rows; //filas
    private int cols; //columnas
    private ArrayList<Seat> planeP = new ArrayList();

    public Plane(int rows, int cols) {
        if (rows <= 20) {
            this.rows = rows;
        } else {
            this.rows = 20;
        }
        if (cols <= 8) {
            this.cols = cols;
        } else {
            this.cols = 8;
        }
        String aux = "";
        for (int r = 1; r <= rows; r++) {
            for (int c = 0; c < cols; c++) {
                switch (c) {
                    case 0:
                        aux = "A";
                        break;
                    case 1:
                        aux = "B";
                        break;
                    case 2:
                        aux = "C";
                        break;
                    case 3:
                        aux = "D";
                        break;
                    case 4:
                        aux = "E";
                        break;
                    case 5:
                        aux = "F";
                        break;
                    case 6:
                        aux = "G";
                        break;
                    case 7:
                        aux = "H";
                    default:
                        break;
                }
                this.seat = new Seat(r, aux);
                planeP.add(seat);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public ArrayList<Seat> getPlaneP() {
        return planeP;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setPlaneP(ArrayList<Seat> planeP) {
        this.planeP = planeP;
    }

    @Override
    public String toString() {
        char c = 0;
        for (int i = 0; i < this.cols; i++) {
            c = (char) ('A' + i);
        }
        System.out.println(c);
        String s = "";
        for (Seat seat : planeP) {
            if (seat.getCol().equals("A")) {
                s += (seat.getRow() + " ");
            }
            if (seat.getCol().equals(c + "")) {
                s += (seat.getCol() + "\n");
            } else {
                s += (seat.getCol() + " ");
            }
        }
        return s;
    }
}

