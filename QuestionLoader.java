import java.io.*;
class QuestionLoader{
    protected FileReader in;
    QuestionLoader (){
        try{
            in = new FileReader("questionsformat.txt");//
        }
        catch(IOException e) {
        System.out.println("Question file not found");
        }
    }
    
    public Question read(){
        //From the way the question is built they must strt defined as null
        String question="";
        String category="";
        String value="";
        int points=0;
        String []answers=new String [4];
        for (int i=0;i<4;i++){
            answers[i]="";}
        int read;
        
        try{
            //Build value
            while ((read=in.read())!=(int)'\n'){//Runs until newline
                value+=(char)read;//Builds the string char by char
            }
            points=Integer.parseInt(value);
            //Build the category
            while ((read=in.read())!=(int)'\n'){//Runs until newline
                category+=(char)read;//Builds the string char by char
            }
            //Build the question
            while ((read=in.read())!=(int)'\n'){//Runs until newline
                question+=(char)read;//Builds the string char by char
            }
            //Build all 4 answers
            for (int i=0;i<4;i++){//For each answer
                while ((read=in.read())!=(int)'\n'){//Builds the string char by char
                    answers[i]+=(char)read;
                }
            }
            read=in.read();
            
        }
        catch(IOException e) {}
        Question q= new Question(points,category,question,answers,0);//construct a question object
        
        return q;//Return it
    }
    
}