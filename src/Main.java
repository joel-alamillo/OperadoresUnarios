//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //invertir el signo de un numero
    var a = 3;
    var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //invertir el valor de una variable booleana
    var c = true;
    var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //valor uniario de preincremento
    var e = 3;
    var f = ++e;  //primero incrementa la variable y despues se usa el valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //valor uniario de posincremento
    var g = 5;
    var h = g++; //primero se usa el valor y despues se incrementa la variable
        System.out.println("g = " + g); //teniamos pendiente un incremento
        System.out.println("h = " + h);

        // ejemplo de predecremento
    var i = 2;
    var j = --i; //primero decrementa la variable y despues se usa el vaor
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // ejemplo de posdecremento
    var k = 4;
    var l = k--; // primero se usa el valor y luego se decrementa la variable
        System.out.println("k = " + k); //teniamos pendiente un decremento
        System.out.println("l = " + l);
    }
}