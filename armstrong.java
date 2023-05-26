package simple;


public class armstrong {
    public static void main(String[] args) {
        int a=153,r,rem=0,temp;
        temp=a;
        while(temp>0){
            r=temp%10;
            rem=rem+(r*r*r);
            temp=temp/10;
        }
        if(a==rem){
            System.out.println("armstromg");
        }
        else{
            System.out.println("not");
        }
    }
    
}
