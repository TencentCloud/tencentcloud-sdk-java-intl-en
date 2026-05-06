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

public class DescribePublicNetworkRequest extends AbstractModel {

    /**
    * Cloud native API gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * gateway group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Network ID.
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

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
     * Get gateway group ID 
     * @return GroupId gateway group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set gateway group ID
     * @param GroupId gateway group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Network ID. 
     * @return NetworkId Network ID.
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set Network ID.
     * @param NetworkId Network ID.
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    public DescribePublicNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicNetworkRequest(DescribePublicNetworkRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);

    }
}

