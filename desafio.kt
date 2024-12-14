// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASIC, INTERMEDIATE, DIFFICULT }

class User

data class EducationalContent(var name: String, val duration: Int = 60)

data class Training(val name: String, var contents: List<EducationalContent>) {

    val registered = mutableListOf<User>()
    
    fun enroll(user: User) {
        TODO("Use the $user parameter to simulate a registration (use the $registered list).")
    }
}

fun main() {
    TODO("Analyze the classes modeled for this application domain and think about ways to evolve them.")
    TODO("Simulate some test scenarios. To do this, create some objects using the classes in question.")
}
