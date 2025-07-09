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

public class AddBandwidthPackageResourcesRequest extends AbstractModel {

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
    * The network type of the bandwidth package. Valid value: `BGP`, indicating that the internal resource is a BGP IP.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * The resource type, including `Address` and `LoadBalance`.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The protocol type of the bandwidth package. Valid values: `ipv4` and `ipv6`.
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
     * Get The network type of the bandwidth package. Valid value: `BGP`, indicating that the internal resource is a BGP IP. 
     * @return NetworkType The network type of the bandwidth package. Valid value: `BGP`, indicating that the internal resource is a BGP IP.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set The network type of the bandwidth package. Valid value: `BGP`, indicating that the internal resource is a BGP IP.
     * @param NetworkType The network type of the bandwidth package. Valid value: `BGP`, indicating that the internal resource is a BGP IP.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get The resource type, including `Address` and `LoadBalance`. 
     * @return ResourceType The resource type, including `Address` and `LoadBalance`.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The resource type, including `Address` and `LoadBalance`.
     * @param ResourceType The resource type, including `Address` and `LoadBalance`.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The protocol type of the bandwidth package. Valid values: `ipv4` and `ipv6`. 
     * @return Protocol The protocol type of the bandwidth package. Valid values: `ipv4` and `ipv6`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol type of the bandwidth package. Valid values: `ipv4` and `ipv6`.
     * @param Protocol The protocol type of the bandwidth package. Valid values: `ipv4` and `ipv6`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public AddBandwidthPackageResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddBandwidthPackageResourcesRequest(AddBandwidthPackageResourcesRequest source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
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

