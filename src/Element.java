public class Element{
  private int wert;
  private Element e; 
  
  public Element(int wert){
    this.setWert(wert);
  } 
  
  public int getWert(){
    return this.wert;       
  }
  
  public void setWert(int wert){
    this.wert=wert;                     
  }
  
  public Element getNextElement(){
    return this.e;     
  }
  
  public void setNextElement(Element e){
    this.e=e;                    
  }
}