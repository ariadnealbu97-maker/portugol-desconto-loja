# Sistema de desconto para clientes

Projeto em Portugol Studio criado para praticar lógica de programação com vetores, estruturas condicionais e repetição em um cenário de cálculo de descontos em loja.

## Problema
O objetivo deste exercício foi simular uma situação em que o usuário informa um valor de desconto do dia e os gastos de vários clientes, e o sistema calcula quem recebeu desconto e quanto a loja arrecadou ao final.

## Solução
Desenvolvi um programa que:
- recebe o valor do desconto do dia;
- lê o nome e o valor gasto de 6 clientes;
- verifica se cada cliente tem direito ao desconto;
- calcula o valor final de cada compra;
- soma o total recebido pela loja;
- informa quantos clientes receberam desconto.

## Lógica aplicada
O programa foi estruturado para praticar:
- entrada de dados com `leia`;
- saída de dados com `escreva`;
- uso de vetores para armazenar nomes e valores;
- repetição com `enquanto` e `para`;
- tomada de decisão com `se / senao`;
- acumulação de valores em variável somadora.

## Decisões técnicas
Escolhi usar vetores para organizar os dados dos clientes e um laço de repetição para processar cada registro de forma sequencial. A condição `se / senao` foi usada para aplicar a regra de desconto somente aos clientes com compras a partir de 100.

## Aprendizados
Com este projeto, pratiquei conceitos fundamentais de lógica de programação e consolidei meu entendimento sobre variáveis, vetores, laços e condicionais em Portugol.

## Tecnologias
- Portugol Studio
- Vetores
- Estruturas condicionais
- Estruturas de repetição

## Exemplo de uso

**Entrada:**
- Desconto do dia: 10
- Cliente 1: Ana — 120
- Cliente 2: Bruno — 80

**Saída:**
- Ana recebeu desconto.
- Bruno não recebeu desconto.
- Valor total recebido pela loja: ...

## Estrutura
```text
portugol-desconto-loja/
├── exercicio-2.por
└── README.md
```
