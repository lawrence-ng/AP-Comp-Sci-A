public class StringChecker
{
    public static void main(String[] args) {
        String text = "Grizzlies";
        String text2 = text.replace('i', '!');
        System.out.println("original: " + text + "\nReplaced: " + text2 + "\nExpected: Cal!forn!a");
    }
}
