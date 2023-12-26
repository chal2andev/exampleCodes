fun main() {
    val a = Player()
    val b = Player()

    a.login = IsLogin.TRUE

    a.loginMessage()
    b.loginMessage()

}

enum class IsLogin{
    TRUE,
    FALSE
}

class Player{
    var login = IsLogin.FALSE
    private fun isLogin(): Boolean{
        return when(login){
            IsLogin.TRUE -> true
            IsLogin.FALSE -> false
        }
    }
    fun loginMessage(){
        when(isLogin()){
            true -> println("로그인 상태입니다.")
            false -> println("로그인하지 않았습니다. 로그인을 먼저 해주세요.")
        }
    }
}
