package Java;

public class JavaVarargsSimpleAddition {
    public void addition(int... x) {
        String result = "";
        int sum = 0;
        for (int i : x) {
            result += i + "+";
            sum += i;
        }
        System.out.print(result.substring(0, result.length() - 1));
        System.out.println("=" + sum);
    }
}
