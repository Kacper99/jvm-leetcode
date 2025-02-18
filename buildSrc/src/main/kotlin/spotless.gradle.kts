plugins {
    id("com.diffplug.spotless")
}


spotless {
    java {
        removeUnusedImports()
        importOrder()

        palantirJavaFormat()

        // Excluded because neither palantir nor google support instanceof pattern matching
        targetExclude("**/BalancedBinaryTree.java")
    }

    kotlin {
        targetExclude("**/build/generated/**", "**/build/tmp/**")
        ktfmt("0.43").dropboxStyle()
    }

    kotlinGradle {
        target("*.gradle.kts")
        ktfmt("0.43").dropboxStyle()
    }
}
