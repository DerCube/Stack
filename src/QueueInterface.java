public interface QueueInterface {

    public void add(Object e);      //hinzufügen des Elements ans Ende der Queue
    public Object pop();            //löscht und gibt aus
    public Object peek();           //gibt das erste Element aus
    public boolean isEmpty();       //prüft ob leer
    public int size();              //größe der Queue

}//end of all
