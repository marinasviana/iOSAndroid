$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculadora.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar as 4 operações matemática",
  "description": "",
  "id": "realizar-as-4-operações-matemática",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Efetuar operações matemáticas com sucesso",
  "description": "",
  "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@equilatero"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou com a calculadora aberta",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "quando informo os numeros \u003cnumero1\u003e e \u003cnumero2\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "escolhoa a operação \u003coperacao\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "devo ver o resultado igual a \u003cresultado\u003e",
  "keyword": "Então "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;",
  "rows": [
    {
      "cells": [
        "numero1",
        "numero2",
        "resultado",
        "operacao"
      ],
      "line": 12,
      "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;1"
    },
    {
      "cells": [
        "2",
        "2",
        "4",
        "\"soma\""
      ],
      "line": 13,
      "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;2"
    },
    {
      "cells": [
        "7",
        "2",
        "5",
        "\"subtração\""
      ],
      "line": 14,
      "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;3"
    },
    {
      "cells": [
        "2",
        "2",
        "4",
        "\"multiplicação\""
      ],
      "line": 15,
      "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;4"
    },
    {
      "cells": [
        "2",
        "2",
        "1",
        "\"divisão\""
      ],
      "line": 16,
      "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;5"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 13,
  "name": "Efetuar operações matemáticas com sucesso",
  "description": "",
  "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@equilatero"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou com a calculadora aberta",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "quando informo os numeros 2 e 2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "escolhoa a operação \"soma\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "devo ver o resultado igual a 4",
  "matchedColumns": [
    2
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CalculadoraSteps.que_estou_com_a_calculadora_aberta()"
});
formatter.result({
  "duration": 42661750788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    },
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "CalculadoraSteps.quando_informo_os_numeros_e(int,int)"
});
formatter.result({
  "duration": 5434651013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "soma",
      "offset": 21
    }
  ],
  "location": "CalculadoraSteps.escolhoa_a_operação(String)"
});
formatter.result({
  "duration": 1197930697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 29
    }
  ],
  "location": "CalculadoraSteps.devo_ver_o_resultado_igual_a(int)"
});
formatter.result({
  "duration": 130497180,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Efetuar operações matemáticas com sucesso",
  "description": "",
  "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@equilatero"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou com a calculadora aberta",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "quando informo os numeros 7 e 2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "escolhoa a operação \"subtração\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "devo ver o resultado igual a 5",
  "matchedColumns": [
    2
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CalculadoraSteps.que_estou_com_a_calculadora_aberta()"
});
formatter.result({
  "duration": 2330455,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 26
    },
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "CalculadoraSteps.quando_informo_os_numeros_e(int,int)"
});
formatter.result({
  "duration": 10028565414,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "subtração",
      "offset": 21
    }
  ],
  "location": "CalculadoraSteps.escolhoa_a_operação(String)"
});
formatter.result({
  "duration": 1192941400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 29
    }
  ],
  "location": "CalculadoraSteps.devo_ver_o_resultado_igual_a(int)"
});
formatter.result({
  "duration": 124480525,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Efetuar operações matemáticas com sucesso",
  "description": "",
  "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@equilatero"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou com a calculadora aberta",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "quando informo os numeros 2 e 2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "escolhoa a operação \"multiplicação\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "devo ver o resultado igual a 4",
  "matchedColumns": [
    2
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CalculadoraSteps.que_estou_com_a_calculadora_aberta()"
});
formatter.result({
  "duration": 1212799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    },
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "CalculadoraSteps.quando_informo_os_numeros_e(int,int)"
});
formatter.result({
  "duration": 10601823894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "multiplicação",
      "offset": 21
    }
  ],
  "location": "CalculadoraSteps.escolhoa_a_operação(String)"
});
formatter.result({
  "duration": 1197491245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 29
    }
  ],
  "location": "CalculadoraSteps.devo_ver_o_resultado_igual_a(int)"
});
formatter.result({
  "duration": 186045230,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Efetuar operações matemáticas com sucesso",
  "description": "",
  "id": "realizar-as-4-operações-matemática;efetuar-operações-matemáticas-com-sucesso;;5",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@equilatero"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou com a calculadora aberta",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "quando informo os numeros 2 e 2",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "escolhoa a operação \"divisão\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "devo ver o resultado igual a 1",
  "matchedColumns": [
    2
  ],
  "keyword": "Então "
});
formatter.match({
  "location": "CalculadoraSteps.que_estou_com_a_calculadora_aberta()"
});
formatter.result({
  "duration": 772708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    },
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "CalculadoraSteps.quando_informo_os_numeros_e(int,int)"
});
formatter.result({
  "duration": 10511579043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "divisão",
      "offset": 21
    }
  ],
  "location": "CalculadoraSteps.escolhoa_a_operação(String)"
});
formatter.result({
  "duration": 1290166791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "CalculadoraSteps.devo_ver_o_resultado_igual_a(int)"
});
formatter.result({
  "duration": 127875484,
  "status": "passed"
});
});