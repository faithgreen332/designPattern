package adapter;

import java.io.*;

/**
 * Author: ljf
 * CreatedAt: 2021/3/25 下午5:23
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("/home/ljf/test.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
    }
}
