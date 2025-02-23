public class datatype {
    public static void main(String[] args) {
        // data type - Primitive - int -> byte , short , int , long(-2,0,3), float -> double , float (3.2, 4.3)  , char(a , b) , boolean ( true, false)
        // int - 4 byte - 32 bit - 2^32 - 2,147,483,648 to 2,147,483,647 -> int i = 5;
        // byte - 1 byte - 8 bit - 2^8 - 256 -> byte b = 5;
        // short - 2 byte - 16 bit - 2^16 - 65,536 -> short s = 5;
        // long - 8 byte - 64 bit - 2^64 - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 -> long l = 5;
        // float - 4 byte - 32 bit - 3.4e-038 to 3.4e+038 -> float f = 5.5f;
        // double - 8 byte - 64 bit - 1.7e-308 to 1.7e+308 -> double d = 5.5;
        // char - 2 byte - 16 bit - 0 to 65,536 - 'a' , 'b' -> char c = 'a';
        // boolean - 1 bit - true , false -> boolean b = true;
        // String - 2 byte - 16 bit - 0 to 65,536 -> string s = "Hello";
        // unicode - 16 bit - 2 byte - 0 to 65,536 
        // ASCII - 7 bit - 0 to 127
        // UTF-8 - 8 bit - 0 to 255
        // data type - Non Primitive - String, Array, Class 
        int num = 8;
        short num2 = 5;
        byte num3 = 5;
        long num4 = 58237l;
        double num5 = 5.5;  
        float marks = 5.5f;
        char ch = 'A';
        boolean isJavaFun = true;  
        String name = "Yash";
        System.out.println(num + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + marks + " " + ch + " " + isJavaFun + " " + name);
    }
}
