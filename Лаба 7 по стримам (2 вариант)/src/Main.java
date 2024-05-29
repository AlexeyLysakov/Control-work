import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args){

        //2 задание

        Scanner in = new Scanner(System.in);

        // Список строк
        List<String> strings = Arrays.asList("Hello", "world", "this", "is", "a", "test");

        // Преобразование в верхний регистр
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Вывод преобразованного списка
        System.out.println("Преобразованный список в верхний регистр: " + upperCaseStrings);

        // Преобразование в нижний регистр
        List<String> lowerCaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // Вывод преобразованного списка
        System.out.println("Преобразованный список в нижний регистр: " + lowerCaseStrings);




        //3 задание

        List<Client> clients = new ArrayList<>();
        clients.add(new Client(2, "Оля Журавлёва", 25, false, Arrays.asList(new Telephone("+798698869", TelephoneType.MOBILE))));
        clients.add(new Client(3, "Максим Бахарев", 40, true, Arrays.asList(new Telephone("+796839893654", TelephoneType.LANDLINE))));
        clients.add(new Client(5, "Даниэль Улеев", 65, true, Arrays.asList(new Telephone("+79869896", TelephoneType.LANDLINE))));
        clients.add(new Client(6, "Оля Провоторова", 60, false, Arrays.asList(new Telephone("+7986356849", TelephoneType.LANDLINE))));

        // 1. Средний возраст клиентов, имеющих стационарные телефоны
        double avgAgeWithLandline = clients.stream()
                .filter(client -> client.hasLandline())
                .mapToInt(Client::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Средний возраст клиентов, имеющих стационарные телефоны: " + avgAgeWithLandline);

        // 2. Вывести список клиентов, возраст которых 18+, владеющих мобильными телефонами
        List<Client> clientsWithMobileOver18 = clients.stream()
                .filter(client -> client.getAge() >= 18)
                .filter(client -> client.hasMobile())
                .collect(Collectors.toList());
        System.out.println("Список клиентов, возраст которых 18+, владеющих мобильными телефонами: " + clientsWithMobileOver18);

        // 3. Проверить, что в списке есть хотя бы одна женщина, старше 60 лет,  владеющая стационарным телефоном
        boolean hasOldWomanWithLandline = clients.stream()
                .anyMatch(client -> client.getGender() == false && client.getAge() > 60 && client.hasLandline());
        System.out.println("В списке есть хотя бы одна женщина, старше 60 лет,  владеющая стационарным телефоном: " + hasOldWomanWithLandline);

    }
}
