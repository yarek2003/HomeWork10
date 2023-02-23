public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task1d();
        task2d();
        task3d();
        task4d();
    }
    public static void task1 () {
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "ФИО сотрудника — " + lastName + " " + firstName + " " + lastName;
        System.out.println(fullName);
    }
    public static void task2() {
        System.out.println();
        System.out.println("Задача №2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println();
        System.out.println("Задача №3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё','е'));
    }
    public static void task1d() {
        System.out.println();
        System.out.println("Задача №1 Доп");
        String fullName = "Иванов Семён Семёнович";
        String newFullName = "";
        for (int i=0;i<fullName.length();i++) {
            newFullName = newFullName + fullName.charAt(i)+fullName.charAt(i);
        }
        System.out.println(newFullName);
    }
    public static void task2d() {
        System.out.println();
        System.out.println("Задача №2 Доп");
        String str1 = "<<<>>>";
        String str2 = "abcd";
        String newString = "";
        newString = str1.substring(0,str1.length()/2) + str2 + str1.substring(str1.length()/2);
        System.out.println(newString);
    }
    public static void task3d() {
        System.out.println();
        System.out.println("Задача №3 Доп");
        String str1 = "";
        String str2 = "45";
        String newStr = "";
        if (str1.isEmpty()) newStr = newStr + '@';
        else newStr =newStr + str1.charAt(0);
        if (str2.isEmpty()) newStr = newStr + '@';
        else newStr = newStr + str2.charAt(str2.length()-1);

        System.out.println(newStr);
    }
    public static void task4d() {
        System.out.println();
        System.out.println("Задача №4 Доп");
        String str1 = "123456";
        String newString = "";
        newString = str1.substring(0, str1.length() - 2) + str1.charAt(str1.length()-1) + str1.charAt(str1.length()-2);
        System.out.println(newString);
    }
}