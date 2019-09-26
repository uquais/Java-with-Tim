import java.util.Scanner;

public class Practice_String {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String sr = "";
        sr = sr+st.charAt(0);
        sr = sr+". ";
        for (int i = 0; i<st.length();i++){
            if(st.charAt(i) == ' ' && st.charAt(i+1)!=' ' && i+1<st.length()){
                sr = (sr+st.charAt(i+1)).toUpperCase();
                sr = sr+". ";
            }
        }
        String last_wrd = "";
        //to get the last word
        for(int i = st.length();i>=0;i--){
            if(st.charAt(i) == ' '){
               last_wrd = st.substring(i+2);
               // System.out.println(last_wrd);
                break;
            }
        }
        //to remove last ". "
        //System.out.println(sr);
        sr = sr.substring(0,sr.length()-2);
        sr = sr+last_wrd;
        System.out.println(sr);
    }
}


