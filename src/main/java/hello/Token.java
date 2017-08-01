package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Token {

	@Id
    private String token;

    private String card;

    private String lastfour;

	public Token() {
        this.card = null;
        this.token = null;
        this.lastfour = null;
    }

	public Token(String token, String card, String lastfour) {
        this.card = card;
        this.token = token;
        this.lastfour = lastfour;
    }
    
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getLastfour() {
		return lastfour;
	}

	public void setLastfour(String lastfour) {
		this.lastfour= lastfour;
	}


}
