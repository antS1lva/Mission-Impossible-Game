import models.mission.Mission;
import models.world.Room;
import models.world.GameNetwork;
import utils.jsonHandlers.MissionImporter;

public class RetornaItems {
    public static void main(String[] args) {
        Mission mission = MissionImporter.importMission("/Users/antoniosilva/Desktop/LEI_ED_8220207_8220208/IMF/" +
                "Mission_Pata_De_Coelho_v1.json");

        GameNetwork building = mission.selectGameVersion(1).getBuilding();

        System.out.println("Salas com itens:");
        for (Room room : building.getVertices()) {
            if (!room.getItems().isEmpty()) {
                System.out.println("Sala: " + room.getName());
            }
        }
    }
}
