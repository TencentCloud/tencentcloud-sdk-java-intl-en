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

public class DescribePublicNetworkResult extends AbstractModel {

    /**
    * Gateway instance ID
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
    * Client public network information
    */
    @SerializedName("PublicNetwork")
    @Expose
    private CloudNativeAPIGatewayConfig PublicNetwork;

    /**
     * Get Gateway instance ID 
     * @return GatewayId Gateway instance ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance ID
     * @param GatewayId Gateway instance ID
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
     * Get Client public network information 
     * @return PublicNetwork Client public network information
     */
    public CloudNativeAPIGatewayConfig getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Client public network information
     * @param PublicNetwork Client public network information
     */
    public void setPublicNetwork(CloudNativeAPIGatewayConfig PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    public DescribePublicNetworkResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicNetworkResult(DescribePublicNetworkResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new CloudNativeAPIGatewayConfig(source.PublicNetwork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "PublicNetwork.", this.PublicNetwork);

    }
}

