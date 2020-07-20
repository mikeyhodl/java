
            package hospital;

            import java.io.*;

            public class Doctor implements Serializable {

            String name;
            int age;
            double height;
            String gender;

            public Doctor ()
            {
            name = "";
            age = 0;
            height = 0;
            gender = " ";
            }


            public Doctor (String n, int a, double h, String g) {
            name = n;
            age = a;
            height = h;
            gender = g;
            }
            void write(String dennis){
            try 
            {
                FileOutputStream fos = new FileOutputStream( dennis );
                ObjectOutputStream oos =new ObjectOutputStream(fos);
                oos.writeUTF( this.name);
                oos.writeInt (this.age);
                oos.writeDouble(this.height);
                oos.writeUTF (this.gender);
                oos.close();
            }
                catch (Exception e) {
                e.printStackTrace();
            }	
            }
            void read(String dennis){
            try {
                     FileInputStream sof = new FileInputStream( dennis );
                     ObjectInputStream soo =new ObjectInputStream(sof);
                        name = soo.readUTF();
                        age = soo.readInt();
                        height = soo.readDouble();
                        gender = soo.readUTF();
                        soo.close();

                    }
            catch (Exception e) {
                    System.out.println("File not found "+e );
                    }
            }
            public String toString(){
            return(name + " is " + age + " years old, " + height + "m tall and is of gender " + gender);
            }
            }
