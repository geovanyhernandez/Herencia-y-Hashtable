public class InfoMercado{
    protected String nombreSuper;
    protected String direccion;
    
    public InfoMercado (String nombreSuper, String direccion) {
		
		/*this.nombreSuper = nombreSuper;
		this.direccion = direccion;*/
	}
    
    
    public void setNombreSuper(String nombreSuper){
        this.nombreSuper=nombreSuper;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    
    public String getNombreSuper(){
        return nombreSuper;
    }
    public String getDireccion(){
        return direccion;
    }
}