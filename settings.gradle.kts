rootProject.name = "jvm-leetcode"

val challengeDirectoryNamePattern = Regex("\\d{4}-.*")

rootDir.listFiles { file -> file.isDirectory }!!
    .asSequence()
    .map { it.name }
    .filter { it.matches(challengeDirectoryNamePattern) }
    .sorted()
    .onEach { println(it) }
    .onEach { include(it) }
    .toList()

include(
        "tree-node",
        "list-node",
)
