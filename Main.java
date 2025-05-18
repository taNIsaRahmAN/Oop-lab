public class Main {
   // static void myMethod(){
        //System.out.println("Tanisha");
   // }
    static void myMethod(String name){
        System.out.println(name);
    }
    static void myMethod(String fname, String lname){
        System.out.println(fname+" "+lname);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = arr.length;

        int sum = 0;
        for (int i : arr) {
            if (arr[i] == 6 || arr[i] == 7) {
                continue;
            } else if (arr[i] == 9) {
                break;
            } else {
                sum = sum + arr[i];
            }

                /*int sum=0;

                for (int i : arr) {
                    sum = sum + i;
                }
                System.out.println("sum is "+sum);
                double average=sum/10;
       System.out.println("average is "+average);*/
        }
        System.out.println("sum is "+sum);
       // myMethod();
       myMethod("Tanisha");
        myMethod("Tanisha","Rahman");

    }
        }