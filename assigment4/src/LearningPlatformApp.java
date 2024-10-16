interface VideoLecture {
    void getInfo();
    void play();
}

class RealVideoLecture implements VideoLecture {
    private String lectureName;

    public RealVideoLecture(String lectureName) {
        this.lectureName = lectureName;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video lecture: " + lectureName);
    }

    public void getInfo() {
        System.out.println("Lecture: " + lectureName);
    }

    public void play() {
        System.out.println("Playing video lecture: " + lectureName);
    }
}

class ProxyVideoLecture implements VideoLecture {
    private String lectureName;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String lectureName) {
        this.lectureName = lectureName;
    }

    public void getInfo() {
        System.out.println("Lecture: " + lectureName);
    }

    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(lectureName);
        }
        realVideoLecture.play();
    }
}

class OnlineCourse {
    private java.util.List<VideoLecture> lectures = new java.util.ArrayList<>();

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void showLectures() {
        for (VideoLecture lecture : lectures) {
            lecture.getInfo();
        }
    }

    public void playLecture(int index) {
        if (index < lectures.size()) {
            lectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index.");
        }
    }
}

class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();
        course.addLecture(new ProxyVideoLecture("Introduction to Java"));
        course.addLecture(new ProxyVideoLecture("Advanced Java Techniques"));

        course.showLectures();
        course.playLecture(0);
        course.playLecture(1);
    }
}
