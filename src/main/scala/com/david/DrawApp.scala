package com.david

import scala.util.Random

object DrawApp extends App {
  val favourites = scala.io.Source.fromFile("src/main/resources/groupFavourites.txt").getLines().toList
  val group2 = scala.io.Source.fromFile("src/main/resources/secondGroup.txt").getLines().toList
  val group3 = scala.io.Source.fromFile("src/main/resources/thirthGroup.txt").getLines().toList
  val group4Lines = Random.shuffle(scala.io.Source.fromFile("src/main/resources/fourthGroup.txt").getLines().toList)

  val toBeAddedGroup4= group4Lines.take(group4Lines.length%8)
  val group4Shuffled= group4Lines.drop(group4Lines.length%8)
  val group4Empties= (1 to (8 - toBeAddedGroup4.length)).foldLeft(List[String]())((acum, _) => "" :: acum) ::: toBeAddedGroup4



  val group4Splited=(1 to group4Shuffled.length/8).foldLeft((List[List[String]](),group4Shuffled)){case ((result, rest), _) => (rest.take(8) :: result, rest.drop(8))}

  val allGroups= group4Empties :: scala.util.Random.shuffle(favourites) :: scala.util.Random.shuffle(group3) :: scala.util.Random.shuffle(group2) :: group4Splited._1

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

    println(s"GROUP A ${pos._1} vs GROUP H ${pos._2}                                                                                                         GROUP E ${pos._1} vs GROUP G ${pos._2}")
    println("--------------------------                                                                                                         --------------------------")
    println("                         ---                                                                                                    ---")
    println("                            ---                                                                                              ---")
    println("                               ---   QUARTER FINAL                                                         QUARTER FINAL  ---")
    println("                            ---                   ---                                                  ---                   ---")
    println("                         ---                        ---                                              ---                        ---")
    println(s"GROUP G ${pos._1} vs GROUP E ${pos._2}                            ---                                         ---                              GROUP F ${pos._1} vs GROUP B ${pos._2}")
    println("--------------------------                              ---                                    ---                                 --------------------------")
    println("                                                           ---                              ---")
    println("                                                               SEMIFINAL -- FINAL -- SEMIFINAL")
    println(s"GROUP B ${pos._1} vs GROUP F ${pos._2}                                  ---                               ---                                  GROUP C ${pos._1} vs GROUP A ${pos._2}")
    println("--------------------------                              ---                                      ---                               --------------------------")
    println("                         ---                         ---                                            ---                         ---")
    println("                            ---                   ---                                                  ---                   ---")
    println("                               ---   QUARTER FINAL                                                         QUARTER FINAL  ---")
    println("                            ---                                                                                              ---")
    println("                         ---                                                                                                    ---")
    println(s"GROUP D ${pos._1} vs GROUP C ${pos._2}                                                                                                         GROUP H ${pos._1} vs GROUP D ${pos._2}")
    println("--------------------------                                                                                                          --------------------------")



  }

}
