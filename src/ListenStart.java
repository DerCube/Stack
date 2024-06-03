public class ListenStart{
  public static void main(String[] args) {
    Liste li=new Liste(0);
    Element e=new Element(99);
    li.setKopf(e);
    li.getKopf().setNextElement(new Element(1111));
    System.out.println("Liste leer? "+li.istLeer());
    li.eleHintenDranHaengen(new Element(444));
    
    li.eleHintenDranHaengen(new Element(444));
    li.eleHintenDranHaengen(new Element(13));
    
    li.eleHintenDranHaengen(new Element(444));
    li.eleHintenDranHaengen(new Element(444));
    li.eleHintenDranHaengen(new Element(99999999));
    li.listeAusgeben();
    System.out.println("Listenlänge: "+li.listenLaenge());
    System.out.println("das fünfte Element: "+li.eleAnStelle(5).getWert());
    System.out.println("das fünfte Element: "+li.get(5));
  }
}