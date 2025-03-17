class Roupa (
    private val nome: String,
    private var preco: Double,
    private val tipo: String,
    private var disconto: Double = 0.10) {

    fun imprimirDetalhes(){
        println("tipo: $tipo")
        println("nome: $nome")
        println("preco: $preco")
        if (tipo == "camiseta") {
            println("disconto: $disconto")
        }
        println("---------------------------")
    }

    fun discontoCamiseta(tipo: String){
        if (tipo == "camiseta"){
            preco *= (1 - disconto)
            println("Disconto aplicado")
            println("Novo valor: $preco")
        } else {
            println("Produto sem disconto!")
        }
    }
}

