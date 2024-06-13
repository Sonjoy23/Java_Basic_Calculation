import java.util.Arrays;
public class Ascending_Array {
    public static void main(String[] args) {
        int [] s= {1,3,2,5,4,7};
        Arrays.sort(s);
        for(int i=0; i<s.length; i++){
            System.out.print(" "+s[i]);
        }
    }
}