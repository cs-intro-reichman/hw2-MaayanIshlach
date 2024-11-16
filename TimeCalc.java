public class TimeCalc {
    public static void main(String[] args) {
        String hour=args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int colonIndex= hour.indexOf(':'); //finding the place of the char ':'
        String h_time=hour.substring(0, colonIndex); 
        String m_time=hour.substring(colonIndex+1,hour.length());
        int total_minutes=Integer.parseInt(h_time)*60+Integer.parseInt(m_time)+minutesToAdd; // The new amount of minutes after adding minutes
        int total_hours=total_minutes/60;
        int new_hours=total_hours%24; //Amount of hours relative to the clock
        int new_minutes=total_minutes-(total_hours*60);
        /*
        System.out.println("Hours: "+h_time);
        System.out.println("Minutes: "+m_time);
        System.out.println("Minutes to add: "+minutesToAdd);
        System.out.println(new_hours+""+new_minutes);
         */
        System.out.println(String.format("%02d:%02d ",new_hours,new_minutes));


    }
}
