package ch.epai.ict.m526.theme5.serie2;

public class Cercle implements Forme{
    private int rayon;
    private Point centre;

    Cercle(int rayon, int x, int y) throws VerifRayonException {
        if (rayon < 0) {
            throw new VerifRayonException("Le rayon est négatif, merci d'entrer un rayon positif.");
        } else {
            this.rayon = rayon;
        }
        this.centre = new Point(x, y);
    }

    Cercle(int rayon, Point point) throws VerifRayonException {
        if (rayon < 0) {
            throw new VerifRayonException("Le rayon est négatif");
        } else {
            this.rayon = rayon;
        }
        this.centre = point;
    }

    @Override
    public String toString() {
        return "Cercle de centre (" + this.centre.getX() + ", " + this.centre.getY() + ") et de rayon " + this.rayon;
    }

    public Point centre() {
        return this.centre;
    }

    public void dessine() {
        System.out.println("Au compas: " + toString());
    }

    public double longueur(){
        return 2 * 3.14 * rayon;
    }
}