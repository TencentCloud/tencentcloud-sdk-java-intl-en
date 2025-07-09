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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcAttributeRequest extends AbstractModel {

    /**
    * Security group can be named freely, but cannot exceed 60 characters.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC can be named freely, but the maximum length is 60 characters.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Whether multicast is enabled. `true`: Enabled. `false`: Off.
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;

    /**
    * DNS address. A maximum of 4 addresses is supported. The first one is primary server by default, and the rest are secondary servers.
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
    * Domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Whether to publish the CDC subnet to CCN. `true`: Publish; `false`: Do not publish
    */
    @SerializedName("EnableCdcPublish")
    @Expose
    private Boolean EnableCdcPublish;

    /**
     * Get Security group can be named freely, but cannot exceed 60 characters. 
     * @return VpcId Security group can be named freely, but cannot exceed 60 characters.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Security group can be named freely, but cannot exceed 60 characters.
     * @param VpcId Security group can be named freely, but cannot exceed 60 characters.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC can be named freely, but the maximum length is 60 characters. 
     * @return VpcName VPC can be named freely, but the maximum length is 60 characters.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC can be named freely, but the maximum length is 60 characters.
     * @param VpcName VPC can be named freely, but the maximum length is 60 characters.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Whether multicast is enabled. `true`: Enabled. `false`: Off. 
     * @return EnableMulticast Whether multicast is enabled. `true`: Enabled. `false`: Off.
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set Whether multicast is enabled. `true`: Enabled. `false`: Off.
     * @param EnableMulticast Whether multicast is enabled. `true`: Enabled. `false`: Off.
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get DNS address. A maximum of 4 addresses is supported. The first one is primary server by default, and the rest are secondary servers. 
     * @return DnsServers DNS address. A maximum of 4 addresses is supported. The first one is primary server by default, and the rest are secondary servers.
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set DNS address. A maximum of 4 addresses is supported. The first one is primary server by default, and the rest are secondary servers.
     * @param DnsServers DNS address. A maximum of 4 addresses is supported. The first one is primary server by default, and the rest are secondary servers.
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get Domain name 
     * @return DomainName Domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name
     * @param DomainName Domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Whether to publish the CDC subnet to CCN. `true`: Publish; `false`: Do not publish 
     * @return EnableCdcPublish Whether to publish the CDC subnet to CCN. `true`: Publish; `false`: Do not publish
     */
    public Boolean getEnableCdcPublish() {
        return this.EnableCdcPublish;
    }

    /**
     * Set Whether to publish the CDC subnet to CCN. `true`: Publish; `false`: Do not publish
     * @param EnableCdcPublish Whether to publish the CDC subnet to CCN. `true`: Publish; `false`: Do not publish
     */
    public void setEnableCdcPublish(Boolean EnableCdcPublish) {
        this.EnableCdcPublish = EnableCdcPublish;
    }

    public ModifyVpcAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcAttributeRequest(ModifyVpcAttributeRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.EnableMulticast != null) {
            this.EnableMulticast = new String(source.EnableMulticast);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new String[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new String(source.DnsServers[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.EnableCdcPublish != null) {
            this.EnableCdcPublish = new Boolean(source.EnableCdcPublish);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "EnableCdcPublish", this.EnableCdcPublish);

    }
}

