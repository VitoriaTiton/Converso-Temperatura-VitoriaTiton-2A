
import java.util.Scanner;

public class CoversorTemperaturaVitoriaTiton2A {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("===Conversor de Temperatura===");
            System.out.println("1.celsius");
            System.out.println("2.Fahrenheit");
            System.out.println("3.Kelvin");
            System.out.println("4.sair");
            System.out.println("Escolha a unidade de origem(1-4): ");

            int escolha = scanner.nextInt();

            if (escolha == 4) {
                continuar = false;
                continue;
            }

            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção invalida!");
                continue;
            }

            System.out.println("Digite o valor da Temperatura: ");
            double graus = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    Celsius celsius = new Celsius(graus);
                    System.out.println("***************************");
                    System.out.println("Resultado: ");
                    System.out.println("Fahrenheit: " + celsius.paraFahrenheit());
                    System.out.println("Kelvin: " + celsius.paraKelvin());
                    System.out.println("******************");
                    break;
                    
                case 2:
                    Fahrenheit  fahrenheit = new Fahrenheit(graus);
                    System.out.println("***************************");
                    System.out.println("Resultado: ");
                    System.out.println("Celcius: " + fahrenheit.paraCelsius());
                    System.out.println("Kelvin: " + fahrenheit.paraKelvin());
                    System.out.println("******************");
                    break;
                
                case 3:
                    Kelvin kelvin = new Kelvin(graus);
                    System.out.println("***************************");
                    System.out.println("Resultado: ");
                    System.out.println("Celcius: " + kelvin.paraCelsius());
                    System.out.println("Fahrenheit: " + kelvin.paraFahrenheit());
                    System.out.println("******************");
                    break;
                    
                
            }
            
            
        }
        System.out.println("Programa Encerrado!");    
        scanner.close();
    }
    
}   
