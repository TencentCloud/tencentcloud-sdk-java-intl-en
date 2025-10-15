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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyEndPointConfigInfo extends AbstractModel {

    /**
    * Specifies the ID of the VPC network it belongs to.
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * Subnet ID.
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * Security group id array.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Weight mode: system-system allocation, custom-custom.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Specifies whether to automatically add a read-only instance. valid values: yes, no.
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * Read-Write attribute. valid values: READWRITE, READONLY.
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * Weight information.
    */
    @SerializedName("InstanceNameWeights")
    @Expose
    private InstanceNameWeight [] InstanceNameWeights;

    /**
     * Get Specifies the ID of the VPC network it belongs to. 
     * @return UniqueVpcId Specifies the ID of the VPC network it belongs to.
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set Specifies the ID of the VPC network it belongs to.
     * @param UniqueVpcId Specifies the ID of the VPC network it belongs to.
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get Subnet ID. 
     * @return UniqueSubnetId Subnet ID.
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set Subnet ID.
     * @param UniqueSubnetId Subnet ID.
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get Security group id array. 
     * @return SecurityGroupIds Security group id array.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group id array.
     * @param SecurityGroupIds Security group id array.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Weight mode: system-system allocation, custom-custom. 
     * @return WeightMode Weight mode: system-system allocation, custom-custom.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Weight mode: system-system allocation, custom-custom.
     * @param WeightMode Weight mode: system-system allocation, custom-custom.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Specifies whether to automatically add a read-only instance. valid values: yes, no. 
     * @return AutoAddRo Specifies whether to automatically add a read-only instance. valid values: yes, no.
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set Specifies whether to automatically add a read-only instance. valid values: yes, no.
     * @param AutoAddRo Specifies whether to automatically add a read-only instance. valid values: yes, no.
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get Read-Write attribute. valid values: READWRITE, READONLY. 
     * @return RwType Read-Write attribute. valid values: READWRITE, READONLY.
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set Read-Write attribute. valid values: READWRITE, READONLY.
     * @param RwType Read-Write attribute. valid values: READWRITE, READONLY.
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get Weight information. 
     * @return InstanceNameWeights Weight information.
     */
    public InstanceNameWeight [] getInstanceNameWeights() {
        return this.InstanceNameWeights;
    }

    /**
     * Set Weight information.
     * @param InstanceNameWeights Weight information.
     */
    public void setInstanceNameWeights(InstanceNameWeight [] InstanceNameWeights) {
        this.InstanceNameWeights = InstanceNameWeights;
    }

    public ProxyEndPointConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyEndPointConfigInfo(ProxyEndPointConfigInfo source) {
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.InstanceNameWeights != null) {
            this.InstanceNameWeights = new InstanceNameWeight[source.InstanceNameWeights.length];
            for (int i = 0; i < source.InstanceNameWeights.length; i++) {
                this.InstanceNameWeights[i] = new InstanceNameWeight(source.InstanceNameWeights[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamArrayObj(map, prefix + "InstanceNameWeights.", this.InstanceNameWeights);

    }
}

