package mainmenuproject;


public class startTime
{
    public static class st
    {
        public static long s;
        st()
        {
            s = System.currentTimeMillis();
        }
        static long getStart()
        {
            return s;
        }
    }
}
