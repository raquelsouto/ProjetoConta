
public class Aviao {
    
    private String caracteristicasAviao;
    private String modelo;

    public Aviao(String caracteristicasAviao, String modelo) {
        this.caracteristicasAviao = caracteristicasAviao;
        this.modelo = modelo;
    }
    
    public String getCaracteristicasAviao() {
        return caracteristicasAviao;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString() {
        String out = "";
        out+= "Modelo: " + modelo + "| Característica: " + caracteristicasAviao; 
          return out;
    }

}
