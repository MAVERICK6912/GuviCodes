import java.io.*;
class StringReverse{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String input=bufferedReader.readLine();
        StringBuffer buffer=new StringBuffer(input);
        buffer.reverse();
        System.out.print(buffer);
    }
}