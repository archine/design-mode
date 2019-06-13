package com.gj;

/**
 * @author Gjing
 * 高级机器
 **/
public interface SuperMachine {
    /**
     * 刷卡
     */
    void blush(MachineType machineType, String number);
}

/**
 * 高级机器内部处理器
 */
class SuperMachineAdapter implements SuperMachine {
    @Override
    public void blush(MachineType machineType, String number) {
        switch (machineType) {
            case ID_CARD:
                CardMachine cardMachine = new IdCardMachine();
                cardMachine.blushIdCard(number);
                break;
            case BANK_CARD:
                cardMachine = new BankCardMachine();
                cardMachine.blushBankCard(number);
                break;
            default:
                throw new NullPointerException("没有找到合适机器");
        }
    }
}

/**
 * 高级机器提供给外部的刷卡口
 */
class SuperMachineOut implements SuperMachine {
    @Override
    public void blush(MachineType machineType, String number) {
        SuperMachineAdapter machineAdapter = new SuperMachineAdapter();
        machineAdapter.blush(machineType, number);
    }
}
