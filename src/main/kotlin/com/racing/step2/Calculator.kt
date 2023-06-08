package com.racing.step2

object Calculator {
    fun exec(exp: String): Int {
        val expressionList = exp.split(" ")

        if (expressionList.size <= 2 || expressionList.size % 2 == 0) {
            throw IllegalArgumentException("식을 정확하게 입력해주세요")
        }

        var indexPointer = 2
        var result = expressionList[0].toInt()
        while (indexPointer < expressionList.size) {
            result = operate(result, expressionList[indexPointer].toInt(), expressionList[indexPointer - 1])
            indexPointer += 2
        }

        return result
    }

    private fun operate(a: Int, b: Int, op: String): Int {
        val operator = Operator.Companion.from(op)
        return operator.run(a, b)
    }
}