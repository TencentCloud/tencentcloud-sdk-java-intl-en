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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageInternalEndpointRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Create/Delete
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * ID of the VPC to be connected to
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet to be connected to
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ID of the requested region, which is used as the region of the replica instance
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Name of the requested region, which is used as the region of the replica instance
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Create/Delete 
     * @return Operation Create/Delete
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Create/Delete
     * @param Operation Create/Delete
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get ID of the VPC to be connected to 
     * @return VpcId ID of the VPC to be connected to
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC to be connected to
     * @param VpcId ID of the VPC to be connected to
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet to be connected to 
     * @return SubnetId ID of the subnet to be connected to
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet to be connected to
     * @param SubnetId ID of the subnet to be connected to
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ID of the requested region, which is used as the region of the replica instance 
     * @return RegionId ID of the requested region, which is used as the region of the replica instance
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set ID of the requested region, which is used as the region of the replica instance
     * @param RegionId ID of the requested region, which is used as the region of the replica instance
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Name of the requested region, which is used as the region of the replica instance 
     * @return RegionName Name of the requested region, which is used as the region of the replica instance
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Name of the requested region, which is used as the region of the replica instance
     * @param RegionName Name of the requested region, which is used as the region of the replica instance
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public ManageInternalEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageInternalEndpointRequest(ManageInternalEndpointRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

