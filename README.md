# JAVA
Este projeto visa desenvolver um Sistema de Gerenciamento de Biblioteca em Java. A aplicação permitirá o gerenciamento de coleções de livros, cadastro de usuários e controle de empréstimos e devoluções, automatizando tarefas administrativas e facilitando a operação diária da biblioteca.

<<<<<<< HEAD
## JAVA INTRODUCTION 

## PRIMEIRO PROJETO

## Projeto ScreenMatch
Concluí o desenvolvimento do projeto ScreenMatch, onde apliquei os conceitos fundamentais da Orientação a Objetos: abstração, herança, encapsulamento e polimorfismo. Neste projeto, modeleu uma série de classes para gerenciar informações e comportamentos relacionados a um sistema de recomendação de filmes e séries.

## O que foi feito:
Abstração: Criei classes com atributos e métodos específicos para representar diferentes entidades e comportamentos do sistema.

Encapsulamento: Utilizei o encapsulamento para proteger os dados, tornando atributos privados e fornecendo métodos públicos para manipulá-los de maneira controlada.

Herança: Organizei o código em uma hierarquia de classes, utilizando herança para reaproveitar e estender funcionalidades. Isso facilitou a criação de subclasses com comportamentos específicos, baseados em uma classe genérica.

Polimorfismo: Implementei polimorfismo para garantir que métodos da superclasse se comportassem de acordo com a subclasse instanciada. Isso permitiu uma maior flexibilidade e reutilização de código.

Interfaces: Criei e utilizei interfaces para definir contratos que as classes deveriam implementar, promovendo a modularidade e a intercambialidade entre diferentes componentes do sistema.

### Detalhes do Projeto:
Classes e Pacotes: Estruturei o código em pacotes e classes, assegurando uma organização clara e modular.

Reutilização e Extensão: Aproveitei a herança para reutilizar código e sobrescrevi métodos conforme as necessidades específicas das subclasses.

Aplicação Final: Desenvolvi uma nova aplicação como desafio, aplicando os conceitos aprendidos para criar uma solução prática e funcional.
=======



# Aplicação de Áudio

Este projeto modela uma aplicação de áudio com uma superclasse "Áudio" e subclasses "Música" e "Podcast". A aplicação permite gerenciar atributos como título, duração, número de reproduções, curtidas e classificação. Também implementa métodos para interagir com esses atributos de forma encapsulada.

## Estrutura de Classes

### Classe: `Audio`

A classe base `Audio` possui os seguintes atributos e métodos:

#### Atributos

- **Título**: `titulo`
- **Duração**: `duracao` (em segundos)
- **Total de Reproduções**: `total_reproducoes`
- **Curtidas**: `curtidas`
- **Classificação**: `classificacao` (de 0 a 5)

#### Métodos

- `curtir()`: Incrementa o número de curtidas.
- `reproduzir()`: Incrementa o número de reproduções.
- `avaliar(nota)`: Define ou atualiza a classificação com uma nota de 0 a 5.

### Classe: `Musica`

Herda de `Audio` e adiciona:

- **Artista**: `artista`
- **Álbum**: `album`

### Classe: `Podcast`

Herda de `Audio` e adiciona:

- **Host**: `host`
- **Episódio**: `episodio`
