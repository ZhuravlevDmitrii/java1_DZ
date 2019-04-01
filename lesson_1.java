package test;

public class lesson_1 {
    public static void main(String[] args) {
        System.out.println(calculate(3,4,5,6));
        System.out.println(number10or20(8));
        positiveOrNegative(7);
        System.out.println(negativeOrPositive(-3));
        enterName("Dima");
        leapYear(800);

    }
    public static void variablesStudied(){
        byte b1 = 10;
        short s1 = 500;
        int i1 = 55555;
        long l1 = 123123123123123L; //
        float f1 = 120.5f;
        double d1 = 120.5;
        boolean bool1 = true;
        char c1 = 156;
        String str = "Hello world";
    }

    public static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
    public static boolean number10or20(int a){
        boolean b;
        if (a >= 10 && a <= 20)
            b = true;
        else
            b = false;
        return b;
    }
    public static void positiveOrNegative(int a){
        if (a >= 0)
            System.out.println("Заданное число положительное");
        else
            System.out.println("Заданное число отрицательное");
    }
    public static boolean negativeOrPositive(int a){
        boolean b;
        if (a < 0)
            b = true;
        else
            b = false;
        return b;
    }
    public static void enterName(String name){
        System.out.println("Привет, " + name + "!");
    }
    public static void leapYear(int year){
       if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
           System.out.println("Год высокосный");
       } else{
           System.out.println("Год не высокосный");
       }
    }
}


