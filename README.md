# Arquitetura hexagonal com Java e Spring Boot

Projeto acadêmico do MBA em Desenvolvimento Web Full Stack para estudar a separação entre domínio, casos de uso e integrações por meio de portas e adaptadores.

## Tecnologias declaradas

| Componente | Versão ou dependência |
| --- | --- |
| Java | 17 |
| Spring Boot | 3.1.0 |
| HTTP | Spring Web |
| Persistência | Spring Data JPA e H2 |
| Apoio | Lombok e Spring Boot Test |
| Build | Maven; scripts `mvnw` e `mvnw.cmd` presentes |

## Organização da arquitetura

A estrutura está em `src/main/java/archHexagonal/`:

| Diretório | Papel na organização |
| --- | --- |
| `application/domain/` | Modelo de domínio |
| `application/usecase/` | Casos de uso |
| `application/ports/` | Contratos das integrações |
| `application/utils/` | Utilitários da aplicação |
| `adapters/input/web/api/` | Adaptadores de entrada HTTP |
| `adapters/output/h2/` | Adaptadores de saída para persistência |

O objetivo do exercício é organizar as regras da aplicação separadamente dos detalhes de transporte HTTP e persistência. O diretório `ports` representa os contratos entre essas partes; os adaptadores concentram a integração com as tecnologias externas.

## Preparação e comandos

```bash
git clone https://github.com/kellyane01/arch-hexagonal.git
cd arch-hexagonal
```

Com Java 17 e Maven instalados:

```bash
mvn test
mvn spring-boot:run
```

Os scripts de Maven Wrapper também estão presentes; seu uso depende da disponibilidade dos arquivos de suporte ao wrapper no checkout.

## Estado do projeto

Este é um exercício acadêmico preservado no portfólio. A configuração em `src/main/resources/application.yml` está incompleta na versão pública analisada e precisa ser corrigida antes de considerar a execução local validada. Os comandos acima identificam o fluxo Maven; não representam uma execução bem-sucedida já verificada.

Uma próxima evolução é completar a configuração, documentar os contratos HTTP e acrescentar testes dos casos de uso e dos adaptadores.

## Arquivos gerados

`target/`, arquivos `*.iml` e configurações locais de IDE não fazem parte do código-fonte necessário ao projeto. O `.gitignore` deve mantê-los fora de novos commits. Arquivos já versionados precisam ser retirados do índice do Git separadamente, preservando a cópia local.

## Autoria

[Brena Kellyane](https://github.com/kellyane01) · [LinkedIn](https://www.linkedin.com/in/brena-k-43b161198/)
