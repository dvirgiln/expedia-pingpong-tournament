package com.david

object DrawApp extends App {
  val favourites = scala.io.Source.fromFile("src/main/resources/groupFavourites.txt").getLines().toList
  val group2 = scala.io.Source.fromFile("src/main/resources/secondGroup.txt").getLines().toList
  val group3 = scala.io.Source.fromFile("src/main/resources/thirthGroup.txt").getLines().toList
  val group3Full= (1 to (group3.length % 8)).foldLeft(List[String]())((acum, _) => "" :: acum) ::: group3

  val group3Shuffled= scala.util.Random.shuffle(group3Full)
  val group3Splited=(1 to group3Shuffled.length/8).foldLeft((List[List[String]](),group3Shuffled)){case ((result, rest), _) => (rest.take(8) :: result, rest.drop(8))}

  val allGroups= scala.util.Random.shuffle(favourites) :: scala.util.Random.shuffle(group2) :: group3Splited._1

  val results = allGroups.map(g => g.zipWithIndex).flatten.groupBy(_._2).map(_._2).toList.map(l => l.map(_._1).filter(!_.isEmpty))
  results.zipWithIndex.foreach{ case (group, i) =>
    println(s"GROUP ${i+1}")
    println("_______________")
    println(s"\t${group.mkString("\n\t")}")
  }

}
