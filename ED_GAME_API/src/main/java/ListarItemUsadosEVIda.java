import dataStructures.exceptions.EmptyCollectionException;
import models.entities.Player;
import models.items.MedKit;
import models.mission.Mission;
import utils.jsonHandlers.MissionImporter;

public class ListarItemUsadosEVIda {

    public static void main(String[] args) throws EmptyCollectionException {
        Mission mission = MissionImporter.importMission("/Users/antoniosilva/Desktop/LEI_ED_8220207_8220208/IMF/" +
                "Mission_Pata_De_Coelho_v1.json");

        Player player = new Player("Agente X", 50, 30, 5);

        MedKit medKit1 = new MedKit("Pequeno MedKit", 20);
        MedKit medKit2 = new MedKit("Médio MedKit", 35);
        MedKit medKit3 = new MedKit("Grande MedKit", 50);

        player.pickUpMedKit(medKit1);
        player.pickUpMedKit(medKit2);
        player.pickUpMedKit(medKit3);

        System.out.println("Ordem cronológica dos itens usados e vida recuperada:");
        try {
            while (!player.getMedKits().isEmpty()) {
                player.useMedKit();
                System.out.println("Item Usado: " + medKit1.getName() +
                        " | Vida Recuperada: " + medKit1.getRecoveryPoints() +
                        " | Vida Atual: " + player.getHealth());
            }
        } catch (EmptyCollectionException e) {
            System.out.println("Não há mais MedKits para usar.");
        }
    }

}
