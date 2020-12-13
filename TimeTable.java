import java.io.*;
import java.util.*;
public class TimeTable {
  public static void main(String args[]) {
    List<List<String>> maths = new ArrayList<>();
    List<List<String>> kannada = new ArrayList<>();
    List<List<String>> hindi = new ArrayList<>();
    List<List<String>> english = new ArrayList<>();
    List<List<String>> science = new ArrayList<>();
    String sixStandard = "6th";
    String seventh = "7th";
    String eighth = "8th";
    String nineth = "9th";
    String tenth = "10th";
    try {
        //Maths
        BufferedReader mt = new BufferedReader(new FileReader("maths.csv"));
        String line;
        while ((line = mt.readLine()) != null) {
            String[] values = line.split(",");
            maths.add(Arrays.asList(values));
        }
        // kannada
        BufferedReader knd = new BufferedReader(new FileReader("kannada.csv"));
        String line1;
        while ((line1 = knd.readLine()) != null) {
            String[] values1 = line1.split(",");
            kannada.add(Arrays.asList(values1));
        }
        // System.out.println(kannada);

        // hindi
        BufferedReader hnd = new BufferedReader(new FileReader("hindi.csv"));
        String line2;
        while ((line2 = hnd.readLine()) != null) {
            String[] values2 = line2.split(",");
            hindi.add(Arrays.asList(values2));
        }
        // System.out.println(hindi);

        // english

        BufferedReader eng = new BufferedReader(new FileReader("english.csv"));
        String line3;
        while ((line3 = eng.readLine()) != null) {
            String[] values3 = line3.split(",");
            english.add(Arrays.asList(values3));
        }
        // System.out.println(english);

        // Science

        BufferedReader sci = new BufferedReader(new FileReader("science.csv"));
        String line4;
        while ((line4 = sci.readLine()) != null) {
            String[] values4 = line4.split(",");
            science.add(Arrays.asList(values4));
        }
        System.out.println(science);

        String[][] sixth = new String[9][6];
        String[][] sev = new String[9][6];
        String[][] eig = new String[9][6];
        String[][] nin = new String[9][6];
        String[][] ten = new String[9][6];

        // maths.toArray(mathsTemp);
        for (int i = 0; i < 9; i += 1) {
          for(int j = 0; j < 6; j += 1) {
            // System.out.println(i+" "+j + " "+ maths.get(i).get(j));
            // System.out.println(maths.get(i).get(j));
            String mathVal = maths.get(i).get(j);
            String kanVal = kannada.get(i).get(j);
            String hindiVal = hindi.get(i).get(j);
            String engVal = english.get(i).get(j);
            String sciVal = science.get(i).get(j);
            if(mathVal.equals(sixStandard)) {
              sixth[i][j] = "maths";
            }
            if(kanVal.equals(sixStandard)) {
              sixth[i][j] = "kannada";
            }
            if(hindiVal.equals(sixStandard)) {
              sixth[i][j] = "hindi";
            }
            if(engVal.equals(sixStandard)) {
              sixth[i][j] = "english";
            }
            if(sciVal.equals(sixStandard)) {
              sixth[i][j] = "science";
            }
            // Eight
            if(mathVal.equals(seventh)) {
              sev[i][j] = "maths";
            }
            if(kanVal.equals(seventh)) {
              sev[i][j] = "kannada";
            }
            if(hindiVal.equals(seventh)) {
              sev[i][j] = "hindi";
            }
            if(engVal.equals(seventh)) {
              sev[i][j] = "english";
            }
            if(sciVal.equals(seventh)) {
              sev[i][j] = "science";
            }
            // Eigth
            if(mathVal.equals(eighth)) {
              eig[i][j] = "maths";
            }
            if(kanVal.equals(eighth)) {
              eig[i][j] = "kannada";
            }
            if(hindiVal.equals(eighth)) {
              eig[i][j] = "hindi";
            }
            if(engVal.equals(eighth)) {
              eig[i][j] = "english";
            }
            if(sciVal.equals(eighth)) {
              eig[i][j] = "science";
            }
            
            // nineth

            if(mathVal.equals(nineth)) {
              nin[i][j] = "maths";
            }
            if(kanVal.equals(nineth)) {
              nin[i][j] = "kannada";
            }
            if(hindiVal.equals(nineth)) {
              nin[i][j] = "hindi";
            }
            if(engVal.equals(nineth)) {
              nin[i][j] = "english";
            }
            if(sciVal.equals(nineth)) {
              nin[i][j] = "science";
            }

            if(mathVal.equals(tenth)) {
              ten[i][j] = "maths";
            }
            if(kanVal.equals(tenth)) {
              ten[i][j] = "kannada";
            }
            if(hindiVal.equals(tenth)) {
              ten[i][j] = "hindi";
            }
            if(engVal.equals(tenth)) {
              ten[i][j] = "english";
            }
            if(sciVal.equals(tenth)) {
              ten[i][j] = "science";
            }
          }
        }
        System.out.println("sixth class time table : ");
        System.out.println(Arrays.deepToString(sixth));
        System.out.println("seventh class time table : ");
        System.out.println(Arrays.deepToString(sev));
        System.out.println("eighth class time table : ");
        System.out.println(Arrays.deepToString(eig));
        System.out.println("ninth class time table : ");
        System.out.println(Arrays.deepToString(nin));
        System.out.println("tenth class time table : ");
        System.out.println(Arrays.deepToString(ten));

    }
    catch (IOException e)   {  
      e.printStackTrace();  
    }  
  }
}