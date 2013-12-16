class Ennemi(var nomo: String) extends Personnage(nomo, 2, 10) {
  def battre(perso: PersonnagePrincipal) {
    perso coup puissance
  }
}