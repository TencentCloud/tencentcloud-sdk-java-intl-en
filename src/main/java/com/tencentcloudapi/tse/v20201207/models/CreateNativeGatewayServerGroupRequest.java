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

public class CreateNativeGatewayServerGroupRequest extends AbstractModel {

    /**
    * Gateway instance id.
Only supports postpaid instances
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * gateway group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Node configuration
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Public network bandwidth information
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Public Network Configuration.
    */
    @SerializedName("InternetConfig")
    @Expose
    private InternetConfig InternetConfig;

    /**
     * Get Gateway instance id.
Only supports postpaid instances 
     * @return GatewayId Gateway instance id.
Only supports postpaid instances
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance id.
Only supports postpaid instances
     * @param GatewayId Gateway instance id.
Only supports postpaid instances
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get gateway group name 
     * @return Name gateway group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set gateway group name
     * @param Name gateway group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Node configuration 
     * @return NodeConfig Node configuration
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Node configuration
     * @param NodeConfig Node configuration
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Description information 
     * @return Description Description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information
     * @param Description Description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Public network bandwidth information 
     * @return InternetMaxBandwidthOut Public network bandwidth information
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network bandwidth information
     * @param InternetMaxBandwidthOut Public network bandwidth information
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Public Network Configuration. 
     * @return InternetConfig Public Network Configuration.
     */
    public InternetConfig getInternetConfig() {
        return this.InternetConfig;
    }

    /**
     * Set Public Network Configuration.
     * @param InternetConfig Public Network Configuration.
     */
    public void setInternetConfig(InternetConfig InternetConfig) {
        this.InternetConfig = InternetConfig;
    }

    public CreateNativeGatewayServerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNativeGatewayServerGroupRequest(CreateNativeGatewayServerGroupRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetConfig != null) {
            this.InternetConfig = new InternetConfig(source.InternetConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamObj(map, prefix + "InternetConfig.", this.InternetConfig);

    }
}

