class Parent{
    String n;
    int eyes;
    float height;
    String place;
    public Parent(String l,int e, int h, String p){
        eyes = e;
        height = h;
        place = p;
        n = l;
    }
    public void name(){
        System.out.println("Amar naam "+this.n);
    }
    public void numberOfEyes(){
        System.out.println("Hi, I have "+this.eyes+" eyes");
    }
    public void myHeight(){
        System.out.println("Hi, I am "+this.height+" feet tall"); 
    }
    public void livingPlace(){
        System.out.println("Hi, I live in "+this.place);
    }
}

class Child extends Parent{
    public Child(String l,int e, int h, String p){
        super(l,e, h, p);
    }
    public void name(){
        System.out.println("Hey, I am "+this.n);
    }

    public void numberOfEyes(){
        System.out.println("I have "+this.eyes+" eyes");
    }

    public void myHeight(){
        System.out.println("Hey, My height is "+this.height+ " feet");
    }

    public void livingPlace(){
        System.out.println(this.place+", yess I live here"); 
       }
}

class RuntimeCall{
    static public void main(String[] args){
        Parent p_rference = new Child("Ved",2, 6,"Dhanbad");
        p_rference.name();
        p_rference.myHeight();
        p_rference.livingPlace();
        p_rference.numberOfEyes();
    }
}
