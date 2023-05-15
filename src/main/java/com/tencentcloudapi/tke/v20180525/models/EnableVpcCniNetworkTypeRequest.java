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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableVpcCniNetworkTypeRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The VPC-CNI mode. `tke-route-eni`: Multi-IP ENI, `tke-direct-eni`: Independent ENI
    */
    @SerializedName("VpcCniType")
    @Expose
    private String VpcCniType;

    /**
    * Whether to enable static IP address
    */
    @SerializedName("EnableStaticIp")
    @Expose
    private Boolean EnableStaticIp;

    /**
    * The container subnet being used
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * Specifies when to release the IP after the Pod termination in static IP mode. It must be longer than 300 seconds. If this parameter is left empty, the IP address will never be released.
    */
    @SerializedName("ExpiredSeconds")
    @Expose
    private Long ExpiredSeconds;

    /**
    * Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
    */
    @SerializedName("SkipAddingNonMasqueradeCIDRs")
    @Expose
    private Boolean SkipAddingNonMasqueradeCIDRs;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The VPC-CNI mode. `tke-route-eni`: Multi-IP ENI, `tke-direct-eni`: Independent ENI 
     * @return VpcCniType The VPC-CNI mode. `tke-route-eni`: Multi-IP ENI, `tke-direct-eni`: Independent ENI
     */
    public String getVpcCniType() {
        return this.VpcCniType;
    }

    /**
     * Set The VPC-CNI mode. `tke-route-eni`: Multi-IP ENI, `tke-direct-eni`: Independent ENI
     * @param VpcCniType The VPC-CNI mode. `tke-route-eni`: Multi-IP ENI, `tke-direct-eni`: Independent ENI
     */
    public void setVpcCniType(String VpcCniType) {
        this.VpcCniType = VpcCniType;
    }

    /**
     * Get Whether to enable static IP address 
     * @return EnableStaticIp Whether to enable static IP address
     */
    public Boolean getEnableStaticIp() {
        return this.EnableStaticIp;
    }

    /**
     * Set Whether to enable static IP address
     * @param EnableStaticIp Whether to enable static IP address
     */
    public void setEnableStaticIp(Boolean EnableStaticIp) {
        this.EnableStaticIp = EnableStaticIp;
    }

    /**
     * Get The container subnet being used 
     * @return Subnets The container subnet being used
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set The container subnet being used
     * @param Subnets The container subnet being used
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get Specifies when to release the IP after the Pod termination in static IP mode. It must be longer than 300 seconds. If this parameter is left empty, the IP address will never be released. 
     * @return ExpiredSeconds Specifies when to release the IP after the Pod termination in static IP mode. It must be longer than 300 seconds. If this parameter is left empty, the IP address will never be released.
     */
    public Long getExpiredSeconds() {
        return this.ExpiredSeconds;
    }

    /**
     * Set Specifies when to release the IP after the Pod termination in static IP mode. It must be longer than 300 seconds. If this parameter is left empty, the IP address will never be released.
     * @param ExpiredSeconds Specifies when to release the IP after the Pod termination in static IP mode. It must be longer than 300 seconds. If this parameter is left empty, the IP address will never be released.
     */
    public void setExpiredSeconds(Long ExpiredSeconds) {
        this.ExpiredSeconds = ExpiredSeconds;
    }

    /**
     * Get Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false` 
     * @return SkipAddingNonMasqueradeCIDRs Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
     */
    public Boolean getSkipAddingNonMasqueradeCIDRs() {
        return this.SkipAddingNonMasqueradeCIDRs;
    }

    /**
     * Set Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
     * @param SkipAddingNonMasqueradeCIDRs Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
     */
    public void setSkipAddingNonMasqueradeCIDRs(Boolean SkipAddingNonMasqueradeCIDRs) {
        this.SkipAddingNonMasqueradeCIDRs = SkipAddingNonMasqueradeCIDRs;
    }

    public EnableVpcCniNetworkTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableVpcCniNetworkTypeRequest(EnableVpcCniNetworkTypeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VpcCniType != null) {
            this.VpcCniType = new String(source.VpcCniType);
        }
        if (source.EnableStaticIp != null) {
            this.EnableStaticIp = new Boolean(source.EnableStaticIp);
        }
        if (source.Subnets != null) {
            this.Subnets = new String[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new String(source.Subnets[i]);
            }
        }
        if (source.ExpiredSeconds != null) {
            this.ExpiredSeconds = new Long(source.ExpiredSeconds);
        }
        if (source.SkipAddingNonMasqueradeCIDRs != null) {
            this.SkipAddingNonMasqueradeCIDRs = new Boolean(source.SkipAddingNonMasqueradeCIDRs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VpcCniType", this.VpcCniType);
        this.setParamSimple(map, prefix + "EnableStaticIp", this.EnableStaticIp);
        this.setParamArraySimple(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "ExpiredSeconds", this.ExpiredSeconds);
        this.setParamSimple(map, prefix + "SkipAddingNonMasqueradeCIDRs", this.SkipAddingNonMasqueradeCIDRs);

    }
}

