package lab6.ex2.line;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(1, 2, 3, 4);
        System.out.println(line1);
        System.out.println(line1.getBegin());
        line1.setBegin(new Point(10, 10));
        System.out.println(line1);

        line1.setBeginXY(0, 0);
        line1.setEndXY(3, 4);
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
