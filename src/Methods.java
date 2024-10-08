public class Methods {
    public int sumLastNums(int x){ //возвращает сумму 2х последних цифр числа
        int lastD = x % 10;
        x/=10;
        int secLastD = x % 10;
        int summ = lastD + secLastD;
        return summ;
    }

    public boolean isPositive(int x){
        return x > 0;
    }

    public boolean isUpperCase(char x){
       return x >= 'A' && x <='Z';
    }

    public boolean isDivisor(int a, int b){
        return (a % b == 0) || (b % a == 0);
    }

    public int lastNumSum(int a, int b){
        return (a % 10 + b % 10) % 10;
    }
}
