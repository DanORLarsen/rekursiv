import java.util.ArrayList;
import java.util.Stack;

public class Main {
    private static Stack<String> source = new Stack<>();
    private static Stack<String> target= new Stack<>();
    private static Stack<String> spare = new Stack<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Metoder.fibonacciTal(i));
        }

        source.push("AAAAAAAAAA");
        source.push(" BBBBBBBB ");
        source.push("  CCCCCC  ");
        source.push("   DDDD   ");
        source.push("    EE    ");
        source.push("AAAAAAAAAA");
        source.push(" BBBBBBBB ");
        source.push("  CCCCCC  ");
        source.push("   DDDD   ");
        source.push("    EE    ");
        source.push("AAAAAAAAAA");
        source.push(" BBBBBBBB ");
        source.push("  CCCCCC  ");
        source.push("   DDDD   ");
        source.push("    EE    ");
        source.push("AAAAAAAAAA");
        source.push(" BBBBBBBB ");
        source.push("  CCCCCC  ");
        source.push("   DDDD   ");
        source.push("    EE    ");
        source.push("AAAAAAAAAA");
        source.push(" BBBBBBBB ");
        source.push("  CCCCCC  ");
        source.push("   DDDD   ");
        source.push("    EE    ");

        move(25,source,target,spare);

    }

    public static void move(int antalDisks, Stack<String> source, Stack<String> target, Stack<String> spare ){

        if(antalDisks == 0){
            printTowers();
        }else {

            move(antalDisks - 1, source, spare, target);

            target.push(source.pop());


            move(antalDisks - 1, spare, target, source);
        }



    }

    public static void printTowers(){
        ArrayList<Stack> towers = new ArrayList<>();
        towers.add(source); towers.add(spare); towers.add(target);
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                if(!towers.get(j).isEmpty()) {
                    if (towers.get(j).size() - 1 >= i) {
                        System.out.print(towers.get(j).get(i));
                    } else {
                        System.out.print("    ||    ");
                    }
                }else {
                    System.out.print("    ||    ");
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}

class Metoder {
    static int stop = 0;

    public static void selvsving() {
        System.out.println("hej");
        selvsving();
    }

    public static void selvsvingmedStop() {
        stop++;
        System.out.println(stop);


        if (stop != 10) {
            selvsvingmedStop();
        }
    }

    public static int fakultet(int a) {
        if (a > 1)
            return a * fakultet(a - 1);
        else return 1;
    }

    public static int fakultetMedLøkke(int a) {
        int resultat = 1;
        for (int i = a; i > 0; i--) {
            resultat *= i;
        }
        return resultat;
    }

    public static int fibonacciTal(int a){
        if(a < 2)
            return 1;
        else{
            return fibonacciTal(a - 2) + fibonacciTal(a - 1);
        }
    }
    /*
    Move m − 1 disks from the source to the spare peg, by the same general solving procedure. Rules are not violated, by assumption. This leaves the disk m as a top disk on the source peg.
    Move the disk m from the source to the target peg, which is guaranteed to be a valid move, by the assumptions — a simple step.
    Move the m − 1 disks that we have just placed on the spare, from the spare to the target peg by the same general solving procedure, so they are placed on top of the disk m without violating the rules.
    The base case being to move 0 disks (in steps 1 and 3), that is, do nothing – which obviously doesn't violate the rules.
    */



}

