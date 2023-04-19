package com.hyunec.cosmicbaseballinit.acceptancetest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class NormalBaseballLv2Test {

    @DisplayName("strike 타석 결과와 관련된 테스트를 진행합니다.")
    @TestFactory
    Stream<DynamicTest> normalBaseBallLv2TestStrikeCollection() {
        return Stream.of(
                DynamicTest.dynamicTest("새로운 타석이 시작되면 타석 상태를 초기화 합니다.", () -> {

                }),
                DynamicTest.dynamicTest("0 strike 상태의 타석에서 타격 결과가 strike 이면 타석 결과는 진행 중 입니다.", () -> {

                }),
                DynamicTest.dynamicTest("진행 중인 타석이 있는 상태에서 새로운 타석을 진행할 수 없습니다.", () -> {

                }),
                DynamicTest.dynamicTest("1 strike 상태의 타석에서 타격 결과가 double_strike 이면 타석 결과는 out 입니다.", () -> {

                }),
                DynamicTest.dynamicTest("2 strike 상태의 타석에서 타격 결과가 strike 이면 타석 결과는 out 입니다.", () -> {

                })
        );
    }

    @DisplayName("ball 타석 결과와 관련된 테스트를 진행합니다.")
    @TestFactory
    Stream<DynamicTest> normalBaseBallLv2TestBallCollection() {
        return Stream.of(
                DynamicTest.dynamicTest("새로운 타석이 시작되면 타석 상태를 초기화 합니다.", () -> {

                }),
                DynamicTest.dynamicTest("0 ball 상태의 타석에서 타격 결과가 ball 이면 타석 결과는 진행 중 입니다.", () -> {

                }),
                DynamicTest.dynamicTest("진행 중인 타석이 있는 상태에서 새로운 타석을 진행할 수 없습니다.", () -> {

                }),
                DynamicTest.dynamicTest("0 ball 상태의 타석에서 타격 결과가 double_ball 이면 타석 결과는 진행 중 입니다.", () -> {

                }),
                DynamicTest.dynamicTest("2 ball 상태의 타석에서 타격 결과가 double_ball 이면 타석 결과는 four_ball 으로 진루 입니다.", () -> {

                }),
                DynamicTest.dynamicTest("3 ball 상태의 타석에서 타격 결과가 ball 이면 타석 결과는 four_ball 으로 진루 입니다.", () -> {

                })
        );
    }

    @DisplayName("타석 결과가 hit 이면 타석 결과는 hit 로 진루 입니다.")
    @Test
    void t10() {
        throw new RuntimeException("Not yet implemented");
    }

    @DisplayName("진행 중인 타석이 있는 상태에서 새로운 타석을 진행할 수 없습니다.")
    @Test
    void t11() {
        throw new RuntimeException("Not yet implemented");
    }
}
