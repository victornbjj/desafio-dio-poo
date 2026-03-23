# 🚀 Desafio DIO — Programação Orientada a Objetos com Java

Projeto desenvolvido como parte do desafio de **POO (Programação Orientada a Objetos)** da [Digital Innovation One (DIO)](https://www.dio.me/).

## 📋 Sobre o Projeto

Modelagem e implementação de um sistema de **Bootcamp** utilizando os pilares da POO em Java: abstração, encapsulamento, herança e polimorfismo.

O sistema simula um bootcamp com cursos e mentorias, onde devs podem se inscrever, progredir nos conteúdos e acumular XP.

## 🗂️ Estrutura do Projeto

```
src/
├── Main.java
└── br/com/dio/desafio/domain/
    ├── Conteudo.java       # Classe abstrata base
    ├── Curso.java          # Herda de Conteudo
    ├── Mentoria.java       # Herda de Conteudo
    ├── Bootcamp.java       # Agrega Conteudos e Devs
    └── Dev.java            # Representa um desenvolvedor inscrito
```

## 🧠 Conceitos Aplicados

- **Abstração** — classe abstrata `Conteudo` com método `calcularXp()`
- **Encapsulamento** — atributos privados com getters/setters
- **Herança** — `Curso` e `Mentoria` estendem `Conteudo`
- **Polimorfismo** — cada subclasse implementa `calcularXp()` de forma diferente

## ▶️ Como Executar

### Pré-requisitos

- Java 11+
- IntelliJ IDEA (ou outra IDE Java)

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/desafio-dio-poo.git

# Abra o projeto na sua IDE e execute a classe Main
```

## 🛠️ Tecnologias

- Java 11+
- IntelliJ IDEA

## 📄 Licença

Este projeto está sob a licença MIT.
