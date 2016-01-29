package com.cline;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by derek.cline on 1/19/16.
 */
public class TicTacToeTest {

    TicTacToe game = new TicTacToe();

    @org.junit.Test
    public void testCheckSpaceValidAndAvailable() throws Exception {
        game.placeMark(0, 0);
        // TODO Fix name or functionality of checkSpaceValidAndAvailable
        assertEquals(game.checkSpaceValidAndAvailable(0, 0), true);
        assertEquals(game.checkSpaceValidAndAvailable(0, 1), false);
        assertEquals(game.checkSpaceValidAndAvailable(3, 3), true);
    }

    @Test
    public void testChangePlayer() throws Exception {
        assertEquals(game.getCurrentPlayerMark(), 'x');
        game.placeMark(0, 0);
        assertEquals(game.getCurrentPlayerMark(), 'o');

    }
}