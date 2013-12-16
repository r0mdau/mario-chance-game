object Main {
  def main(args: Array[String]) {
    val mario = new PersonnagePrincipal("Mario")
    val goomba = new Ennemi("goomba")
    val bowser = new Boss("Bowser")
    val peach = new Princesse("Peach")

    val rand = new scala.util.Random

    def chance(n: Int, m: Int) = {
      rand.nextInt(m) >= n
    }

    var gameOver = false

    def maledictionDeMario = {

      for (i <- 1 to 10; if (!gameOver)) {
        println("*" * 50)

        if (chance(1, 5)) {
          mario.sauter

          if (chance(1, 3)) {
            mario.sauter

            if (chance(1, 4)) {
              mario.battre(goomba)

              if (chance(3, 10) || chance(3, 10)) { /* on a deux essais pour le château, il faut
                                                que le premier OU le deuxième soit VRAI */
                mario.entrerChateau

                if (chance(1, 2)) {
                  mario.battre(bowser)

                  if (chance(1, 3)) {
                    mario.donnerBisou(peach)
                    gameOver = true // si Mario arrive à baiser Peach alors le jeu se termine
                    println("WI" + "N" * 50)

                  } else peach.donnerGifle(mario)

                } else bowser.battre(mario)

              } else println(mario.nom + " a été attrapé !")

            } else goomba.battre(mario)

          } else println(mario.nom + " est tombé dans le 2e trou !")

        } else println(mario.nom + " est tombé dans le premier trou !")

        if (mario.pv == 0) gameOver = true // si les vies de Mario sont toutes perdues on perd le jeu
        Thread.sleep(3000) // temps d'attente 3 secondes
      }
      println("*" * 50)
      println("*" * 50)
      println("Game Over")
    }
    maledictionDeMario
  }
}