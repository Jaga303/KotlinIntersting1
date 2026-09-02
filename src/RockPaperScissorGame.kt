fun main(){
    println("Welcome to Rock, Paper, Scissors Game .... ")
    println("Please choose one from Rock, Paper and Scissors")
    print("Enter your choice: ")
    val yourChoice = readLine()?.lowercase()

    val computerNumberChoice = (1..3).random()
    val computerChoice = when(computerNumberChoice){
        1 -> "rock"
        2 -> "paper"
        else -> "scissor"
    }
    println("Computer Choice: $computerChoice")

    if(yourChoice == computerChoice){
        println("Match Draw! (Please press ctrl + fn + Shift + f10 to replay)")
    } else if(
        (computerChoice == "rock" && yourChoice == "paper") ||
        (computerChoice == "paper" && yourChoice == "scissor") ||
        (computerChoice == "scissor" && yourChoice == "rock")
    ){
        println("You Win!")
    } else if(
        (computerChoice == "rock" && yourChoice == "scissor") ||
        (computerChoice == "paper" && yourChoice == "rock") ||
        (computerChoice == "scissor" && yourChoice == "paper")
    ){
        println("You Lost!")
    } else{
        println("Please select one from Rock, Paper and Scissor only! ")
    }
}