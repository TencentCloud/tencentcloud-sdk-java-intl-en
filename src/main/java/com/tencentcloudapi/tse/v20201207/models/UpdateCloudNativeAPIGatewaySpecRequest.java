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

public class UpdateCloudNativeAPIGatewaySpecRequest extends AbstractModel {

    /**
    * Cloud Native API gateway instance ID.
Only supports postpaid instances
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway group id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Gateway grouping node specification configuration.
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
     * Get Cloud Native API gateway instance ID.
Only supports postpaid instances 
     * @return GatewayId Cloud Native API gateway instance ID.
Only supports postpaid instances
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Cloud Native API gateway instance ID.
Only supports postpaid instances
     * @param GatewayId Cloud Native API gateway instance ID.
Only supports postpaid instances
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway group id 
     * @return GroupId Gateway group id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Gateway group id
     * @param GroupId Gateway group id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Gateway grouping node specification configuration. 
     * @return NodeConfig Gateway grouping node specification configuration.
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Gateway grouping node specification configuration.
     * @param NodeConfig Gateway grouping node specification configuration.
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    public UpdateCloudNativeAPIGatewaySpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCloudNativeAPIGatewaySpecRequest(UpdateCloudNativeAPIGatewaySpecRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);

    }
}

