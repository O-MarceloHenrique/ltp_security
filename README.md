> TABELA TAREFAS 💾
> 
Verbo HTTP | Descrição da Funcionalidade | Path |	Path (Exemplo) | Dados de envio em JSON (Body) | Dados de Resposta em JSON (Body) | Responsável
---|---|---|---|---|---|---|
POST | Cadastrar animal | /cadastro/animal | POST /cadastro/animal | { "id": 0, "raca": "ViraLata", "idade": "1", "porte": "pequeno", "genero": "macho", "especie": "cachorro" } |  |	Marcelo
POST | Cadastrar usuário | /cadastro/usuario | POST /cadastro/usuario	| { "id": 0, "nome": "Jose", "endereco": "Rua 1", "email": "jose@gmail.com", "telefone": "4002-8922" } |	|	Isabele
POST | Cadastrar resgate | /cadastro/resgate | POST /cadastro/resgate	| { "id": 0, "dataResgate": "19/02/2023", "localResgate": "Bragança Paulista", "descricaoResgate": "Animal atropelado", "animalResgatado": "Gato"} |	|	Paulo
GET |	Recuperar a lista de cadastro dos animais	| /recuperar/animal	| GET /recuperar/animal	|  | { "id": 0, "raca": "ViraLata", "idade": "1", "porte": "pequeno", "genero": "macho", "especie": "cachorro" } | Marcelo
GET | Recuperar a lista de cadastro dos usuários | /recuperar/usuario | GET /recuperar/usuario |  | { "id": 0, "nome": "Jose", "endereco": "Rua 1", "email": "jose@gmail.com", "telefone": "4002-8922" } | Isabele
GET |	Recuperar a lista de cadastro de resgate | /recuperar/resgate |	GET recuperar/resgate	|  | { "id": 0, "dataResgate": "19/02/2023", "localResgate": "Bragança Paulista", "descricaoResgate": "Animal atropelado", "animalResgatado": "Gato" } | Paulo
DELETE | Deletar cadastro do animal	| /deletar/animal	| DELETE /deletar/animal | { “id”: “” }	|  | Marcelo
DELETE | Deletar cadastro do usuário | /deletar/usuario	| DELETE /deletar/usuario	| { “id”: “” } |  |	Isabele
DELETE | Deletar cadastro de resgate | /deletar/resgate |	DELETE /deletar/resgate |	{ “id”: “” } |  |	Paulo
