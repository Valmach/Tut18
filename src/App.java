/**
 * Created by valmach on 15/01/2017.
 */

//constructors are used for initialisation of instance variables

class Machine {
    private String name;
    private int code;

    public Machine(){
        System.out.println("Constructor running! ");

        name = "Arnie";
    }
    public Machine(String name){
        System.out.println("Second constructor running ");
        this.name = name;
        this.code = code;

        System.out.println("Third constructor running");

    }
    public Machine(String name, int code){

    }
}
public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Chalky");

    }
}
