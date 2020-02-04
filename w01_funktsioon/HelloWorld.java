public class HelloWorld{
    public static void main(final String[] arg){
        System.out.println("Hello World");
        
        final byte minByte = Byte.MIN_VALUE;
        final byte maxByte = Byte.MAX_VALUE;
        //short, int, long, float, double, char, boolean

        boolean flag = true;


        
        System.out.println(1+1); // * / - %
        
        int number = 5;
        System.out.println(number++);
        System.out.println(++number);

        if (number < 10 || number > 0){
            System.out.println("Jah");
        }


        for(int i = 0; i < 10; i++){   //i++ on i = i + 1

        }

        int counter = 0;

        while(flag){
            if (!flag){

            }
            counter++;
            if(counter == 10){
                System.out.println("I'm out");
                flag = false;
            }
        }
    }

    int counterTwo = 0;

    do {

    } while(counterTwo == 10);

    int[] numberArray = new int[] {1, 2, 3, 4, 5};

    for(int element : numberArray){
        System.out.println(element);
    }

    for(int i = 0; i < nummberArray.length; ++i){
        System.out.println(numberArray[i]);
    }

    String myName = "Taavi";

    System.out.println(myName);

    HelloWorld helloWorld = new HelloWorld();

    printSomething(10);    

    String name();
    System.out.println(name)

static String name(){
    return "Taavi";
}

static void printSomething(int number){
    int number = 5;
    for (int i; i < 10; i++){
        number += i;
    }

    System.out.println(number);
}
}}