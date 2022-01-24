package ss17_io_binary_file_and_serialization.exercise.copy_file_binary;

import java.io.*;

public class CopyFIle {
    public static void main(String[] args) throws Exception {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(new File("src/ss17_io_binary_file_and_serialization/" +
                    "exercise/copy_file_binary/source.txt"));
            os = new FileOutputStream(new File("src/ss17_io_binary_file_and_serialization/" +
                    "exercise/copy_file_binary/dest.txt"));
            int length;
            byte[] buffer = new byte[1024];
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            is.close();
            os.close();
        }
    }
}
