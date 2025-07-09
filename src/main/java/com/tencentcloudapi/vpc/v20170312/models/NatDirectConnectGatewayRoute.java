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

public class NatDirectConnectGatewayRoute extends AbstractModel {

    /**
    * The `IPv4` `CIDR` of the subnet.
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * The type of the next-hop gateway. Supported types:
`DIRECTCONNECT`: Direct connect gateway
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * ID of the next-hop gateway
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * The creation time of the route
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The update time of the route
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get The `IPv4` `CIDR` of the subnet. 
     * @return DestinationCidrBlock The `IPv4` `CIDR` of the subnet.
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set The `IPv4` `CIDR` of the subnet.
     * @param DestinationCidrBlock The `IPv4` `CIDR` of the subnet.
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get The type of the next-hop gateway. Supported types:
`DIRECTCONNECT`: Direct connect gateway 
     * @return GatewayType The type of the next-hop gateway. Supported types:
`DIRECTCONNECT`: Direct connect gateway
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set The type of the next-hop gateway. Supported types:
`DIRECTCONNECT`: Direct connect gateway
     * @param GatewayType The type of the next-hop gateway. Supported types:
`DIRECTCONNECT`: Direct connect gateway
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get ID of the next-hop gateway 
     * @return GatewayId ID of the next-hop gateway
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set ID of the next-hop gateway
     * @param GatewayId ID of the next-hop gateway
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get The creation time of the route 
     * @return CreateTime The creation time of the route
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time of the route
     * @param CreateTime The creation time of the route
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The update time of the route 
     * @return UpdateTime The update time of the route
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time of the route
     * @param UpdateTime The update time of the route
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public NatDirectConnectGatewayRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatDirectConnectGatewayRoute(NatDirectConnectGatewayRoute source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

