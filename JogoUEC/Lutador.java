package curso_de_poo;

public class Lutador {
 private String name;
 private String nationality;
 private int age;
 private float height;
 private float weight;
 private String category;
 private int victories;
 private int defeats;
 private int draws;
 
 public Lutador( String nam, String nat, int ag, float he,
		 float we, int vi, int de, int dr) {
	 this.name = nam;
	 this.nationality = nat;
	 this.age = ag;
	 this.height = he;
	 this.setWeight(we);
	 this.victories = vi;
	 this.defeats = de; 
	 this.draws = dr;
 }
  public String getName() {
  	return name;
  }
  public void setName(String name) {
  	this.name = name;
  }
  public String getNationality() {
  	return nationality;
  }
  public void setNationality(String nationality) {
  	this.nationality = nationality;
  }
  public int getAge() {
  	return age;
  }
  public void setAge(int age) {
  	this.age = age;
  }
  public float getHeight() {
  	return height;
  }
  public void setHeight(float height) {
  	this.height = height;
  }
  public float getWeight() {
  	return weight;
  }
  public void setWeight(float weight) {
  	this.weight = weight;
  	this.setCategory();
  }
  public String getCategory() {
  	return category;
  }
  private void setCategory() {
  	if (this.weight < 52.2) {
  		this.category = "Invalido";
  	} else if (this.weight <= 70.3) {
  		this.category = "peso leve";
  	} else if (this.weight <= 83.9) {
  		this.category = "peso medio";
  	} else if (this.weight <= 120.2) {
  		this.category = "peso pesado";
  	} else {
  		this.category = "invalido";
  	}
  }
  public int getVictories() {
  	return victories;
  }
  public void setVictories(int victories) {
  	this.victories = victories;
  }
  public int getDefeats() {
  	return defeats;
  }
  public void setDefeats(int defeats) {
  	this.defeats = defeats;
  }
  public int getDraws() {
  	return draws;
  }
  public void setDraws(int draws) {
  	this.draws = draws;
  }
 public void apresentar() {
	 System.out.println("------------------------------------------");
	 System.out.println("APRESENTANDO O LUTADOR : " + this.getName());
	 System.out.println("DIRETAMENTE DE : " + this.getNationality());
	 System.out.println("COM " + this.getAge() + " ANOS");
	 System.out.println("MEDINDO " +this.getHeight() + " M DE ALTURA");
	 System.out.println("PESANDO : " + this.getWeight() + " KG");
	 System.out.println("Ganhou: " + this.getVictories());
	 System.out.println("Perdeu: " + this.getDefeats());
	 System.out.println("Empatou: " + this.getDraws());
	 System.out.println("da categoria: " + this.getCategory());
	 System.out.println(" ");
 }
 public void status() {
	 System.out.println(this.getName());
	 System.out.println("é da categoria: " + this.getCategory());
	 System.out.println(this.getVictories() + " vitorias");
	 System.out.println(this.getDefeats() + " derrotas");
	 System.out.println(this.getDraws() + " empates");
 }
 public void ganharLuta() {
	 this.setVictories(this.getVictories() + 1);
 }
 public void perderLuta() {
	 this.setDefeats(this.getDefeats() + 1);
 }
 public void empatarLuta() {
	 this.setDraws(this.getDraws() + 1);
 }
}
