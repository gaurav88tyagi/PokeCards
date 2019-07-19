package com.example.pokecards

import android.media.Image
import android.widget.ImageView
import kotlin.random.Random

data class Card(
    val image: Int,
    val name: String,
    val hp: String
)

val cardName = arrayOf(
    Pair(R.drawable.abra, "ABRA"),
    Pair(R.drawable.bellsprout, "BELLSPROUT"),
    Pair(R.drawable.bullbasaur, "BULLBASAUR"),
    Pair(R.drawable.caterpie, "CATERPIE"),
    Pair(R.drawable.charmander, "CHARMANDER"),
    Pair(R.drawable.dratini, "DRATINI"),
    Pair(R.drawable.eevee, "EEVEE"),
    Pair(R.drawable.jigglypuff, "JIGGLYPUFF"),
    Pair(R.drawable.mankey, "MANKEY"),
    Pair(R.drawable.meowth, "MEOWTH"),
    Pair(R.drawable.mew, "MEW"),
    Pair(R.drawable.pidgey, "PIDGEY"),
    Pair(R.drawable.pikachu, "PIKACHU"),
    Pair(R.drawable.psyduck, "PSYDUCK"),
    Pair(R.drawable.rattata, "RATTATA"),
    Pair(R.drawable.snorlax, "SNORLAX"),
    Pair(R.drawable.squirtle, "SQUIRTLE"),
    Pair(R.drawable.venonat, "VENONATE"),
    Pair(R.drawable.weedle, "WEEDLE"),
    Pair(R.drawable.zubat, "ZUBAT")
)

fun genNRandomCards(n: Int): ArrayList<Card> {
    val cards = ArrayList<Card>()

    for(i in 1..n)
    {
        var x = Random.nextInt(cardName.size)
        cards.add(Card(
            cardName[x].first,
            cardName[x].second,
            "${Random.nextInt(10,100)} HP"
        ))
    }

    return cards

}