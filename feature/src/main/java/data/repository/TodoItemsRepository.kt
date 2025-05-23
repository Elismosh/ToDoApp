package data.repository


import data.local.model.TodoItem
import kotlinx.coroutines.flow.Flow


/**
 * Repository interface for managing todo items data.
 */
interface TodoItemsRepository {

    val allTodo: Flow<List<TodoItem>>

    val incompleteTodo: Flow<List<TodoItem>>

    val undoTodo: Flow<List<TodoItem>>

    suspend fun insert(todo: TodoItem)

    suspend fun deleteTodoById(id: String)

    suspend fun undoTodoById(id: String)

    suspend fun toggleCompletedById(id: String)

    suspend fun getTodoById(id: String): TodoItem?

    fun getCompletedTodoCount(): Flow<Int>

    suspend fun syncWithServer()

    suspend fun getServerRevision():Int

    fun updateAuthToken(token: String)

}