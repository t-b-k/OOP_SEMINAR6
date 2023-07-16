package OOP_HOMEWORK6;

public class UserSaver implements InfoMessageCreator<User> {
    public void save (User user) {
        System.out.println(createInfoMessage("Save ", user, user.getName()));
        System.out.println("Далее метод save() выполняет операции по сохранению объекта класса User... ");
        // далее идет сохранение информации об объекте
    }
}
