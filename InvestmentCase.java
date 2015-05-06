package com.krplus.activity.speed.bean;

import java.util.Date;

import com.krplus.company.model.Company;
import com.krplus.enums.FinancePhase;
import com.krplus.finance.model.FinanceEvent;

public class InvestmentCase {
    private int cid;
    private String name;
    private String logo;
    private FinancePhase phase;
    private Date date;

    public InvestmentCase() {
    }

    public InvestmentCase(FinanceEvent event, Company company) {
        cid = company.getId();
        name = company.getName();
        logo = company.getLogo();
        phase = event.getPhase();
        date = event.getFinanceDate();
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public FinancePhase getPhase() {
        return phase;
    }

    public void setPhase(FinancePhase phase) {
        this.phase = phase;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
