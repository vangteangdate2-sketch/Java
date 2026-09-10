import javafx.stage.Stage;
import java.util.Objects;
import java.util.Scanner;

public class employeeobject {
   int x;
   int y;

   public employeeobject(final employeeobject var1) {
      Objects.requireNonNull(var1);
      super();
   }

   void input() {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter x of Point: ");
      this.x = var1.nextInt();
      System.out.print("Eneter y of Point: ");
      this.y = var1.nextInt();
   }

   void output() {
      System.out.println("P(" + this.x + "," + this.y + ")");
   }
}
 
    

