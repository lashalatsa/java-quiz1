public class Vehicle {
    int passenge;
    int fuel;
    int mpg;

    Vehicle(int p,int f,int m){
        passenge=p;
        fuel= f;
        mpg=m;
    }
    int Range(){
        return mpg*fuel;
    }
}
