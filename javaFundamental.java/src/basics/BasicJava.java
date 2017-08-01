package basics;

import java.util.*;

public class BasicJava {
    public void oneToTwofivefive(){
        for(int i = 1; i < 256; i ++){
            System.out.println(i);
        }
    }

    public void allOdd(){
        for(int i = 1; i < 256; i ++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public void sumAll(){
        int sum = 0;
        for (int i = 0; i < 256; i ++){
            sum += i;
            String words = String.format("New number: %d Sum: %d", i, sum);
            System.out.println(words);
        }
    }

    public void interate(int[] array){
        for (int value: array){
            System.out.println(value);
        }
    }

    public int findMax(int[] array){
        int max = array[0];
        for (int value: array){
            if (max < value){
                max = value;
            }
        }
        return max;
    }

    public double average(int[] array){
        double sum = 0;
        for (int value: array){
            sum += value;
        }
        return sum / array.length;
    }

    public ArrayList<Integer> oddArray(){
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 1; i < 256; i = i + 2){
            y.add(i);
        }
        return y;
    }

    public int GreaterThanY(int[] arr, int y){
        int count = 0;
        for (int value: arr){
            if (value > y){
                count ++;
            }
        }
        return count;
    }

    public void squareValues(int[] givenArray){
        int length = givenArray.length;
        for (int i = 0; i < length; i++){
            givenArray[i] *= givenArray[i];
        }
        System.out.println(Arrays.toString(givenArray));
    }

    public void eliminateNegative(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[] maxMinAndAvg(int[] arr){
        int min = arr[0], max = arr[0], sum = 0;
        for (int value: arr){
            if (min > value){
                min = value;
            }
            if (max < value){
                max = value;
            }
            sum += value;
        }
        int[] result = new int[3];
        result[0] = max;
        result[1] = min;
        result[2] = sum / arr.length;
        return result;
    }

    public void shifting(int[] arr){
        for (int i = 0; i < arr.length - 1; i ++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length -1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
