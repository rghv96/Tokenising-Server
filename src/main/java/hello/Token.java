package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Token {
   // @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //private Integer id;
	@Id
    private String token;

    private String card;

	/*public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}*/

	public Token() {
        this.card = null;
        this.token = null;
    }

	public Token(String token, String card) {
        this.card = card;
        this.token = token;
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


}