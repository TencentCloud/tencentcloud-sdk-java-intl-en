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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPCOption extends AbstractModel {

    /**
    * VPC ID (Either VPCId or VPCCIDRBlock must be selected. If VPCId is selected, the existing VPCs will be used; if VPCCIDRBlock is selected, a new VPC will be created.)
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * Subnet ID (Either SubnetId or SubnetZone&SubnetCIDRBlock must be selected. If SubnetId is selected, the existing subnet will be used; if SubnetZone&SubnetCIDRBlock is selected, a new subnet will be created.)
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Subnet availability zone
    */
    @SerializedName("SubnetZone")
    @Expose
    private String SubnetZone;

    /**
    *  VPC CIDR.
    */
    @SerializedName("VPCCIDRBlock")
    @Expose
    private String VPCCIDRBlock;

    /**
    * Subnet CIDR
    */
    @SerializedName("SubnetCIDRBlock")
    @Expose
    private String SubnetCIDRBlock;

    /**
     * Get VPC ID (Either VPCId or VPCCIDRBlock must be selected. If VPCId is selected, the existing VPCs will be used; if VPCCIDRBlock is selected, a new VPC will be created.) 
     * @return VPCId VPC ID (Either VPCId or VPCCIDRBlock must be selected. If VPCId is selected, the existing VPCs will be used; if VPCCIDRBlock is selected, a new VPC will be created.)
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set VPC ID (Either VPCId or VPCCIDRBlock must be selected. If VPCId is selected, the existing VPCs will be used; if VPCCIDRBlock is selected, a new VPC will be created.)
     * @param VPCId VPC ID (Either VPCId or VPCCIDRBlock must be selected. If VPCId is selected, the existing VPCs will be used; if VPCCIDRBlock is selected, a new VPC will be created.)
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get Subnet ID (Either SubnetId or SubnetZone&SubnetCIDRBlock must be selected. If SubnetId is selected, the existing subnet will be used; if SubnetZone&SubnetCIDRBlock is selected, a new subnet will be created.) 
     * @return SubnetId Subnet ID (Either SubnetId or SubnetZone&SubnetCIDRBlock must be selected. If SubnetId is selected, the existing subnet will be used; if SubnetZone&SubnetCIDRBlock is selected, a new subnet will be created.)
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID (Either SubnetId or SubnetZone&SubnetCIDRBlock must be selected. If SubnetId is selected, the existing subnet will be used; if SubnetZone&SubnetCIDRBlock is selected, a new subnet will be created.)
     * @param SubnetId Subnet ID (Either SubnetId or SubnetZone&SubnetCIDRBlock must be selected. If SubnetId is selected, the existing subnet will be used; if SubnetZone&SubnetCIDRBlock is selected, a new subnet will be created.)
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Subnet availability zone 
     * @return SubnetZone Subnet availability zone
     */
    public String getSubnetZone() {
        return this.SubnetZone;
    }

    /**
     * Set Subnet availability zone
     * @param SubnetZone Subnet availability zone
     */
    public void setSubnetZone(String SubnetZone) {
        this.SubnetZone = SubnetZone;
    }

    /**
     * Get  VPC CIDR. 
     * @return VPCCIDRBlock  VPC CIDR.
     */
    public String getVPCCIDRBlock() {
        return this.VPCCIDRBlock;
    }

    /**
     * Set  VPC CIDR.
     * @param VPCCIDRBlock  VPC CIDR.
     */
    public void setVPCCIDRBlock(String VPCCIDRBlock) {
        this.VPCCIDRBlock = VPCCIDRBlock;
    }

    /**
     * Get Subnet CIDR 
     * @return SubnetCIDRBlock Subnet CIDR
     */
    public String getSubnetCIDRBlock() {
        return this.SubnetCIDRBlock;
    }

    /**
     * Set Subnet CIDR
     * @param SubnetCIDRBlock Subnet CIDR
     */
    public void setSubnetCIDRBlock(String SubnetCIDRBlock) {
        this.SubnetCIDRBlock = SubnetCIDRBlock;
    }

    public VPCOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPCOption(VPCOption source) {
        if (source.VPCId != null) {
            this.VPCId = new String(source.VPCId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetZone != null) {
            this.SubnetZone = new String(source.SubnetZone);
        }
        if (source.VPCCIDRBlock != null) {
            this.VPCCIDRBlock = new String(source.VPCCIDRBlock);
        }
        if (source.SubnetCIDRBlock != null) {
            this.SubnetCIDRBlock = new String(source.SubnetCIDRBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VPCId", this.VPCId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetZone", this.SubnetZone);
        this.setParamSimple(map, prefix + "VPCCIDRBlock", this.VPCCIDRBlock);
        this.setParamSimple(map, prefix + "SubnetCIDRBlock", this.SubnetCIDRBlock);

    }
}

