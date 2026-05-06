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

public class DescribeCloudNativeAPIGatewayConfigResult extends AbstractModel {

    /**
    * Gateway Instance ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Grouped network configuration list.
    */
    @SerializedName("ConfigList")
    @Expose
    private CloudNativeAPIGatewayConfig [] ConfigList;

    /**
    * Grouped subnet info
    */
    @SerializedName("GroupSubnetId")
    @Expose
    private String GroupSubnetId;

    /**
    * Grouped VPC info
    */
    @SerializedName("GroupVpcId")
    @Expose
    private String GroupVpcId;

    /**
    * group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Gateway Instance ID 
     * @return GatewayId Gateway Instance ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway Instance ID
     * @param GatewayId Gateway Instance ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Grouped network configuration list. 
     * @return ConfigList Grouped network configuration list.
     */
    public CloudNativeAPIGatewayConfig [] getConfigList() {
        return this.ConfigList;
    }

    /**
     * Set Grouped network configuration list.
     * @param ConfigList Grouped network configuration list.
     */
    public void setConfigList(CloudNativeAPIGatewayConfig [] ConfigList) {
        this.ConfigList = ConfigList;
    }

    /**
     * Get Grouped subnet info 
     * @return GroupSubnetId Grouped subnet info
     */
    public String getGroupSubnetId() {
        return this.GroupSubnetId;
    }

    /**
     * Set Grouped subnet info
     * @param GroupSubnetId Grouped subnet info
     */
    public void setGroupSubnetId(String GroupSubnetId) {
        this.GroupSubnetId = GroupSubnetId;
    }

    /**
     * Get Grouped VPC info 
     * @return GroupVpcId Grouped VPC info
     */
    public String getGroupVpcId() {
        return this.GroupVpcId;
    }

    /**
     * Set Grouped VPC info
     * @param GroupVpcId Grouped VPC info
     */
    public void setGroupVpcId(String GroupVpcId) {
        this.GroupVpcId = GroupVpcId;
    }

    /**
     * Get group ID 
     * @return GroupId group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set group ID
     * @param GroupId group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DescribeCloudNativeAPIGatewayConfigResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayConfigResult(DescribeCloudNativeAPIGatewayConfigResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ConfigList != null) {
            this.ConfigList = new CloudNativeAPIGatewayConfig[source.ConfigList.length];
            for (int i = 0; i < source.ConfigList.length; i++) {
                this.ConfigList[i] = new CloudNativeAPIGatewayConfig(source.ConfigList[i]);
            }
        }
        if (source.GroupSubnetId != null) {
            this.GroupSubnetId = new String(source.GroupSubnetId);
        }
        if (source.GroupVpcId != null) {
            this.GroupVpcId = new String(source.GroupVpcId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArrayObj(map, prefix + "ConfigList.", this.ConfigList);
        this.setParamSimple(map, prefix + "GroupSubnetId", this.GroupSubnetId);
        this.setParamSimple(map, prefix + "GroupVpcId", this.GroupVpcId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

