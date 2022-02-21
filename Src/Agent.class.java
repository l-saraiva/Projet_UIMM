import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Function;
import java.io.*; 

public class Agent{
   private String[][] agents;
   
   public static void main(String[] args) {
        File file = new File(args[0]);
        File[] files = file.listFiles();
        if (files != null) {
            System.out.println("Ca marche");
        }
   }

   public static void listeAgents(){
    
   }
}
