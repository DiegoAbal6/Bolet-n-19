
package coleccionalumnos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ColeccionAlumnos {

    public static void main(String[] args) {
        
        int op;
        Alumno metodos = new Alumno();
        ArrayList <Alumno> cAlumnos = new <Alumno> ArrayList();
        
        do
        {
            op=Integer.parseInt(JOptionPane.showInputDialog("Que Desexas Facer\n\n"
                    + "1- Crear Lista\n"
                    + "2- Ver Listaxe\n"
                    + "3- Buscar Alumno\n"
                    + "4- Alumno Novo\n"
                    + "5- Dar De Baixa Un Alumno\n"
                    + "6- Consultar Existencia\n"
                    + "7- Ordenar Alumno Polos Seus Nomes\n\n"
                    + "8- Sair\n"));
            
            switch(op)
            {
                default:
                    JOptionPane.showMessageDialog(null, "OPCION NO EXISTENTE","Informacion!!!!!", JOptionPane.INFORMATION_MESSAGE);
                case 1: //INSERTAR DATOS
                    metodos.insertarDatos(cAlumnos);
                    break;
                case 2: //FOREACH VER LISTAXE
                    metodos.verListaxeAlumnos(cAlumnos);
                    break;
                case 3://BUSCAR IMPRIMIR ALUMNO
                    metodos.buscarAlumno(cAlumnos);
                    break;
                case 4://ALUMNO NOVO
                    metodos.alumnoNovo(cAlumnos);
                    break;
                case 5://BAJA A UN ALUMNO
                    metodos.baixaAlumno(cAlumnos);
                    break;
                case 6: //CONSULTAR UN ALUMNO
                    metodos.consultarAlumno(cAlumnos);
                    break;
                case 7: //ORDENAR ALUMNOS POR NOME
                    metodos.ordenar(cAlumnos);
                    break;    
                case 8: //CONFIRMACION DE SAIR
                    op= Integer.parseInt(JOptionPane.showInputDialog("Seguro Que Desexa Sair?\n1- SI\n2- NO"));
                    if (op==1)
                        op=10;
                    break;
            }
            if (op==10)
                JOptionPane.showMessageDialog(null, "Gracias Por Usar Nuestro Programa", "GRACIAS!!!", JOptionPane.INFORMATION_MESSAGE);
            else
                op=Integer.parseInt(JOptionPane.showInputDialog("Ir A Menu De Opcións\n1-SI"));
            
        }while (op!=10);
    }
}
