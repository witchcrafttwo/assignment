package lesson74;

public class Program5 {

	public static void main(String[] args) {
		
		try {
            System.out.println("x"); // 実行される

            // args[0]にアクセスしようとしてArrayIndexOutOfBoundsExceptionが発生
            int value = Integer.parseInt(args[0]);
            
            System.out.println(value); // 実行されない

        } catch (NumberFormatException e) {
            // 型が違うため、このcatchブロックは実行されない
            System.out.println("catch");

        } finally {
            // catchできなくても、finallyは必ず実行される
            System.out.println("y");
        }
		
        // finallyの後、プログラムは強制終了するため、この行は実行されない
        System.out.println("z");

	}

}
