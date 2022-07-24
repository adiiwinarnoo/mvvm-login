package com.example.loginmvvm.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(

	@field:SerializedName("dataLogin")
	val dataLogin: DataLogin? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class DataLogin(

	@field:SerializedName("level_id")
	val levelId: Int? = null,

	@field:SerializedName("toko")
	val toko: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("deleted_at")
	val deletedAt: Any? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null,

	@field:SerializedName("status_label")
	val statusLabel: String? = null,

	@field:SerializedName("foto_user")
	val fotoUser: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("device_token")
	val deviceToken: Any? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("no_telepon")
	val noTelepon: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)
