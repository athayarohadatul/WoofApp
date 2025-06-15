package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.luna, R.string.dog_name_1, 3, R.string.dog_description_1),
    Dog(R.drawable.jake, R.string.dog_name_2, 2, R.string.dog_description_2),
    Dog(R.drawable.lucy, R.string.dog_name_3, 1, R.string.dog_description_3),
    Dog(R.drawable.milo, R.string.dog_name_4, 2, R.string.dog_description_4),
    Dog(R.drawable.coco, R.string.dog_name_5, 5, R.string.dog_description_5),
    Dog(R.drawable.daisy, R.string.dog_name_6, 6, R.string.dog_description_6),
    Dog(R.drawable.rocky, R.string.dog_name_7, 4, R.string.dog_description_7),
    Dog(R.drawable.churro, R.string.dog_name_8, 3, R.string.dog_description_8),
    Dog(R.drawable.waffles, R.string.dog_name_9, 3, R.string.dog_description_9)
)
