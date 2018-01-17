package org.web.emall.models;

public class ReputationUser {

    private Reputation goods;

    private User user;

    public Reputation getGoods() {
        return goods;
    }

    public void setGoods(Reputation goods) {
        this.goods = goods;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
