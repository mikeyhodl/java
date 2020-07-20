
                package hospital;

                import java.io.*;


                public class Drugs {


                        String type;
                        String name;
                        String prescription;


                        public Drugs ()
                        {
                        type = "";
                        name = "";
                        prescription = "";

                        }


                public Drugs (String t, String n, String p) {
                        type = t;
                        name = n;
                        prescription = p;

                        }


                void write(String filename){
                        try {
                          
                                RandomAccessFile raf = new  RandomAccessFile(filename,"rw");

                                raf.writeUTF(type);
                                raf.writeUTF(name);
                               raf.writeUTF(prescription);	

                               raf.close();
                                }
                        catch (Exception e) {
                                e.printStackTrace();
                                }	
                }
                void read(String filename){
                        try {
                            
                                 RandomAccessFile din = new  RandomAccessFile(filename,"r");

                                type = din.readUTF();
                                name= din.readUTF();
                                prescription= din.readUTF();	

                                din.close();
                                }
                        catch (Exception e) {
                                e.printStackTrace();
                                }
                        }
                public String toString(){
                        return( type + " is of type " +name + " should be taken in this order, " + prescription);
                        }
                }

