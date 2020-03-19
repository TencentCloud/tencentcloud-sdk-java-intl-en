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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealInfo extends AbstractModel{

    /**
    * Order name
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Number of items
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * ID of associated flow, which can be used to query the flow execution status
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * This field is required only for an order that creates an instance, indicating the ID of the instance created by the order
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Account
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Instance billing type
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

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
     * Get Number of items 
     * @return Count Number of items
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of items
     * @param Count Number of items
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get ID of associated flow, which can be used to query the flow execution status 
     * @return FlowId ID of associated flow, which can be used to query the flow execution status
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set ID of associated flow, which can be used to query the flow execution status
     * @param FlowId ID of associated flow, which can be used to query the flow execution status
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get This field is required only for an order that creates an instance, indicating the ID of the instance created by the order 
     * @return InstanceIdSet This field is required only for an order that creates an instance, indicating the ID of the instance created by the order
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set This field is required only for an order that creates an instance, indicating the ID of the instance created by the order
     * @param InstanceIdSet This field is required only for an order that creates an instance, indicating the ID of the instance created by the order
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Account 
     * @return OwnerUin Account
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Account
     * @param OwnerUin Account
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Instance billing type 
     * @return InstanceChargeType Instance billing type
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type
     * @param InstanceChargeType Instance billing type
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

