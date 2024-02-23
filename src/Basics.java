public class Basics {
    public Basics() {
        /*
         * Numbers
         * byte 8 bit, short 16 bit, int 32 bit & long 64 bit
         *
         * Decimals
         * double 64 bit and float 32 bit
         *
         * String 32 bit and char 16 bit
         *
         * boolean
         *
         * Overflow is when a number or a decimal surpass its size causing an error
         *
         * Casing the conversion of the data type on another and is also found in
         * operators += case implicit to the users changes
         * */

        int bSize = Byte.SIZE;
        int sSize = Short.SIZE;
        int iSize = Integer.SIZE;
        int lSize = Long.SIZE;

        int dSize = Double.SIZE;
        int fSize = Float.SIZE;

        int cSize = Character.SIZE;

        char qn = '\u0012';
        System.out.println("The char is" + qn);
    }
}
