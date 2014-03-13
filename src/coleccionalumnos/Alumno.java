
package coleccionalumnos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Alumno implements Comparable{
    
    private String nome;
    private int nota;
    Alumno alumno;
    
    public Alumno()
    {
        this.nome=null;
        this.nota=0;
    }
    
    public Alumno(String nome, int nota)
    {
        this.nome=nome;
        this.nota=nota;
    }
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNota(int nota)
    {
        this.nota=nota;
    }
    
    public int getNota()
    {
        return this.nota;
    }
    
    public void insertarDatos(ArrayList <Alumno> cAlumno)
    {
        nota = Integer.parseInt(JOptionPane.showInputDialog("Nota Do Alumno"));        
        while (nota>0 && nota<=10)
        {
                nome = JOptionPane.showInputDialog("Nome Do Alumno:");
                Alumno alum = new Alumno(nome, nota);
                cAlumno.add(alum);
                
                nota = Integer.parseInt(JOptionPane.showInputDialog("Nota Do Seguinte Alumno"));
            
        }
    }
    
    public void verListaxeAlumnos(ArrayList <Alumno> cAlumno)
    {
       int num=-1;
       System.out.println("........Ver Listaxe Foreach........");
       for (Alumno a : cAlumno)
       {
           System.out.println("Nombre: \t" +a.nome+
                    "\nNota: \t\t"+a.nota);
           System.out.println("...................................");
       }   
    } 
    
    public void verListaxe(ArrayList <Alumno> cAlumno)
    {
        System.out.println("........Ver Listaxe Alumnos........");
        for (int i=0; i<cAlumno.size(); i++)
        {
            System.out.println("Nombre: \t" +cAlumno.get(i).getNome()+
                    "\nNota: \t\t"+cAlumno.get(i).getNota());
            System.out.println("...................................");
        }
    }
    
    public void buscarAlumno(ArrayList <Alumno> cAlumno)
    {
        boolean validar = false;
        int posicion = 0;
        nome = JOptionPane.showInputDialog("Nome De Que Alumno Desexas Buscar");
        for (int i=0; i<cAlumno.size(); i++)
        {
            if (cAlumno.get(i).getNome().equalsIgnoreCase(nome))
            {
                validar = true;
                posicion = i;
            }
        }
        
        if (validar == true)
        {
            System.out.println("...........Buscar Alumno..........."+
                "\nNome: \t\t" + cAlumno.get(posicion).getNome()+
                "\nNota: \t\t" + cAlumno.get(posicion).getNota());
        }
        else
            JOptionPane.showMessageDialog(null, "Síntoo Moito, O Alumno Non Foi Atopado");
        
        System.out.println("...................................");
    }
    
    public void alumnoNovo(ArrayList <Alumno> cAlumno)
    {
        System.out.println("........Añadir Novo Alumno.........");
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Desexa Añadir Un Novo Alumno?"
                + "\n1- SI"
                + "\n2- NO"));
        
        if (op==1)
        {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Nota Do Alumno"));        
            if (nota>0 && nota<=10)
            {                  
                nome = JOptionPane.showInputDialog("Nome Do Alumno:");
                Alumno alum = new Alumno(nome, nota);
                cAlumno.add(alum);
                    
                nota=0;                    
            }
        }
        else
            JOptionPane.showMessageDialog(null,"..............Gracias..............");
        
        System.out.println("...................................");
    }
    
   public void baixaAlumno(ArrayList <Alumno> cAlumno)
    {
        System.out.println(".........Baixa a Un Alumno.........");
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Desexa Dar De Baixa A Un Alumno?"
                + "\n1- SI"
                + "\n2- NO"));
        
        if (op==1)
        {
            boolean validar = false;
            nome = JOptionPane.showInputDialog("Nome De Que Alumno Desexas Dar De Baixa");
            for (int i=0; i<cAlumno.size(); i++)
            {
                if (cAlumno.get(i).getNome().equalsIgnoreCase(nome))
                {
                    cAlumno.remove(i);
                    validar = true;
                }
            }
            
            if (validar == true)
            {
                JOptionPane.showMessageDialog(null, "...Alumno De Baixa Correctamente...");
            }
            else
                JOptionPane.showMessageDialog(null, "Síntoo Moito, O Alumno Non Foi Atopado");
            
        System.out.println("...................................");
        }
        else
            JOptionPane.showMessageDialog(null, "..............Gracias..............");
        
        System.out.println("...................................");
    }
   
   public void consultarAlumno(ArrayList <Alumno> cAlumno)
   {
       boolean validar = false;
       int posicion = 0;
       nome = JOptionPane.showInputDialog("Nome De Que Alumno Desexas Atopar");
       
       for (int i=0; i<cAlumno.size(); i++)
       {
           if (cAlumno.get(i).nome.contains(nome))
           {
               validar = true;
               posicion = i;
           }
       }
       
       if (validar == true)
       {
           System.out.println("O Alumno Existe Na Posición " +(posicion+1));
           JOptionPane.showMessageDialog(null, "O Alumno Existe Na Posicion " +(posicion+1));
       }
       else
           JOptionPane.showMessageDialog(null, "Síntoo Moito, O Alumno Non Foi Atopado");
       
       System.out.println("...................................");
   }
   
   public void ordenar(ArrayList <Alumno> cAlumno)
   {
       Collections.sort(cAlumno);
   }
   
   @Override
   public int compareTo(Object al)
   { 
       int result; 
       Alumno a = (Alumno) al; 
       if(this.getNome().compareTo(a.getNome()) < 0) result = -1; 
       else if(this.getNome().compareTo(a.getNome()) > 0) result = 1;
       else result=0;
       
       return result; 
   }
}
