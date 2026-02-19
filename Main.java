// Basic Printing in java
// class demo{
//     public static void main(String args[]){
//         String name="Vetsa Satya Srikar";
//         int age=18;
//         int Rollno=32;
//         String DOB="29/05/2007";
//         String Class="424MN";
//         System.out.println("Hello World");
//         System.out.println("The Name is : "+name);
//         System.out.println("The age is : "+age);
//         System.out.println("The Roll No is : "+Rollno);
//         System.out.println("The DOB is : "+DOB);
//         System.out.print("The Class name is : "+Class);
//     }
// }
// taking input 
// import java.util.*;

// public class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();
//     sc.nextLine();
//     String Name = sc.nextLine();
//     String DOB = sc.next();
//     String City = sc.nextLine();
//     String Classes = sc.next();
//     System.out.println("My age is : "+age);
//     System.out.println("My name is : "+Name);
//     System.out.println("My DOB is : "+DOB);
//     System.out.println("My City is : "+City);
//     System.out.println("My class is : "+Classes);
//     sc.close();
//   }
// }
// taking input in terminal for an array in names giving size and then input

// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size=sc.nextInt();
//         String[] name = new String[size];
//         for(int i=0;i<size;i++){
//             name[i]=sc.next();
//         }
//         for(int i=0;i<size;i++){
//             System.out.println("name"+(i+1)+":"+name[i]);
//         }
//     }
// }
// input in terminal
// 2
// Srikar
// Sasi
// name1: Srikar
// name2: Sasi
// swapping of numbers using bitwise operters
// from a to b and b to a 
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         int a = 6, b = 5;
//         a = a^b;
//         b = a^b;
//         a = a^b;
//         System.out.println("A : "+a);
//         System.out.println("B : "+b);
//         if((a & 1)==0){
//             System.out.println(a+" is Even");
//         }
//         else{
//             System.out.println(a+" is not even");
//         }
//     }
// }
// boxing and unboxing in java

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	int num = 30;
//     double dou = 1022;
//     char cha = 'A';
//     boolean boo = true;

//     Integer Num1 = num;
//     Double Dou = dou;
//     Character Cha = cha;
//     Boolean Boo = boo;

//     int num1 = Num1;
//     double dou1 = Dou;
//     char cha1 = Cha;
//     boolean boo1 = Boo;

//     System.out.println("boxing : " + Num1 + " Unboxing : "+ num1);
//     System.out.println("boxing : " + Dou + " Unboxing : "+ dou1);
//     System.out.println("boxing : " + Cha + " Unboxing : "+ cha1);
//     System.out.println("boxing : " + Boo + " Unboxing : "+ boo1);
// 	}
// }
// different array problems
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         for(int i = 0; i<5; i++){
//             arr[i]=sc.nextInt();
//         }
//         int max = 0;
//         for(int i=0;i<5;i++){
//             if(arr[i]<max){
//                 max = arr[i];
//             }
//         }
//         // System.out.print(max);
//         int min;
//         for(int i=0;i<5;i++){
//             if(arr[i]>min){
//                 min = arr[i];
//             }
//         }
//         // System.out.print(min);
//         for(int i=0;i<5;i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println(min);
//         System.out.println(max);
//         int secmax;
//         for(int i=0;i<5;i++){
            
//         }

//     }
// }
// different types of problems in 2D array

// // Printing the matrix of 2D array
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = 3;
//         int col = 3;
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i= 0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// // Sum of Matrix of all elements in 2D array
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = 3;
//         int col = 3;
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int sum = 0;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 sum += arr[i][j];
//             }
//         }
//         System.out.println("Matrix sum is " +sum);
        
//     }
// }

// // Sum of Matrix of all elements int row-wise and col-wise in 2D array
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = 3;
//         int col = 3;
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i= 0;i<row;i++){
//             int rowsum = 0;
//             for(int j=0;j<col;j++){
//                 rowsum +=arr[i][j]; 
//             }
//             System.out.println("Matrix Sum of Row-wise is" +(i+1)+" Sum : "+rowsum);
//         }
//         for(int j=0;j<col;j++){
//             int colsum= 0 ;
//             for(int i=0;i<row;i++){
//                 colsum += arr[i][j];
//             }
//             System.out.println("Matrix sum of col-wise is" +(j+1)+ " Sum : "+colsum);
//         }
//     }
// }

// printing the sum of Diagonal Sum of 1st and 2nd rows and sum of two rows of an  elements in 2D array
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = 3;
//         int col = 3;
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int diagonalsum1 = 0;
//         int diagonalsum2 = 0;
//         for(int i=0;i<row;i++){
//             diagonalsum1 += arr[i][i];
//             diagonalsum2 += arr[i][col-1-i];
//         }
//         System.out.println("The Diagonalsum of 1st row of a Matrix is : "+diagonalsum1);
//         System.out.println("The Diagonalsum of 2nd row of a Matrix is : "+diagonalsum2);
//         System.out.println("The sum of Diagonal of a Matrix is : "+(diagonalsum1 + diagonalsum2));
//     }
// }

// printing the Reverse Array of the Matrix in 2D Array
// Transpose of a 2D Matrix
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = 4;
//         int col = 4;
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i= 0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// different problems in 1D array
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         for(int i = 0; i<5; i++){
//             arr[i]=sc.nextInt();
//         }
//         int max = 0;
//         for(int i=0;i<5;i++){
//             if(arr[i]<max){
//                 max = arr[i];
//             }
//         }
//         // System.out.print(max);
//         int min;
//         for(int i=0;i<5;i++){
//             if(arr[i]>min){
//                 min = arr[i];
//             }
//         }
//         // System.out.print(min);
//         for(int i=0;i<5;i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println(min);
//         System.out.println(max);
//         int secmax;
//         for(int i=0;i<5;i++){
            
//         }

// //     }
// // }
// spiral Travesal problem with boundries matrix
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    int[][] matrix={
// 	        {1,2,3,4},
// 	        {5,6,7,8},
// 	        {9,10,11,12}
// 	    };
// 	    int n=matrix.length;
// 	    int m=matrix[0].length;
// 	    int left = 0;
// 	    int right = m-1;
// 	    int top = 0;
// 	    int bottom = n-1;
// 	    if(top <= bottom && left<=right){
// 	        for(int i=left;i<=right;i++){
// 	            System.out.println(matrix[left][i]+" ");
// 	    }
// 	    top++;
// 	    for(int i=top;i<=bottom;i++){
// 	        System.out.println(matrix[i][right]+ " ");
// 	    }
// 	    right--;
// 	    }
// 	    if(top<=bottom){
// 	        for(int i=right;i>=left;i--){
// 	            System.out.println(matrix[bottom][i]+ " ");
// 	        }
// 	        bottom--;
// 	    }
// 	    if(left<=right){
// 	        for(int i=bottom;i>=top;i--){
// 	            System.out.println(matrix[i][left]+" ");
// 	        }
// 	        left++;
// 	    }
// 	}
// }
// Sprial Travesal in matrix 

// public class Main {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12}
//         };

//         int n = matrix.length;
//         int m = matrix[0].length;

//         int top = 0, bottom = n - 1;
//         int left = 0, right = m - 1;

//         while (top <= bottom && left <= right) {

//             for (int i = left; i <= right; i++)
//                 System.out.print(matrix[top][i] + " ");
//             top++;

//             for (int i = top; i <= bottom; i++)
//                 System.out.print(matrix[i][right] + " ");
//             right--;

//             if (top <= bottom) {
//                 for (int i = right; i >= left; i--)
//                     System.out.print(matrix[bottom][i] + " ");
//                 bottom--;
//             }

//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--)
//                     System.out.print(matrix[i][left] + " ");
//                 left++;
//             }
//         }
//     }
// }
// import java.util.*;
// public class Main{
//     static int sum(int a){
//         return a;
//     }
//     static double sum(int a,double b){
//         return a+b;
//     }
//     static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     static double sum(double a,double b,double c){
//         return a+b+c;
//     }
//     public static void main(String[] args){
//         int res = sum(5);
//         double res1 = sum(5,6.55);
//         int res2 = sum(5,6,7);
//         // implict
//         double res3 = sum(5 ,6);
//         // explicit 
//         double res4 = sum(5,6,9);              
//         System.out.println(res4);
//         System.out.println(res3);
//         System.out.println(res);
//         System.out.println(res1);
//         System.out.println(res2);
//     }
// }
// reverseing a string 
// public class Main{
//     public static void main(String[] args){
//         String name = "Vetsa Sri Rama Naga Venkata Sri Satya Srikar";
//         String str1 = " ";
//         for(int i=name.length()-1;i>=0;i--){
//             str1 +=name.charAt(i);
//         }
//         System.out.println(str1);
//     }
// // }
// for finding vowels in the string
// public class Main{
//     public static void main(String[] args){
//         String name = "Vetsa Sri Rama Naga Venkata Sri Satya Srikar";
//         String str1 = " ";
//         for(int i = 0; i < name.length(); i++){
//             char c = Character.toLowerCase(name.charAt(i));
//             if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
//                 str1 += c;
//             }
//         }
// //         System.out.println("Vowels: " + str1);
// //     }
// // }
// import java.util.*;
// public class{
//     public static void main(string[] args){
//         Scanner sc = new Scanner(System.in);
//         int row = 4;
//         int col = 4;
//         int[][] arr = new int[][]
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i= 0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print("The array is "+arr[i][j]);
//             }
//             System.out.print();
//         }
//     }
// }