# JAVA
Este projeto visa desenvolver um Sistema de Gerenciamento de Biblioteca em Java. A aplicação permitirá o gerenciamento de coleções de livros, cadastro de usuários e controle de empréstimos e devoluções, automatizando tarefas administrativas e facilitando a operação diária da biblioteca.



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
