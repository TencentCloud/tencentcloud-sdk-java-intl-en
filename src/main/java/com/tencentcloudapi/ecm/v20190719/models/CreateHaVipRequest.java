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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHaVipRequest extends AbstractModel {

    /**
    * VPC ID of the HAVIP.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of the HAVIP.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * HAVIP name.
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * The specified virtual IP address, which must be within the IP range of the VPC and not in use. It will be automatically assigned if not specified.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get VPC ID of the HAVIP. 
     * @return VpcId VPC ID of the HAVIP.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of the HAVIP.
     * @param VpcId VPC ID of the HAVIP.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID of the HAVIP. 
     * @return SubnetId Subnet ID of the HAVIP.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of the HAVIP.
     * @param SubnetId Subnet ID of the HAVIP.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get HAVIP name. 
     * @return HaVipName HAVIP name.
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set HAVIP name.
     * @param HaVipName HAVIP name.
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get The specified virtual IP address, which must be within the IP range of the VPC and not in use. It will be automatically assigned if not specified. 
     * @return Vip The specified virtual IP address, which must be within the IP range of the VPC and not in use. It will be automatically assigned if not specified.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set The specified virtual IP address, which must be within the IP range of the VPC and not in use. It will be automatically assigned if not specified.
     * @param Vip The specified virtual IP address, which must be within the IP range of the VPC and not in use. It will be automatically assigned if not specified.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public CreateHaVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHaVipRequest(CreateHaVipRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

