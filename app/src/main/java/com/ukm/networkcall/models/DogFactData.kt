package com.ukm.networkcall.models

import com.google.gson.annotations.SerializedName

data class DogFactData(

	@field:SerializedName("success")
	val success: Boolean? = null,

	@field:SerializedName("facts")
	val facts: List<String?>? = null
)
