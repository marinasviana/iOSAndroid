# iOSAndroid

================================================================================
## Run

Run the tests with maven sending plataform name by parameter

mvn -Denv.PLATAFORM=Android -Dtest=Runer test

Or

If you want to run in the eclipse

 -> Right-click on the project name

 -> constructing Maven ...

 -> put in the field Goals: -Denv.PLATAFORM=Android -Dtest=Test Runer

 -> and click the 'Apply' button, then click the 'Run'

- If you want to run in iOS device 

put in the field Goals: -Denv.PLATAFORM=Ios -Dtest=Test Runer 
=================================================================================

## Sobre o projeto

Este projeto é modularizado com o Maven, todas as suas dependências estão no pom.xml,
O objetivo desse projeto foi criar um teste automatizado utilizando: CUCUMBER e APPIUM em JAVA que fosse Cross-plataforma (rodando em iOS e no Android)

==================================================================================
## Pré-requisitos

Antes de Rodar o projeto é necessário ter o server do appium rodando alem de obter os Simulator dos devices para android e iOS  
Segue algumas referencias para obter isso:

Appium

https://www.concrete.com.br/2017/12/06/15565/

Simulador para o Android

Antes de rodar os teste para android é necessário que o simulado esteja rodando

https://eliasnogueira.github.io/appium-workshop/

Simulador para iOS 

(para usar o  simulator basta segui apenas os passo para rodar o simulado do link seguir)

https://medium.com/automa%C3%A7%C3%A3o-com-batista/executando-seus-testes-automatizados-com-appium-em-um-device-real-com-android-e-ios-parte-2-3e7fb02dad13

