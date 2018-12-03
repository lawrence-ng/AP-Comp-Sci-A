
public class StringBufferChecker
{
    public static void main(String[] args) {
        StringBuffer stringbuffer1 = new StringBuffer("Alabama");
        stringbuffer1.reverse();
        System.out.println("original: Cal High\nresulting: " + stringbuffer1 + "\nexptected: " + "hgiH laC");
    }
}
