public class TestPersonne {

    public static void main(String[] args) {
        Personne personne = new Personne("Toto", "toto", "1 rue Dumont");
        personne.setNom("Machin");
        personne.setAdresse("3 rue Didier");
        personne.affInfos();
    }

}
