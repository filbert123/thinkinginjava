import java.util.Arrays;

public class Vampire {
    public static void main(String[] args) {
        for(int i=9; i<100; i++) {
            for(int j=i; j<100; j++) {
                int k = i * j;

                String kStr = Integer.toString(k);
                String checkStr = Integer.toString(i) + Integer.toString(j);
                System.out.println(kStr+" "+checkStr);
                //if(kStr.length() != 4) break;

                char[] kChar = kStr.toCharArray();
                char[] checkChar = checkStr.toCharArray();

                Arrays.sort(kChar);
                Arrays.sort(checkChar);
                boolean isVampire = Arrays.equals(kChar, checkChar);

                if(isVampire) {
                    System.out.println(i + " * " + j + " = " + k);
                }
            }
        }
    }
}