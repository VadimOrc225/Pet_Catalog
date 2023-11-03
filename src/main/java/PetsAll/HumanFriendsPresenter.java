package PetsAll;

import java.time.LocalDate;
import java.util.ArrayList;

public class HumanFriendsPresenter {              // PRESENTER
    private HumanFriend model;                        // "Видит" model и view
    private HumanFriendsView view;

    public HumanFriendsPresenter(HumanFriend model, HumanFriendsView view) {
        this.model = model;
        this.view = view;
    }

    public void performAction() {
        char operator = view.getInputOperator();
        switch (operator) {
            case '1':
                String id = view.getInputId();
                String name = view.getInputName();
                LocalDate birthDate = view.getInputBirthDate();
                String type = "Животное";
                ArrayList<String> commands = view.getInputCommands();
                char operatorAction1 = view.getInputPetClass();
                switch (operatorAction1) {
                    case '1':
                        type = "Собака";
                        model.setType(type);
                        break;
                    case '2':
                        type = "Кошка";
                        model.setType(type);
                        break;
                    case '3':
                        type = "Хомяк";
                        model.setType(type);
                        break;
                    case '4':
                        type = "Лошадь";
                        model.setType(type);
                        break;
                    case '5':
                        type = "Осел";
                        model.setType(type);
                        break;
                    case '6':
                        type = "Верблюд";
                        model.setType(type);
                        break;
                    case '9':
                        performAction();
                }
                HumanFriend humanFriend = new HumanFriend(id, name, birthDate, commands, type);
                model.addition(humanFriend);

                break;
            case '2':
                birthDate = view.getInputBirthDate();
                HumanFriend humanFriend2 = new HumanFriend(birthDate);
                model.matchingDate(humanFriend2);
                break;

            case '3':
                id = view.getInputId();
                name = view.getInputName();
                HumanFriend humanFriend3 = new HumanFriend(id,name);
                if(model.matchingPet(humanFriend3)){
                    char operatorAction2 = view.getInputAction();
                    switch (operatorAction2) {
                        case '1':
                            String command = view.getInputNewCommand();
                            model.addCommand(humanFriend3, command);
                            break;
                        case '2':
                            model.removing(humanFriend3);
                            break;

                        case '9':
                            performAction();
                    }


                    }
                else {
                    view.greetingWord();

                }
                break;
            case '4':

                view.displayQuantity(model.counter);
                break;
            case '9':
                performAction();
        }
        performAction();
    }
}