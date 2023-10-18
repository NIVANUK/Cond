import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Cond {
    public static void main(String[] args) throws IOException {
        String inputFName = "Input.txt";
        Scanner sc = new Scanner(new File(inputFName));
        int troom = sc.nextInt();
        int tcond = sc.nextInt();
        String mod = sc.next();
        int tresult = -200;


        if (mod.equals("auto"))
            tresult = tcond;
        else if (mod.equals("fan")) {
            tresult = troom;

            if (mod.equals("freeze"))
                tresult = tcond;
            if (mod.equals("freeze") && troom < tcond)
                tresult = troom;
            if (mod.equals("heat") && troom < tcond)
                tresult = tcond;
            if (mod.equals("heat") && troom > tcond)
                tresult = troom;

        }
        System.out.println(tresult);
        String OutPutFName = "Output.txt";
        String s = Integer.toString(tresult);
        Files.writeString(Path.of(OutPutFName), s);
    }
}

