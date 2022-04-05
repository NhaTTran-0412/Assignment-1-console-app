package App;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class ExportCSV {
    private ExportCSV() {

    }


    public static Boolean WriteCSV(final ArrayList<Student> list, final String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write(Function.FileHeader);
            bufferedWriter.newLine();

            for (Student student : list ) {
                String data = student.toString();
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception e) {
            System.out.println("Error");
        }
        return false;
    }
}
