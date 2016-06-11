/**
 * 
 * Diese Klasse wird benötigt, um die Gans, dann als "Ente" bei
 * Observable zu registrieren. 
 * 
 * Pattern: Adapter 
 *
 * @author Sefer
 * @version 2016-06-11
 */

public class Goose {

	public void honk() {
		System.out.println("Honk");
	}

	public String toString() {
		return "Goose";
	}
}
