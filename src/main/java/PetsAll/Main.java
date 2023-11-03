package PetsAll;

public class Main {                     //  основной класс
    public static void main(String[] args) {
        HumanFriend model = new HumanFriend();
        HumanFriendsView view = new HumanFriendsView();
        HumanFriendsPresenter presenter = new HumanFriendsPresenter(model, view);
        presenter.performAction();

    }
}