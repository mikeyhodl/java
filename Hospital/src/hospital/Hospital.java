
        package hospital;

        import java.io.*;
        import java.util.*;
import javax.swing.JOptionPane;

        public class Hospital {
        public static void main(String[] args) {

                Scanner x = new Scanner (System.in);

              /*  Patient me = new Patient("Julie", 37, 2.06, "female");
                me.write("patient.dat");
                me.read("patient.dat");
                System.out.println(me);


                Doctor you = new Doctor("Pato",600,5.7,"");
                //you.write("doctor.dat");
                you.read("doctor.dat");
                System.out.println(you);
                */   

             while(true){ 
                 
                String c  = JOptionPane.showInputDialog(null,"1. Doctors \n 2. Drugs \n  3. Patient");
                int choice = Integer.parseInt(c);

                 switch(choice){
                   case 1: 
                      // object of class doctor 
                       Doctor readd = new Doctor();
                       String p  = JOptionPane.showInputDialog(null, "1.Add Doctors \n 2.Display Doctors ");
                       int option = Integer.parseInt(p);
                       
                       if (option == 2){
                           readd.read("doctor.txt");
                           JOptionPane.showMessageDialog(null, readd.toString());
                       }
                       else if (option == 1){
                           String name  = JOptionPane.showInputDialog(null, "Enter Name: ");
                           
                           String age = JOptionPane.showInputDialog(null, "Enter Age: ");
                           int a = Integer.parseInt(age);
                           
                           String height  = JOptionPane.showInputDialog(null, "Enter Height:  ");
                           double h = Double.parseDouble(height);
                           
                           String gender = JOptionPane.showInputDialog(null, "Enter Gender: ");
                           
                           Doctor writee = new Doctor(name,a,h,gender);
                           writee.write("doctor.txt");
                           System.out.println(writee.toString());
                           JOptionPane.showMessageDialog(null, "Written Successfully");
                       }
                       else{
                           JOptionPane.showConfirmDialog(null, " Invalid Choice");

                       }
                       break;
                    case 2:

                        // object of class  Drugs 
                            Drugs dawa = new Drugs();
                            
                            String p2  = JOptionPane.showInputDialog(null, "1.Add Drugs \n 2.Display Drugs ");
                            int select = Integer.parseInt(p2);
                            
                       if (select == 2){
                            dawa.read(" Drugs.txt");
                            JOptionPane.showMessageDialog(null, dawa.toString());
                       }
                       else if (select == 1){
                           String name  = JOptionPane.showInputDialog(null, "Enter Name: ");
                           
                           String type  = JOptionPane.showInputDialog(null, "Enter Type: ");
                           
                           String Prescription= JOptionPane.showInputDialog(null, "Enter Prescription: ");
                           
                           Drugs writee = new   Drugs(name ,type, Prescription);
                           writee.write(" Drugs.txt");
                           JOptionPane.showMessageDialog(null, "Written Successfully");
                            
                             writee.write("");
                             System.out.println(writee.toString());
                       }
                       else{
                           JOptionPane.showConfirmDialog(null, " Invalid Choice");
                       }
                       break;

                        case 3:

                        // object of class  Patient 
                            Patient come = new  Patient();
                            String p3  = JOptionPane.showInputDialog(null, "1.Add Patient \n 2.Display Patient");
                            int pick = Integer.parseInt(p3);
                            
                       if (pick == 2){
                           come.read(" Patient.txt");
                           JOptionPane.showMessageDialog(null, come.toString());
                          
                       }
                       else if (pick == 1){
                           String name  = JOptionPane.showInputDialog(null, "Enter Name: ");
                           
                           String age = JOptionPane.showInputDialog(null, "Enter Age: ");
                           int a = Integer.parseInt(age);
                           
                           String height  = JOptionPane.showInputDialog(null, "Enter Height:  ");
                           double h = Double.parseDouble(height);
                           
                           String gender = JOptionPane.showInputDialog(null, "Enter Gender: ");
                           
                           Patient writee = new  Patient(name,a,h,gender);
                           writee.write(" Patient.txt");
                           JOptionPane.showMessageDialog(null, "Written Successfully");
                       }
                       else{
                           JOptionPane.showConfirmDialog(null, " Invalid Choice");
                       }
                       break;

                      }
                }
               }
            }