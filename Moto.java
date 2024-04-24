package actividad_2;
public class Moto {
    private int velocidad;
     Moto() {
        velocidad=0;
    }
    
 private int getvelocidad (){
    return velocidad;
 }

 private void acelera (int mas) { 
    if (mas > 0) {
        velocidad += mas;
        System.out.println(getvelocidad());
    }
}

private void frena(int menos) {
    if (menos >  0) {
        if (velocidad - menos >= 0) {
            velocidad -= menos;
            System.out.println(getvelocidad());
        } else {
            velocidad = 0; // Velocidad no puede ser negativa, se establece a cero.
            System.out.println(getvelocidad());
            } 
        } 
    } 

public static void main(String[] args) {
   Moto moto1=new Moto();
   System.out.println("Velocimetro:");
   moto1.acelera(100);
   moto1.acelera(5);
   moto1.frena(4);
   moto1.frena(5);
}
}
