package sk.denis.sqrt;
public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Použitie: BabylonianSqrt.exe <S> <x0> <eps> [maxIter]");
            return;
        }
        double S   = Double.parseDouble(args[0]);
        double x0  = Double.parseDouble(args[1]);
        double eps = Double.parseDouble(args[2]);
        int maxIter = (args.length >= 4) ? Integer.parseInt(args[3]) : 1_000_000;
        BabylonianMethod bm = new BabylonianMethod();
        Result r = bm.compute(S, x0, eps, maxIter);
        System.out.println("sqrt("+S+") ≈ " + r.estimate);
        System.out.println("iterácie: " + r.iterations);
        System.out.println("konvergoval: " + r.converged);
    }
}
