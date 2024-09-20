package l13;

public class l13 {
    public static void main(String[] args) {
        User us1 = new User("us1");
        User us2 = new User("us2");
        User us3 = new User("us3");
        MessageDatabase.sendMessage(us1,us2,"Hello");
        MessageDatabase.sendMessage(us1,us2,"How are you?");
        MessageDatabase.sendMessage(us2,us1,"Hello my friend!");
        MessageDatabase.sendMessage(us2,us1,"Wery well!!");
        MessageDatabase.sendMessage(us2,us1,"Java go 0_0");
        MessageDatabase.sendMessage(us3,us1,"HI HI HI");
        MessageDatabase.sendMessage(us1,us3,"PRIVET");
        MessageDatabase.sendMessage(us3,us1,"go play))");
        MessageDatabase.sendMessage(us1,us3,"hamster hamster tap tap <- ->");
        us3.sendMessage(us1,"my rank++");
        MessageDatabase.sendMessage(us1,us3,"My wallet ++");
        MessageDatabase.showDialog(us1,us2);
        System.out.println();
        MessageDatabase.showDialog(us3,us1);
        System.out.println("zzzz");
        MessageDatabase.showDialog(us3,us2);
    }
}
