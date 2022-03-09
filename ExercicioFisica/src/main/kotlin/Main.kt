fun main(args: Array<String>) {


    val calculadora = Calculo()


    println(
        "Olá, Bem Vindo a Calculadora Inteligente!!!" +
                "Escolhe a função desejada:" +
                "1- Força Peso" +
                "2- Força Centrípeta" +
                "3- Impulso" +
                "4- Força Elástica" +
                "5- Velocidade Média" +
                "6- Movimento Retilíneo Uniformemente (MRU)" +
                "7- Movimento Retilíneo Uniformemente Variado (MRUV)"
    )

    val escolhaUsuario = readLine()!!.toInt()


    if (escolhaUsuario == 1) {
        println("Digite o valor da massa:")
        val massa: Float = readLine()!!.toFloat()
        println("Digite o valor da gravidade:")
        val gravidade: Float = readLine()!!.toFloat()
        val forcaPeso = calculadora.forcaPeso(massa,gravidade)
    } else if (escolhaUsuario == 2) {
        println("Digite o dividendo: ")
        val dividendo: Float = readLine()!!.toFloat()
        println("Digite o divisor:")
        val divisor: Float = readLine()!!.toFloat()
        println("Digite o multilpicador:")
        val multiplicador: Float = readLine()!!.toFloat()
    } else if (escolhaUsuario == 3) {
        println("Digite o tempo final:")
        val tempoFinal: Float = readLine()!!.toFloat()
        println("Digite o tempo inicial:")
        val tempoInicial: Float = readLine()!!.toFloat()
        println("Digite a força:")
        val forca: Float = readLine()!!.toFloat()
    } else if (escolhaUsuario == 4)
        println("Digite o valor do corpo:")
        val corpo: Float = readLine()!!.toFloat()
        println("Digite o valor da gravidade")
        val gravidade: Float = readLine()!!.toFloat()
        println("Digite o valor da massa:")
        val massa: Float = readLine()!!.toFloat()

}

//}
