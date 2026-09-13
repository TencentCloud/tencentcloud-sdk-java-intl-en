/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaymentMethod extends AbstractModel {

    /**
    * <p>Payment method</p><p>Enumeration value:</p><ul><li>cash</li><li>check</li><li>credit_card</li><li>debit_card</li><li>crypto_currency</li><li>digital_wallet</li><li>gift_card</li><li>points</li><li>in_app_purchase</li><li>electronic_fund_transfer</li><li>financing</li><li>invoice</li><li>prepaid_card</li><li>sepa_credit</li></ul>
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * <p>The channel of the payment</p>
    */
    @SerializedName("PaymentChannel")
    @Expose
    private String PaymentChannel;

    /**
    * <p>The details of the card.Required while PaymentMethod is "credit_card","debit_card"</p>
    */
    @SerializedName("Card")
    @Expose
    private Card Card;

    /**
    * <p>SEPA direct debit mandate</p><p>Enumeration value:</p><ul><li>true: Yes</li><li>false: No</li></ul>
    */
    @SerializedName("SEPADirectDebitMandate")
    @Expose
    private Boolean SEPADirectDebitMandate;

    /**
    * <p>The details of the digital wallet when involved digital trade</p>
    */
    @SerializedName("DigitalWallet")
    @Expose
    private Wallet DigitalWallet;

    /**
     * Get <p>Payment method</p><p>Enumeration value:</p><ul><li>cash</li><li>check</li><li>credit_card</li><li>debit_card</li><li>crypto_currency</li><li>digital_wallet</li><li>gift_card</li><li>points</li><li>in_app_purchase</li><li>electronic_fund_transfer</li><li>financing</li><li>invoice</li><li>prepaid_card</li><li>sepa_credit</li></ul> 
     * @return PaymentType <p>Payment method</p><p>Enumeration value:</p><ul><li>cash</li><li>check</li><li>credit_card</li><li>debit_card</li><li>crypto_currency</li><li>digital_wallet</li><li>gift_card</li><li>points</li><li>in_app_purchase</li><li>electronic_fund_transfer</li><li>financing</li><li>invoice</li><li>prepaid_card</li><li>sepa_credit</li></ul>
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * Set <p>Payment method</p><p>Enumeration value:</p><ul><li>cash</li><li>check</li><li>credit_card</li><li>debit_card</li><li>crypto_currency</li><li>digital_wallet</li><li>gift_card</li><li>points</li><li>in_app_purchase</li><li>electronic_fund_transfer</li><li>financing</li><li>invoice</li><li>prepaid_card</li><li>sepa_credit</li></ul>
     * @param PaymentType <p>Payment method</p><p>Enumeration value:</p><ul><li>cash</li><li>check</li><li>credit_card</li><li>debit_card</li><li>crypto_currency</li><li>digital_wallet</li><li>gift_card</li><li>points</li><li>in_app_purchase</li><li>electronic_fund_transfer</li><li>financing</li><li>invoice</li><li>prepaid_card</li><li>sepa_credit</li></ul>
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * Get <p>The channel of the payment</p> 
     * @return PaymentChannel <p>The channel of the payment</p>
     */
    public String getPaymentChannel() {
        return this.PaymentChannel;
    }

    /**
     * Set <p>The channel of the payment</p>
     * @param PaymentChannel <p>The channel of the payment</p>
     */
    public void setPaymentChannel(String PaymentChannel) {
        this.PaymentChannel = PaymentChannel;
    }

    /**
     * Get <p>The details of the card.Required while PaymentMethod is "credit_card","debit_card"</p> 
     * @return Card <p>The details of the card.Required while PaymentMethod is "credit_card","debit_card"</p>
     */
    public Card getCard() {
        return this.Card;
    }

    /**
     * Set <p>The details of the card.Required while PaymentMethod is "credit_card","debit_card"</p>
     * @param Card <p>The details of the card.Required while PaymentMethod is "credit_card","debit_card"</p>
     */
    public void setCard(Card Card) {
        this.Card = Card;
    }

    /**
     * Get <p>SEPA direct debit mandate</p><p>Enumeration value:</p><ul><li>true: Yes</li><li>false: No</li></ul> 
     * @return SEPADirectDebitMandate <p>SEPA direct debit mandate</p><p>Enumeration value:</p><ul><li>true: Yes</li><li>false: No</li></ul>
     */
    public Boolean getSEPADirectDebitMandate() {
        return this.SEPADirectDebitMandate;
    }

    /**
     * Set <p>SEPA direct debit mandate</p><p>Enumeration value:</p><ul><li>true: Yes</li><li>false: No</li></ul>
     * @param SEPADirectDebitMandate <p>SEPA direct debit mandate</p><p>Enumeration value:</p><ul><li>true: Yes</li><li>false: No</li></ul>
     */
    public void setSEPADirectDebitMandate(Boolean SEPADirectDebitMandate) {
        this.SEPADirectDebitMandate = SEPADirectDebitMandate;
    }

    /**
     * Get <p>The details of the digital wallet when involved digital trade</p> 
     * @return DigitalWallet <p>The details of the digital wallet when involved digital trade</p>
     */
    public Wallet getDigitalWallet() {
        return this.DigitalWallet;
    }

    /**
     * Set <p>The details of the digital wallet when involved digital trade</p>
     * @param DigitalWallet <p>The details of the digital wallet when involved digital trade</p>
     */
    public void setDigitalWallet(Wallet DigitalWallet) {
        this.DigitalWallet = DigitalWallet;
    }

    public PaymentMethod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaymentMethod(PaymentMethod source) {
        if (source.PaymentType != null) {
            this.PaymentType = new String(source.PaymentType);
        }
        if (source.PaymentChannel != null) {
            this.PaymentChannel = new String(source.PaymentChannel);
        }
        if (source.Card != null) {
            this.Card = new Card(source.Card);
        }
        if (source.SEPADirectDebitMandate != null) {
            this.SEPADirectDebitMandate = new Boolean(source.SEPADirectDebitMandate);
        }
        if (source.DigitalWallet != null) {
            this.DigitalWallet = new Wallet(source.DigitalWallet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "PaymentChannel", this.PaymentChannel);
        this.setParamObj(map, prefix + "Card.", this.Card);
        this.setParamSimple(map, prefix + "SEPADirectDebitMandate", this.SEPADirectDebitMandate);
        this.setParamObj(map, prefix + "DigitalWallet.", this.DigitalWallet);

    }
}

