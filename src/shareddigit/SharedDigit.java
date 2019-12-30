
package shareddigit;


public class SharedDigit {

    
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    
    public static boolean hasSharedDigit(int a, int b)
{
    int dig=0;
    int temp;
    if(a<10 || a>99 || b<10 || b>99)
        return false;
    else {
        while (a != 0) {
            dig = a % 10;
            a = a / 10;
            temp=b;
            while (temp != 0) {
                if (dig == temp % 10)
                    return true;
                temp = temp / 10;
            }
        }
    }
    return false;
}
    
}
