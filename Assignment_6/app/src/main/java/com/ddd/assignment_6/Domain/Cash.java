package com.ddd.assignment_6.Domain;

/**
 * Created by 214162966 on 4/17/2016.
 */
public class Cash implements Payment {
    private Long id;
    private double amount;
    private String company_name;

    public Long getId(){return id;}
    public double getAmount(){
        return amount;
    }

    public String getName(){
        return company_name=company_name;

    }

    public Cash(Builder builder){
        this.id=builder.id;
        this.amount=builder.amount;
        this.company_name=builder.company_name;
    }
    public static class Builder{
        private long id;
        private double amount;
        private String company_name;
        public Builder id(Long id){
            this.id=id;
            return this;
        }
        public Builder amount(double amount){
            this.amount=amount;
            return this;
        }

        public Builder name(String company_name){
            this.company_name=company_name;
            return this;
        }

        public Builder copy(Cash cash){
            this.id=cash.getId();
            this.amount=cash.getAmount();
            this.company_name=cash.getName();

            return this;
        }
        public Cash build(){
            return new Cash(this);
        }
    }

    public String getTypeOfPayment(){
        return "deposit";
    }
}
