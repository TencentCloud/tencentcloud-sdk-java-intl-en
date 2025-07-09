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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQServerlessEndpoint extends AbstractModel {

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * subnet id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Access address
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * Access address status.
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
    * Whether it is a public network.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Boolean PublicNetwork;

    /**
    * Specifies the access policy.
    */
    @SerializedName("AccessStrategy")
    @Expose
    private String AccessStrategy;

    /**
    * Bandwidth
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get subnet id 
     * @return SubnetId subnet id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set subnet id
     * @param SubnetId subnet id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Access address 
     * @return VpcEndpoint Access address
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set Access address
     * @param VpcEndpoint Access address
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get Access address status. 
     * @return VpcDataStreamEndpointStatus Access address status.
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set Access address status.
     * @param VpcDataStreamEndpointStatus Access address status.
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
    }

    /**
     * Get Whether it is a public network. 
     * @return PublicNetwork Whether it is a public network.
     */
    public Boolean getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Whether it is a public network.
     * @param PublicNetwork Whether it is a public network.
     */
    public void setPublicNetwork(Boolean PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get Specifies the access policy. 
     * @return AccessStrategy Specifies the access policy.
     */
    public String getAccessStrategy() {
        return this.AccessStrategy;
    }

    /**
     * Set Specifies the access policy.
     * @param AccessStrategy Specifies the access policy.
     */
    public void setAccessStrategy(String AccessStrategy) {
        this.AccessStrategy = AccessStrategy;
    }

    /**
     * Get Bandwidth 
     * @return Bandwidth Bandwidth
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth
     * @param Bandwidth Bandwidth
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public RabbitMQServerlessEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQServerlessEndpoint(RabbitMQServerlessEndpoint source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcEndpoint != null) {
            this.VpcEndpoint = new String(source.VpcEndpoint);
        }
        if (source.VpcDataStreamEndpointStatus != null) {
            this.VpcDataStreamEndpointStatus = new String(source.VpcDataStreamEndpointStatus);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Boolean(source.PublicNetwork);
        }
        if (source.AccessStrategy != null) {
            this.AccessStrategy = new String(source.AccessStrategy);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);
        this.setParamSimple(map, prefix + "VpcDataStreamEndpointStatus", this.VpcDataStreamEndpointStatus);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "AccessStrategy", this.AccessStrategy);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

