// 1. Crie uma função chamada imprimir que recebe um argumento e simplesmente imprime ele na tela;

function imprimir(argumento){
  console.log(argumento)
}


/* 2. Lembra dos exercícios que propusemos na Aula 05 - Variáveis? Com base neles, faça o seguinte:
Crie uma função para cada algoritmo proposto lá, exceto o número 6;
Todas as funções devem retornar o valor final;
Procure dar nomes que façam sentido às funções. Ex.: a função para o item 4 poderia se chamar mediaAritmetica ou calcularMediaAritmetica;
Procure utilizar comentários para documentar cada método;
Na função da média aritmética, evite colocar todos os itens como argumentos do método, pois isso limitaria sua utilização a um número fixo de elementos. Tente implementar uma lógica para receber um array e calcular a média em cima dele, tornando a função mais reaproveitável em diferentes situações. */

// Verifica se os dois nome são iguais
function mesmoNome(nome1, nome2){
  return nome1 == nome2
}


// Verifica se é maior de idade
function maiorDeIdade(idade){
  return idade >=18
}


// Calcula valor do boleto com juros 10%
function valorComJuros(valorBoleto){
  return valorBoleto * 1.1
}


/ Calcula média aritmética dos itens 
function mediaAritmetica (itens){

  soma = 0

  for (index = 0; index < itens.length; index++){
    soma += (itens[index])
  }
  return soma / itens.length
}

// Calcula margem bruta de uma empresa
function margemBruta(receitaLiquidaDeVendas, custoDosProdutosVendidos){
  lucroBruto = receitaLiquidaDeVendas - custoDosProdutosVendidos
  return (lucroBruto / receitaLiquidaDeVendas) * 100
}

/* 3. Com as funções criadas, execute todo código abaixo e verifique se os resultados são os esperados (o resultado esperado de cada função está no comentário ao lado da chamada):
cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome(cwi, cwi))   // true
imprimir(mesmoNome(cwi, reset)) // false

imprimir("---")

imprimir(maiorDeIdade(30)) // true
imprimir(maiorDeIdade(18)) // true
imprimir(maiorDeIdade(5))  // false

imprimir("---")

imprimir(valorComJuros(100))   // 110
imprimir(valorComJuros(984.5)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...] */

