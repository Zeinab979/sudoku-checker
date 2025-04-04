import kotlin.math.sqrt


fun runSudokuTest(name : String, board: List<List<Char>>, expectedResult : Boolean){
    val actualResult = checkSudoku(board)
    val status = if (expectedResult == actualResult)"pass" else "fail"
    println("$status | $name | Expected: $expectedResult, Got: $actualResult")
}

fun checkSudoku(board: List<List<Char>>): Boolean {
    val size = board.size
    val boxSize = sqrt(size.toDouble()).toInt()

    fun isValidGroup(group: List<Char>): Boolean {
        val seen = mutableSetOf<Char>()
        for (num in group) {
            if (num != '-' && !seen.add(num)) return false
        }
        return true
    }

    for (row in board) {
        if (!isValidGroup(row)) return false
    }

    for (col in 0..<size) {
        val column = board.map { it[col] }
        if (!isValidGroup(column)) return false
    }

    for (row in 0..<size step boxSize) {
        for (col in 0..<size step boxSize) {
            val subgrid = mutableListOf<Char>()
            for (r in 0..<boxSize) {
                for (c in 0..<boxSize) {
                    subgrid.add(board[row + r][col + c])
                }
            }
            if (!isValidGroup(subgrid)) return false
        }
    }

    return true
}
