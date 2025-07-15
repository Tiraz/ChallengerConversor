# 💱 Conversor de Moedas

Este projeto é um **Conversor de Moedas em Java**, desenvolvido como parte do **Challenge do Programa ONE (Oracle Next Education) + Alura**. Ele utiliza uma API de câmbio para buscar valores atualizados de moedas e permite ao usuário converter valores entre diferentes moedas de forma interativa via terminal.

## 🚀 Funcionalidades

- Conversão entre várias moedas com base em dados atualizados:
  - Dólar (USD) ↔ Real (BRL)
  - Dólar (USD) → Euro (EUR)
  - Peso Argentino (ARS) ↔ Real (BRL)
  - Peso Argentino (ARS) → Dólar (USD)
  - Real (BRL) → Iene Japonês (JPY)
  - Euro (EUR) ↔ Peso Argentino (ARS)
  - Euro (EUR) ↔ Iene Japonês (JPY)

- Interface via terminal com menu interativo
- Entrada de valor customizada
- Validação de entrada e mensagens de erro amigáveis
- Encerramento seguro do programa

## 🛠️ Tecnologias e Ferramentas

- **Java** (versão 17 ou superior recomendada)
- **API de câmbio**: [ExchangeRate API](https://www.exchangerate-api.com/)  
  Exemplo de endpoint utilizado:
  ```
  https://v6.exchangerate-api.com/v6/SEU_TOKEN_AQUI/latest/USD
  ```
- **IDE recomendada**: IntelliJ IDEA ou Eclipse

## 📦 Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd conversor-moedas
   ```

3. Adicione sua chave da API ExchangeRate no código (`Conversor.java` ou onde necessário).

4. Compile e execute o projeto:
   ```bash
   javac br/com/desafio/conversor/principal/Principal.java
   java br.com.desafio.conversor.principal.Principal
   ```

## 🧠 Aprendizados

Durante o desenvolvimento deste projeto, foram trabalhados conceitos como:

- Manipulação de API REST com Java
- Leitura de dados JSON (utilizando bibliotecas como `Gson` ou similares)
- Estruturação de código orientado a objetos
- Manipulação de exceções (try-catch)
- Lógica de menus e entrada do usuário via terminal

## 📌 Desafios Superados

- Entendimento e integração com APIs externas
- Conversão de moedas com base em múltiplas combinações
- Criação de uma interface amigável para o usuário, mesmo em terminal
- Validação de entradas e tratamento de erros de forma elegante

## 📚 Créditos

Projeto desenvolvido como parte do curso:

**ONE - Oracle Next Education**  
Parceria: [Alura](https://www.alura.com.br/) + [Oracle](https://www.oracle.com/br/education/)

## 📝 Licença

Este projeto é de uso educacional e está aberto para melhorias.  
Sinta-se à vontade para usar e contribuir!
