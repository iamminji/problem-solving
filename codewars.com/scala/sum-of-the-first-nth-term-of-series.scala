/**
  * https://www.codewars.com/kata/sum-of-the-first-nth-term-of-series/train/scala
  *
  * 분모는 3씩 증가하는 (분자는 항상 1) 분수의 sum 을 구하는 문제
  * i가 n까지 증가할 때, 분모의 항이 3 * (i - 1) + 1 이기 때문에 이를 풀어서 식을 구하면 됨
  **/

object Sol {

    def seriesSum(n: Int): String = {
        var res: Double = 0.0
        for (i <- 1 to n) {
            res += (1.0 / (3.0 * i - 2.0))
        }
        "%.2f".format(res)
    }

    def main(args: Array[String]): Unit = {
        println(seriesSum(5))
        println(seriesSum(3))
        println(seriesSum(2))
        println(seriesSum(1))
    }
}