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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditAllocationHistoryData extends AbstractModel {

    /**
    * Allocation time
    */
    @SerializedName("AllocatedTime")
    @Expose
    private String AllocatedTime;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Allocated credit value
    */
    @SerializedName("Credit")
    @Expose
    private Float Credit;

    /**
    * The allocated total credit
    */
    @SerializedName("AllocatedCredit")
    @Expose
    private Float AllocatedCredit;

    /**
    * Available credits after allocation.
    */
    @SerializedName("ClientCreditAfter")
    @Expose
    private Float ClientCreditAfter;

    /**
    * Remark
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Allocation time 
     * @return AllocatedTime Allocation time
     */
    public String getAllocatedTime() {
        return this.AllocatedTime;
    }

    /**
     * Set Allocation time
     * @param AllocatedTime Allocation time
     */
    public void setAllocatedTime(String AllocatedTime) {
        this.AllocatedTime = AllocatedTime;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Allocated credit value 
     * @return Credit Allocated credit value
     */
    public Float getCredit() {
        return this.Credit;
    }

    /**
     * Set Allocated credit value
     * @param Credit Allocated credit value
     */
    public void setCredit(Float Credit) {
        this.Credit = Credit;
    }

    /**
     * Get The allocated total credit 
     * @return AllocatedCredit The allocated total credit
     */
    public Float getAllocatedCredit() {
        return this.AllocatedCredit;
    }

    /**
     * Set The allocated total credit
     * @param AllocatedCredit The allocated total credit
     */
    public void setAllocatedCredit(Float AllocatedCredit) {
        this.AllocatedCredit = AllocatedCredit;
    }

    /**
     * Get Available credits after allocation. 
     * @return ClientCreditAfter Available credits after allocation.
     */
    public Float getClientCreditAfter() {
        return this.ClientCreditAfter;
    }

    /**
     * Set Available credits after allocation.
     * @param ClientCreditAfter Available credits after allocation.
     */
    public void setClientCreditAfter(Float ClientCreditAfter) {
        this.ClientCreditAfter = ClientCreditAfter;
    }

    /**
     * Get Remark 
     * @return Remark Remark
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remark
     * @param Remark Remark
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public QueryCreditAllocationHistoryData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditAllocationHistoryData(QueryCreditAllocationHistoryData source) {
        if (source.AllocatedTime != null) {
            this.AllocatedTime = new String(source.AllocatedTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Credit != null) {
            this.Credit = new Float(source.Credit);
        }
        if (source.AllocatedCredit != null) {
            this.AllocatedCredit = new Float(source.AllocatedCredit);
        }
        if (source.ClientCreditAfter != null) {
            this.ClientCreditAfter = new Float(source.ClientCreditAfter);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedTime", this.AllocatedTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Credit", this.Credit);
        this.setParamSimple(map, prefix + "AllocatedCredit", this.AllocatedCredit);
        this.setParamSimple(map, prefix + "ClientCreditAfter", this.ClientCreditAfter);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

