public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);
        // здесь будет ошибка деления на ноль
        //требуется добавить проверку делителя
        int c = calc.devideZ.apply(a, b);

        calc.println.accept(c);
    }
}
