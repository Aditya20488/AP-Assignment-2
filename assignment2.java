import java.util.ArrayList;
import java.util.Scanner;


public class assignment2 {
    public static void main(String[] args) {



    }
    class Student{

    }
    class instructor{

    }
    class slides implements study_material {
        String topic_of_Slides;
        int no_of_slides;
        String content_of_Slides;

        public slides(String topics, int no_of_Slides, String content) {
            this.topic_of_Slides = topics;
            no_of_Slides = 0;
            this.content_of_Slides = content;
        }


        ArrayList<String> Slides = new ArrayList<String>();


        @Override
        public void add() {
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter topic of Slides :");
            String topic = sc.next();
            System.out.println("Enter number of Slides:");
            int Slides = sc.nextInt();
            System.out.println("Enter content of Slides :");
            String content = sc.next();

        }

        @Override
        public void show() {
            System.out.println("Enter topic of Slides:" + topic_of_Slides);
            System.out.println("Enter number of Slides:" + no_of_slides);
            System.out.println("Enter content of slides " + content_of_Slides);

        }
    }
    ArrayList<String> videos = new ArrayList<String>();
    class videos implements study_material{
        String topic_of_videos;
        String Filename;

        public videos(String videos , String filename){
            this.Filename=filename;
            this.topic_of_videos= videos ;
        }


        @Override
        public void add() {
            Scanner a = new Scanner(System.in);
            System.out.println("Enter topic of videos :");
            String videos = a.next();
            System.out.println("Enter filename:");
            String filename=a.next();

        }

        @Override
        public void show() {
            System.out.println("Enter topic of videos :"+topic_of_videos);
            System.out.println("Enter filename of videos :"+Filename);

        }
    }
    ArrayList<String> assignments = new ArrayList<String>();
    class assignments implements Assessment{
        String Problem_statement ;
        int maximum_marks;

        public assignments(String Problem  ,int marks  ){
            this.Problem_statement= Problem;
            this.maximum_marks= marks;

        }


        @Override
        public void add() {
            Scanner b = new Scanner(System.in);
            System.out.println("Enter problem Statement :");
            String problem = b.next();
            System.out.println("Enter maximum marks :");
            int marks = b.nextInt();

        }

        @Override
        public void show() {
            System.out.println("Enter problem statement:"+Problem_statement);
            System.out.println("Enter maximum marks:"+maximum_marks);

        }
    }
    class quiz implements Assessment{
        String quiz_que;

        public quiz(String quiz){
            this.quiz_que = quiz;


        }

        @Override
        public void add() {
            Scanner c = new Scanner(System.in);
            System.out.println("Enter quiz question:");
            String quiz = c.next();


        }

        @Override
        public void show() {
            System.out.println("Enter quiz question :" +quiz_que);

        }
    }
        interface study_material{
        public void add();
        public void show();
        }
        interface Assessment{
        public void add();
        public void show();
    }
}
