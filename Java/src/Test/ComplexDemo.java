/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Giang8692
 */
public class ComplexDemo {
  public static void main(String[] args) {
    Complex complex1 = new Complex(6, 9);
    Complex complex2 = new Complex(9, 6);
        
    Complex sum = complex1.add(complex2);
    System.out.println("Sum of 2 complex numbers: " + sum);
    
    Complex difference = complex1.subtract(complex2);
    System.out.println("Difference of 2 complex numbers: " + difference);
    
    Complex product = complex1.multiply(complex2);
    System.out.println("Product of 2 complex numbers: " + product);
    
    Complex result = complex1.divide(complex2);
    System.out.println("Quotient of complex numbers: " + result);
    
    // set realPart and imaginaryPart of 2 complex numbers
    complex1.setRealPart(11);
    complex1.setImaginaryPart(22);
    complex2.setRealPart(22);
    complex2.setImaginaryPart(11);
    System.out.println("The new realPart of 2 complex numbers: " + complex1.getRealPart() + ";" + complex2.getRealPart());
    System.out.println("The new imaginaryPart of 2 complex numbers: " + complex1.getImaginaryPart() + ";" + complex2.getImaginaryPart());
    
      System.out.println("String of 2 complex numbers:");
      
      System.out.println(complex1.toString());
      System.out.println(complex2.toString());
  }
}
