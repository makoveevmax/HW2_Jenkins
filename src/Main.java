public class Main {
    /**
     * Поднимаем VM, затем Tomcat и Jenkins в Docker'е, создаем ssh соединение с Git и настраиваем,
     * чтобы после каждого коммита в мастер ветку на Github Jenkins инсталил приложение на сервер Tomcat
     * */
    public static void main(String[] args) {
        System.out.println("Some dummy strings...");
    }
}