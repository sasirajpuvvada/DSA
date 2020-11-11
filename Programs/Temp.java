package Programs;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Temp {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n;
        String a;
        n=Integer.parseInt(br.readLine());
        a = br.readLine();
        System.out.print(n+" "+a);

        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(ar.size());
        System.out.println(ar.remove(ar.size()-1));
        System.out.println(ar.size());

    }
}
