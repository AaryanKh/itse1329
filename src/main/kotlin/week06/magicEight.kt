fun main() {
    while(true) {
        val arrayAnswers = arrayOf(
            "Yes, of course!",
            "Without a doubt, yes.",
            "You can count on it.",
            "For sure!",
            "Ask me later.",
            "I’m not sure.",
            "I can’t tell you right now.",
            "I’ll tell you after my nap.",
            "No way!",
            "I don’t think so.",
            "Without a doubt, no.",
            "The answer is clearly NO."
        )
        println("Ask a question! Type \"quit\" to exit the program")
        var userInput = readLine()
        if(userInput!!.equals("quit",true))
            break;
        var computerChoice = (0..11).random()
        println(arrayAnswers[computerChoice])
    }
}