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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkBasicInfoRequest extends AbstractModel {

    /**
    * Cloud Native API gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Network type:
-Enable public IP address
-Public IPv6 address
-Internal private network
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * IP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Public network outbound traffic bandwidth, [1,2048]Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Description of load balancing
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Load balancing specification types support:
-Leave empty for shared type.
-clb.c2.medium: standard specification
-clb.c3.small: High-performance type 1 specification
-clb.c3.medium: High-performance type 2 specification
-clb.c4.small: Super high-performance specification 1
-clb.c4.medium: Super high-performance specification 2
-clb.c4.large: Super high-performance specification 3
-clb.c4.xlarge: Super high-performance 4 specification.
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
     * Get Cloud Native API gateway instance ID. 
     * @return GatewayId Cloud Native API gateway instance ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Cloud Native API gateway instance ID.
     * @param GatewayId Cloud Native API gateway instance ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Group ID 
     * @return GroupId Group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID
     * @param GroupId Group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Network type:
-Enable public IP address
-Public IPv6 address
-Internal private network 
     * @return NetworkType Network type:
-Enable public IP address
-Public IPv6 address
-Internal private network
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type:
-Enable public IP address
-Public IPv6 address
-Internal private network
     * @param NetworkType Network type:
-Enable public IP address
-Public IPv6 address
-Internal private network
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get IP address 
     * @return Vip IP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP address
     * @param Vip IP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Public network outbound traffic bandwidth, [1,2048]Mbps 
     * @return InternetMaxBandwidthOut Public network outbound traffic bandwidth, [1,2048]Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network outbound traffic bandwidth, [1,2048]Mbps
     * @param InternetMaxBandwidthOut Public network outbound traffic bandwidth, [1,2048]Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Description of load balancing 
     * @return Description Description of load balancing
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of load balancing
     * @param Description Description of load balancing
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Load balancing specification types support:
-Leave empty for shared type.
-clb.c2.medium: standard specification
-clb.c3.small: High-performance type 1 specification
-clb.c3.medium: High-performance type 2 specification
-clb.c4.small: Super high-performance specification 1
-clb.c4.medium: Super high-performance specification 2
-clb.c4.large: Super high-performance specification 3
-clb.c4.xlarge: Super high-performance 4 specification. 
     * @return SlaType Load balancing specification types support:
-Leave empty for shared type.
-clb.c2.medium: standard specification
-clb.c3.small: High-performance type 1 specification
-clb.c3.medium: High-performance type 2 specification
-clb.c4.small: Super high-performance specification 1
-clb.c4.medium: Super high-performance specification 2
-clb.c4.large: Super high-performance specification 3
-clb.c4.xlarge: Super high-performance 4 specification.
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Load balancing specification types support:
-Leave empty for shared type.
-clb.c2.medium: standard specification
-clb.c3.small: High-performance type 1 specification
-clb.c3.medium: High-performance type 2 specification
-clb.c4.small: Super high-performance specification 1
-clb.c4.medium: Super high-performance specification 2
-clb.c4.large: Super high-performance specification 3
-clb.c4.xlarge: Super high-performance 4 specification.
     * @param SlaType Load balancing specification types support:
-Leave empty for shared type.
-clb.c2.medium: standard specification
-clb.c3.small: High-performance type 1 specification
-clb.c3.medium: High-performance type 2 specification
-clb.c4.small: Super high-performance specification 1
-clb.c4.medium: Super high-performance specification 2
-clb.c4.large: Super high-performance specification 3
-clb.c4.xlarge: Super high-performance 4 specification.
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    public ModifyNetworkBasicInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkBasicInfoRequest(ModifyNetworkBasicInfoRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);

    }
}

