package dev.evertonsavio.app.models.machines;

import dev.evertonsavio.app.models.products.HotDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DrinkMachine {

    private final List<HotDrinkMachine> machines = List.of(
            new CoffeeMachine(),
            new ChocolateMachine(),
            new TeaMachine());
    public DrinkMachine() {
    }

    public void prepare() throws IOException {
        System.out.println("Escolha sua Bebida!");
        for (int i = 0; i < machines.size(); i++) {
            System.out.println(i + ". " + machines.get(i).getClass().getSimpleName().replace("Machine", ""));
        }
        System.out.print("Escolha: ");

        while (true)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //TODO FIX BUG STRING VAZIA
            int valor = Integer.parseInt(reader.readLine());
            System.out.println("Valor informado pelo usuário: " + valor);
            if(valor < machines.size() && valor >= 0) {
                HotDrink hotDrink = this.machines.get(valor).makeDrink();
                System.out.println(hotDrink);
                System.out.println("///////////////////////////////////////////////////");
                System.out.print("Escolha: ");
            }else {
                System.out.println("Opção não disponivel, tente novamente!");
            }
        }
    }
}
