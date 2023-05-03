import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[num]; //길이 num인 배열 생성

        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        for(int i=0;i< array.length-1;i++){
            int min_index = i;
            for(int j=i+1; j< array.length; j++) {
                if (array[min_index] > array[j])
                    min_index = j;
            }
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;

        }
        for (int i : array) {
            System.out.println(i);
        }
    }

}


