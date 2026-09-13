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

public class WithdrawEvent extends AbstractModel {

    /**
    * <p>The amount of the withdraw</p>
    */
    @SerializedName("Amount")
    @Expose
    private Amount Amount;

    /**
    * <p>The method of the withdraw</p><p>Enumeration value:</p><ul><li>card: bank card</li><li>wallet: digital wallet</li></ul>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>The detail information of the card withdrawn to.Required while the withdraw method is card</p>
    */
    @SerializedName("Card")
    @Expose
    private Card Card;

    /**
    * <p>The detail information of the wallet withdrawn to.Required while the withdraw method is wallet</p>
    */
    @SerializedName("Wallet")
    @Expose
    private Wallet Wallet;

    /**
    * <p>Withdraw result</p>
    */
    @SerializedName("Result")
    @Expose
    private Result Result;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The amount of the withdraw</p> 
     * @return Amount <p>The amount of the withdraw</p>
     */
    public Amount getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>The amount of the withdraw</p>
     * @param Amount <p>The amount of the withdraw</p>
     */
    public void setAmount(Amount Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>The method of the withdraw</p><p>Enumeration value:</p><ul><li>card: bank card</li><li>wallet: digital wallet</li></ul> 
     * @return Method <p>The method of the withdraw</p><p>Enumeration value:</p><ul><li>card: bank card</li><li>wallet: digital wallet</li></ul>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>The method of the withdraw</p><p>Enumeration value:</p><ul><li>card: bank card</li><li>wallet: digital wallet</li></ul>
     * @param Method <p>The method of the withdraw</p><p>Enumeration value:</p><ul><li>card: bank card</li><li>wallet: digital wallet</li></ul>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>The detail information of the card withdrawn to.Required while the withdraw method is card</p> 
     * @return Card <p>The detail information of the card withdrawn to.Required while the withdraw method is card</p>
     */
    public Card getCard() {
        return this.Card;
    }

    /**
     * Set <p>The detail information of the card withdrawn to.Required while the withdraw method is card</p>
     * @param Card <p>The detail information of the card withdrawn to.Required while the withdraw method is card</p>
     */
    public void setCard(Card Card) {
        this.Card = Card;
    }

    /**
     * Get <p>The detail information of the wallet withdrawn to.Required while the withdraw method is wallet</p> 
     * @return Wallet <p>The detail information of the wallet withdrawn to.Required while the withdraw method is wallet</p>
     */
    public Wallet getWallet() {
        return this.Wallet;
    }

    /**
     * Set <p>The detail information of the wallet withdrawn to.Required while the withdraw method is wallet</p>
     * @param Wallet <p>The detail information of the wallet withdrawn to.Required while the withdraw method is wallet</p>
     */
    public void setWallet(Wallet Wallet) {
        this.Wallet = Wallet;
    }

    /**
     * Get <p>Withdraw result</p> 
     * @return Result <p>Withdraw result</p>
     */
    public Result getResult() {
        return this.Result;
    }

    /**
     * Set <p>Withdraw result</p>
     * @param Result <p>Withdraw result</p>
     */
    public void setResult(Result Result) {
        this.Result = Result;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public WithdrawEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WithdrawEvent(WithdrawEvent source) {
        if (source.Amount != null) {
            this.Amount = new Amount(source.Amount);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Card != null) {
            this.Card = new Card(source.Card);
        }
        if (source.Wallet != null) {
            this.Wallet = new Wallet(source.Wallet);
        }
        if (source.Result != null) {
            this.Result = new Result(source.Result);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Amount.", this.Amount);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamObj(map, prefix + "Card.", this.Card);
        this.setParamObj(map, prefix + "Wallet.", this.Wallet);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

