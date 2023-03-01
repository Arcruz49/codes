import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Pessoa{
    private String name;
    private String hora;

     public Pessoa(String name, String hora){
        this.name = name;
        this.hora = hora;
    }
}

public class Principal {

    public static void recebeHorarios(List<Pessoa> list){
        System.out.println("Quantas pessoas?");
        Scanner teclado = new Scanner(System.in);
                
        int n = teclado.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Nome: ");
            String name = teclado.nextLine();
            System.out.println("Horário da aposta: HH:mm");
            String hora = teclado.nextLine();
            Pessoa pessoa = new Pessoa(name, hora);
            list.add(pessoa);
            System.out.println("---------------------------||----------------------------");
        }
    }
    public static void main(String[] args) {
        try{
            List<Pessoa> list = new ArrayList<>();
            recebeHorarios(list);
        }
        catch(RuntimeException e){

        }
    }
}
