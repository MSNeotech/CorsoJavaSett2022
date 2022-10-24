package srl.neotech.corsojava.partitascacchi;

public class Giocatore {
	
	private String nome;
	private Integer anni;
	private Integer livelloAbilita;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome: " + nome);
	}
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
		System.out.println("Anni: " + anni);
	}
	public int getLivelloAbilita() {
		return livelloAbilita;
	}
	public void setLivelloAbilità(int livelloAbilita) {
		this.livelloAbilita = livelloAbilita;
		System.out.println("Livello abilità: " + livelloAbilita);
	}
	

}
