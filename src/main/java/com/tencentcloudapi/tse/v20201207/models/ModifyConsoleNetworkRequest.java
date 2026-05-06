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

public class ModifyConsoleNetworkRequest extends AbstractModel {

    /**
    * Cloud Native API gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Network type:
-Open public network
-Internal private network (not currently supported)
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Enable the Konga network. Default is Open.
-Open
- Close: disabled.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

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
     * Get Enable the Konga network. Default is Open.
-Open
- Close: disabled. 
     * @return Operate Enable the Konga network. Default is Open.
-Open
- Close: disabled.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set Enable the Konga network. Default is Open.
-Open
- Close: disabled.
     * @param Operate Enable the Konga network. Default is Open.
-Open
- Close: disabled.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
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

    public ModifyConsoleNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsoleNetworkRequest(ModifyConsoleNetworkRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
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
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);

    }
}

