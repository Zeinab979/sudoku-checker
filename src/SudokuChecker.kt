fun testValidSudoku9x9() {
    val board = arrayOf(
        arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
        arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
        arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
        arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
        arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
        arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
        arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
        arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
    )
    println("Test valid Sudoku (9x9): ${checkSudoku(board)}")
}
fun testValidEmptyCell() {
    val board = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    println("Test valid Sudoku (9x9): ${checkSudoku(board)}")
}
fun testInvalidSudokuRow() {
    val board = arrayOf(
        arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
        arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
        arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
        arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
        arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
        arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
        arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
        arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '5')
    )
    println("Test invalid Sudoku (row): ${checkSudoku(board)}")
}

fun testInvalidSudokuColumn() {
    val board = arrayOf(
        arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
        arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
        arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
        arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
        arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
        arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '1'),
        arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
        arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
    )

    println("Test invalid Sudoku (column): ${checkSudoku(board)}")
}

fun testEmptyPuzzle() {
    val board = Array(9) { Array(9) { '-' } }
    println("Test empty Sudoku: ${checkSudoku(board)}")
}

fun testValidSudoku4x4() {
    val board = arrayOf(
        arrayOf('1', '2', '3', '4'),
        arrayOf('3', '4', '1', '2'),
        arrayOf('2', '3', '4', '1'),
        arrayOf('4', '1', '2', '3')
    )
    println("Test valid Sudoku (4x4): ${checkSudoku(board)}")
}

fun testInvalidSudoku4x4Row() {
    val board = arrayOf(
        arrayOf('1', '2', '3', '4'),
        arrayOf('3', '4', '1', '2'),
        arrayOf('2', '3', '4', '1'),
        arrayOf('4', '1', '2', '2')
    )
    println("Test invalid Sudoku (4x4 row): ${checkSudoku(board)}")
}

fun checkSudoku(board: Array<Array<Char>>): Boolean {
    return false
}
