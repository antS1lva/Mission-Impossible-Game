import dataStructures.exceptions.EmptyCollectionException;
import dataStructures.queues.LinkedQueue;
import models.entities.Enemy;
import models.world.GameNetwork;
import models.world.Room;

public class InimigoEmFila {

    LinkedQueue<Enemy> enemies;

    public InimigoEmFila() {
        this.enemies = new LinkedQueue<>();
    }

    public void queuEnemys(GameNetwork building) {
        for (Room room : building.getVertices()) {
            for (Enemy enemy : room.getEnemies()) {
                enemies.enqueue(enemy);
            }
        }
    }

    public void displayEnemies() throws EmptyCollectionException {
        while (!enemies.isEmpty()) {System.out.println(enemies.dequeue().getName());}
    }
}
