fun main() {
    // Raquel Campos Silva

    val exercicios = Functions()

    println("====================================")
    println("==== Operações simples #1 -> #4 ====")
    println("====================================")

    println()

    // #1
    println("#1 Print do índice de n iterações")
    exercicios.nIteracao(14)
    println("---------------------------")
    // #2
    println("#2 Print do índice dos valores ímpares de n iterações")
    exercicios.imprimeImpares(7)
    println("---------------------------")
    // #3
    println("#3 Soma se ambos pares, multiplicação para o contrário")
    println("SOMA")
    println(exercicios.somaOuMultiplica(14, 12))
    println("-----")
    println("MULTIPLICAÇÃO")
    println(exercicios.somaOuMultiplica(11, 14))
    println("---------------------------")
    // #4
    println("#4 Operações com dois números")
    println("MILHAR")
    println(exercicios.verifParametro(1400, 200))
    println("-----")
    println("CENTENA")
    println(exercicios.verifParametro(140, 200))
    println("-----")
    println("DEZENA")
    println(exercicios.verifParametro(50, 200))
    println("-----")
    println("UNIDADE")
    println(exercicios.verifParametro(8, 200))
    println("---------------------------")

    println()

    println("=====================================================")
    println("==== Operações com relação ao contexto: Roupas ====")
    println("=====================================================")

    println()

    val roupas = listOf(
        Roupa("Camiseta do Mickey", 100.0, "camiseta"),
        Roupa("Shorts Jeans", 100.99, "shorts"),
        Roupa("Calça Cargo", 250.0, "calca"),
    )

    println("#5 Aplicando desconto na camiseta")
    roupas[0].discontoCamiseta("camiseta")
    println("---------------------------")

    println("#6 Imprimindo roupas")
    println("==== CATÁLOGO DE ROUPAS ====")
    for (book in roupas) {
        book.imprimirDetalhes()
    }
}