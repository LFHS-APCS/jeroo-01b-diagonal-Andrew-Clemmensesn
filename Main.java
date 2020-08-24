/**
 * Write code in runJerooCode() to have a single Jeroo 
 * put a flower at (0,0), (1,1), (2,2) and (3,3).
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
  //      new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
      Jeroo Mike = new Jeroo(4);
  Mike.plant();
  Mike.turn(LEFT);
  Mike.turn(LEFT);
  Mike.turn(LEFT);
  Mike.hop();
  Mike.turn(LEFT);
  Mike.hop();
  Mike.plant();
  Mike.turn(LEFT);
  Mike.turn(LEFT);
  Mike.turn(LEFT);
  Mike.hop();
  Mike.turn(LEFT);
  Mike.hop();
  Mike.plant();
  Mike.turn(LEFT);
  Mike.turn(LEFT);
  Mike.turn(LEFT);
  Mike.hop();
  Mike.turn(LEFT);
  Mike.hop();
  Mike.plant();
  Mike.hop();
    }

}
