public class SuperMercado extends InfoMercado{

 private int idSuper;
 
 public SuperMercado(String nombresuper, String direccion) { 
     //la palabra super hace referencia a la superclase del objeto.  
    super(nombresuper, direccion);
 }
 
 public void setIdSuper(int idSuper){
     this.idSuper=idSuper;
 }

 public int getIdSuper(){
     return idSuper;
 }
 
        public void verDatosdeProductos() {
		System.out.println("\n--- Super Mercado ---");
		System.out.println("Nombre de supermercado: " + nombreSuper);
		System.out.println("Dirección de supermercado: " + direccion);
		System.out.println("id del supermercado: " + idSuper);
        }
 
}