fun main() {
    runSudokuTest(
        name = "Test valid Sudoku (9x9)",
        board = listOf(
            listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
            listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
            listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
            listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
            listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
            listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
            listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
            listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
            listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
        ),
        expectedResult = true

    )
    runSudokuTest(
        name = "Test valid Sudoku (9x9)",
        board = listOf(
            listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        ),
        expectedResult = true

    )
    runSudokuTest(
        name = "Invalid 9x9 Sudoku (row repeated value) should return false",
        board = listOf(
            listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
            listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
            listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
            listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
            listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
            listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
            listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
            listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
            listOf('3', '4', '5', '2', '8', '6', '1', '7', '5') //repeated 5
        ),
        expectedResult = false
    )
    runSudokuTest(
        name = "Invalid 9x9 Sudoku (column repeated value) should return false",
        board = listOf(
            listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
            listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
            listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
            listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
            listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),//1
            listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
            listOf('9', '6', '1', '5', '3', '7', '2', '8', '1'),//1
            listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
            listOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
        ),
        expectedResult = false
        )
    runSudokuTest(name = "Empty grid should return true",
        board = List(9) { List(9) { '-' } },
        expectedResult = true
        )
    runSudokuTest(name = "Valid 4x4 Sudoku should return true",
        board = listOf(
            listOf('1', '2', '3', '4'),
            listOf('3', '4', '1', '2'),
            listOf('2', '3', '4', '1'),
            listOf('4', '1', '2', '3')
        ),
        expectedResult = true
        )
    runSudokuTest(
        name = "Invalid 4x4 Sudoku (row repeated) should return false",
        board = listOf(
            listOf('1', '2', '3', '4'),
            listOf('3', '4', '1', '2'),
            listOf('2', '3', '4', '1'),
            listOf('4', '1', '2', '2')// repeated 2
        ),
        expectedResult = false
    )
}
