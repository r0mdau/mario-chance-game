class Boss(var nomo: String) extends Personnage(nomo, 2, 10) {
  def battre(perso: PersonnagePrincipal) {
    perso coup puissance
  }

  def battre(enne: Ennemi) {
    enne coup puissance
  }
}