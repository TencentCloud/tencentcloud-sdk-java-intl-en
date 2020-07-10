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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddBandwidthPackageResourcesRequest extends AbstractModel{

    /**
    * The unique ID of the source, such as 'eip-xxxx' and 'lb-xxxx'. EIP and LB resources are currently supported.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * The unique ID of the bandwidth package, such as 'bwp-xxxx'.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * The type of the bandwidth package. Valid value: 'BGP'. Internal resources will be represented by 'BGP IP'.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * The resource type, including 'Address' and 'LoadBalance'.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get The unique ID of the source, such as 'eip-xxxx' and 'lb-xxxx'. EIP and LB resources are currently supported. 
     * @return ResourceIds The unique ID of the source, such as 'eip-xxxx' and 'lb-xxxx'. EIP and LB resources are currently supported.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set The unique ID of the source, such as 'eip-xxxx' and 'lb-xxxx'. EIP and LB resources are currently supported.
     * @param ResourceIds The unique ID of the source, such as 'eip-xxxx' and 'lb-xxxx'. EIP and LB resources are currently supported.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get The unique ID of the bandwidth package, such as 'bwp-xxxx'. 
     * @return BandwidthPackageId The unique ID of the bandwidth package, such as 'bwp-xxxx'.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of the bandwidth package, such as 'bwp-xxxx'.
     * @param BandwidthPackageId The unique ID of the bandwidth package, such as 'bwp-xxxx'.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get The type of the bandwidth package. Valid value: 'BGP'. Internal resources will be represented by 'BGP IP'. 
     * @return NetworkType The type of the bandwidth package. Valid value: 'BGP'. Internal resources will be represented by 'BGP IP'.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set The type of the bandwidth package. Valid value: 'BGP'. Internal resources will be represented by 'BGP IP'.
     * @param NetworkType The type of the bandwidth package. Valid value: 'BGP'. Internal resources will be represented by 'BGP IP'.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get The resource type, including 'Address' and 'LoadBalance'. 
     * @return ResourceType The resource type, including 'Address' and 'LoadBalance'.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The resource type, including 'Address' and 'LoadBalance'.
     * @param ResourceType The resource type, including 'Address' and 'LoadBalance'.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'. 
     * @return Protocol The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'.
     * @param Protocol The protocol type of the bandwidth package. Valid values: 'ipv4' and 'ipv6'.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

