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

public interface Quackable extends QuackObservable {
	public void quack();
}
