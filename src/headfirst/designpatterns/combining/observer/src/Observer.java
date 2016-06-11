/**
 * Alle Beobacher implementieren diese Klasse.
 * Die Methode update wird aufgerufen, wenn sich
 * beim Status des Subjekten etwas ändert.
 * 
 * Pattern: Observer
 *
 * @author Sefer
 * @version 2016-06-11
 */
public interface Observer {
	public void update(QuackObservable duck);
}
