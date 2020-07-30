package com.shop.barter.crowcoin.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idc;

    private String characterName;

    private Long crowCoins;

    private Long silver;

    private Long level;

    private String sex;

    private String characterClass;

    public Long getIdc() {
        return idc;
    }

    public void setIdc(Long idc) {
        this.idc = idc;
    }

    public Long getCrowCoins() {
        return crowCoins;
    }

    public void setCrowCoins(Long crowCoins) {
        this.crowCoins = crowCoins;
    }


    public Long getSilver() {
        return silver;
    }

    public void setSilver(Long silver) {
        this.silver = silver;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
