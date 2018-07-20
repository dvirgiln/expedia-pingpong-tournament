## INTRODUCCION

Repository that creates random groups for a tournament.

## RULES

* Group matches are played as the best of 5 sets to 11 points. 2 serves per player.
* Classificatory matches are played as the best of 5 to 21 points. 5 serves per player.
* There is no specific order when playing your games. You can arrange with the other players when to play.
* In case of tie within groups, it will count:
    * 2 players tie: Direct result between players.
    * 3 or more players tie: players with more direct games won.
        * In case there is a tie in direct numbers of games won -> Number of sets won - Number of sets lost.
        * In case there is a tie in the number of sets -> Total number of points made - Total number of points lost.

* If a player retire from the tournament, then the result of the games will be 11-5 11-5 11-5


### ProRound

    GROUP A 1st vs GROUP H 2nd                                                                                                         GROUP E 1st vs GROUP G 2nd
    --------------------------                                                                                                         --------------------------
                             ---                                                                                                    ---
                                ---                                                                                              ---
                                   ---   QUARTER FINAL                                                         QUARTER FINAL  ---
                                ---                   ---                                                  ---                   ---
                         ---                        ---                                              ---                        ---
    GROUP G 1st vs GROUP E 2nd                            ---                                         ---                              GROUP F 1st vs GROUP B 2nd
    --------------------------                              ---                                    ---                                 --------------------------
                                                               ---                              ---
                                                                   SEMIFINAL -- FINAL -- SEMIFINAL
    GROUP B 1st vs GROUP F 2nd                                  ---                               ---                                  GROUP C 1st vs GROUP A 2nd
    --------------------------                              ---                                      ---                               --------------------------
                             ---                         ---                                            ---                         ---
                                ---                   ---                                                  ---                   ---
                                   ---   QUARTER FINAL                                                         QUARTER FINAL  ---
                                ---                                                                                              ---
                             ---                                                                                                    ---
    GROUP D 1st vs GROUP C 2nd                                                                                                         GROUP H 1st vs GROUP D 2nd
    --------------------------                                                                                                          --------------------------

### Improvers Round

    GROUP A 3th vs GROUP H 4th                                                                                                         GROUP E 3th vs GROUP G 4th
    --------------------------                                                                                                         --------------------------
                             ---                                                                                                    ---
                                ---                                                                                              ---
                                   ---   QUARTER FINAL                                                         QUARTER FINAL  ---
                                ---                   ---                                                  ---                   ---
                             ---                        ---                                              ---                        ---
    GROUP G 3th vs GROUP E 4th                            ---                                         ---                              GROUP F 3th vs GROUP B 4th
    --------------------------                              ---                                    ---                                 --------------------------
                                                               ---                              ---
                                                                   SEMIFINAL -- FINAL -- SEMIFINAL
    GROUP B 3th vs GROUP F 4th                                  ---                               ---                                  GROUP C 3th vs GROUP A 4th
    --------------------------                              ---                                      ---                               --------------------------
                             ---                         ---                                            ---                         ---
                                ---                   ---                                                  ---                   ---
                                   ---   QUARTER FINAL                                                         QUARTER FINAL  ---
                                ---                                                                                              ---
                             ---                                                                                                    ---
    GROUP D 3th vs GROUP C 4th                                                                                                         GROUP H 3th vs GROUP D 4th
    --------------------------                                                                                                          --------------------------