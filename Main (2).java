import java.util.*;
public class Main{
  public static void main(String []args){
    Scanner kbd=new Scanner(System.in);
    String card=kbd.nextLine();
    int t=0,c=0,g=0,seven=0;
    
    for(int i=0;i<card.length();i++){
      if(card.charAt(i) == 'T'){
        t++;
      }
      else if(card.charAt(i) == 'C'){
        c++;
      }
      else{
        g++;
      }
    }

   if(t <= c && t <= g)
     seven=7*t;
   else if(c <= t && c <= g)
     seven=7*c;
   else
    seven=7*g;


   System.out.print((t*t)+(c*c)+(g*g)+seven);
}
}