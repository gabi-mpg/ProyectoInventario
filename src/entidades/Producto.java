package entidades;

public class Producto {
    private static int cont = 0;
    private int idProducto;
    private String descripcion;
    private int EAN13;
    private String keyRFID;

    public Producto(){

    }
    public Producto(int idProducto, String descripcion, int EAN13, String keyRFID) {
        this.idProducto = cont++;
        this.descripcion = descripcion;
        this.EAN13 = EAN13;
        this.keyRFID = keyRFID;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEAN13() {
        return EAN13;
    }

    public void setEAN13(int EAN13) {
        this.EAN13 = EAN13;
    }

    public String getKeyRFID() {
        return keyRFID;
    }

    public void setKeyRFID(String keyRFID) {
        this.keyRFID = keyRFID;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", descripcion='" + descripcion + '\'' +
                ", EAN13=" + EAN13 +
                ", keyRFID='" + keyRFID + '\'' +
                '}';
    }
}
