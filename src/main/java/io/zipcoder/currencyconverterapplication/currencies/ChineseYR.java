package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType chin = CurrencyType.CHINESE_YR;
    public  CurrencyType getType(){
        return chin;
}}
