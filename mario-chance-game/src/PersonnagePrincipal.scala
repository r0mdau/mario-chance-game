class PersonnagePrincipal(var nomo: String) extends Personnage(nomo, 2, 10) {
	var pv = 10
  def battre(enne: Ennemi) {
    enne coup puissance
  }

  def battre(boss: Boss) {
    boss coup puissance
  }
  
  def sauter = println(nomo + " sauute")
  def entrerChateau = println(nomo + " entre dans le chateau")
  def donnerBisou(peach : Princesse) = peach bisous
}