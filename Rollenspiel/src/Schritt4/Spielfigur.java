package Schritt4;

public abstract class Spielfigur {

    private String name;
    private int staerkepunkte;

    public Spielfigur(String name, int staerkepunkte){
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void essen() {
        setStaerkepunkte(getStaerkepunkte() + 10);
    }

    public void laufen() throws KeineKraftException {
      if (getStaerkepunkte() - 1 >= 0) {
          setStaerkepunkte(getStaerkepunkte() - 1);
      }
      else {
          throw  new KeineKraftException(getName(), "laufen");
      }
    }

    public void klettern() throws KeineKraftException {
        if (getStaerkepunkte() - 2 >= 0) {
            setStaerkepunkte(getStaerkepunkte() - 2);
        }
        else {
            throw new KeineKraftException(getName(), "klettern");
        }
    }

    public  void  kaempfen() throws KeineKraftException {
        if (getStaerkepunkte() - 3 >= 0) {
        setStaerkepunkte(getStaerkepunkte() - 3);
        }
        else {
            throw new KeineKraftException(getName(), "kämpfen");
        }
    }

    @Override
    public String toString() {
        return "[Spielfigur]\n" +
                "[Name] " + name +
                "\n [Stärkepunkte] " + staerkepunkte;
    }
}
