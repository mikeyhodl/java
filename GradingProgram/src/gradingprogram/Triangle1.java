import java.util.Scanner;
 
public class Triangle1 {
 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double length,width;
            double perimeter, area, diagonal = 0;
            do
            {
                System.out.print("Enter the width: ");
                width = scanner.nextDouble();
                
                if (width != 0)
                {
                    System.out.print("Enter the length: ");
                    length = scanner.nextDouble();
                    
                    diagonal = Math.sqrt((width * width) + (length * length));
                    
                    perimeter = width  + length + diagonal;
                    area =  (width * length)/2;
                    diagonal = Math.sqrt((width * width) + (length * length));
                    
                    System.out.println("Perimeter: "+perimeter);
                    System.out.println("Area: "+area);
                    System.out.println("Diagonal: "+diagonal);
                    System.out.println("length: " +length);
                    System.out.println("width: " +width);           }
            }
            while (width != 0);
        }
    }
}