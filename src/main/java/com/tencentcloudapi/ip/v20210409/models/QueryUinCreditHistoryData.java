/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryUinCreditHistoryData extends AbstractModel{

    /**
    * Credit allocatee UIN
    */
    @SerializedName("CreditAssignUin")
    @Expose
    private Long CreditAssignUin;

    /**
    * Allocation time
    */
    @SerializedName("AssginTime")
    @Expose
    private String AssginTime;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Allocated credit value
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
     * Get Credit allocatee UIN 
     * @return CreditAssignUin Credit allocatee UIN
     */
    public Long getCreditAssignUin() {
        return this.CreditAssignUin;
    }

    /**
     * Set Credit allocatee UIN
     * @param CreditAssignUin Credit allocatee UIN
     */
    public void setCreditAssignUin(Long CreditAssignUin) {
        this.CreditAssignUin = CreditAssignUin;
    }

    /**
     * Get Allocation time 
     * @return AssginTime Allocation time
     */
    public String getAssginTime() {
        return this.AssginTime;
    }

    /**
     * Set Allocation time
     * @param AssginTime Allocation time
     */
    public void setAssginTime(String AssginTime) {
        this.AssginTime = AssginTime;
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
     * @return CreditAmount Allocated credit value
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set Allocated credit value
     * @param CreditAmount Allocated credit value
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    public QueryUinCreditHistoryData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryUinCreditHistoryData(QueryUinCreditHistoryData source) {
        if (source.CreditAssignUin != null) {
            this.CreditAssignUin = new Long(source.CreditAssignUin);
        }
        if (source.AssginTime != null) {
            this.AssginTime = new String(source.AssginTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CreditAmount != null) {
            this.CreditAmount = new Float(source.CreditAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreditAssignUin", this.CreditAssignUin);
        this.setParamSimple(map, prefix + "AssginTime", this.AssginTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CreditAmount", this.CreditAmount);

    }
}

