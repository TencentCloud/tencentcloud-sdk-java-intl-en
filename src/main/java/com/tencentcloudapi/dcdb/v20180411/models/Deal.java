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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Deal extends AbstractModel {

    /**
    * Order ID.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Account
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Number of items
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * The associated process ID, which can be used to query the process execution status.
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * The ID of the created instance, which is required only for the order that creates an instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Billing mode. Valid values: `0` (postpaid), `1` (prepaid).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get Order ID. 
     * @return DealName Order ID.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order ID.
     * @param DealName Order ID.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
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
     * Get The associated process ID, which can be used to query the process execution status. 
     * @return FlowId The associated process ID, which can be used to query the process execution status.
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set The associated process ID, which can be used to query the process execution status.
     * @param FlowId The associated process ID, which can be used to query the process execution status.
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get The ID of the created instance, which is required only for the order that creates an instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceIds The ID of the created instance, which is required only for the order that creates an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set The ID of the created instance, which is required only for the order that creates an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceIds The ID of the created instance, which is required only for the order that creates an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Billing mode. Valid values: `0` (postpaid), `1` (prepaid). 
     * @return PayMode Billing mode. Valid values: `0` (postpaid), `1` (prepaid).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Valid values: `0` (postpaid), `1` (prepaid).
     * @param PayMode Billing mode. Valid values: `0` (postpaid), `1` (prepaid).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public Deal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Deal(Deal source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

