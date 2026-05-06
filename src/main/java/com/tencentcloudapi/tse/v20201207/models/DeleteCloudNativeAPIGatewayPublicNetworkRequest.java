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

public class DeleteCloudNativeAPIGatewayPublicNetworkRequest extends AbstractModel {

    /**
    * Cloud native API gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * group id, required for kong event type
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * public network type
-IPV4 (default value)
- IPV6
    */
    @SerializedName("InternetAddressVersion")
    @Expose
    private String InternetAddressVersion;

    /**
    * Public IP address. Required when public IP addresses exist across multiple public networks.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get Cloud native API gateway instance ID. 
     * @return GatewayId Cloud native API gateway instance ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Cloud native API gateway instance ID.
     * @param GatewayId Cloud native API gateway instance ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get group id, required for kong event type 
     * @return GroupId group id, required for kong event type
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set group id, required for kong event type
     * @param GroupId group id, required for kong event type
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get public network type
-IPV4 (default value)
- IPV6 
     * @return InternetAddressVersion public network type
-IPV4 (default value)
- IPV6
     */
    public String getInternetAddressVersion() {
        return this.InternetAddressVersion;
    }

    /**
     * Set public network type
-IPV4 (default value)
- IPV6
     * @param InternetAddressVersion public network type
-IPV4 (default value)
- IPV6
     */
    public void setInternetAddressVersion(String InternetAddressVersion) {
        this.InternetAddressVersion = InternetAddressVersion;
    }

    /**
     * Get Public IP address. Required when public IP addresses exist across multiple public networks. 
     * @return Vip Public IP address. Required when public IP addresses exist across multiple public networks.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Public IP address. Required when public IP addresses exist across multiple public networks.
     * @param Vip Public IP address. Required when public IP addresses exist across multiple public networks.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DeleteCloudNativeAPIGatewayPublicNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayPublicNetworkRequest(DeleteCloudNativeAPIGatewayPublicNetworkRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.InternetAddressVersion != null) {
            this.InternetAddressVersion = new String(source.InternetAddressVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "InternetAddressVersion", this.InternetAddressVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

