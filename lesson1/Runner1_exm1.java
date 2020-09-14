/**
 * вывод входных аргументов
 * @author Alexander Butkevich
 */
public class Runner1_exm1 {
    public static void main(String[] args) {
        System.out.println("Runner");
        // получение аргументов args ком. строки
        //System.out.println("arg[0]= " + args[0]);
        //System.out.println("arg[1]= " + args[1]);
        //System.out.println("arg[2]= " + args[2]);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d]= %s\n",i,args[i]);
        }
    }
}

/*
    метод main всегда делать в class Runner
 */

