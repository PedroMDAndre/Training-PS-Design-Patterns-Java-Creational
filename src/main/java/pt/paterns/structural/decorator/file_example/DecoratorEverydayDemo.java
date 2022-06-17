package pt.paterns.structural.decorator.file_example;

import java.io.*;

public class DecoratorEverydayDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        outputStream.close();
    }

}
