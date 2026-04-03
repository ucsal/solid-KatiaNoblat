# Refatoração do Sistema das Olimpíadas

## Objetivo
Este projeto foi refatorado com base nos princípios SOLID, mantendo a lógica de negócio original, sem remoção de funcionalidades e sem uso de frameworks externos.

## Principais mudanças realizadas
- Separação de responsabilidades em classes de serviço e repositório.
- Criação de interfaces para reduzir acoplamento.
- Injeção de dependências via construtor.
- Organização do código para facilitar manutenção e extensibilidade.
- Melhoria da legibilidade e estrutura das classes.

## Aplicação dos princípios SOLID

### SRP (Single Responsibility Principle)
- A classe `QuestaoService` foi refatorada para focar apenas nas regras de negócio.
- A persistência/manipulação de dados foi separada em repositórios específicos.

### OCP (Open/Closed Principle)
- O sistema foi reorganizado para permitir extensões por meio de interfaces, evitando alterações diretas em classes principais.

### LSP (Liskov Substitution Principle)
- As abstrações foram ajustadas para garantir substituição correta entre implementações sem quebrar o comportamento esperado.

### ISP (Interface Segregation Principle)
- Interfaces específicas foram criadas para evitar dependências desnecessárias.

### DIP (Dependency Inversion Principle)
- As classes de serviço passaram a depender de abstrações (interfaces) em vez de implementações concretas.
- As dependências foram injetadas via construtor.

## Restrições respeitadas
- Lógica de negócio original mantida.
- Nenhuma funcionalidade existente foi removida.
- Nenhum framework externo foi adicionado.

## Observações
A refatoração teve como foco principal melhorar a organização, manutenção e extensibilidade do sistema, preservando integralmente seu comportamento funcional.

