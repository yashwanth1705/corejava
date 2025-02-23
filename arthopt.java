public class arthopt {
    public static void main(String[] args) {
        int num=7;
        int num2=7;
        //num = num + 1;
        //num +=2; shortway to write the above statement
        //num++; Post increment operator
        //++num; Pre increment operator
        //num--; Post decrement operator
        //--num; Pre decrement operator
        int result = num++; // Output 6 fetch the value of num and then increment 
        int re = ++num2; // increment and then fetch the value 
        System.out.println(result);
        System.out.println(re);
    }
}
