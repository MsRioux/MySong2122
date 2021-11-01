public class mySong implements Media, Comparable
{
    //1) List of instance Variables
    private String name;
    private String artist;
    private double time; //length given in minutes
    private int tempo;
    private boolean isSingable; //does it have lyrics
    private static int count;  //static variable lets me count all songs

    //2) Constructors
    //mutli-argument constructor
    public mySong(String name, String artist, double time, int tempo, boolean isSingable )
    {
        this.name = name;
        this.artist = artist;
        this.time = validateTime(time);
        this.tempo = tempo;
        this.isSingable = isSingable;
        count++;
    }//end full constructor

    public mySong(String newName, String newArtist, boolean newIsSingable)
    {
        name = newName;
        artist = newArtist;
        time = 0.0;
        tempo = 0;
        isSingable = newIsSingable;

        count++;
    }//end constructor with name, artist and isSingable

    /*
    Overloaded constructors must have different parameter lists by data type
    public mySong(String newArtist, String newName, boolean newIsSingable)
    {
        name = newName;
        artist = newArtist;
        time = 0.0;
        tempo = 0;
        isSingable = newIsSingable;
    }//end constructor with name, artist and isSingable
  */

    public mySong()
    {
        this.name = "unnamed song";
        this.artist = "";
        this.time = 0.0;
        this.tempo = 0;
        this.isSingable = false;
        count++;
    }//end default constructor

    public static int getCount()
    {
        return count;
    }

    //4) Getters  (aka accessors)
    public String getName()
    {
        return name;
    }


    // Precondition 0 <= time
    public double getTime()
    {
        return time;
    }
    //5) Setters (aka mutators)
    public void setName(String name)
    {
        this.name = name;
    }

    public void setTime(double newTime)
    {
        time = validateTime(newTime);
    }

    //6) Brain methods

    //post condition 0 < = time
    private double validateTime(double newTime)
    {
        double result = 0;
        if (newTime > 0)
        {
            result = newTime;
        }
        return result;
    }



    public int lengthInSec()
    {
        //Shawn's solution
        int seconds = (int)(60 * time);
        return seconds;
//        int minutes = (int)time;
//        int seconds = (int)((time - minutes) * 60);
//        minutes *= 60;
        //will use the time variable
        //need to convert it to seconds
        //take the minute (whole number) multiply by 60
        //
        //will use math
        //the return the result
//        return minutes + seconds;
    }

    //3) ToString
    public String toString()
    {
        String output = "Name: " + name;
        output += "\nArtist: " + artist;
        output += "\nTime: " + time;
        output += "\nTempo: " + tempo;
        output += "\nIs it Singable: " + isSingable;
        return output;
    }

    @Override
    public int compareTo(Object mS)
    {
        int output = 0;
        if(this.time < ((mySong)mS).getTime())
        {
            output = -1;
        }
        else if(this.time > ((mySong)mS).getTime())
        {
            output = 1;
        }
        return output;
    }
}//end object class mySong  aka reference class
