interface AudioPlayer {
    void play(String audioType, String fileName);
}

class MP3Player implements AudioPlayer {
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid format. MP3 only.");
        }
    }
}

interface WAVPlayer {
    void playWAV(String fileName);
}

interface AACPlayer {
    void playAAC(String fileName);
}

class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    public void playWAV(String fileName) {
        System.out.println("Playing WAV file. Name: " + fileName);
    }

    public void playAAC(String fileName) {
        System.out.println("Playing AAC file. Name: " + fileName);
    }
}

class AudioAdapter implements AudioPlayer {
    AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedAudioPlayer.playWAV(fileName);
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedAudioPlayer.playAAC(fileName);
        }
    }
}

class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer player = new MP3Player();
        player.play("mp3", "song.mp3");

        AudioAdapter audioAdapter = new AudioAdapter("wav");
        audioAdapter.play("wav", "song.wav");

        audioAdapter = new AudioAdapter("aac");
        audioAdapter.play("aac", "song.aac");
    }
}
