package com.example.thirtydays

import androidx.annotation.DrawableRes

data class Day(
    val dayNumber: Int,
    val fromPage: Int,
    val toPage: Int,
    val isReview: Boolean,
    @DrawableRes val imageRes: Int
)

object DaysRepository {

    private val images = listOf(
        R.drawable.day1, R.drawable.day2, R.drawable.day3, R.drawable.day4,
        R.drawable.day5, R.drawable.day6, R.drawable.day7, R.drawable.day8,
        R.drawable.day9, R.drawable.day10, R.drawable.day11, R.drawable.day12,
        R.drawable.day13, R.drawable.day14, R.drawable.day15, R.drawable.day16,
        R.drawable.day17, R.drawable.day18, R.drawable.day19, R.drawable.day20,
        R.drawable.day21, R.drawable.day22, R.drawable.day23, R.drawable.day24,
        R.drawable.day25, R.drawable.day26, R.drawable.day27, R.drawable.day28,
        R.drawable.day29, R.drawable.day30
    )

    val days: List<Day> = (1..30).map { d ->
        // Triple(awel sfa7a, akher sfa7a, mouraja3a?)
        val (from, to, review) = when (d) {
            in 1..8 -> Triple(2 * d, 2 * d + 1, false)
            in 9..10 -> Triple(2, 17, true)
            in 11..18 -> Triple(2 * d - 4, 2 * d - 3, false)
            in 19..20 -> Triple(18, 33, true)
            in 21..28 -> Triple(2 * d - 8, 2 * d - 7, false)
            else -> Triple(2, 49, true)
        }
        Day(
            dayNumber = d,
            fromPage = from,
            toPage = to,
            isReview = review,
            imageRes = images[d - 1]
        )
    }
}