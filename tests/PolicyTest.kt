fun main() {
    val signalcase_1 = Signal(85, 76, 11, 21, 6)
    check(Policy.score(signalcase_1) == 133)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(62, 97, 23, 9, 9)
    check(Policy.score(signalcase_2) == 138)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(102, 82, 22, 17, 4)
    check(Policy.score(signalcase_3) == 137)
    check(Policy.classify(signalcase_3) == "review")
}
