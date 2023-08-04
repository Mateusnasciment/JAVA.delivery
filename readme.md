GET /api/users - Retorna todos os usuários cadastrados.


GET /api/users/{id} - Retorna um usuário específico com o ID fornecido.
Método: 

getUserByIdUser(Long id)
Descrição: Recupera um usuário pelo ID fornecido.


POST /api/users - Cria um novo usuário com os dados fornecidos no corpo da requisição.
Método: createUser(User user)
Descrição: Cria um novo usuário com base nos dados fornecidos no corpo da requisição.




PUT /api/users/{id} - Atualiza um usuário existente com os dados fornecidos no corpo da requisição.
Método: updateUser(Long id, User user)
Descrição: Atualiza um usuário existente, cujo ID é fornecido, com os dados do usuário fornecido no corpo da requisição.



DELETE /api/users/{id} - Deleta um usuário existente com o ID fornecido.
Método: deleteUser(Long id)
Descrição: Deleta um usuário existente cujo ID é fornecido. Se o usuário existir, ele será excluído e a mensagem "User deleted successfully" será retornada.