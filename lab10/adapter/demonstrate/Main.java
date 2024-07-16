package lab10.adapter.demonstrate;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg)); // Output: true

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // The following line won't compile since it's incompatible types
        // hole.fits(smallSquarePeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(hole.fits(smallSquarePegAdapter)); // Output: true
        System.out.println(hole.fits(largeSquarePegAdapter)); // Output: false
    }
}
