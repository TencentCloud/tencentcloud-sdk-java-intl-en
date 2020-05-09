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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportData extends AbstractModel{

    /**
    * Project ID/domain name ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Project name/domain name.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Total traffic/max bandwidth in bytes and bps, respectively.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Percentage of individual resource out of all resources.
    */
    @SerializedName("Percentage")
    @Expose
    private Float Percentage;

    /**
    * Total billable traffic/max billable bandwidth in bytes and bps, respectively.
    */
    @SerializedName("BillingValue")
    @Expose
    private Long BillingValue;

    /**
    * Percentage of billable amount out of total amount.
    */
    @SerializedName("BillingPercentage")
    @Expose
    private Float BillingPercentage;

    /**
     * Get Project ID/domain name ID. 
     * @return ResourceId Project ID/domain name ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Project ID/domain name ID.
     * @param ResourceId Project ID/domain name ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Project name/domain name. 
     * @return Resource Project name/domain name.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Project name/domain name.
     * @param Resource Project name/domain name.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Total traffic/max bandwidth in bytes and bps, respectively. 
     * @return Value Total traffic/max bandwidth in bytes and bps, respectively.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Total traffic/max bandwidth in bytes and bps, respectively.
     * @param Value Total traffic/max bandwidth in bytes and bps, respectively.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Percentage of individual resource out of all resources. 
     * @return Percentage Percentage of individual resource out of all resources.
     */
    public Float getPercentage() {
        return this.Percentage;
    }

    /**
     * Set Percentage of individual resource out of all resources.
     * @param Percentage Percentage of individual resource out of all resources.
     */
    public void setPercentage(Float Percentage) {
        this.Percentage = Percentage;
    }

    /**
     * Get Total billable traffic/max billable bandwidth in bytes and bps, respectively. 
     * @return BillingValue Total billable traffic/max billable bandwidth in bytes and bps, respectively.
     */
    public Long getBillingValue() {
        return this.BillingValue;
    }

    /**
     * Set Total billable traffic/max billable bandwidth in bytes and bps, respectively.
     * @param BillingValue Total billable traffic/max billable bandwidth in bytes and bps, respectively.
     */
    public void setBillingValue(Long BillingValue) {
        this.BillingValue = BillingValue;
    }

    /**
     * Get Percentage of billable amount out of total amount. 
     * @return BillingPercentage Percentage of billable amount out of total amount.
     */
    public Float getBillingPercentage() {
        return this.BillingPercentage;
    }

    /**
     * Set Percentage of billable amount out of total amount.
     * @param BillingPercentage Percentage of billable amount out of total amount.
     */
    public void setBillingPercentage(Float BillingPercentage) {
        this.BillingPercentage = BillingPercentage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Percentage", this.Percentage);
        this.setParamSimple(map, prefix + "BillingValue", this.BillingValue);
        this.setParamSimple(map, prefix + "BillingPercentage", this.BillingPercentage);

    }
}

