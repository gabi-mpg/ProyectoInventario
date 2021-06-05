package entidades;

public class Aula {
    private static int cont = 0;
    private int idAula;
    private String numeracion;
    private String descripcion;
    private String IP;

    public Aula(){

    }

    public Aula(String numeracion, String descripcion, String IP) {
        this.idAula = cont ++;
        this.numeracion = numeracion;
        this.descripcion = descripcion;
        this.IP = IP;
    }


    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "idAula=" + idAula +
                ", numeracion='" + numeracion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", IP='" + IP + '\'' +
                '}';
    }
}
