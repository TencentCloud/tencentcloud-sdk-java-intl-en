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

public class ChargeBackEvent extends AbstractModel {

    /**
    * <p>The ID of the transaction</p>
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * <p>The ID(s) of the order associated with the transaction</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String [] OrderId;

    /**
    * <p>The code of the chargeback defined by the card organization, for example: 10.1, 13.1, 4870, 4871</p>
    */
    @SerializedName("ChargeBackCode")
    @Expose
    private String ChargeBackCode;

    /**
    * <p>The reason of the chargeback defined by the card organization, for example: non-receipt of goods, fraud</p>
    */
    @SerializedName("ChargeBackReason")
    @Expose
    private String ChargeBackReason;

    /**
    * <p>The process of the chargeback defined by the card organization</p><p>Enumeration values:</p><ul><li>need_response: Merchant needs to respond</li><li>information_supplied: Merchant has provided information</li><li>chargeback_reversed: Chargeback has been canceled</li><li>chargeback_sustained: Chargeback has been established</li></ul>
    */
    @SerializedName("ChargeBackProcess")
    @Expose
    private String ChargeBackProcess;

    /**
    * <p>The amount of the chargeback</p>
    */
    @SerializedName("ChargeBackAmount")
    @Expose
    private Amount ChargeBackAmount;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The ID of the transaction</p> 
     * @return TransactionId <p>The ID of the transaction</p>
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set <p>The ID of the transaction</p>
     * @param TransactionId <p>The ID of the transaction</p>
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get <p>The ID(s) of the order associated with the transaction</p> 
     * @return OrderId <p>The ID(s) of the order associated with the transaction</p>
     */
    public String [] getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>The ID(s) of the order associated with the transaction</p>
     * @param OrderId <p>The ID(s) of the order associated with the transaction</p>
     */
    public void setOrderId(String [] OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>The code of the chargeback defined by the card organization, for example: 10.1, 13.1, 4870, 4871</p> 
     * @return ChargeBackCode <p>The code of the chargeback defined by the card organization, for example: 10.1, 13.1, 4870, 4871</p>
     */
    public String getChargeBackCode() {
        return this.ChargeBackCode;
    }

    /**
     * Set <p>The code of the chargeback defined by the card organization, for example: 10.1, 13.1, 4870, 4871</p>
     * @param ChargeBackCode <p>The code of the chargeback defined by the card organization, for example: 10.1, 13.1, 4870, 4871</p>
     */
    public void setChargeBackCode(String ChargeBackCode) {
        this.ChargeBackCode = ChargeBackCode;
    }

    /**
     * Get <p>The reason of the chargeback defined by the card organization, for example: non-receipt of goods, fraud</p> 
     * @return ChargeBackReason <p>The reason of the chargeback defined by the card organization, for example: non-receipt of goods, fraud</p>
     */
    public String getChargeBackReason() {
        return this.ChargeBackReason;
    }

    /**
     * Set <p>The reason of the chargeback defined by the card organization, for example: non-receipt of goods, fraud</p>
     * @param ChargeBackReason <p>The reason of the chargeback defined by the card organization, for example: non-receipt of goods, fraud</p>
     */
    public void setChargeBackReason(String ChargeBackReason) {
        this.ChargeBackReason = ChargeBackReason;
    }

    /**
     * Get <p>The process of the chargeback defined by the card organization</p><p>Enumeration values:</p><ul><li>need_response: Merchant needs to respond</li><li>information_supplied: Merchant has provided information</li><li>chargeback_reversed: Chargeback has been canceled</li><li>chargeback_sustained: Chargeback has been established</li></ul> 
     * @return ChargeBackProcess <p>The process of the chargeback defined by the card organization</p><p>Enumeration values:</p><ul><li>need_response: Merchant needs to respond</li><li>information_supplied: Merchant has provided information</li><li>chargeback_reversed: Chargeback has been canceled</li><li>chargeback_sustained: Chargeback has been established</li></ul>
     */
    public String getChargeBackProcess() {
        return this.ChargeBackProcess;
    }

    /**
     * Set <p>The process of the chargeback defined by the card organization</p><p>Enumeration values:</p><ul><li>need_response: Merchant needs to respond</li><li>information_supplied: Merchant has provided information</li><li>chargeback_reversed: Chargeback has been canceled</li><li>chargeback_sustained: Chargeback has been established</li></ul>
     * @param ChargeBackProcess <p>The process of the chargeback defined by the card organization</p><p>Enumeration values:</p><ul><li>need_response: Merchant needs to respond</li><li>information_supplied: Merchant has provided information</li><li>chargeback_reversed: Chargeback has been canceled</li><li>chargeback_sustained: Chargeback has been established</li></ul>
     */
    public void setChargeBackProcess(String ChargeBackProcess) {
        this.ChargeBackProcess = ChargeBackProcess;
    }

    /**
     * Get <p>The amount of the chargeback</p> 
     * @return ChargeBackAmount <p>The amount of the chargeback</p>
     */
    public Amount getChargeBackAmount() {
        return this.ChargeBackAmount;
    }

    /**
     * Set <p>The amount of the chargeback</p>
     * @param ChargeBackAmount <p>The amount of the chargeback</p>
     */
    public void setChargeBackAmount(Amount ChargeBackAmount) {
        this.ChargeBackAmount = ChargeBackAmount;
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

    public ChargeBackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargeBackEvent(ChargeBackEvent source) {
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String[source.OrderId.length];
            for (int i = 0; i < source.OrderId.length; i++) {
                this.OrderId[i] = new String(source.OrderId[i]);
            }
        }
        if (source.ChargeBackCode != null) {
            this.ChargeBackCode = new String(source.ChargeBackCode);
        }
        if (source.ChargeBackReason != null) {
            this.ChargeBackReason = new String(source.ChargeBackReason);
        }
        if (source.ChargeBackProcess != null) {
            this.ChargeBackProcess = new String(source.ChargeBackProcess);
        }
        if (source.ChargeBackAmount != null) {
            this.ChargeBackAmount = new Amount(source.ChargeBackAmount);
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
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamArraySimple(map, prefix + "OrderId.", this.OrderId);
        this.setParamSimple(map, prefix + "ChargeBackCode", this.ChargeBackCode);
        this.setParamSimple(map, prefix + "ChargeBackReason", this.ChargeBackReason);
        this.setParamSimple(map, prefix + "ChargeBackProcess", this.ChargeBackProcess);
        this.setParamObj(map, prefix + "ChargeBackAmount.", this.ChargeBackAmount);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

