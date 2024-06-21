//paquete de donde obtendremos todo, tambien recibieremos las confg. heredadas de movimiento
package cuenta;

import java.util.Date;


// creamos la clase y heredamos desde movimiento
public class CuentaCorriente extends Movimiento{
    String strTitular = "";
    int intNumCuenta = (0);
    float floatsaldo = (0);
    Movimiento [] ultimMovimientos;







// se construye el constructor de la cuenta y sus atributos.
    public CuentaCorriente(boolean abonar, float monto, String strTitular, int intNumCuenta, float floatsaldo) {
        super(abonar, monto);
        this.strTitular = strTitular;
        this.intNumCuenta = intNumCuenta;
        this.floatsaldo = floatsaldo;
        this.ultimMovimientos = new Movimiento[10];
    }

// APARTADO DE GETTERS Y SETTERS 
    public String getStrTitular() {
        return strTitular;
    }


    public void setStrTitular(String strTitular) {
        this.strTitular = strTitular;
    }


    public int getIntNumCuenta() {
        return intNumCuenta;
    }


    public void setIntNumCuenta(int intNumCuenta) {
        this.intNumCuenta = intNumCuenta;
    }


    public float getFloatsaldo() {
        return floatsaldo;
    }


    public void setFloatsaldo(float floatsaldo) {
        this.floatsaldo = floatsaldo;
    }


    public Movimiento[] getUltimMovimientos() {
        return ultimMovimientos;
    }


    public void setUltimMovimientos(Movimiento[] ultimMovimientos) {
        this.ultimMovimientos = ultimMovimientos;
    }


    // APARTADO EN EL CUAL REGISTRAREMOS LOS MOVIMIENTOS PARA SER USADOS MAS ADELANTE
    private void registrarMovimiento( boolean abonar, Date fecha , float monto){
        Movimiento movimiento= new Movimiento(abonar, monto);
        if (ultimMovimientos != null){
            if (ultimMovimientos.length > 0 && ultimMovimientos.length <= 10){
        for (int i = ultimMovimientos.length -1; i > 0; i --){
            ultimMovimientos[i] = ultimMovimientos[i -1];


        }
        ultimMovimientos [0] = movimiento;

        // alidacion de los 10 movimientos permitidos
    }else{
        System.out.println(" Disculpanos, pero superaste la cantidad de movimientos permitidos dentro 24 hrs. ");
    } 
    }
}


    // APARTADO PARA MOSTRAR LOS MOVIMIENTOS EN EL CASO DE SER DESEADO
        public void mostrarMovimientos (){
            System.out.println("Ultimos movimientos realizados: ");
            if (ultimMovimientos != null){
            for(Movimiento movimiento: ultimMovimientos){
                if (movimiento != null){
                    System.out.println(" Fecha: " + movimiento.getFecha() + ", Monto "+ movimiento.getMonto());
                }
            }
            }
    }


    // MOVIMIENTOS DE ABONO Y CARGO
    public void abonar (float monto){
        if (monto > 0) {
            this.floatsaldo += monto;

            registrarMovimiento(true, null, monto);
            System.out.println(" Estas abonando: " + monto);
            

            
        }else {
            System.out.println( " El abono tiene que ser mayor a 0 ");
        }
    }

       public void cargar (float monto){
        if (monto > 0 && monto <= this.floatsaldo) {
            this.floatsaldo -= monto;
            registrarMovimiento(false, null, monto);
            System.out.println(" Estas sacando de tu cuenta: "+ monto );

            
        }else {
            System.out.println( " Excede maximo" );
        }
    }
}