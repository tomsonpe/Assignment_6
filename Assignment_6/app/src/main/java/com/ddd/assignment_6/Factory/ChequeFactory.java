package com.ddd.assignment_6.Factory;

import com.ddd.assignment_6.Domain.Cheque;

/**
 * Created by 214162966 on 4/17/2016.
 */
public class ChequeFactory {
    public static ChequeFactory cheque=null;
    public ChequeFactory(){
    }
    public static ChequeFactory getInstance(){
        if(cheque==null){
            cheque=new ChequeFactory();
        }
        return cheque;
    }
    public static Cheque getCheque(String cheque_no,String company_name){
        Cheque cheq=new Cheque.Builder()
                .no(cheque_no)
                .name(company_name)
                .build();
        return cheq;
    }
}

