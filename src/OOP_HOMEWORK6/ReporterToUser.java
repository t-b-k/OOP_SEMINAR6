package OOP_HOMEWORK6;

public class ReporterToUser implements InfoMessageCreator<User> {

    public void report(User user) {
        System.out.println(createInfoMessage("Report to ", user, user.getName()));
        System.out.printf("Далее метод report() выполняет операции по информированию пользователя %s \n", user.getName());
        // далее идет сохранение информации об объекте
    }
}

