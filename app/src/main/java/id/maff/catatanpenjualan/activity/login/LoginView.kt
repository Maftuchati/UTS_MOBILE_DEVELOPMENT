package id.maff.catatanpenjualan.activity.login

import id.maff.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}