package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();

    }
}
