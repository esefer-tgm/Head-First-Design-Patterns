/**
 * Diese Klasse implementiert das Interface Quackable.
 * Objekte benutzen diese Klasse, um sich zu registrieren,
 * damit dann später Daten an den Observer gelangen können.
 * 
 * Pattern: Observer
 *
 * @author Sefer
 * @version 2016-06-11
 */

import java.util.Iterator;
import java.util.ArrayList;

public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}