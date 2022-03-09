import kotlin.math.pow

class Calculo

fun forcaPeso (massa: Float, gravidade: Float): Float = massa * gravidade)


fun forcaCentripeta(dividendo: Float, divisor: Float, multiplicador: Float): Float {
    return (dividendo / divisor) * multiplicador
}

fun impulso(tempoFinal: Float, tempoInicial: Float, forca: Float): Float {
    return  (tempoFinal - tempoInicial) * forca
}

fun forcaElastica(corpo: Float, gravidade: Float, massa: Float): Float {
    return (corpo * gravidade / massa)
}

fun velocidadeMedia(posicaoF: Float, posicaoI: Float, tempoF: Float, tempoI: Float): Float {
    return (posicaoF - posicaoI) / (tempoF - tempoI)
}

fun mru(velocidade: Float, tempo: Float): Float {
    return (velocidade * tempo)
}

fun mruv(velocidade: Float, velocidadeInicial: Float, aceleracao: Float, tempo: Float): Float {
    return (velocidadeInicial + aceleracao) * tempo
}

