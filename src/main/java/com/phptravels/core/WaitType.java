package com.phptravels.core;

public enum WaitType {
    Displayed, Enabled, NotDisplayed, NotPresent, Present,Clickable;

    public boolean isNagative() {
        return this.equals(NotDisplayed) || this.equals(NotPresent);
    }

}
