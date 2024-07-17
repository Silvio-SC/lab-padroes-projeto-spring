package one.digitalinnovation.gof.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import one.digitalinnovation.gof.model.RequestGame.GameType;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private GameType gameType;
	private String gameFederation;
	private int rating;
	@ManyToOne
	private Endereco endereco;

	private List<RequestHandler> handlers;

	private Cliente() {
		buildChain();
	}

	private void buildChain() {
        handlers = Arrays.asList(new XadrezReq(), new DamaReq(), new GoReq(), new PokerReq());
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public GameType getGameType() {
		return gameType;
	}
	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}
	
	public String getGameFederation() {
		return gameFederation;
	}
	public void setgetGameFederation() {
		RequestGame req = new RequestGame(this.getGameType());
		Stream<Object> faderation;
		faderation = handlers.stream()
		.filter(handler -> handler.canHandleRequest(req))
		.map(handler -> handler.handle(req));

		this.gameFederation = faderation.toString();
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
