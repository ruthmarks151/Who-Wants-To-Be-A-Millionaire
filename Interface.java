class Interface{
    public static void main(String args[]){
QuestionDeck qd=new QuestionDeck();
qd.fill();
Question q1=qd.get();
q1.display();
    }
    
}