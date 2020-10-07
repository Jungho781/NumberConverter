public class Binary {
    public static Object convertToHexadecimal(){
        String bitStream="011010";
        int byteLength=4;
        int bitStartPos=0,bitPos=0;
        String hexString="";
        int sum=0;
        if(bitStream.length()%4 !=0){
            int tempCount=0;
            int tempBit=bitStream.length()%4;
            while (tempCount<(byteLength-tempBit)){
                bitStream="0"+bitStream;
                tempCount++;
            }
        }
        while (bitStartPos<bitStream.length()){
            while(bitPos<byteLength){
                sum=(int)(sum+Integer.parseInt(""+bitStream.charAt(bitStream.length()
                        -bitStartPos-1))*Math.pow(2,bitPos));
                bitPos++;
                bitStartPos++;
            }
            if(sum<10)
                hexString=Integer.toString(sum)+hexString;
            else
                hexString=(char)(sum+55)+hexString;
            bitPos=0;
            sum=0;
        }

        return null;
    }

    public static Object convertToDecimal(){
        int n= 0100;
        int decimal=0,p=0;
        while(n!=0){
            decimal+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }

        return null;
    }

}
