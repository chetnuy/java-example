package l3;

import java.util.Objects;

/**
 * @date: 02.01.18
 * @author: nevernew
 * @root:
 */

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    @Override
    public boolean equals (Object o){
        if (o == null)
            return false;
        return o.hashCode() == this.hashCode();
    }
  /*  public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 &&
                Double.compare(that.im, im) == 0;
    }*/

    @Override
    public int hashCode() {

        return (int) (Math.pow(re,35)*Math.pow(im, 42));
    }

    public double getIm() {
        return im;
    }
}