# Parte teórica da prova

## O que é orientação a objetos e quais são seus princípios fundamentais?
Um dos paradigmas da programação, onde se utilizam objetos, atributos e funções para chegar-se a um resultado. Podendo ser um objeto genérico, para ser utilizado em diversas ocasiões, como por exemplo, um objeto de botão, que liga e desliga, tendo com característica o texto em cima, esse pode ser usado em várias ocasiões.
Como Princípios, temos: **Encapsulamento, Herança, Polimorfismo e Abstração.**

## Quais são as vantagens da orientação a objetos em comparação com paradigmas de programação procedural?
Eu diria que como vantagens, temos a **flexibilidade e dinamicidade**. Pois podemos fazer classes e instâncias da mesma na medida da necessidade e **reutilizar** o código ao invés de sempre fazer a mesma coisa do zero. Por conta do polimorfismo podemos até mesmo utilizar métodos de outras classes apenas estendendo seu escopo. A manutenção fica mais fácil por ser tudo feito em "blocos", fica mais organizado e entendível. 

## Explique o conceito de encapsulamento e como ele é implementado em linguagens de programação orientadas a objetos.
Ao que eu entendi, o encapsulamento permite que apenas os objetos da mesma classe os acessem, assim para mudar seus valores em instâncias, utilizamos o **setter e getter**, que basicamente são funções que "setam" e "pegam" os valores dos objetos da classe em questão. Ele permite uma maior **segurança e modularidade**.

## Explique o conceito de classe e objeto em programação orientada a objetos, e como eles estão relacionados.
Sempre que você tiver uma classe, ela terá objetos. São duas coisas estritamente ligadas como por exemplo: Temos uma **Classe chamada Carro**, ela tem alguns atributos, como **marca, cor e ano**, tem também algumas funções como **acelerar e frear**. Então no arquivo main, usamos o **new** para instanciar essa Classe, assim criando um **Objeto com o nome de meuCarro por exemplo. Logo, meuCarro é um objeto da minha Classe Carro**.

## Qual é a importância dos construtores e métodos em uma classe em programação orientada a objetos?

**Construtores:** O java por padrão, cria um **construtor Default** quando instanciámos uma Classe, porém ele não nos fornece a capacidade de usar os atributos dessa Classe, por isso precisamos fazer um construtor que nos permite acessar os atributos de forma direta (utilizando o **this.atributo**). Logo os construtores (de forma rasa) são importantes para que as classes sejam **modulares, flexíveis e principalmente, úteis.**
**Métodos:** Os métodos ou funções, são basicamente as **ações que a nossa classe pode executar**, como numa Classe de Humano, as funções seriam infinitas, mas como algo básico eu posso citar: Andar, Correr, Sentar, Falar...

## Quais são as diferenças entre métodos estáticos e métodos de instância em uma classe?
Em resumo, os métodos de instância, são funções que **necessitam da Classe em questão, instanciada**, para que sejam usados. Já um método estático, ele **independe da classe instanciada, você pode apenas chamar a função** em questão, utilizando o nome da Classe.

## Como são tratados os conceitos de acoplamento e coesão na orientação a objetos e por que são importantes?
São conceitos que falam especificamente sobre a qualidade da arquitetura de um software (um pouco de google e ChatGPT, foi isso que eu aprendi). Influenciam diretamente na manutenção, reusabilidade e capacidade de testar o software. **Coesão** é basicamente o significado da palavra por si só., quanto mais coesa uma unidade, mais ela concentra-se em realizar uma tarefa ou um conjunto de tarefas relacionadas, o que a torna mais compreensível e mais fácil de manter. **Acoplamento** descreve como os módulos (classes, funções, etc.) dependem uns dos outros. Quanto menor o acoplamento, menos dependente um módulo é de outros módulos.
Basicamente se for pegar o significado das palavras e atribuir ao contexto de programação, é o que significam, portanto, são de extrema importância para um software bem construido e coeso (pego o trocadilho).

## Qual é o objetivo do método main ?
Sendo sincero eu não sei como responder isso de forma "bonitinha", é basicamente o método que permite a **execução do programa,** simplesmente.

## Como ocorre a passagem de parâmetros em métodos de uma classe em programação orientada a objetos?
Normalmente se faz por meio do construtor, mas aí depende aonde você tá querendo passar os parâmetros. Vamos supor que é quando a classe já está instanciada mas ela não roda por que faltam os parâmetros. Se no construtor tava algo como Pessoa(String nome, int idade), quando instanciar vai ter q ser minhaPessoa("Junin", 21), basicamente você está passando valores para parâmetros que já foram criados antes em um método construtor, utilizando o .this.

## Qual é a diferença entre os modificadores de acesso "public", "private" e "protected" em uma classe?
Por serem modificares de acessos, como o nome diz, vai modificar como e quem pode os acessar (dependendo até quando).
**public:** são públicos, acabou - não brincadeira - basicamente significa que os métodos, atributos e afins public, **podem ser acessados de qualquer outro pacote ou classe.**
**private:** significa que os métodos, atributos e afins, são acessados apenas dentro da própria classe.
**protected:** é um meio termo do public e do private, significa que seus métodos, atributos e afins, podem ser acessados pela mesma classe, pacotes e subclasses, ainda assim, sendo mais restritivo que o public.

## Qual é a importância da palavra-chave "this" em programação orientada a objetos e como ela é utilizada?
Existem explicações complexas e tal, mas o que eu entendi foi: ela permite que você referencie a instância um atributo, como por exemplo, se ao instanciar uma classe onde o construtor não tem o this.atributo, quando tentamos acessar seu valor, ele vai retornar Null, porém ao usarmos this e permitir que esse atributo seja  referenciado na instância no objeto, assim ele consegue acessar o valor do atributo.

# Fim da parte teórica da revisão 🫡
