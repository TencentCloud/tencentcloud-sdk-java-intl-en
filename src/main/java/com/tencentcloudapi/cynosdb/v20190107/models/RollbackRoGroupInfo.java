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

public class RollbackRoGroupInfo extends AbstractModel {

    /**
    * Instance group ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * VPC information
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet information.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vip information.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Specifies the vport information.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get Instance group ID 
     * @return InstanceGroupId Instance group ID
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID
     * @param InstanceGroupId Instance group ID
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get VPC information 
     * @return UniqVpcId VPC information
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC information
     * @param UniqVpcId VPC information
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet information. 
     * @return UniqSubnetId Subnet information.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet information.
     * @param UniqSubnetId Subnet information.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vip information. 
     * @return Vip vip information.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip information.
     * @param Vip vip information.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Specifies the vport information. 
     * @return Vport Specifies the vport information.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Specifies the vport information.
     * @param Vport Specifies the vport information.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public RollbackRoGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackRoGroupInfo(RollbackRoGroupInfo source) {
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

