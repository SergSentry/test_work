import service.AnimalRegisterService;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to pet register.");
        AnimalRegisterService animalRegisterService = new AnimalRegisterService();
        System.out.println("""
                1 - Use empty register
                2 - Use register preset
                """);
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        try{
            choose = scanner.nextInt();
            if (choose == 1){
                initProgram(animalRegisterService);
            } else if (choose == 2) {
                loadPreset(animalRegisterService);
            }else System.out.println("Choose is incorrect");
        }catch (InputMismatchException e){
            System.out.println("You entered wrong number!");
        }
    }

    private static void initProgram(AnimalRegisterService animalRegisterService){
        boolean isContinue = true;
        while(isContinue){
            System.out.println("""
                    Choose a command:
                    1 - Add animal to register
                    2 - Train animal
                    3 - Show animals
                    4 - Exit
                    """);
            Scanner scanner = new Scanner(System.in);
            try {
                int choose = scanner.nextInt();
                switch (choose){
                    case 1 -> animalRegisterService.addAnimal();
                    case 2 -> animalRegisterService.trainAnimal();
                    case 3 -> animalRegisterService.getShelterContent();
                    case 4 -> isContinue = false;
                }
            }catch (InputMismatchException e){
                System.out.println("You wrote not a number!");
            }catch (NoSuchElementException e){
                System.out.println("You didn't write anything!");
            }
        }
    }

    private static void loadPreset(AnimalRegisterService animalRegisterService){
        animalRegisterService.presetLoader();
        System.out.println("Preset loaded!");
        initProgram(animalRegisterService);
    }
}