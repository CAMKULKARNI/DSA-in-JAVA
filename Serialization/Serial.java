import java.io.*;

class Test implements java.io.Serializable {
    String name;

    public Test(String s) {
        name = s;
    }

    public String toString() {
        return name;
    }
}

public class Serial {
    public static void main(String[] args) {
        Test p = new Test("chinmay");

        try {
            FileOutputStream fout = new FileOutputStream("f1.txt");
            ObjectOutputStream objout = new ObjectOutputStream(fout);
            objout.writeObject(p);
            objout.flush();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream fin = new FileInputStream("f1.txt");
            ObjectInputStream objin = new ObjectInputStream(fin);

            Object newp = objin.readObject();
            System.out.println(newp);
            objin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
