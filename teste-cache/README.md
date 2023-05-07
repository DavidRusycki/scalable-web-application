## 🚚 Teste de carga com cache 

Ambos os cenários realizaram 100 mil requisições para as aplicações em Spring Boot. O banco de dados estava rodando com as configurações da pasta docker. Ou seja estava limitado a usar somente 10% do processador da máquina.

### 1. Sem cache 

![sem-cache](./img/sem%20estrutura%20de%20cache.png)

- Cerca de 13% das requisições foram perdidas.
- 4 minutos e 2 segundos.

### 2. Com cache 

![com-cache](./img/com%20estrutura%20de%20cache.png)

- Todas as requests foram atendidas.
- 19 segundos.

___

## ✅ Conclusão

Desse modo podemos ver que uma estrutura de cache onde possível, pode fazer muita diferença. Além de permitir reduzir as especificações da sua aplicação. Economizando em soluções para rodar o banco de dados.

___

### 🧰 Aplicações Utilizadas para teste e desenvolvimento

- [Apache JMeter](https://jmeter.apache.org/)
- [Insomnia REST](https://insomnia.rest/)
- [Spring Boot](https://spring.io/)
- [Spring Tool Suite 4](https://spring.io/tools)
- [Docker]([https://](https://www.docker.com/))
- [Postgres](https://www.postgresql.org/)
