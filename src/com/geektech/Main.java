package com.geektech;

public class Main {

    public static void main(String[] args) {
        double sum =0.0;
        int count= 0;
        boolean isNegative= false;


	double []number ={2,-5, 7,8,3,-9,11};
        for (double number2: number) {
            if ( number2 < 0 ){
                isNegative=true;
            }
            else if (isNegative){
                sum += number2;
                count ++;

            }


        }    System.out.println(sum/count);
    }
}
