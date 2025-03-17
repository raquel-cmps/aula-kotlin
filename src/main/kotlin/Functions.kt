class Functions {
    fun isOdd(n: Int): Boolean{
        return n%2 != 0
    }

    // #1 algoritmo que realize n iterações
    fun nIteracao(n: Int) {
        for (i in 0..<n){
            println(i)
        }
    }

    // #2 algoritmo que imprime apenas os ímpares
    fun imprimeImpares(n: Int) {
        for (i in 0..<n){
            if(isOdd(i)){
                println(i)
            }
        }
    }

    // #3 retorna soma caso ambos sejam pares, multiplicação do contrário
    fun somaOuMultiplica (x: Int, y: Int): Int{
        if (!isOdd(x) && !isOdd(y)){
            return (x + y)
        }
        return (x * y)
    }

    // #4 verifica o primeiro parâmetro e retorna uma operação
    fun verifParametro (x: Int, y: Int): Float{
        if(x > 999){ // caso seja uma milhar, faça a subtração dos dois valores.
            if (x > y){
                return (x - y).toFloat()
            }
            return (y - x).toFloat()
        }

        if (x > 99){ // caso seja uma centena, faça a divisão dos dois valores.
            if (x > y){
                return (x / y).toFloat()
            }
            return (y / x).toFloat()
        }

        if(x > 9){ // caso seja uma dezena, faça a soma dos dois valores.
            return (y + x).toFloat()
        }

        return (x * y).toFloat() // caso seja uma unidade, faça a multiplicação dos dois valores
    }
}