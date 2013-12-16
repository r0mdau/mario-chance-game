class Personnage(var nom : String, var puissance: Int, var vie: Int) {
  def coup(force: Int) = vie -= force
}