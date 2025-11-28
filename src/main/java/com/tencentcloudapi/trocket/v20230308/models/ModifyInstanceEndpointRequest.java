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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceEndpointRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Access point type.
PUBLIC network.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Public network bandwidth, in Mbps
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Public network security group information
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * Whether the public network is billed by traffic.
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.comom/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Access point type.
PUBLIC network. 
     * @return Type Access point type.
PUBLIC network.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Access point type.
PUBLIC network.
     * @param Type Access point type.
PUBLIC network.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Public network bandwidth, in Mbps 
     * @return Bandwidth Public network bandwidth, in Mbps
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Public network bandwidth, in Mbps
     * @param Bandwidth Public network bandwidth, in Mbps
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Public network security group information 
     * @return IpRules Public network security group information
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set Public network security group information
     * @param IpRules Public network security group information
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get Whether the public network is billed by traffic. 
     * @return BillingFlow Whether the public network is billed by traffic.
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set Whether the public network is billed by traffic.
     * @param BillingFlow Whether the public network is billed by traffic.
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    public ModifyInstanceEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceEndpointRequest(ModifyInstanceEndpointRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);

    }
}

