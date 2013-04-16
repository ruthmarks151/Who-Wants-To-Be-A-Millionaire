class Interface{
    public static void main(String args[]){
        QuestionLoader ql=new QuestionLoader();
        Question q=ql.read();
        Question q2=ql.read();
        q.display();
        q2.display();
        
    }
    
}