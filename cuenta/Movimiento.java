// PAGINA DE MOVIMIENTOS, LA CAUL HARA HEREDAR A CUANTA CORRIENTE 

package cuenta;

import java.util.Date;


// CREACION DE CLASE Y SUS ATRIBUTOS
public class Movimiento  {

    private boolean abonar;
    private Date fecha;
    private float monto;

    //CONTROLADOR
    public Movimiento(boolean abonar,  float monto) {
        this.abonar = abonar;
        this.fecha = new Date();
        this.monto = monto;
    }

    //SECTOR GETTERS Y SETTERS 
    public boolean isAbonar() {
        return abonar;
    }

    public void setAbonar(boolean abonar) {
        this.abonar = abonar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }



}
