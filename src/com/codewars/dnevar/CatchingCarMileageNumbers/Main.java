package com.codewars.dnevar.CatchingCarMileageNumbers;


public class Main {
    public static void main(String[] args) {
//        System.out.println(isInteresting(11207, new int[]{})); // 0
//        System.out.println(isInteresting(11208, new int[]{})); // 0
//        System.out.println(isInteresting(11209, new int[]{})); // 1
//        System.out.println(isInteresting(11210, new int[]{})); // 1
//        System.out.println(isInteresting(11211, new int[]{})); // 2
//        System.out.println();
//        System.out.println(isInteresting(19997, new int[]{})); // 0
//        System.out.println(isInteresting(39997, new int[]{})); // 0
//        System.out.println(isInteresting(19998, new int[]{})); // 1
//        System.out.println(isInteresting(19999, new int[]{})); // 1
//        System.out.println(isInteresting(10000, new int[]{})); // 2
//        System.out.println();
        System.out.println(isInteresting(9996, new int[]{9998, 256})); // 1
        System.out.println(isInteresting(9997, new int[]{9998, 256})); // 1
        System.out.println(isInteresting(9998, new int[]{9998, 256})); // 2
//        System.out.println();
//        System.out.println(isInteresting(99997, new int[]{})); // 1
//        System.out.println(isInteresting(999997, new int[]{})); // 1
//        System.out.println(isInteresting(99998, new int[]{})); // 1
//        System.out.println(isInteresting(99999, new int[]{})); // 2
//        System.out.println(isInteresting(10000, new int[]{})); // 2
//        System.out.println(isInteresting(10001, new int[]{})); // 2

//        for (int i = 999000000; i <= 1000000000; i++) {
//            if(isInteresting(i, new int[]{})!=0) {
//                System.out.println(i + " - " + isInteresting(i, new int[]{}));
//            }
//        }
    }

    public static int isInteresting(int number, int[] awesomePhrases) {
        if(number<100){
            return 0;
        }
        
        int[] numbers = new int[3];
        numbers[0]=number;
        numbers[1]=number+1;
        numbers[2]=number+2;
        String[] nums = new String[3];
        nums[0] = Integer.toString(numbers[0]);
        nums[1] = Integer.toString(numbers[1]);
        nums[2] = Integer.toString(numbers[2]);
        String digitsIncrementing = "1234567890";
        String digitsDecrementing = "9876543210";
        int[] results = new int[4];


        results[0] = 0;
        for (int awesomePhrase : awesomePhrases) {   //The digits match one of the values in the awesomePhrases array
            if (awesomePhrase == number){
                results[0] = 2;
            }else if (awesomePhrase == numbers[1] || awesomePhrase == numbers[2]){
                results[0] = 1;
            }
        }

        results[1] = 0;
        if(digitsDecrementing.contains(nums[0])      //The digits are sequential, incementing†: 1234, decrementing‡: 4321
                || digitsIncrementing.contains(nums[0])){
            results[1] = 2;
        }else if(digitsDecrementing.contains(nums[1])
                || digitsIncrementing.contains(nums[1])
                || digitsDecrementing.contains(nums[2])
                || digitsIncrementing.contains(nums[2])){
            results[1] = 1;
        }

        results[2] = 0;
        for (int i = 0; i < nums.length; i++) {    //The digits are a palindrome: 1221 or 73837
            char[] arr = nums[i].toCharArray();
            char[] res = new char[arr.length];
            int count = 0;
            for (int j = arr.length-1; j >= 0; j--) {
                res[count] = arr[j];
                count++;
            }
            String result = new String(res);
            if(nums[i].equals(result) && i==0){
                results[2] = 2;
                break;
            }else if(nums[i].equals(result) && i!=0){
                results[2] = 1;
            }
        }

        results[3] = 0;
        for (int j = 1; j < 10; j++) {              //Any digit followed by all zeros: 100, 90000
            for (int i = 100; i < 1000000000; i*=10) {
                if (j*i == number){
                    results[3] = 2;
                    break;
                } else if (numbers[1] == j*i || numbers[2] == j*i){
                    results[3] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < results.length; i++) {
            if(results[i]>result){
                result = results[i];
            }
        }
        return result;
    }
}
