package assignment1;

public class tmp {
    public static void main(String[] args){
        int[] initial = {9,8,4,4,6,9,2,5,1,1,5,2};
        for (int i = 1; i < 12; i++){
            if (initial[i] == initial[i-1]){
                initial[i] = (initial[i] + 3) % 10;
            }
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(initial[i]);
        }
    }
 }
