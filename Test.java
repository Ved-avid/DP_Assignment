class Class{
    static int number;
    static final int CAPACITY = 60;
    static int k=0;
    int[] student = new int[30];
    int i = 0;
    public void input(int n){
         if(number >= CAPACITY){
             System.out.println("Maximum capacity of school is 60");
             return;
         }
         student[i++] = n;
         number++;
    }

    public void display(){
        if(number>30){
            k++;
        }
        System.out.println("Student of class C"+k);
        for(int x: student){
            System.out.println(x);
        }
    }
}
public class Test{
    public static  void main(String[] args){
        Class c1 = new Class();
        for(int i = 1;i<=30;i++){
            c1.input(i);
        }
        Class c2 = new Class();
        for(int i = 1;i<=30;i++){
            c2.input(i);
        }
        c1.display();
        c2.display();
        Class c3 = new Class();
        c3.input(45);
    }
}