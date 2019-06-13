package com.gj;

import cn.gjing.TimeUtil;

import java.time.LocalDateTime;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) {
        SuperMachine superMachine = new SuperMachineOut();
        superMachine.blush(MachineType.ID_CARD, TimeUtil.localDateTimeToStamp(LocalDateTime.now())+"");
        superMachine.blush(MachineType.BANK_CARD, TimeUtil.localDateTimeToStamp(LocalDateTime.now())+"");
    }
}
