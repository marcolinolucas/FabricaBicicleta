# Trabalho de POO - Teste e Entrega

##### Link do repositório: https://github.com/marcolinolucas/FabricaBicicleta

###### Ficamos responsáveis pela parte de Teste e Entrega então tentamos abstrair o máximo dos outros grupos, incluindo a implementação mais avançada e correta. Logo, para o funcionamento completo do nosso código, tivemos que implementar algumas outras classes.

**Cliente**: Basicamente se refere ao cliente, com seus atributos e getters and setters. Adicionamos também o "toString" para melhor apresentação no console.

**Funcionário**: Utilizamos o conceito de herança aqui, logo precisávamos ter somente nessa classe os atributos comuns e seus getters and setters.

**Engenheiro, Gerente, Técnico**: Herdam a classe funcionário com seus atributos e "toString" específico.

**Rh**: Faz o controle dos funcionários na empresa. Alocando quando há algum projeto e liberando após a sua produção.

**ItensPedido**: Guarda as especificações da(s) bicicleta(s) do cliente. E possui também um atributo de verificação de qualidade de teste das mesmas.

**Pedido**: É a classe construtora de quase tudo, ela recebe um cliente, que por sua vez chama a classe cliente, onde é atribuída os dados dele. Chama a itensPedido, onde entram as especificações da bicicleta e possui o seu financeiro também.

**Projeto**: Recebe um pedido e a partir dele, consegue definir a quantidade de funcionários (Engenheiros, Técnicos e Gerentes) para pedir ao RH que fossem solicitados e chama a classe produção, após a produção e caso tudo ocorra bem, ela libera os funcionários que foram alocados para aquele projeto.

**Produção**: Foi abstraída a ideia de controle de estoque e de materiais, mas a ideia seria que essa classe, construiria o projeto que foi elaborado.

**TestePedido**: Após a produção dos produtos precisamos testar a funcionalidade dos mesmos. Para isso criamos algumas funções que retornam sempre true ou false e caso todas retornem “true”, podemos afirmar que aquele produto passou nos testes e está pronto para ir ao setor financeiro.

**Financeiro**: Após o teste do produto e ele ter passado, precisamos enviar para o financeiro para que o mesmo verifique se houve pagamento ou não, caso exista ele emite a nota fiscal e também chama a classe entrega.
Entrega: Após o pagamento podemos chamar a classe entrega que finalmente irá entregar o produto no lugar informado no início da venda.

**EntregaTrabalhoPraticoBicileta**: Nossa main.
