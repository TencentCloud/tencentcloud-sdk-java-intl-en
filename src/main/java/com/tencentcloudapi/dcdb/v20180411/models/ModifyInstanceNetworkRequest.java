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

public class ModifyInstanceNetworkRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The ID of the desired VPC network
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The subnet ID of the desired VPC network
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The field is required to specify VIP.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * The field is required to specify VIPv6.
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * VIP retention period in hours. Value range: 0-168. Default value: `24`. `0` indicates that the VIP will be released immediately, but there will be 1-minute delay.
    */
    @SerializedName("VipReleaseDelay")
    @Expose
    private Long VipReleaseDelay;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The ID of the desired VPC network 
     * @return VpcId The ID of the desired VPC network
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The ID of the desired VPC network
     * @param VpcId The ID of the desired VPC network
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The subnet ID of the desired VPC network 
     * @return SubnetId The subnet ID of the desired VPC network
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The subnet ID of the desired VPC network
     * @param SubnetId The subnet ID of the desired VPC network
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The field is required to specify VIP. 
     * @return Vip The field is required to specify VIP.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set The field is required to specify VIP.
     * @param Vip The field is required to specify VIP.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get The field is required to specify VIPv6. 
     * @return Vipv6 The field is required to specify VIPv6.
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set The field is required to specify VIPv6.
     * @param Vipv6 The field is required to specify VIPv6.
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get VIP retention period in hours. Value range: 0-168. Default value: `24`. `0` indicates that the VIP will be released immediately, but there will be 1-minute delay. 
     * @return VipReleaseDelay VIP retention period in hours. Value range: 0-168. Default value: `24`. `0` indicates that the VIP will be released immediately, but there will be 1-minute delay.
     */
    public Long getVipReleaseDelay() {
        return this.VipReleaseDelay;
    }

    /**
     * Set VIP retention period in hours. Value range: 0-168. Default value: `24`. `0` indicates that the VIP will be released immediately, but there will be 1-minute delay.
     * @param VipReleaseDelay VIP retention period in hours. Value range: 0-168. Default value: `24`. `0` indicates that the VIP will be released immediately, but there will be 1-minute delay.
     */
    public void setVipReleaseDelay(Long VipReleaseDelay) {
        this.VipReleaseDelay = VipReleaseDelay;
    }

    public ModifyInstanceNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceNetworkRequest(ModifyInstanceNetworkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.VipReleaseDelay != null) {
            this.VipReleaseDelay = new Long(source.VipReleaseDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "VipReleaseDelay", this.VipReleaseDelay);

    }
}

