public class ClavierFactory {

    // methode de creation d'un clavier par la Factory
    public Clavier fabriquerClavier(String typeClavier){

        switch (typeClavier){
            case "AZERTY":
                return  new ClavierAZERTY();
            case "QWERTY":
                return new ClavierQWERTY();
                default:
                    return null;
        }
    }

    public static  void main(String [] args){

        ClavierFactory clavierFactory = new ClavierFactory();

        // un client veut un clavier AZERTY
        Clavier clavierClient1 = clavierFactory.fabriquerClavier("AZERTY");
        clavierClient1.dispositonTouches();

        // un autre client veut un clavier QWERTY
        Clavier clavierClient2 = clavierFactory.fabriquerClavier("QWERTY");
        clavierClient2.dispositonTouches();

        //on constate bien que le clavier s'est adapté à la demande du client

    }
}
