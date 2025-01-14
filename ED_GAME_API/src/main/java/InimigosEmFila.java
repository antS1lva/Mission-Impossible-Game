import dataStructures.exceptions.EmptyCollectionException;
import models.mission.Mission;
import models.world.GameNetwork;
import utils.jsonHandlers.MissionImporter;

public class InimigosEmFila {
    public static void main(String[] args) throws EmptyCollectionException {
        Mission mission = MissionImporter.importMission("C:\\Users\\justf\\Documents\\IMF\\" +
                "Mission_Pata_De_Coelho_v1.json");

        GameNetwork building = mission.selectGameVersion(1).getBuilding();

        InimigoEmFila inimigosEmFila = new InimigoEmFila();
        inimigosEmFila.queuEnemys(building);
        inimigosEmFila.displayEnemies();
    }
}
