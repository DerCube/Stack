public class Liste{
  private Element kopf;
  
  public Liste(int anz){
    //to do 
  }
  
  //erste Methode: ist die Liste leer??
  //wenn der Kopf gleich null ist, dann gibt es ein true
  public boolean istLeer(){
    return this.kopf==null;                        
  }
  
  //zweite Methode: Listeninhalte (!) ausgeben
  public void listeAusgeben(){
    Element tmp=this.kopf;
    while(tmp!=null){
      System.out.println("Element Nr.: "+""+"\tWert: "+tmp.getWert());
      tmp=tmp.getNextElement();
    }
  }
  
  //dritte Methode: ein Element hinten dran hängen
  public void eleHintenDranHaengen(Element e){
    if (this.istLeer()) {
      this.setKopf(e);
    } else {
      Element tmp=this.kopf;
      while(tmp.getNextElement()!=null){
        tmp=tmp.getNextElement();
      }
      tmp.setNextElement(e);
    } 
  }
  
  //vierte Methode Länge der Liste ausgeben
  public int listenLaenge(){
    Element tmp=this.kopf;
    int i=0;
    while(tmp!=null){
      i++;
      tmp=tmp.getNextElement();
    }
    return i;
  }
  
 
  public Element eleAnStelle(int x) {
    Element tempEle=null;
    if (this.listenLaenge()<x) {
      System.out.println("x ist zu groß");
    } else {
      tempEle = this.kopf;
      while (tempEle.getNextElement() != null && x > 1) {
        tempEle = tempEle.getNextElement();
        x--;
      }
    }  
    return tempEle;  
  }
  
  
  public int get(int l) {
    Element a;
    a=this.getKopf();
    for (int i = 0; i < l-1; i++) {
      a=a.getNextElement(); 
    }
    return a.getWert();
  }

    
  public Element getKopf(){
    return this.kopf;     
  }
  
  public void setKopf(Element kopf){
    this.kopf=kopf;                    
  }
}