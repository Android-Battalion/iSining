package com.xanthenite.isining.view.state

data class LoginState(
        val isLoading: Boolean = false,
        val isLoggedIn: Boolean = false,
        val error: String? = null,
        val email: String = "",
        val password: String = ""
) : State
