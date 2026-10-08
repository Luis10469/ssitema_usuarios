enum class Rol {ADMIN, Editor, Visitante} 

data class Usuario (
    var id : Int,
    var nombre : String,
    var rol  : Rol, 
)

fun main(){
    var Usuario1=Usuario (1,"brayan", Rol.ADMIN)
    var Usuario2=Usuario (2,"pepe", Rol.Editor)
    var Usuario3=Usuario (3,"juan", Rol.Visitante)


var Usuariosr = mutableListOf(Usuario1, Usuario2, Usuario3)

println("usuarios registrados")

for (usuario in Usuariosr ){
	println("Nombre: ${usuario.nombre}")
	println("Id : ${usuario.id }")
	println("Rol: ${usuario.rol}")
}
} 