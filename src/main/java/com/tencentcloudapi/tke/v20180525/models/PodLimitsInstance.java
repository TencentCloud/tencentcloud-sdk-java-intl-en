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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodLimitsInstance extends AbstractModel {

    /**
    * The availability zone where the model is located
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The instance family to which the model belongs
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Instance type
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The maximum number of Pods in the VPC-CNI mode supported by the model
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PodLimits")
    @Expose
    private PodLimitsByType PodLimits;

    /**
     * Get The availability zone where the model is located
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Zone The availability zone where the model is located
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone where the model is located
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Zone The availability zone where the model is located
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The instance family to which the model belongs
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return InstanceFamily The instance family to which the model belongs
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set The instance family to which the model belongs
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param InstanceFamily The instance family to which the model belongs
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Instance type
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return InstanceType Instance type
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param InstanceType Instance type
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The maximum number of Pods in the VPC-CNI mode supported by the model
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return PodLimits The maximum number of Pods in the VPC-CNI mode supported by the model
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public PodLimitsByType getPodLimits() {
        return this.PodLimits;
    }

    /**
     * Set The maximum number of Pods in the VPC-CNI mode supported by the model
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param PodLimits The maximum number of Pods in the VPC-CNI mode supported by the model
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPodLimits(PodLimitsByType PodLimits) {
        this.PodLimits = PodLimits;
    }

    public PodLimitsInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodLimitsInstance(PodLimitsInstance source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PodLimits != null) {
            this.PodLimits = new PodLimitsByType(source.PodLimits);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "PodLimits.", this.PodLimits);

    }
}

