package com.david

object DrawApp extends App {
  val favourites = scala.io.Source.fromFile("src/main/resources/groupFavourites.txt").getLines().toList
  val group2 = scala.io.Source.fromFile("src/main/resources/secondGroup.txt").getLines().toList
  val group3 = scala.io.Source.fromFile("src/main/resources/thirthGroup.txt").getLines().toList
  val group4 = scala.io.Source.fromFile("src/main/resources/fourthGroup.txt").getLines().toList
  val group4full= (1 to (group4.length % 8)).foldLeft(List[String]())((acum, _) => "" :: acum) ::: group4

  val group4Shuffled= scala.util.Random.shuffle(group4full)
  val group4Splited=(1 to group4Shuffled.length/8).foldLeft((List[List[String]](),group4Shuffled)){case ((result, rest), _) => (rest.take(8) :: result, rest.drop(8))}

  val allGroups= scala.util.Random.shuffle(favourites) :: scala.util.Random.shuffle(group3) :: scala.util.Random.shuffle(group2) :: group4Splited._1

  val results = allGroups.map(g => g.zipWithIndex).flatten.groupBy(_._2).map(_._2).toList.map(l => l.map(_._1).filter(!_.isEmpty))
  val groupByIndex = (1 to 8) zip ('A' to 'H')
  results.zipWithIndex.foreach{ case (group, i) =>
    println(s"GROUP ${groupByIndex(i)._2 }")
    println("_______________")
    println(s"\t${group.mkString("\n\t")}")
  }
  println()
  defineGroups(("1st", "2nd"))
  println()
  defineGroups(("3th", "4th"))

  def defineGroups(pos: (String, String))={

    println(s"GROUP 1 ${pos._1} vs GROUP 8 ${pos._2}                                                                                                         GROUP 5 ${pos._1} vs GROUP 7 ${pos._2}")
    println("--------------------------                                                                                                         --------------------------")
    println("                         ---                                                                                                    ---")
    println("                            ---                                                                                              ---")
    println("                               ---   QUARTER FINAL                                                         QUARTER FINAL  ---")
    println("                            ---                   ---                                                  ---                   ---")
    println("                         ---                        ---                                              ---                        ---")
    println(s"GROUP 7 ${pos._1} vs GROUP 5 ${pos._2}                            ---                                         ---                              GROUP 6 ${pos._1} vs GROUP 2 ${pos._2}")
    println("--------------------------                              ---                                    ---                                 --------------------------")
    println("                                                           ---                              ---")
    println("                                                               SEMIFINAL -- FINAL -- SEMIFINAL")
    println(s"GROUP 2 ${pos._1} vs GROUP 6 ${pos._2}                                  ---                               ---                                  GROUP 3 ${pos._1} vs GROUP 1 ${pos._2}")
    println("--------------------------                              ---                                      ---                               --------------------------")
    println("                         ---                         ---                                            ---                         ---")
    println("                            ---                   ---                                                  ---                   ---")
    println("                               ---   QUARTER FINAL                                                         QUARTER FINAL  ---")
    println("                            ---                                                                                              ---")
    println("                         ---                                                                                                    ---")
    println(s"GROUP 4 ${pos._1} vs GROUP 3 ${pos._2}                                                                                                         GROUP 8 ${pos._1} vs GROUP 4 ${pos._2}")
    println("--------------------------                                                                                                          --------------------------")



  }

}
