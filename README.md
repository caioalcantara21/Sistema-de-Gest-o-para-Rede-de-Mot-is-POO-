### **Documentação do Sistema de Gestão para Rede de Motéis**

| Nome | Matrícula |
| :--- | :--- |
| Caio Cézar Alcântara | 01841899 |
| Cláudio Lísias | 01667062 |
| Leonardo Rodrigues | 01731489 |
| Lucas Noberto Tavares | 01852874 |
| Julliano Cesar Maciel Evangelista Silva | 01838684 |
| José Gustavo Santana da Silva | 01847511 |
| Victor Moises | 01667062 |

---

Este documento descreve as classes e suas interações no sistema de gestão de uma rede de motéis, conforme o diagrama de classes fornecido. O sistema é estruturado para gerenciar reservas, quartos, clientes e serviços, garantindo um fluxo operacional eficiente.

---

### **1. 🏨 Classes**

#### **1.1. Quarto**

Esta classe representa um quarto individual dentro do motel.

* **Atributos:**
    * `valor_diaria`: O custo por diária do quarto.
    * `tipo_quarto`: O tipo de quarto (ex: suíte, luxo, padrão).
    * `capacidade`: O número máximo de hóspedes que o quarto pode acomodar.
* **Operações:**
    * `hospedar_cliente`: Inicia a hospedagem de um cliente neste quarto.

#### **1.2. Reserva**

Esta classe gerencia as reservas feitas pelos clientes.

* **Atributos:**
    * `data_entrada`: A data de check-in da reserva.
    * `data_saida`: A data de check-out da reserva.
    * `total_estadia`: O custo total da estadia, calculado com base na duração e no valor da diária.
* **Operações:**
    * `reservar_suite`: Realiza uma nova reserva para um quarto (suíte).
    * `verificar_disponibilidade`: Consulta se um quarto está disponível para as datas solicitadas.
    * `controle_reservas`: Gerencia e atualiza o estado de todas as reservas.

#### **1.3. Motel**

Esta classe centraliza as operações gerais da rede de motéis.

* **Atributos:**
    * `disponibilidade`: O estado geral de ocupação dos quartos no motel.
    * `funcionarios`: O número de funcionários disponíveis para o turno.
* **Operações:**
    * `recepcionar`: Realiza o processo de check-in e check-out de clientes.
    * `alocar_quartos`: Atribui um quarto disponível a uma nova reserva.
    * `higienizacao`: Gerencia a limpeza e preparação dos quartos após o check-out.

#### **1.4. Usuário**

Esta classe representa os clientes que utilizam os serviços do motel.

* **Atributos:**
    * `cadastro`: O número de identificação ou registro do cliente.
    * `forma_pagamento`: O método de pagamento preferido do cliente.
    * `historico_estadia`: Um registro das estadias anteriores do cliente.
* **Operações:**
    * `cadastrar_hospede`: Adiciona um novo cliente ao sistema.
    * `deletar_hospede`: Remove um cliente do sistema.
    * `buscar_hospede`: Pesquisa por um cliente já cadastrado.

#### **1.5. Serviço**

Esta classe descreve os serviços adicionais oferecidos aos hóspedes.

* **Atributos:**
    * `refeicao`: O tipo de refeição solicitada (ex: café da manhã, jantar).
    * `acessorios_adicionais`: Itens extras solicitados (ex: toalhas, bebidas, etc.).
    * `pernoite`: O tipo de estadia noturna.
* **Operações:**
    * `registrar_servico`: Adiciona um novo serviço à conta de um hóspede.
    * `atualizar_servico`: Modifica um serviço já registrado (ex: alterar o pedido).
    * `cancelar_servico`: Remove um serviço da conta do hóspede.

---

### **2. 🔗 Relacionamentos**

O diagrama também mostra as conexões entre as classes, indicando como elas interagem.

* Um **Usuário** pode solicitar **Serviços** adicionais.
* O **Motel** gerencia as **Reservas** e a alocação dos **Quartos**.
* Uma **Reserva** está ligada a um **Quarto** e a um **Usuário**.
* A operação `hospedar_cliente` da classe `Quarto` está diretamente relacionada ao `Motel`, que coordena essa ação.
