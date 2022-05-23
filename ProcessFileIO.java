import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class ProcessFileIO {

    public void readFile(List finalResult){
        //Local System Path
        File readInputFile = new File("D:/Angular-New/JAVA/develop/ProcessFileIO/src/sampleData.txt");
        Scanner inputRead = null;
        try {
            inputRead = new Scanner(readInputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (inputRead.hasNextLine()) {
            String data = inputRead.nextLine();
            String filterNumber="";
            int count=0;
            String filterData[] = data.split("[,]", 0);
            for(int i=0;i<filterData.length;i++){
         String findNo= filterData[i].replaceAll("[^0-9]", "");
                     if(!findNo.equalsIgnoreCase( "")) {
                         int no = Integer.parseInt(findNo);

                         out.println(filterData[i].replaceAll("[^0-9]", ""));

                         if (no % 2 != 0) {
                             count++;
                         }
                     }

            }

            finalResult.add(count);
        }
        inputRead.close();
    }


    public void printFile(List Result){
        PrintWriter printResult = null;
        try {
            //Local System Path
            printResult = new PrintWriter("D:/Angular-New/JAVA/develop/ProcessFileIO/src/OutputReport");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String finalOutput = Result.toString();
        char finalResultOutput[]= finalOutput.toCharArray();

        for(int i=0;i<finalResultOutput.length; i++) {
            printResult.print(finalResultOutput[i]);
        }

        printResult.close();
    }


    public static void main(String[] args) {
        List finalResult = new ArrayList();


        ProcessFileIO obj =new ProcessFileIO();
        obj.readFile(finalResult);
        obj.printFile(finalResult);
    }




}
