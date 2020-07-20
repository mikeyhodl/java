import java.io.*;


class Person {

	String name;
	int age;
	double height;
	char gender;
public Person(){
	name = new String();
	age = 0;
	height = 0;
	gender = ' ';
	}


public Person(String n, int a, double h, char g) {
	name = n;
	age = a;
	height = h;
	gender = g;
	}
void write(String filename){
	try {
		FileOutputStream fout = new FileOutputStream(filename);
		DataOutputStream dout = new DataOutputStream(fout);

		dout.writeUTF(name);
		dout.writeInt(age);
		dout.writeDouble(height);	
		dout.writeChar(gender);
		fout.close();
		}
	catch (Exception e) {
		e.printStackTrace();
		}	}
void read(String filename){
	try {
		FileInputStream fin = new FileInputStream(filename);
		DataInputStream din = new DataInputStream(fin);

		name = din.readUTF();
		age = din.readInt();
		height= din.readDouble();	
		gender = din.readChar();
		fin.close();
		}
	catch (Exception e) {
		e.printStackTrace();
		}
	}// end read
public String toString(){
	return(name + " is " + age + " years old, " + height + "m tall and is of gender " + gender);
	}// end toString
}