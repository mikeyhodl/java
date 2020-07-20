
            package hospital;
            import java.io.*;

            public class Patient {


                    String name;
                    int age;
                    double height;
                    String gender;

                    public Patient ()
                    {
                    name = new String();
                    age = 0;
                    height = 0;
                    gender = " ";
                    }


            public Patient (String n, int a, double h, String g) {
                    name = n;
                    age = a;
                    height = h;
                    gender = g;
                    }
            void write(String dennis){
                    try {
                            FileOutputStream fout = new FileOutputStream(dennis);
                            DataOutputStream dout = new DataOutputStream(fout);

                            dout.writeUTF(name);
                            dout.writeInt(age);
                            dout.writeDouble(height);	
                            dout.writeUTF(gender);
                            fout.close();
                            }
                    catch (Exception e) {
                            e.printStackTrace();
                            }	
                         }
            void read(String dennis){
                    try {
                            FileInputStream fin = new FileInputStream(dennis);
                            DataInputStream din = new DataInputStream(fin);

                            name = din.readUTF();
                            age = din.readInt();
                            height= din.readDouble();	
                            gender = din.readUTF();
                            fin.close();
                            }
                    catch (Exception e) {
                            e.printStackTrace();
                            }
                    }
            public String toString(){
                    return(name + " is " + age + " years old, " + height + "m tall and is of gender " + gender);
                    }
            }

 