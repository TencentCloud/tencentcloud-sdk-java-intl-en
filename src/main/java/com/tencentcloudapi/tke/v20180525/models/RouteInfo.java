/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteInfo extends AbstractModel{

    /**
    * Route table name.
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * Destination CIDR.
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * Next hop address.
    */
    @SerializedName("GatewayIp")
    @Expose
    private String GatewayIp;

    /**
     * Get Route table name. 
     * @return RouteTableName Route table name.
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set Route table name.
     * @param RouteTableName Route table name.
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get Destination CIDR. 
     * @return DestinationCidrBlock Destination CIDR.
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set Destination CIDR.
     * @param DestinationCidrBlock Destination CIDR.
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get Next hop address. 
     * @return GatewayIp Next hop address.
     */
    public String getGatewayIp() {
        return this.GatewayIp;
    }

    /**
     * Set Next hop address.
     * @param GatewayIp Next hop address.
     */
    public void setGatewayIp(String GatewayIp) {
        this.GatewayIp = GatewayIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayIp", this.GatewayIp);

    }
}

