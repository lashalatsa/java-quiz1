public class Fraction {
    private int numenator;
    private int denominator;


    Fraction(int numenator, int denominator) {
        this.numenator = numenator;
        this.denominator = denominator;

    }

    public int getNumenator() {
        return numenator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void gamravleba(int n) {
        if (n == 0) {
            return;
        }
        this.numenator *= n;
        this.denominator *= n;
    }
    public void shekreba(int a,int b) {
        if (a==0 || b==0){
            return;
        }else{
            this.numenator = this.numenator*b+a*this.denominator;
            this.denominator = this.denominator*b;
        }
    }

    public void shekveca(int n) {
        if (n == 0) {
            return;
        }
        this.numenator /= n;
        this.denominator /= n;
    }



    public void printfraction() {
        System.out.println(this.numenator + "/" + this.denominator);

    }
}