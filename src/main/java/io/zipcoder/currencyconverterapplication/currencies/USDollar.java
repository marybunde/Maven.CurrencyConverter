package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertableCurrency {
    CurrencyType usd = CurrencyType.US_DOLLAR;
    public  CurrencyType getType(){
        return usd;
}}
