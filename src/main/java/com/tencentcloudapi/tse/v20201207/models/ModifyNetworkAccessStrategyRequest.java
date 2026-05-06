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

public class ModifyNetworkAccessStrategyRequest extends AbstractModel {

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
-Open public network
-Internal private network (not currently supported)
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
    * Access control policy
    */
    @SerializedName("AccessControl")
    @Expose
    private NetworkAccessControl AccessControl;

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
-Open public network
-Internal private network (not currently supported) 
     * @return NetworkType Network type: 
-Open public network
-Internal private network (not currently supported)
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type: 
-Open public network
-Internal private network (not currently supported)
     * @param NetworkType Network type: 
-Open public network
-Internal private network (not currently supported)
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
     * Get Access control policy 
     * @return AccessControl Access control policy
     */
    public NetworkAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set Access control policy
     * @param AccessControl Access control policy
     */
    public void setAccessControl(NetworkAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    public ModifyNetworkAccessStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkAccessStrategyRequest(ModifyNetworkAccessStrategyRequest source) {
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
        if (source.AccessControl != null) {
            this.AccessControl = new NetworkAccessControl(source.AccessControl);
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
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);

    }
}

