// Clyde "Thluffy" Sinclair
// APCS p0
// HW49
// 2021-12-23r

/**
 * Driver for class Rational (v3)
 **/

public class Driver
{

  //main method for testing
  public static void main( String[] args )
  {
      Rational r = new Rational( 3, 7 );
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );

      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );

      Rational  vnn = new Rational( -2,  3 );
      Rational  vnd = new Rational(  2, -3 );
      Rational vnnd = new Rational( -2, -3 );

      Rational x = new Rational( 8, 12 );
      String y = "yoo";

      System.out.println("r: " +  r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );
      System.out.println("u: " +  u );
      System.out.println("v: " +  v );
      System.out.println("w: " +  w );
      System.out.println("x: " +  x );
      System.out.println("vnn: " +  vnn );
      System.out.println("vnd: " +  vnd );

      /*
      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );
      */

      /*
      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);

      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);

      System.out.print( u + " + " + v + " = ");
      u.add(v);
      System.out.println(u);

      System.out.print( u + " - " + v + " = ");
      u.subtract(v);
      System.out.println(u);
      */

      /*
      System.out.println( "\nNow testing static gcd...");

      System.out.println("expect 1");
      System.out.print("actual:\t");
      System.out.println( Rational.gcd(100,9) );

      System.out.println("expect 5");
      System.out.print("actual:\t");
      System.out.println( Rational.gcd(245,25) );


      System.out.println( "\nNow testing non-static gcd...");

      System.out.println("Rational r...");
      System.out.println( r );
      System.out.println("expect 40");
      System.out.print("actual:\t");
      System.out.println( r.gcd() );

      System.out.println("Rational t...");
      System.out.println( t );
      System.out.println("expect 1");
      System.out.print("actual:\t");
      System.out.println( t.gcd() );

      System.out.println("Rational w...");
      System.out.println( w );
      System.out.println("expect 4");
      System.out.print("actual:\t");
      System.out.println( w.gcd() );
      */

      /*
      System.out.println( "\nNow testing reduce...");
      System.out.println("Rational r...");
      System.out.println( r );
      System.out.print( r + " in reduced form = ");
      r.reduce();
      System.out.println(r);
      */

      /**
         r: 3 / 7
         s: 0 / 1
         t: 8 / 5
         u: 1 / 2
         v: 2 / 3
         w: 8 / 12
         x: 8 / 12
         vnn: -2 / 3
         vnd: 2 / -3
         vnnd: -2 / -3
       **/
      System.out.println( "r > t: " +  r.compareTo(t) ); // -1
      System.out.println( "r > s: " +  r.compareTo(s) ); // 1
      System.out.println( "s > t: " +  s.compareTo(t) ); // -1
      //uncommenting the line below should trigger a runtime error
      //  System.out.println( "s > y: " +  s.compareTo(y) );

      System.out.println( "   v > u: " +  v.compareTo(u) ); // 1
      System.out.println( " vnn > u: " +  vnn.compareTo(u) ); // -1
      System.out.println( " vnd > u: " +  vnd.compareTo(u) ); // -1
      System.out.println( "vnnd > u: " +  vnnd.compareTo(u) ); // 1

      System.out.println( "v.equals(v): " + v.equals(v) );
      System.out.println( "v.equals(u): " + v.equals(u) );
      System.out.println( "v.equals(w): " + v.equals(w) );
      System.out.println( "w.equals(x): " + w.equals(x) );
      System.out.println( "w.equals(y): " + w.equals(y) );
    /*~~~v~~~~~~~~~~down~goer~3~~~~~~~~~~~~~v~~~~~
      ~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~*/
  }

}//end class
