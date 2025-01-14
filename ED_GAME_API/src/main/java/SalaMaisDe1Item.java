import models.mission.Mission;
import models.world.GameNetwork;
import models.world.Room;
import utils.jsonHandlers.MissionImporter;

public class SalaMaisDe1Item {
    public static void main(String[] args) {
        Mission mission = MissionImporter.importMission("/Users/antoniosilva/Desktop/LEI_ED_8220207_8220208/IMF/" +
                "Mission_Pata_De_Coelho_v1.json");

        GameNetwork building = mission.selectGameVersion(1).getBuilding();

        System.out.println("Salas com mais de 1 item:");
        for (Room room : building.getVertices()) {
            if (room.getItems().size() > 1) {
                System.out.println("Sala: " + room.getName() + " | Número de itens: " + room.getItems().size());
            }
        }
    }
}
