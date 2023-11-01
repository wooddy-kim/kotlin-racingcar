package racingcar.domain

import io.kotest.core.spec.style.ExpectSpec
import io.kotest.matchers.shouldBe
import racingcar.test.RacingCarGenerator

class RacingCarTest : ExpectSpec({

    context("자동차에게 FORWARD 를 반환하는 게임룰을 설정하면") {
        val racingCar = RacingCarGenerator.create(direction = MovingDirection.FORWARD)

        expect("자동차의 포지션은 1 증가한다.") {
            racingCar.move()
            racingCar.position shouldBe Position(1)
        }
    }

    context("자동차에게 STOP 을 반환하는 게임룰을 설정하면") {
        val racingCar = RacingCarGenerator.create(direction = MovingDirection.STOP)

        expect("자동차의 포지션은 증가하지 않는다.") {
            racingCar.move()
            racingCar.position shouldBe Position(0)
        }
    }
})