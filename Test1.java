package com.training.multithreading;

import java.util.*;

class Test1{
    
    static boolean isPrime(int n){
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    static boolean isAdditivePrime(int x){
        boolean a1 = isPrime(x);
        if(a1 == true){
            int sum = 0;
            while(x > 0){
                int z1 = x%10;
                sum += z1;
                x /= 10;
            }
            boolean a2 = isPrime(sum);
            if(a2 == true){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++){
            boolean result = isAdditivePrime(A[i]);
            if(result == true)
                System.out.print(A[i] + " ");
        }
        scan.close();
    }
}