package sk.denis.sqrt;
public class Result {
    public final double estimate; public final int iterations; public final boolean converged;
    public Result(double estimate, int iterations, boolean converged) {
        this.estimate=estimate; this.iterations=iterations; this.converged=converged;
    }
}
