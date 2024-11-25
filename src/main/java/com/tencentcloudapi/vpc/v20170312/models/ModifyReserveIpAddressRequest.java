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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReserveIpAddressRequest extends AbstractModel {

    /**
    * Unique ID of the VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique ID of the reserved private IP address.
    */
    @SerializedName("ReserveIpId")
    @Expose
    private String ReserveIpId;

    /**
    * Name of the reserved private IP address.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the reserved private IP address.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Unique ID of the VPC. 
     * @return VpcId Unique ID of the VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of the VPC.
     * @param VpcId Unique ID of the VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique ID of the reserved private IP address. 
     * @return ReserveIpId Unique ID of the reserved private IP address.
     */
    public String getReserveIpId() {
        return this.ReserveIpId;
    }

    /**
     * Set Unique ID of the reserved private IP address.
     * @param ReserveIpId Unique ID of the reserved private IP address.
     */
    public void setReserveIpId(String ReserveIpId) {
        this.ReserveIpId = ReserveIpId;
    }

    /**
     * Get Name of the reserved private IP address. 
     * @return Name Name of the reserved private IP address.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the reserved private IP address.
     * @param Name Name of the reserved private IP address.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the reserved private IP address. 
     * @return Description Description of the reserved private IP address.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the reserved private IP address.
     * @param Description Description of the reserved private IP address.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyReserveIpAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReserveIpAddressRequest(ModifyReserveIpAddressRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ReserveIpId != null) {
            this.ReserveIpId = new String(source.ReserveIpId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ReserveIpId", this.ReserveIpId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

