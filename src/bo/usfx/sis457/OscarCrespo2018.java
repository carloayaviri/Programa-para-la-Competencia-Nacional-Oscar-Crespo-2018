
    package bo.usfx.sis457;

    import bo.usfx.sis457.entidades.Participante;
import java.util.ArrayList;
import java.util.Scanner;
import static bo.usfx.sis457.OscarCrespo2018.menuPrincipal;
import bo.usfx.sis457.entidades.Navegante;
import bo.usfx.sis457.entidades.Organizador;
import bo.usfx.sis457.entidades.Piloto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author GONZALO CARLO AYAVIRI
 */

    public class OscarCrespo2018 {
    public static ArrayList<Participante> participantes;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        participantes = new ArrayList<>();
     
        menuPrincipal();
    }    
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: CIRCUITO OSCAR CRESPO 2018             |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Participantes                      |");
        System.out.println("| 2) Gestión de Competidor                         |");
        System.out.println("| 3) Gestión de Organizador                        |");
        System.out.println("| 4) Gestión de Vehiculos                          |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuParticipantes();
                break;
            case "2":
                menuCompetidor();
                break;
            case "3":
                menuOrganizador();
                break;
            case "4":
                menuVehiculos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }

    public static void menuParticipantes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Participantes                         |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Participantes                          |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarParticipantes();
                volverMenu();
                menuParticipantes();
                break;
            default:
                menuPrincipal();
        }
    }      
  
    private static void menuCompetidor() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Competidores                           |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Competidor Piloto                             |");
        System.out.println("| 2) Competidor Navegante                          |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPiloto();
                volverMenu();
                menuCompetidor();
                break;
            case "2":
                menuNavegante();
                volverMenu();
                menuCompetidor();
                break;
            default:
                menuPrincipal();
        }
    }

    private static void menuOrganizador() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Organizador                           |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Organizador                            |");
        System.out.println("| 2) Crear Organizador                             |");
        System.out.println("| 3) Modificar Organizador                         |");
        System.out.println("| 4) Eliminar Organizador                          |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarOrganizador();
                volverMenu();
                menuPiloto();
                break;
            case "2":
                crearOrganizador();
                volverMenu();
                menuPiloto();
                break;
            case "3":
                modificarOrganizador();
                volverMenu();
                menuPiloto();
                break;
            case "4":
                eliminarOrganizador();
                volverMenu();
                menuPiloto();
                break;
            default:
                menuPrincipal();
        }
    }

    private static void menuVehiculos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Vehiculos                             |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Vehiculos                              |");
        System.out.println("| 2) Crear Vehiculos                               |");
        System.out.println("| 3) Modificar Vehiculos                           |");
        System.out.println("| 4) Eliminar Vehiculo                             |");
        System.out.println("| 5) Velocidad Promedio                            |");
        System.out.println("| 6) GeoPosición                       |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarVehiculos();
                volverMenu();
                menuVehiculos();
                break;
            case "2":
                crearVehiculos();
                volverMenu();
                menuVehiculos();
                break;
            case "3":
                modificarVehiculos();
                volverMenu();
                menuPiloto();
                break;
            case "4":
                eliminarVehiculos();
                volverMenu();
                menuVehiculos();
                break;
            case "5":
                VelocidadPromedioVehiculos();
                volverMenu();
                menuVehiculos();
                break;
            case "6":
                GeoPosicionVehiculos();
                volverMenu();
                menuVehiculos();
                break;
            default:
                menuPrincipal();
        }
    }

    private static void volverMenu() {
     String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if (opcion.equals("M")) {
                break;
            }
        }
    }

    private static void listarParticipantes() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Participantes                         |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante participante: participantes) {
            i++;
            System.out.println(i + ": " + participante);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }

    private static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void menuPiloto() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Piloto                                |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Piloto                                 |");
        System.out.println("| 2) Crear Piloto                                  |");
        System.out.println("| 3) Modificar Piloto                              |");
        System.out.println("| 4) Eliminar Piloto                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPiloto();
                volverMenu();
                menuPiloto();
                break;
            case "2":
                crearPiloto();
                volverMenu();
                menuPiloto();
                break;
            case "3":
                modificarPiloto();
                volverMenu();
                menuPiloto();
                break;
            case "4":
                eliminarPiloto();
                volverMenu();
                menuPiloto();
                break;
            default:
                menuPrincipal();
        }
    }

    private static void menuNavegante() {
         // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Navegante                             |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Navegante                              |");
        System.out.println("| 2) Crear Navegante                               |");
        System.out.println("| 3) Modificar Navegante                           |");
        System.out.println("| 4) Eliminar Navegante                            |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarNavegante();
                volverMenu();
                menuNavegante();
                break;
            case "2":
                crearNavegante();
                volverMenu();
                menuNavegante();
                break;
            case "3":
                modificarNavegante();
                volverMenu();
                menuNavegante();
                break;
            case "4":
                eliminarNavegante();
                volverMenu();
                menuNavegante();
                break;
            default:
                menuPrincipal();
        }
    }

    private static void listarPiloto() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Pilotos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante piloto: participantes) {
            if (piloto instanceof Piloto) {
                i++;
                System.out.println(i + ": " + piloto);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }

    private static void crearPiloto() {
        String documento;
        String nombres;
        String apellidos;
        int nroLicencia;
        String categoria;
        String certificadoAfiliacion;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Piloto                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Documento: ");
            documento = entradaTeclado.readLine();
            System.out.print("Introduzca Nombres: ");
            nombres = entradaTeclado.readLine();
            System.out.print("Introduzca Apellidos: ");
            apellidos = entradaTeclado.readLine();
            System.out.print("Introduzca el Nro. Licencia: ");
            nroLicencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca Categoria: ");
            categoria = entradaTeclado.readLine();
            System.out.print("Introduzca Certicado Afiliacion: ");
            certificadoAfiliacion = entradaTeclado.readLine();
            participantes.add(new Piloto(documento,nombres,apellidos,nroLicencia,categoria,certificadoAfiliacion));
            System.out.println("Registro de Docentes completado!");
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    private static void modificarPiloto() {
        int id;
        Piloto piloto;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Piloto                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Piloto: ");
            id = buscarParticipante(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                piloto = (Piloto)participantes.get(id);
                System.out.print("Modificar el Documento '" + piloto.getDocumento()+ "': ");
                piloto.setDocumento(entradaTeclado.readLine());
                System.out.print("Modificar Nombres '" + piloto.getNombres()+ "': ");
                piloto.setNombres(entradaTeclado.readLine());
                System.out.print("Modificar Apellidos '" + piloto.getApellidos()+ "': ");
                piloto.setApellidos(entradaTeclado.readLine());
                System.out.print("Modificar Nro. Licencia '" + piloto.getNroLicencia()+ "': ");
                piloto.setNroLicencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar el Categoria Licencia '" + piloto.getCategoria() + "': ");
                piloto.setCategoria(entradaTeclado.readLine());
                System.out.print("Modificar Certificado de Afiliacion'" + piloto.getCertificadoAfiliacion()+ "': ");
                piloto.setCertificadoAfiliacion(entradaTeclado.readLine());
                participantes.set(id, piloto);
                System.out.println("Registro de Piloto modificado!");
            } else {
                System.out.println("El Registro de Piloto no existe!");
            }
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void eliminarPiloto() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Elimiar Piloto                                   |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Piloto: ");
            id = buscarParticipante(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                participantes.remove(id);
                System.out.println("Registro de Pilotos borrado!");
            } else {
                System.out.println("El Registro de Pilotos no existe!");
            }
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void listarNavegante() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Navegantes                            |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante navegante: participantes) {
            if (navegante instanceof Navegante) {
                i++;
                System.out.println(i + ": " + navegante);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }

    private static void crearNavegante() {
        String documento;
        String nombres;
        String apellidos;
        int nroLicencia;
        String categoria;
        String certificadoMecanica;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Piloto                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Documento: ");
            documento = entradaTeclado.readLine();
            System.out.print("Introduzca Nombres: ");
            nombres = entradaTeclado.readLine();
            System.out.print("Introduzca Apellidos: ");
            apellidos = entradaTeclado.readLine();
            System.out.print("Introduzca el Nro. Licencia: ");
            nroLicencia = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca Categoria: ");
            categoria = entradaTeclado.readLine();
            System.out.print("Introduzca Certicado Mecánica: ");
            certificadoMecanica = entradaTeclado.readLine();
            participantes.add(new Piloto(documento,nombres,apellidos,nroLicencia,categoria,certificadoMecanica));
            System.out.println("Registro de Docentes completado!");
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void modificarNavegante() {
        int id;
        Navegante navegante;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Navegante                               |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Navegante: ");
            id = buscarParticipante(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                navegante = (Navegante)participantes.get(id);
                System.out.print("Modificar el Documento '" + navegante.getDocumento()+ "': ");
                navegante.setDocumento(entradaTeclado.readLine());
                System.out.print("Modificar Nombres '" + navegante.getNombres()+ "': ");
                navegante.setNombres(entradaTeclado.readLine());
                System.out.print("Modificar Apellidos '" + navegante.getApellidos()+ "': ");
                navegante.setApellidos(entradaTeclado.readLine());
                System.out.print("Modificar Nro. Licencia '" + navegante.getNroLicencia()+ "': ");
                navegante.setNroLicencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar el Categoria Licencia '" + navegante.getCategoria() + "': ");
                navegante.setCategoria(entradaTeclado.readLine());
                System.out.print("Modificar Certificado de Afiliacion'" + navegante.getCertificadoMecanica()+ "': ");
                navegante.setCertificadoMecanica(entradaTeclado.readLine());
                participantes.set(id, navegante);
                System.out.println("Registro de Navengante modificado!");
            } else {
                System.out.println("El Registro de Navegante no existe!");
            }
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void eliminarNavegante() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Elimiar Navegante                                |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Navegante: ");
            id = buscarParticipante(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                participantes.remove(id);
                System.out.println("Registro de Navegantes borrado!");
            } else {
                System.out.println("El Registro de Navegantes no existe!");
            }
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void listarOrganizador() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Organizador                          |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Participante organizador: participantes) {
            if (organizador instanceof Organizador) {
                i++;
                System.out.println(i + ": " + organizador);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }

    private static void crearOrganizador() {
        String documento;
        String nombres;
        String apellidos;
        String cargo;
        String comision;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Piloto                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Documento: ");
            documento = entradaTeclado.readLine();
            System.out.print("Introduzca Nombres: ");
            nombres = entradaTeclado.readLine();
            System.out.print("Introduzca Apellidos: ");
            apellidos = entradaTeclado.readLine();
            System.out.print("Introduzca Cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.print("Introduzca Comision: ");
            comision = entradaTeclado.readLine();
            participantes.add(new Organizador(documento,nombres,apellidos,cargo,comision));
            System.out.println("Registro de Docentes completado!");
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void modificarOrganizador() {
        int id;
        Organizador organizador;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Organizador                            |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Organizador: ");
            id = buscarParticipante(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                organizador = (Organizador)participantes.get(id);
                System.out.print("Modificar el Documento '" + organizador.getDocumento()+ "': ");
                organizador.setDocumento(entradaTeclado.readLine());
                System.out.print("Modificar Nombres '" + organizador.getNombres()+ "': ");
                organizador.setNombres(entradaTeclado.readLine());
                System.out.print("Modificar Apellidos '" + organizador.getApellidos()+ "': ");
                organizador.setApellidos(entradaTeclado.readLine());
                System.out.print("Modificar Cargo'" + organizador.getCargo()+ "': ");
                organizador.setCargo(entradaTeclado.readLine());
                participantes.set(id, organizador);
                System.out.println("Registro de Organizador modificado!");
            } else {
                System.out.println("El Registro de Organizador no existe!");
            }
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void eliminarOrganizador() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Elimiar Organizador                             |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Organizador: ");
            id = buscarParticipante(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                participantes.remove(id);
                System.out.println("Registro de Organizador borrado!");
            } else {
                System.out.println("El Registro de Organizador no existe!");
            }
        } catch(IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void listarVehiculos() {
 
    }

    private static void crearVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void modificarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void eliminarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int buscarParticipante(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void VelocidadPromedioVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void GeoPosicionVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
