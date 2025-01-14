import models.mission.Mission;
import models.world.GameNetwork;
import models.world.Room;
import models.entities.Enemy;
import models.entities.Player;
import utils.jsonHandlers.MissionImporter;

public class InimigoMaisForte {
    public static void main(String[] args) {
        Mission mission = MissionImporter.importMission("/Users/antoniosilva/Desktop/LEI_ED_8220207_8220208/IMF/" +
                "Mission_Pata_De_Coelho_v1.json");

        GameNetwork building = mission.selectGameVersion(1).getBuilding();

        Player player = new Player("To", 10, 10, 3);

        System.out.println("Salas com inimigos mais fortes que o jogador:");
        for (Room room : building.getVertices()) {
            for (Enemy enemy : room.getEnemies()) {
                if (enemy.getFirePower() > player.getFirePower()) {
                    System.out.println("Sala: " + room.getName() + " | Inimigo: " + enemy.getName() +
                            " (Poder: " + enemy.getFirePower() + ")");
                }
            }
        }
    }
}
