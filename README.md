
# BDS02 - TDD - Testes Automatizados

Nesse projeto foram adicionados recursos de acordo com os testes pre-definidos na atividade do capitulo 2 da trilha do curso Java Bootcamp Spring 3.0. 




# Testes para CityController

## findAllShouldReturnAllResourcesSortedByName

**Descrição:** Verifica se a API retorna todas as cidades ordenadas por nome.

**Cenário:**
- **Dados de entrada:** Nenhum.
- **Resultado esperado:** Status de resposta OK (200) e lista de cidades ordenadas por nome.

## insertShouldInsertResource

**Descrição:** Verifica se a API insere uma nova cidade corretamente.

**Cenário:**
- **Dados de entrada:** DTO representando uma nova cidade.
- **Resultado esperado:** Status de resposta Created (201) e confirmação da inserção da cidade.

## deleteShouldReturnNoContentWhenIndependentId

**Descrição:** Verifica se a API deleta uma cidade existente corretamente.

**Cenário:**
- **Dados de entrada:** ID de uma cidade existente.
- **Resultado esperado:** Status de resposta No Content (204) indicando a exclusão bem-sucedida.

## deleteShouldReturnNotFoundWhenNonExistingId

**Descrição:** Verifica se a API retorna NotFound ao tentar excluir uma cidade com ID inexistente.

**Cenário:**
- **Dados de entrada:** ID de uma cidade inexistente.
- **Resultado esperado:** Status de resposta Not Found (404) indicando que a cidade não foi encontrada para exclusão.

## deleteShouldReturnBadRequestWhenDependentId

**Descrição:** Verifica se a API retorna BadRequest quando tenta excluir uma cidade com dependências.

**Cenário:**
- **Dados de entrada:** ID de uma cidade que possui dependências.
- **Resultado esperado:** Status de resposta Bad Request (400) indicando que a exclusão não pode ser concluída devido a dependências.

# Testes para EventController

## updateShouldUpdateResourceWhenIdExists

**Descrição:** Verifica se a API atualiza um evento existente corretamente.

**Cenário:**
- **Dados de entrada:** ID de um evento existente e DTO com dados atualizados.
- **Resultado esperado:** Status de resposta OK (200) e confirmação da atualização do evento.

## updateShouldReturnNotFoundWhenIdDoesNotExist

**Descrição:** Verifica se a API retorna NotFound ao tentar atualizar um evento com ID inexistente.

**Cenário:**
- **Dados de entrada:** ID de um evento inexistente e DTO com dados atualizados.
- **Resultado esperado:** Status de resposta Not Found (404) indicando que o evento não foi encontrado para atualização.

Estes cenários cobrem as principais operações dos controladores, garantindo que as funcionalidades básicas estejam funcionando corretamente.
