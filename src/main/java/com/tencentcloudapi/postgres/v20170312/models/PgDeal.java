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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PgDeal extends AbstractModel{

    /**
    * Order name
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * User
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Number of instances involved in order
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Billing mode. 0: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Async task flow ID
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * Instance ID array
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
     * Get Order name 
     * @return DealName Order name
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order name
     * @param DealName Order name
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get User 
     * @return OwnerUin User
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User
     * @param OwnerUin User
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Number of instances involved in order 
     * @return Count Number of instances involved in order
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of instances involved in order
     * @param Count Number of instances involved in order
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Billing mode. 0: pay-as-you-go 
     * @return PayMode Billing mode. 0: pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. 0: pay-as-you-go
     * @param PayMode Billing mode. 0: pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Async task flow ID 
     * @return FlowId Async task flow ID
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Async task flow ID
     * @param FlowId Async task flow ID
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Instance ID array 
     * @return DBInstanceIdSet Instance ID array
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set Instance ID array
     * @param DBInstanceIdSet Instance ID array
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);

    }
}

