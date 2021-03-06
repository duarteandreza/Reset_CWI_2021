/* O IMC significa Índice de Massa Corpórea e é um indicador utilizado pela OMS (Organização Mundial da Saúde) como referência para saber a saúde de uma pessoa com base no seu peso e altura.

O cálculo do IMC é feito pela divisão do peso de alguém pela sua altura ao quadrado. Os valores de referência do índice são:

IMC	Classificação	Grau de Obesidade
Menor do que 18,50	Magreza	0
Entre 18,50 e 24,99	Normal	0
Entre 25,00 e 29,99	Sobrepeso	1
Entre 30,00 e 39,99	Obesidade	2
Maior ou igual a 40,00	Obesidade grave	3
Faça um algoritmo que efetue o cálculo do IMC, com base nas variáveis peso e altura.

Exiba o valor do IMC e a classificação obtida. Se houver algum grau de obesidade, exiba também a mensagem: Cuidado! Você está acima do peso recomendado pela OMS.

Se o grau de obesidade for 3, adicione também a seguinte mensagem: É importante procurar um médico para avaliar sua saúde.*/

peso = 45
altura = 1.67
classificacao = ""
grauObesidade = ""

imc = (peso / altura **2).toFixed(2)

if (imc < 18.5){
  classificacao = "Magreza"
  grauObesidade = "0"
} else if (imc < 25) {
  classificacao = "Normal"
  grauObesidade = 0
} else if (imc < 30) {
  classificacao = "Sobrepeso"
  grauObesidade = "1"
} else if (imc < 40) {
  classificacao = "Obesidade"
  grauObesidade = "2"
} else {
  classificacao = "Obesidade grave"
  grauObesidade = "3"
}

console.log("Seu IMC é: " + imc + " (" + classificacao + ").")
if (grauObesidade > 0) {
  console.log("Cuidado você está acima do peso recomendado pela OMS.")
} if (grauObesidade == 3) {
  console.log("É importante procurar um médico para avaliar sua saúde.")
}
