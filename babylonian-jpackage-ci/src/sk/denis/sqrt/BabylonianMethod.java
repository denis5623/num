package sk.denis.sqrt;
public class BabylonianMethod {
    public Result compute(double S, double x0, double eps, int maxIter) {
        if (!(S > 0)) throw new IllegalArgumentException("S musí byť > 0");
        if (!(x0 > 0)) throw new IllegalArgumentException("x0 musí byť > 0");
        if (!(eps > 0)) throw new IllegalArgumentException("eps musí byť > 0");
        if (maxIter < 1) throw new IllegalArgumentException("maxIter >= 1");
        double xk = x0, xk1 = xk; int k=0;
        while (k < maxIter) {
            xk1 = 0.5 * (xk + S / xk);
            if (Math.abs(xk1 - xk) < eps) return new Result(xk1, k+1, true);
            xk = xk1; k++;
        }
        return new Result(xk1, k, false);
    }
}
