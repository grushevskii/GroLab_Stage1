package JavaFundamentals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OptionalTaskTwo {
    private static Scanner scanner = new Scanner(System.in);
    private  static Random random=new Random();

    public static void main(String[] args) {
        int[][] arrayNumbers =createMatrixWithRandomNumbers(50,25);
        sortAscendingColumnValue(arrayNumbers);
        searchLargestNumberIncreasingElements(arrayNumbers);
    }
    public static int[][] createMatrixWithRandomNumbers(int m,int size){
        int n = (int) Math.sqrt(size);
        int[][] arrayNumbers = new int[n][n];
        System.out.println("Матрица ["+n+"] на ["+n+"] с элементами в интервале значений от -"+m+" до "+m+":");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                arrayNumbers[i][j] = random.nextInt(m*2)-m;
                System.out.print(arrayNumbers[i][j] + " ");
            }
            System.out.println();
        }
        return arrayNumbers;
    }
    public  static void sortAscendingColumnValue(int[][] arrayNumbers){
        System.out.println("Выбирайте столбец для сортировки: ");
        int k=scanner.nextInt();
        System.out.println("Матрица, отсортированная в порядке возрастания значений элементов "+k+" столбца:");
        for (int i=0;  i<arrayNumbers.length; i++)
            for (int n=i+1; n < arrayNumbers.length; n++) {
                if (arrayNumbers[i][k-1] > arrayNumbers[n][k-1]){
                    for (int j=0; j < arrayNumbers.length; j++) {
                        int temp = arrayNumbers[i][j];
                        arrayNumbers[i][j]=arrayNumbers[n][j];
                        arrayNumbers[n][j]=temp;
                    }
                }
            }
        for (int i=0; i<arrayNumbers.length; i++)
        {
            for (int j=0; j<arrayNumbers.length; j++)
            {
                System.out.print(arrayNumbers[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void searchLargestNumberIncreasingElements(int[][] arrayNumbers){
        int[] array = new int[arrayNumbers.length * arrayNumbers.length];//преобразую в одномерный массив
        int ind = 0;
        int numMax=0;
        int max=0;
        int idMax=0;
        int numMin=0;
        int min=0;
        int idMin=0;
        for(int[]i:arrayNumbers){
            for(int j:i){
                array[ind++] =j;
            }
        }
        for (int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                numMax+=1;
                if(numMax>max){max=numMax;idMax=i+1;}
            }else{numMax=0;}
            if(array[i]>array[i+1]){
                numMin+=1;
                if(numMin>min){min=numMin;idMin=i+1;}
            } else{numMin=0;}
        }
        System.out.println("Максимальная последовательность возрастающих чисел:");
        int[]arrayMax=new int[max+1];
        System.arraycopy(array,(idMax-max),arrayMax,0,(max+1));
        System.out.println(Arrays.toString(arrayMax)+" Количество чисел:"+(max+1));
        System.out.println("Максимальная последовательность убывающих чисел:");
        int[]arrayMin=new int[min+1];
        System.arraycopy(array,(idMin-min),arrayMin,0,(min+1));
        System.out.println(Arrays.toString(arrayMin)+" Количество чисел:"+(min+1));
    }
}
