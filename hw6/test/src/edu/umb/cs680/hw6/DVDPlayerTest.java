package edu.umb.cs680.hw6;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DVDPlayerTest {
	@Test
    public void verifyDVDPlayer() {
	DVDPlayer d = DVDPlayer.getInstance();
	State expected = null;
	expected = DrawerClosedNotPlaying.getInstance();
	assertEquals(expected,d.getState());
	
	d.openCloseButtonPushed();
	expected = DrawerOpen.getInstance();
	assertSame(expected,d.getState());
	
	d.playButtonPushed();
	expected = DrawerClosedPlaying.getInstance();
	assertSame(expected,d.getState());

	d.stopButtonPushed();
    expected = DrawerClosedNotPlaying.getInstance();
    assertEquals(expected,d.getState());
	
	}
	
    @Test
    public void DrawerClosedNotPlayingWhenStopButtonPushedWhilePlaying() {
        DVDPlayer d = DVDPlayer.getInstance();
        d.playButtonPushed();
        d.stopButtonPushed();
        State expected = DrawerClosedNotPlaying.getInstance();
        assertEquals(expected,d.getState());
    }
    @Test
    public void DrawerOpenWhenOpenCloseButtonPushedWhilePlaying() {
        DVDPlayer d = DVDPlayer.getInstance();
        d.playButtonPushed();
        d.openCloseButtonPushed();
        State expected = DrawerOpen.getInstance();
        assertEquals(expected,d.getState());
    }

}