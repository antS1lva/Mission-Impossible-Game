import models.mission.Mission;
import models.world.GameNetwork;
import models.world.Room;
import models.items.MedKit;
import utils.jsonHandlers.MissionImporter;

public class QuantidadeTotalMedkits {
    public static void main(String[] args) {
        Mission mission = MissionImporter.importMission("/Users/antoniosilva/Desktop/LEI_ED_8220207_8220208/IMF/" +
                "Mission_Pata_De_Coelho_v1.json");

        GameNetwork building = mission.selectGameVersion(1).getBuilding();

        int totalMedKits = 0;
        for (Room room : building.getVertices()) {
            for (var item : room.getItems()) {
                if (item instanceof MedKit) {
                    totalMedKits++;
                }
            }
        }
        System.out.println("Total de MedKits disponíveis na missão: " + totalMedKits);
    }
}
