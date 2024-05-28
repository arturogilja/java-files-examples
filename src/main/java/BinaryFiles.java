import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
        try (
            FileOutputStream fos = new FileOutputStream("numbers.seq");
            DataOutputStream dos = new DataOutputStream(fos);
            FileInputStream fis = new FileInputStream("numbers.seq");
            DataInputStream dis = new DataInputStream(fis);
        ) {
            for (int i = 0; i < 512; i++) {
                dos.writeInt(i);
            }

            while (dis.available() > 0) {
                int integer = dis.readInt();
                System.out.println("NUMBER: " + integer);
            }

        }
         catch (IOException e) {
            System.out.println("ERROR OPENING FILE");
            e.printStackTrace();
        }
    }
}
