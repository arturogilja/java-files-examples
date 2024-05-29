import java.io.*;
import java.nio.charset.StandardCharsets;

public class BinaryFiles {
    public static void main(String[] args) {
        try (
            FileOutputStream fos = new FileOutputStream("numbers.seq");
            DataOutputStream dos = new DataOutputStream(fos);
            FileInputStream fis = new FileInputStream("numbers.seq");
            DataInputStream dis = new DataInputStream(fis);
        ) {

            while (dis.available() > 0) {
                dis.readByte();
            }
        }
         catch (IOException e) {
            System.out.println("ERROR OPENING FILE");
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        String str = "Hola Mundo";
//        byte[] byteArray = str.getBytes();
//        System.out.println(byteArray.length);
//
//        for(byte b : byteArray) {
//            System.out.println("BYTE: "+ b);
//        }
//
//        String newString = new String(byteArray, StandardCharsets.UTF_8);
//        System.out.println("newString: " + newString);
//    }
}
