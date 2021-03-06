package com.ddd.assignment_6.Factory;

import com.ddd.assignment_6.Domain.ReligionCeremony;

/**
 * Created by 214162966 on 4/17/2016.
 */
public class ReligionCerFactory {
    public static ReligionCerFactory religion=null;
    public ReligionCerFactory(){
    }
    public static ReligionCerFactory getInstance(){
        if(religion==null){
            religion=new ReligionCerFactory();
        }
        return religion;
    }
    public static ReligionCeremony getReligionCeremony(Long id,String event_name,String eventAddress){
        ReligionCeremony rel=new ReligionCeremony.Builder().id(id)
                .name(event_name)
                .address(eventAddress)
                .build();
        return rel;
    }
}