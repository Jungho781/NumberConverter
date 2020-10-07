public class Hexadecimal {
    public static Object convertToBinary(){
        char hexdec[] = new char[0];
        int i=0;
        while(hexdec[i]!='\u0000'){
            switch (hexdec[i]){
                case '0':
            }
        }

        return null;

    }
    public static Object convertToDecimal(){
        String hexnum="";
        String hstring="0123456789ABCDEF";
        hexnum=hexnum.toUpperCase();
        int num=0;
        for (int i=0;i<hexnum.length();i++){
            char ch=hexnum.charAt(i);
            int n=hstring.indexOf(ch);
            num=16*num+n;
        }
        return num;
    }

}
