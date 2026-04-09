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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceChargeTypeRequest extends AbstractModel {

    /**
    * <p>Instance ID Array</p><p>Input parameter limitation: Length of batch operation array not exceeding 20</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Operation type for billing mode change</p><p>Enumeration value:</p><ul><li>PREPAID: Transition from pay-as-you-go to monthly subscription</li><li>POSTPAID: Monthly subscription to pay-as-you-go</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Purchase duration is required only when InstanceChargeType=PREPAID.</p><p>Valid values: 1 to 36.</p><p>Unit: months.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get <p>Instance ID Array</p><p>Input parameter limitation: Length of batch operation array not exceeding 20</p> 
     * @return InstanceIds <p>Instance ID Array</p><p>Input parameter limitation: Length of batch operation array not exceeding 20</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Instance ID Array</p><p>Input parameter limitation: Length of batch operation array not exceeding 20</p>
     * @param InstanceIds <p>Instance ID Array</p><p>Input parameter limitation: Length of batch operation array not exceeding 20</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Operation type for billing mode change</p><p>Enumeration value:</p><ul><li>PREPAID: Transition from pay-as-you-go to monthly subscription</li><li>POSTPAID: Monthly subscription to pay-as-you-go</li></ul> 
     * @return InstanceChargeType <p>Operation type for billing mode change</p><p>Enumeration value:</p><ul><li>PREPAID: Transition from pay-as-you-go to monthly subscription</li><li>POSTPAID: Monthly subscription to pay-as-you-go</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Operation type for billing mode change</p><p>Enumeration value:</p><ul><li>PREPAID: Transition from pay-as-you-go to monthly subscription</li><li>POSTPAID: Monthly subscription to pay-as-you-go</li></ul>
     * @param InstanceChargeType <p>Operation type for billing mode change</p><p>Enumeration value:</p><ul><li>PREPAID: Transition from pay-as-you-go to monthly subscription</li><li>POSTPAID: Monthly subscription to pay-as-you-go</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Purchase duration is required only when InstanceChargeType=PREPAID.</p><p>Valid values: 1 to 36.</p><p>Unit: months.</p> 
     * @return Period <p>Purchase duration is required only when InstanceChargeType=PREPAID.</p><p>Valid values: 1 to 36.</p><p>Unit: months.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Purchase duration is required only when InstanceChargeType=PREPAID.</p><p>Valid values: 1 to 36.</p><p>Unit: months.</p>
     * @param Period <p>Purchase duration is required only when InstanceChargeType=PREPAID.</p><p>Valid values: 1 to 36.</p><p>Unit: months.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public ModifyInstanceChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceChargeTypeRequest(ModifyInstanceChargeTypeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

