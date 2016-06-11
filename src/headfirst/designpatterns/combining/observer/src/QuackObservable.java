/**
 * Dieses Interface ist die Überklasse von Quackable und Observable
 * und dient als Layer über den "gleichgeordneten" Klassen.
 * 
 * Pattern: Observer
 *
 * @author Sefer
 * @version 2016-06-11
 */

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
