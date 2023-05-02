import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num]; //길이 num인 배열 생성
        int temp;

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        for(int i=0;i< array.length-1 ;i++){
            for(int j=0;j< array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

        }
        for (int i : array) {
            System.out.println(i);
        }
    }

}
