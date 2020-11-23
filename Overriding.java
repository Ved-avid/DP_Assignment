class Vehicle{
    int wheel;
    int speed;
    public Vehicle(int w, int s){
        this.wheel=w;
        this.speed=s;
    }

    public void maxSpeed(){
        System.out.println("I am just a class so no speed");
    }
    public void numWheel(){
        System.out.println("I am just a class So no wheels");
    }
}

class Maruti extends Vehicle{
    public Maruti(int w, int s){
        super(w, s);
    }

    public void maxSpeed(){
        System.out.println("Vehicle of maruti has Max Speed: "+wheel);
    }
    public void numWheel(){
        System.out.println("Vehicle of maruti has "+ speed +" wheels");
    }
}

class Overriding{
    static public void main(String[] args){
        Maruti m800 = new Maruti(180, 4);
        m800.maxSpeed();
        m800.numWheel();

        Vehicle v = new Vehicle(200, 2);
        v.maxSpeed();
        v.numWheel();

    }
}