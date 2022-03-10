package homework3;

public class homework3 {
    public static void main(String[] args) {
        /**
         * Homework 3. Covertining
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         *
         * K -> C
         * K -> F
         *
         *
         */

        // Converting degree-Celsius into deg-Fahrenheit
        // fT = cT * 9/5 + 32


        double cTemp = 19;
        double fTemp =  cTemp * 9/5 + 32;
        System.out.println(fTemp);

       // Converting Celsius into kelvin
        //K = °C + 273.15

        double cTem = 19;
        double kTem = 19 + 273.15;
        System.out.println(kTem);

        // Converting Fahrenheit to Celsius
        // T(°C) = (T(°F) - 32) × 5/9
        // F = 19
        //

        double fTem = 19;
        double cTempt = (fTem - 32) * 5/9;
        System.out.println(cTempt);

        //Converting fahrenheit into kelvin
        // K = (°F − 32) × 5/9 + 273.15

        double tem = 19;
        double kelv = (tem- 32) * 5/9 + 273.15;
        System.out.println(kelv);

        //Converting kelvin to celsius
        // C = K - 273.15
        // K = 500

        double k= 500;
        double c = k - 273.15;
        System.out.println(c);

        //converting kelvin to Fahrenheit
        // F = 1.8*(K-273) + 32
        // K = 500

        double kel = 500;
        double fah = 1.8 * (500-273) + 32;
        System.out.println(fah);





    }










}

