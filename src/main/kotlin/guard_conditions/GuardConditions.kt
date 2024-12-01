package guard_conditions

sealed interface Animal {
    data class Cat(val mouseHunter: Boolean) : Animal {
        fun feedCat() {
            println("Cat eating")
        }
    }

    data class Dog(val breed: String) : Animal {
        fun feedDog() {
            println("Dog eating")
        }
    }
}

fun feedAnimal(animal: Animal) {
    when (animal) {
        // Branch with only the primary condition. Returns `feedDog()` when `Animal` is `Dog`
        is Animal.Dog -> animal.feedDog()
        // Branch with both primary and guard conditions. Returns `feedCat()` when `Animal` is `Cat` and is not `mouseHunter`
        is Animal.Cat if !animal.mouseHunter -> animal.feedCat()
        // Returns "Unknown animal" if none of the above conditions match
        else -> println("Unknown animal")
    }
}

fun main() {
    feedAnimal(Animal.Dog(breed = "Bulldog"))
    feedAnimal(Animal.Cat(mouseHunter = false))
}