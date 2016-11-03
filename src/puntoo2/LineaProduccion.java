
package puntoo2;


public class LineaProduccion {
    private int serie;
    private String producto;
    private int costeLinProd;

    public LineaProduccion(int serie, String producto, int costeLinProd) {
        this.serie = serie;
        this.producto = producto;
        this.costeLinProd = costeLinProd;
    }
    
    

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCosteLinProd() {
        return costeLinProd;
    }

    public void setCosteLinProd(int costeLinProd) {
        this.costeLinProd = costeLinProd;
    }
    
    
    
}
