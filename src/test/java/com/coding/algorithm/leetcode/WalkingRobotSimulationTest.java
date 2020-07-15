package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class WalkingRobotSimulationTest {

    @Test
    public void robotSim() {
        WalkingRobotSimulation test = new WalkingRobotSimulation();
        assertEquals(25, test.robotSim(new int[]{4, -1, 3}, new int[][]{}));
        assertEquals(65, test.robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}}));
    }
}