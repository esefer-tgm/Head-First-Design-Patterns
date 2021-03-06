/**
 * Diese Klasse ist eine Entenart und implementiert die Klasse Quackable.
 * Dies ist ein konkretes Subjekt und diese implementieren immer die Subjekt
 * Klasse. In diesem Fall ist dies das Interface Quackable.
 * Die Methode notifyObervers() wird genutzt um alle Beobachter (Observer) 
 * zu benachrichtigen. In diesem Fall, wenn die Ente quackt.
 * 
 * Pattern: Observer
 *
 * @author Sefer
 * @version 2016-06-11
 */
 
public class DecoyDuck implements Quackable {
	Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
