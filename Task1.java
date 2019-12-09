package Space.Kolbasoff.puzzelofmath;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static final String fileName = "Task1.txt";
   public String readFile() {

   //    File myFile = new File(Environment.getExternalStorageDirectory() + "/" + fileName);
   String baseDir = Environment.getExternalStorageDirectory().getAbsolutePath();
      File f = new File(baseDir + "/" + fileName);
      // File f = new File("src/main/assets/Text1.txt");
      // StringBuilder stringBuilder = new StringBuilder();
       String ret = null;

        try (
          //  FileInputStream inputStream = new FileInputStream(f);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f))){
            //String line;
            ret = bufferedReader.readLine();
            //    while ((line = bufferedReader.readLine()) != null){
               //     stringBuilder.append(line);
             //  }

            }
            catch (IOException e) {
                e.printStackTrace();
            }


        return ret ;
    }

       /* public StringBuilder readFile  () {
            StringBuilder stringBuilder = new StringBuilder();
            try {
                File file = new File("Task1.txt");
                FileReader fileReader = new FileReader(file); // поток, который подключается к текстовому файлу
                BufferedReader bufferedReader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader

                String line;
                while((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }

                bufferedReader.close(); // закрываем поток
            } catch (Exception e) {
                e.printStackTrace();
            }
            return stringBuilder;
        }*/
}





