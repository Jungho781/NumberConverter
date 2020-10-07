
public class Decimal {
    public static Object convertToBinary(){
        int n=789;

        int[]binaryNum=new int[32];
        int i=0;
        while (n>0){
            binaryNum[i]=n%2;
            n=n/2;
            i++;
        }

        return null;
    }


    public static Object convertToHexadecimal(){
        int num=0;
        int rem;
        String str2="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9',
                'A','B','B','D','E','F'};
        while(num>0){
            rem=num%16;
            str2=hex[rem]+str2;
            num=num/16;
        }
        return null;

    }
}
