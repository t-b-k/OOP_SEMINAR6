package OOP_HOMEWORK6;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        ReporterToUser reporter = new ReporterToUser();
        UserSaver saver = new UserSaver();
        reporter.report(user);
        saver.save(user);
    }
}
