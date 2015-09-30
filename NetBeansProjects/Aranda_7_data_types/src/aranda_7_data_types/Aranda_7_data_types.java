/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aranda_7_data_types;

/**
 *
 * @author Evan
 */
public class Aranda_7_data_types {
    public static void main(String[] args) {
   
    
int i = 3;
float a = 2.5f;
double b = 3.87;
short c = 16;
char d1 = ';';
char d2 = 'a';
char d3 = 42;
char d4 = 145; 
String e = d4+"";
String e1 = "Amanda is the best";
boolean f = true;
boolean g = i % 2 == 0;
/*
here we will look at some mahtematical operators
*/
// + this adds two numbers and more
// - this subtracts two numbers and more
// * this multiplies two numbers and more
// / this divides two numbers and more
// % this is modulo. Shows you the remainder.
System.out.println(i + " an integer");
System.out.println(a + " a float" );
System.out.println(b + " a double");
System.out.println(c + " a short");
System.out.println(d1 + " a char");
System.out.println(d2 + " a char");
System.out.println(d3+ " a char");
System.out.println(d4 + " a char");
System.out.println(e + " a string");
System.out.println(e1 + " a string");
System.out.println(f + " a boolean");
System.out.println(g + " a boolean");
//for (i = -123;i < 123; i++) {
//  System.out.println(i % 3 ==0);
//}
/* % checks for the remainder
    i % 2 checks if a number is 
    even or odd
*/
// a number value for char
//  maps to a character
i = 7;
a = 0;
e = "ninja";
System.out.println(i + a + " an integer plus a for loop.");
/* adding and int and a string
* concactonates the int and the
* string as a string
*/
for (i=0; i<500; i++) {
    /* 
    * if it is a conditional (flow)
    * statement. If a condition is true
    * the following command will be executed.
    */
    if (i % 2 == 0) {
        System.out.println(i + " is even");
    } else {
        System.out.println(i + " is odd");
        
        }
    }
 }
}




