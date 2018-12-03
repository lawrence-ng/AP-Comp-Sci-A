public class Swapper
{
    public static void main(String[] args) {
    String string1 = "Cal High";
    String string2 = string1.replace('a', '(').replace('i', ')').replace('(', 'i').replace(')', 'a');
    System.out.println("original: " + string1 + "\nresult: " + string2 + "\nexpected: Cil Hagh");
}
}