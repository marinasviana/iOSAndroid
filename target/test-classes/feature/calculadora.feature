#language: pt

Funcionalidade: Realizar as 4 operações matemática
  
  @equilatero  
  Esquema do Cenário: Efetuar operações matemáticas com sucesso
    Dado que estou com a calculadora aberta
    Quando quando informo os numeros <numero1> e <numero2> 
    E escolhoa a operação <operacao> 
    Então devo ver o resultado igual a <resultado>
    Exemplos:
            |numero1|numero2|resultado|operacao        |
            |2      |2      |4        |"soma"          |
            |7      |2      |5        |"subtração"     |
            |2      |2      |4        |"multiplicação" |
            |2      |2      |1        |"divisão"       |