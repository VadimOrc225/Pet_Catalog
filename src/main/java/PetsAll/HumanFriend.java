package PetsAll;

import java.time.LocalDate;
import java.util.ArrayList;


public class HumanFriend {
    private String id;
    private String name;
    private LocalDate birthDate;
    private ArrayList<String> commands;
    private String type;
    private int quantity;

    // ряд конструкторов
    public HumanFriend() {

    }

    public HumanFriend(String id, String name, LocalDate birthDate, ArrayList<String> commands, String type) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        this.type = type;
    }

    public HumanFriend(String id, String name, LocalDate birthDate, String type) {   //три конструктора
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
    }

    public HumanFriend(String id, String name) {

        this.name = name;
        this.id = id;
    }

    public HumanFriend(LocalDate birthDate) {

        this.birthDate = birthDate;
    }

    public HumanFriend(String id, ArrayList<String> commands) {

        this.id = id;
        this.commands = commands;
    }

    public String getId() {
        return id;
    }

    public HumanFriend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public void displayInfo(HumanFriend humanFriend) {
        System.out.printf("Id: %s; Имя животного: %s, Дата рождения: %s, Команды: %s\n", humanFriend.getId(), humanFriend.getName(),
                humanFriend.getBirthDate(), humanFriend.getCommands());
    }

    private ArrayList<HumanFriend> catalog = new ArrayList<>();


    int counter = getQuantity();

    public void addition(HumanFriend humanFriend) {
        catalog.add(humanFriend);
        counter = getQuantity();
        counter += 1;
        setQuantity(counter);

    }

    public void removing(HumanFriend humanFriend) {
        int temp = 0;
        for (HumanFriend x : catalog) {
            if ((humanFriend.id.equals(x.id)) && (humanFriend.name.equals(x.name))) {
                temp = catalog.indexOf(x);

            }
        }
        catalog.remove(temp);
        counter = getQuantity();
        counter -= 1;
        setQuantity(counter);
    }

    public void matchingDate(HumanFriend humanFriend) {

        for (HumanFriend x : catalog) {
            if (humanFriend.birthDate.equals(x.birthDate)) {
                displayInfo(x);
            }
        }
    }

    public void addCommand(HumanFriend humanFriend, String command) {

        for (HumanFriend x : catalog) {
            if ((humanFriend.id.equals(x.id)) && (humanFriend.name.equals(x.name))) {
                x.getCommands().add(command);
                System.out.println("Команда добавлена! Животное ее изучит!");
            }

        }
    }

    public boolean matchingPet(HumanFriend humanFriend) {

        for (HumanFriend x : catalog) {
            if ((humanFriend.id.equals(x.id)) && (humanFriend.name.equals(x.name))) {
                return true;
            }
        }
        return false;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }
}


