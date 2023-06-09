package study.racinggame.domain

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class CarTest : BehaviorSpec({
    given("차 위치 기본값은 0이다") {
        val car = Car()
        `when`("차가 이동할 때 값이 위치 값이 1 증가한다.") {
            val oldPosition = car.position
            car.moveForward(Int.MAX_VALUE)
            then("위치 값은 기존 값 보다 1증가한다.") {
                oldPosition shouldBe 0
                car.position shouldBe oldPosition + 1
            }
        }
    }
})