import java.util.Scanner;

/*public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         try {
        System.out.println("Output of a number after dividing it by 1000 is"  + 1000/a);
    } catch (ArithmeticException e) {
             System.out.println("Please enter a valid number");
             System.out.println(e);
         }
    }
}*/
/*
public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        numbers[8] = 90;
        numbers[9] = 100;

        System.out.println("Enter the Array index");
        int x = sc.nextInt();

        System.out.println("Enter the Array element");
        int y = sc.nextInt();

        try {
            System.out.println("The value entered in array index" + x + " is " + numbers[x]);
            System.out.println("The number executed after dividing" + y + " is " + numbers[x] / y);
        } catch (ArithmeticException e) {
            System.out.println("Please enter a valid number");

        }
          catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter a valid number");
        }
           catch(Exception e) {
            System.out.println("Please enter a valid number");
            System.out.println(e);
           }
*/


import java.util.Scanner;
/*
public class divide {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}*/

/*class MyException extends Exception {
    public String toString() {
        return "I am to string";
    }
    public String getMessage() {
        return "I am to get message";
    }
}*/
/*
class MyageException extends Exception {
    public MyageException(String message) {
        super(message);
    }
    public String toString() {
        return "Age cannot be greater than 125";
    }
    public String getMessage() {
        return "Make sure the value of age is less than 125";
    }
}
public class divide {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try{
        if (age > 125) {
            throw new MyageException("This is an exception");
        }else {
               System.out.println("Age is valid");
            }
    } catch (MyageException e) {
        System.out.println(e);
        System.out.println(e.getMessage());
        }
    }

}*/


import java.util.Scanner;

/*class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class divide{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}*/

/*public class divide {

    public static int divide(int a, int b) throws ArithmeticException {
        int num3 = a/b;
        return num3;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        try{
            int c = divide(num1,num2);
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Exception");
        }

    }
}
*/
/*
class negativeException extends Exception {
    public String toString(){
        return("Number cannot be negative");
    }
    public String getMessege() {
        return("Radius cannot be negative");
    }

}
public class divide {

    public static int area(int radius) throws negativeException {
             if(radius < 0) {
                 throw new negativeException();
             }
             double result = Math.PI * radius * radius;
             return (int)result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        try {
            int c = area(radius);
            System.out.println("Area of the circle is " + c);
        }catch(negativeException e) {
            System.out.println(e.getMessege());
        }

    }
}*/
 /*public class divide {
     public static int greet (){
         try {
             int a = 60;
             int b = 10;
             int c = a / b;
             return c;
         }catch(ArithmeticException e){
             System.out.println("Arithmetic Exception");
         } finally{
             System.out.println("Cleaning up the code ...");
         }
         return -1;
     }
     public static void main(String[] args) {
            int k = greet();
            System.out.println(k);
            int a = 7;
            int b = 9;
            while(true) {
                try {
                    System.out.println(a/b);
                } catch (ArithmeticException e) {
                    System.out.println("Exception");
                    break;
                } finally {
                    System.out.println("Cleanup the code ...");
                }
                b--;
            }

     }
}*/
/*public class divide {
    public static void main(String[] args) {
        // int a=8 syntax error
        //int age = 78
        //int year born = 2000 -78; Logical error
        //System.out.println(6/0) generate arithmetic exception
        try {
            int a = 666/0;
        }catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        }catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }
}*/

import java.util.Scanner;

/*
public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] numbers = new int[3];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index:");
                int index = sc.nextInt();
                System.out.println("The value present at the index is " + numbers[index]);
                i++; // Increment i only on successful access
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index. Please enter an index between 0 and 2.");
                i++; // Increment i on invalid access
            }
        }

        if (i >= 5) {
            System.out.println("Too many invalid attempts.");
        }

        sc.close(); // Close the scanner
    }
}*/
import java.util.Scanner;

class limitmyarrayException extends Exception {
    @Override
    public String toString() {
        return "Please enter a valid number within the range.";
    }

    @Override
    public String getMessage() {
        return "Invalid index.";
    }
}

public class divide {
    public static void checkArrayIndex(int[] numbers, int index) throws limitmyarrayException {
        if (index < 0 || index >= numbers.length) {
            throw new limitmyarrayException();
        }
        System.out.println("The number at index " + index + " is " + numbers[index]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] numbers = new int[3];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index:");
                int index = sc.nextInt();
                checkArrayIndex(numbers, index);
            } catch (limitmyarrayException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            } finally {
                i++;
            }
        }

        if (i >= 5) {
            System.out.println("Too many invalid attempts.");
        }

        sc.close();
    }
}



