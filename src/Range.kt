fun main() {
    val range: IntRange = 1..5
    println(range)
    println(range.count())
    println(range.contains(3))
    println(range.contains(6))
    println(range.first)
    println(range.last)
    println(range.step)

    val reversedRange: IntProgression = 5 downTo 1
    println(reversedRange)
    println(reversedRange.count())
    println(reversedRange.contains(3))
    println(reversedRange.contains(6))
    println(reversedRange.first)
    println(reversedRange.last)
    println(reversedRange.step)

    val rangeWithStep: IntProgression = 1..10 step 2
    println(rangeWithStep)
    println(rangeWithStep.count())
    println(rangeWithStep.contains(3))
    println(rangeWithStep.contains(6))
    println(rangeWithStep.first)
    println(rangeWithStep.last)
    println(rangeWithStep.step)

    val rangeWithStepReversed: IntProgression = 10 downTo 1 step 2
    println(rangeWithStepReversed)
    println(rangeWithStepReversed.count())
    println(rangeWithStepReversed.contains(3))
    println(rangeWithStepReversed.contains(6))
    println(rangeWithStepReversed.first)
    println(rangeWithStepReversed.last)
    println(rangeWithStepReversed.step)

}