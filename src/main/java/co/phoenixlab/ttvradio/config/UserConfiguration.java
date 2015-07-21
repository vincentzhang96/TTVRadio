package co.phoenixlab.ttvradio.config;

import java.util.Locale;
import java.util.Set;

/**
 *
 */
public class UserConfiguration {

    /**
     * User-set stream volume, [0.0 - 1.0]
     */
    private double volume;

    /**
     * Automatically sync {@link #twitchUsername}'s following list
     */
    private boolean autoSyncFollowing;

    /**
     * User's Twitch username, for syncing following list
     */
    private String twitchUsername;

    /**
     * Channels being followed
     */
    private Set<String> following;

    /**
     * Application locale
     */
    private Locale locale;

    public UserConfiguration() {
    }

    /**
     * @return {@link #volume}
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume {@link #volume}
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * @return {@link #autoSyncFollowing}
     */
    public boolean isAutoSyncFollowing() {
        return autoSyncFollowing;
    }

    /**
     * @param autoSyncFollowing {@link #autoSyncFollowing}
     */
    public void setAutoSyncFollowing(boolean autoSyncFollowing) {
        this.autoSyncFollowing = autoSyncFollowing;
    }

    /**
     * @return {@link #twitchUsername}
     */
    public String getTwitchUsername() {
        return twitchUsername;
    }

    /**
     * @param twitchUsername {@link #twitchUsername}
     */
    public void setTwitchUsername(String twitchUsername) {
        this.twitchUsername = twitchUsername;
    }

    /**
     * @return {@link #following}
     */
    public Set<String> getFollowing() {
        return following;
    }

    /**
     * @param following {@link #following}
     */
    public void setFollowing(Set<String> following) {
        this.following = following;
    }

    /**
     * @return {@link #locale}
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * @param locale {@link #locale}
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
