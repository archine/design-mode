package com.gj;

/**
 * @author Gjing
 * 刷卡器
 **/
public interface CardMachine {
    /**
     * 刷身份证
     */
    void blushIdCard(String number);

    /**
     * 刷银行卡
     */
    void blushBankCard(String number);
}

/**
 * 身份证刷卡器
 */
class IdCardMachine implements CardMachine{

    @Override
    public void blushIdCard(String number) {
        System.out.println("身份证刷卡器执行刷卡，卡号：" + number);
    }

    @Override
    public void blushBankCard(String number) {

    }
}

/**
 * 银行卡刷卡器
 */
class BankCardMachine implements CardMachine {
    @Override
    public void blushIdCard(String number) {

    }

    @Override
    public void blushBankCard(String number) {
        System.out.println("银行卡刷卡器执行刷卡，卡号：" + number);
    }
}



