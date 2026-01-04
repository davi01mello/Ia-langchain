# 🚗 Agente de Locadora com IA (Java + LangChain4j + Gemini)

Este projeto é um assistente virtual inteligente para uma locadora de veículos corporativa. Ele utiliza **IA Generativa** (Google Gemini) integrada ao **Java** para conversar com clientes, calcular cotações em tempo real e verificar disponibilidade de veículos.

O diferencial é o uso de **Function Calling** (Tools), permitindo que a IA decida quando deve executar códigos Java para buscar dados precisos em vez de alucinar respostas.

## 🚀 Tecnologias Utilizadas

* **Java 25** (Preview/LTS)
* **Spring Boot 3.5.6** (Web)
* **LangChain4j** (Orquestração de IA)
* **Google Gemini 2.5 Flash** (Modelo de LLM)
* **Bootstrap 5** (Interface Frontend)
* **Maven** (Gerenciador de dependências)

## 🧠 Funcionalidades da IA

1.  **Conversação Natural:** Entende intenções do usuário sobre locação de carros.
2.  **Cálculo de Preços (Tool):** Calcula valores baseados em tabelas de preços e seguros quando o usuário solicita cotação.
3.  **Verificação de Disponibilidade (Tool):** Simula consulta ao sistema para ver se há carros disponíveis na data solicitada (Lógica: SUVs sempre esgotados para demonstração).
4.  **Memória de Chat:** O agente recorda o contexto das últimas 10 mensagens.

## 🛠️ Como Rodar

### Pré-requisitos
* JDK 25 instalado.
* Uma API Key do Google AI Studio.

### Passo a Passo
1.  Clone o repositório.
2.  Configure sua chave API no arquivo `application.properties`:
    ```properties
    gemini.api-key= XXXXXXX
    ```
3.  Execute o projeto:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  Acesse `http://localhost:8080` no navegador.

---
*Projeto desenvolvido para fins de estudo sobre Agentes de IA com Java.*
