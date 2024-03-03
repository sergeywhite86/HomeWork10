public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Task2");
        String upperCaseFullName = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета - %s %n",upperCaseFullName);

        System.out.println("Task3");
        fullName = "Иванов Семён Семёнович";
        String changeFullName = fullName.replace('ё','е');
        System.out.printf("Данные ФИО сотрудника - %s",changeFullName);

    }
}