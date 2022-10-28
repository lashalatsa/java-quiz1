public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator) throws FractionException{
        if(denominator==0){
            throw new FractionException("veraa kargad saqme");
        }

        this.numerator = numerator;
        this.denominator=denominator;
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        return "Fraction {"+"numerator =" +numerator+"denominator=" +denominator;
    }
}
