package co.simplon.BoiteAJeu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String text;
	private int rating;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Boardgame boardgame;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boardgame getBoardgame() {
		return boardgame;
	}

	public void setBoardgame(Boardgame boardgame) {
		this.boardgame = boardgame;
	}
	
	
}
