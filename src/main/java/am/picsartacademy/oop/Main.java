package am.picsartacademy.oop;

public class Main {
    public static void main(String[] args) {
        SocialApp app1 = new SocialApp();
        app1.name = "Instagram";
        app1.sizeMb = 125.3;
        app1.version = "320.5";
        app1.username = "anna.grigoryan";
        app1.statusMessage = "Online";

        Application app2 = new Application();
        app2.name = "Telegram";
        app2.sizeMb = 110.0;
        app2.version = "10.3";

        app1.launch();
        app2.launch();

        System.out.println(app1.name);
        System.out.println(app1.sizeMb);
        System.out.println(app1.version);
        System.out.println(app1.username);
        System.out.println(app1.statusMessage);

        System.out.println(app2.name);
        System.out.println(app2.sizeMb);
        System.out.println(app2.version);

        GameApp app3 = new GameApp();
        app3.version ="230.2";
        app3.sizeMb = 110;
        app3.name ="Subway Surfer";
        app3.level = "7";
        app3.language = "English";

        System.out.println(app3.name);
        System.out.println(app3.sizeMb);
        System.out.println(app3.version);
        System.out.println(app3.level);
        System.out.println(app3.language);






    }
}
