public class SongDriver
{
    public static void main (String[] args)
    {
       mySong lover = new mySong("Lover", "Taylor Swift", 3.6, 120, true);
       mySong twilightZone = new mySong("Twilight Zone", "Box 6" , 7.25, 116, false);
       mySong blank = new mySong();
       mySong froggyFriend = new mySong("Froggy Friend", "Moss Talkers", true);

        mySong froggyFriend2 = new mySong("Froggy Friend", "Moss Talkers", true);

        //Array of mySong objects
        mySong[] playlist = {lover, twilightZone, blank, froggyFriend, froggyFriend2};

        for (mySong s: playlist) { //augmented for loop : for-  each loop
            System.out.println(s.toString() + "\n");
        }
        /*using array reference like object name
        playlist[2].setName("1812 Overture");
        System.out.println("Song at element #2:" + playlist[2].toString());

         */



        /*
        myVideo cspPT = new myVideo("AP CSP Create PT", 1);

        //using compareTo()
        if (lover.compareTo(froggyFriend) == 0)
        {
            System.out.println(lover.getName() + " is the same length as" + froggyFriend.getName());
        }
        else if (lover.compareTo(froggyFriend) > 0)
        {
            System.out.println(lover.getName() + " is longer than " + froggyFriend.getName());
        }
        else
        {
            System.out.println(lover.getName() + " is shorter than " + froggyFriend.getName());
        }
//        System.out.println(cspPT);
*/
        /*Alias practice
       if (froggyFriend == froggyFriend2)
       {
           System.out.println("Yes they are the same.");
       }
       else
       {
           System.out.println("Nope, they are different froggy songs.");
       }

       mySong froggyFriend3 = froggyFriend; //creating an alias
        froggyFriend3.setTime(20);
        System.out.println("New times " + froggyFriend3.getTime() + " and " + froggyFriend.getTime());

        if (froggyFriend == froggyFriend3)
        {
            System.out.println("Yes 1 and 3 are the same.");
        }
        else
        {
            System.out.println("Nope, they are also different froggy songs.");
        }

        */


//       blank.setTime(-243);
//       System.out.println(blank.getTime());
//
       System.out.println("Number of songs: " + mySong.getCount());



       // System.out.println("Checking Length in Seconds: " + lover.lengthInSec());


       /* testing getters and setters
       System.out.println(froggyFriend.toString() + "\n");
       froggyFriend.setTime(10);
       System.out.println("Froggy Friend length: " + froggyFriend.getTime());

       //testing Name getter and setter
        twilightZone.setName("TwIlIgHt ZoNe");
        System.out.println(twilightZone.getName());
*/
//       System.out.println(froggyFriend.toString());
//       System.out.println(lover.toString());
//        System.out.println("\n");
//       System.out.println(twilightZone.toString());
//       System.out.println("\n");
//       System.out.println(blank.toString());
    }

}
