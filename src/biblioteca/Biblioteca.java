
package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        UsuarioData Udat = new UsuarioData();

        String nom, apel, nac, cc, dir, tel, Af, nomB;
        String borrar = ("Sin Datos");

        int opc;

        System.out.println(":::::INGRESO DE USUARIOS BIBLIOTECA DANIEL ORTIZ::::\n");

        System.out.println("Seleccione una opcción:\n"
                + "1. Ingresar nuevo usuario\n"
                + "2. Actualizar usurario\n"
                + "3. Eliminar usuario\n"
                + "4. Buscar usuario\n"
                + "5. Salir");
        opc = lector.nextInt();

        do {

            if (opc == 0) {
                System.out.println(":::::INGRESO DE USUARIOS BIBLIOTECA DANIEL ORTIZ::::\n");

                System.out.println("Seleccione una opcción:\n"
                        + "1. Ingresar nuevo usuario\n"
                        + "2. Actualizar usurario\n"
                        + "3. Eliminar usuario\n"
                        + "4. Buscar usuario\n"
                        + "5. Salir");
                opc = lector.nextInt();

            }

            if (opc == 1) {

                System.out.println("::::INGRESAR NUEVO USUARIO::::\n");
                System.out.println("Profavor ingrese su nombre:");
                nom = lector.next();
                Udat.setNombre(nom);
                
                System.out.println("\nProfavor ingrese su apellido:");
                apel = lector.next();
                Udat.setApellido(apel);
                
                System.out.println("\nProfavor ingrese su fecha de nacimiento (dd-mm-aaaa):");
                nac = lector.next();
                Udat.setfNac(nac);
                
                System.out.println("\nProfavor ingrese numero de documento:");
                cc = lector.next();
                Udat.setCed(cc);
                
                System.out.println("\nProfavor ingrese su direccion (sin espacios):");
                dir = lector.next();
                Udat.setDirec(dir);
                
                System.out.println("\nProfavor ingrese su numero de telefono:");
                tel = lector.next();
                Udat.setTel(tel);
                
                System.out.println("\nProfavor ingrese su area favorita:\n"
                        + "(Quimica, Fisica, Tecnologia, Calculo y Programacion.)");
                Af = lector.next();
                Udat.setArfav(Af);
                
                System.out.println("Su informacion ha quedado registrada. Gracias!\n");
                System.out.println("Menu principal: 0 Salir: 5.\n");
                opc = lector.nextInt();}

                if (opc == 2) {

                    System.out.println(":::::ACTUALIZAR USUARIO:::::\n");
                    System.out.println("\nProfavor actualice su nombre:");
                    nom = lector.next();
                    Udat.setNombre(nom);
                    
                    System.out.println("\nProfavor actualice su apellido:");
                    apel = lector.next();
                    Udat.setApellido(apel);
                    
                    System.out.println("\nProfavor actualice su fecha de nacimiento (dd,mm,aaaa):");
                    nac = lector.next();
                    Udat.setfNac(nac);
                    
                    System.out.println("\nProfavor actualice su numero de documento:");
                    cc = lector.next();
                    Udat.setCed(cc);
                    
                    System.out.println("\nProfavor actualice su direccion:");
                    dir = lector.next();
                    Udat.setDirec(dir);
                    
                    System.out.println("\nProfavor actualice su telefono:");
                    tel = lector.next();
                    Udat.setTel(tel);
                    
                    System.out.println("\nProfavor actualice su area favorita:\n"
                            + "(Quimica, Fisica, Tecnologia, Calculo y Programacion.)");
                    Af = lector.next();
                    Udat.setArfav(Af);
                    
                    System.out.println("Su informacion ha quedado Actualizada. Gracias!\n");
                    System.out.println("Menu principal: 0 Salir: 5.\n");
                    opc = lector.nextInt();
                }
                    if (opc == 3) {
                        System.out.println("::::ELIMINANDO......\n");
                        Udat.setNombre(borrar);
                        Udat.setApellido(borrar);
                        Udat.setfNac(borrar);
                        Udat.setDirec(borrar);
                        Udat.setCed(borrar);
                        Udat.setTel(borrar);
                        Udat.setArfav(borrar);
                        System.out.println("::::USUARIO ELIMINADO::::\n");
                        System.out.println("Menu principal: 0 Salir: 5.\n");
                        opc = lector.nextInt();
                    }
                        if (opc == 4) {
                            System.out.println("INGRESE EL NOMBRE DEL USUARIO:");
            nomB=lector.next();
            if(nomB.equals(Udat.getNombre())){
            System.out.println(":::::COINCIDENCIA HALLADA:::::\n");
            System.out.println("*Nombre: "+Udat.getNombre());
            System.out.println("*Apellido: "+Udat.getApellido());
            System.out.println("*Fecha de nacimiento: "+Udat.getfNac());
            System.out.println("*Numero de documento: "+Udat.getCed());
            System.out.println("*Direccion: "+Udat.getDirec());
            System.out.println("*Telefono: "+Udat.getTel());
            System.out.println("*Area favorita: "+Udat.getArfav());
            System.out.println("Menu principal: 0 Salir: 5.\n");
            opc=lector.nextInt();
            }else{
            System.out.println("::::NO SE HALLARON COINCIDENCIAS:::::");
            System.out.println("Menu principal: 0 Salir: 5.\n");
                        opc = lector.nextInt();
            }
                        }
            
                            
                        
                    

                

            

        
        
        }while(opc!=5);
        
        System.out.println("::::GRACIAS Y VUELVA PRONTO::::");
                        
        
        
        
 
    }
    
}
