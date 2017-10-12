import java.util.ArrayList;

public class Application {
    static int[] ryad = {1,7,8,9};

    private static boolean proverSummu(int chislo, int [] arr, int length) {
        if (length<2){
            int s = 0;
            ArrayList c = new ArrayList<Integer>();
            for(int i=0; i<arr.length; i++){
                s +=ryad[i];
                c.add(ryad[i]);
                if(ryad[i]==chislo || s==chislo){
                    System.out.println("TRUE : "+c.toString());
                    return true;
                }
            }
        }else{
            for (int i = 0; i < length; i++) {
                smenaMest(arr,i,length-1);
                if(proverSummu(chislo, arr,length-1)){
                    return true;
                }
                smenaMest(arr,length-1,i);
            }
        }
        return false;
    }
    private static void smenaMest(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        proverSummu(16,ryad,ryad.length);
    }

}
