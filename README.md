# ☕ Imersão Prática com Collections em Java

Este repositório foi criado para documentar e organizar meus códigos de estudo, exercícios e desafios práticos focados na **Collections API** do Java. 
O objetivo principal é dominar a manipulação eficiente de dados em memória, compreendendo quando e como utilizar cada tipo de coleção com base na necessidade de performance, ordenação e chaves duplicadas.

## 📚 Conceitos e Aplicações Práticas

| Tópico | Abordagem Teórica | Implementação Prática |
| :--- | :--- | :--- |
| **1. ArrayList** | Armazenamento dinâmico e indexado em memória. | Inserção, iteração ordenada e busca eficiente via índices. |
| **2. Map & Wrappers** | Estruturas baseadas em Chave-Valor (`Key-Value`). | Associações únicas utilizando classes Wrappers (`Integer`, `Double`, etc.) para tipagem segura. |
| **3. Strings & Buffers** | Mutabilidade vs. Imutabilidade em memória Heap. | Comparação de performance entre `String`, `StringBuilder` e `StringBuffer` (Thread-Safe). |

---

## 🚀 Como Executar o Projeto

> ✨ **Pré-requisito:** Necessário ter o **JDK 17** ou superior instalado.

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/gabrielctnn/ExerciciosCollectionsJava.git](https://github.com/gabrielctnn/ExerciciosCollectionsJava.git)

## 🛠️ Estrutura do Repositorio

O projeto está dividido em pacotes baseados nas três principais interfaces da Collections API. Cada interface possui subpacotes focados em operações básicas, pesquisa e ordenação:

```text
src/
├── Ex_Array_List/                        # Exercícios práticos utilizando a estrutura java.util.ArrayList
├── Ex_Map_Wrappers/                      # Prática com estruturas de Chave-Valor (Map) utilizando classes Wrappers
└── Ex_Strings_StringBuffer_StringBuilder # Estudos focados em performance e mutabilidade na manipulação de textos
