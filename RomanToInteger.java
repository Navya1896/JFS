//Converting Roman Numbers to Integers
public class RomanToInteger {
    static final int I = 1;
    static final int V = 5;
    static final int X = 10;
    static final int L = 50;
    static final int C = 100;
    static final int D = 500;
    static final int M = 1000;

    int result = 0, previous = 0, current;
    public int romanNumbers(String romanValue){
        for (int i = 0; i < romanValue.length(); i++){
            switch(romanValue.charAt(i))
            {
                case 'I': current = I;
                    break;
                case 'V': current = V;
                    break;
                case 'X': current = X;
                    break;
                case 'L': current = L;
                    break;
                case 'C': current = C;
                    break;
                case 'D': current = D;
                    break;
                case 'M': current = M;
                    break;
            }
            if (previous < current) {
                result = current - previous;
                previous = current;
            }
            else if(previous >= current){
                result = current + previous;
                previous = current;
            }

        }

        return result;
    }
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        int wholeNumber = romanToInteger.romanNumbers("CC");
        System.out.println("The whole Number is : "+wholeNumber);
    }
}
