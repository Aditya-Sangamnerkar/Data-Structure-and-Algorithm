public class countDigit {



        public static int countDigitUtils(int n)
        {
            if( n == 0)
                return 0;
            return 1 + countDigitUtils(n/10);
        }
        public static int countDigits(int n)
        {
            if( n == 0)
                return 1;
            else
                return countDigitUtils(n);
        }

        public static void main(String[] args)
        {
            System.out.println(countDigit.countDigits(34));
        }

}
