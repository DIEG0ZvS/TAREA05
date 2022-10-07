package TAREA05;

public class main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        tienda.setNombre("Tienda Don Paco");
        tienda.setDireccion("Jr.Aguilar");

        tienda.agregarCliente(new Cliente("Carlos","Escobar",9000));
        tienda.agregarCliente(new Cliente("Miguel","Ponce",7000));
        tienda.agregarCliente(new Cliente("Poleo","Anguel",3000));
        tienda.agregarCliente(new Cliente("Manuel","Rodrigo",6000));
        tienda.agregarCliente(new Cliente("Jorge","Dayiro",5000));
        tienda.agregarCliente(new Cliente("Antony","Jose",2000));
        tienda.agregarCliente(new Cliente("Sebastean","Diana",1000));
        tienda.agregarCliente(new Cliente("Comedic","Portral",4000);
        tienda.agregarCliente(new Cliente("Erick","Chusa",8000));
                              
        System.out.println("Nombre de tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());


        tienda.ordenarCodigo();
    }
}
