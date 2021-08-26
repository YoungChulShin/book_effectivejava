package item18;

// 내가 만들었으면 이렇게 했겠지..?
//public class Complex {
//
//  private double re;
//  private double im;
//
//  public Complex(double re, double im) {
//    this.re = re;
//    this.im = im;
//  }
//}

import java.util.Objects;

public final class Complex {

  private final double re;
  private final double im;

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double realPart() {
    return re;
  }

  public double imaginaryPart() {
    return im;
  }

  public Complex plus(Complex c) {
    return new Complex(re + c.re, im + c.im);
  }

  public Complex minus(Complex c) {
    return new Complex(re - c.re, im - c.im);
  }

  public Complex times(Complex c) {
    return new Complex(re * c.re - im * c.im,
        re * c.im + im * c.re);
  }

  @Override
  public int hashCode() {
    return 31 * Double.hashCode(re) + Double.hashCode(im);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complex complex = (Complex) o;
    return Double.compare(complex.re, re) == 0
        && Double.compare(complex.im, im) == 0;
  }

  @Override
  public String toString() {
    return "Complex{" +
        "re=" + re +
        ", im=" + im +
        '}';
  }
}
