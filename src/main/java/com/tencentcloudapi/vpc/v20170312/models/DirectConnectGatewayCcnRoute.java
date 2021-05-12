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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectConnectGatewayCcnRoute extends AbstractModel{

    /**
    * Route ID.
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * IDC IP range.
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * The `AS-Path` attribute of `BGP`.
    */
    @SerializedName("ASPath")
    @Expose
    private String [] ASPath;

    /**
     * Get Route ID. 
     * @return RouteId Route ID.
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route ID.
     * @param RouteId Route ID.
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get IDC IP range. 
     * @return DestinationCidrBlock IDC IP range.
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set IDC IP range.
     * @param DestinationCidrBlock IDC IP range.
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get The `AS-Path` attribute of `BGP`. 
     * @return ASPath The `AS-Path` attribute of `BGP`.
     */
    public String [] getASPath() {
        return this.ASPath;
    }

    /**
     * Set The `AS-Path` attribute of `BGP`.
     * @param ASPath The `AS-Path` attribute of `BGP`.
     */
    public void setASPath(String [] ASPath) {
        this.ASPath = ASPath;
    }

    public DirectConnectGatewayCcnRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnectGatewayCcnRoute(DirectConnectGatewayCcnRoute source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.ASPath != null) {
            this.ASPath = new String[source.ASPath.length];
            for (int i = 0; i < source.ASPath.length; i++) {
                this.ASPath[i] = new String(source.ASPath[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamArraySimple(map, prefix + "ASPath.", this.ASPath);

    }
}

