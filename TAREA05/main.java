package TAREA05;

public class main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        tienda.setNombre("Tienda Don Paco");
        tienda.setDireccion("Jr.Aguilar");

        Cliente cliente = new Cliente();
        cliente.setCodigo(1234567);
        cliente.setNombre("Danna");
        cliente.setApellido("Ponce Leon");

        System.out.println("Cliente 1: "+cliente.getNombre()+", "+cliente.getApellido()+", "+cliente.getCodigo());


        Cliente cliente1 = new Cliente();
        cliente1.setCodigo(3456789);
        cliente1.setNombre("Carlos");
        cliente1.setApellido("Cuarite Estrada");

        System.out.println("Cliente 2: "+cliente1.getNombre()+", "+cliente1.getApellido()+", "+cliente1.getCodigo());


        Cliente cliente2 = new Cliente();
        cliente2.setCodigo(7555689);
        cliente2.setNombre("Emanuel");
        cliente2.setApellido("Mozart Pillco");

        System.out.println("Cliente 3: "+cliente2.getNombre()+", "+cliente2.getApellido()+", "+cliente2.getCodigo());


        Cliente cliente3 = new Cliente();
        cliente3.setCodigo(9327578);
        cliente3.setNombre("Cesar");
        cliente3.setApellido("Idalgo Vieso");

        System.out.println("Cliente 4: "+cliente3.getNombre()+", "+cliente3.getApellido()+", "+cliente3.getCodigo());
        System.out.println("Nombre de tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());


        tienda.ordenarCodigo();
    }
}
