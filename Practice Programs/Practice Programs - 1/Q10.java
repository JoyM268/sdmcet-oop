/*  You are asked to develop a simple media player application that can play different types of media files such as MP3, MP4, WAV and WMA. 
All the listed media players must provide the common features to play, pause, stop, rewind and forward the media being streamed. 
Using the feature of interfaces, write a Java program that provides the implementation for the above problem definition. 
Note: No need to actually implement the above-mentioned common features, as these features require the implementation of drivers and codecs,
and is beyond the scope of current discussion. Hence, it is sufficient to put relevant display statements inside the common features. */

interface media{
    void play();
    void pause();
    void stop();
    void forward();
}

class mp3 implements media{
    public void play(){
        System.out.println("MP3 playing");
    }

    public void pause(){
        System.out.println("MP3 paused");
    }

    public void stop(){
        System.out.println("MP3 stopped");
    }

    public void rewind(){
        System.out.println("MP3 rewind");
    }

    public void forward(){
        System.out.println("MP3 forward");
    }
}

class mp4 implements media{
    public void play(){
        System.out.println("MP4 playing");
    }

    public void pause(){
        System.out.println("MP4 paused");
    }

    public void stop(){
        System.out.println("MP4 stopped");
    }

    public void rewind(){
        System.out.println("MP4 rewind");
    }

    public void forward(){
        System.out.println("MP4 forward");
    }
}

class wav implements media{
    public void play(){
        System.out.println("WAV playing");
    }

    public void pause(){
        System.out.println("WAV paused");
    }

    public void stop(){
        System.out.println("WAV stopped");
    }

    public void rewind(){
        System.out.println("WAV rewind");
    }

    public void forward(){
        System.out.println("WAV forward");
    }
}

class wma implements media{
    public void play(){
        System.out.println("WMA playing");
    }

    public void pause(){
        System.out.println("WMA paused");
    }

    public void stop(){
        System.out.println("WMA stopped");
    }

    public void rewind(){
        System.out.println("WMA rewind");
    }

    public void forward(){
        System.out.println("WMA forward");
    }
}