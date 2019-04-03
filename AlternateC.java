import java.util.*;
import java.io.*;

public class Solution{
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
              int q = input.nextInt();
              for (int count = 0; count < q; count++) {
                     char[] characters= input.next().toCharArray();
                      int delete=0;
                     for(int i=0;i<characters.length-1;i++) {
                           if(characters[i]==characters[i+1]) {
                                  delete++;
                           }
                     }
                     System.out.println(delete);
              }
              input.close();
       }
}
