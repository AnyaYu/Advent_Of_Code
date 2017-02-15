/**
 * Created by annayushina on 22/01/17.
 */

    public class javarush
    {
        public static void main(String[] args)
        {
            method1();
      //     System.out.println(method());


        }

        public static void method1()
        {
            method2();
        }

        public static String method2()
        {
            method3();
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element: stackTraceElements) {
                System.out.println(element.getMethodName());
            }
            System.out.println("!!!");
            return stackTraceElements[2].getMethodName();
        }

        public static void method3()
        {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        }
    }

