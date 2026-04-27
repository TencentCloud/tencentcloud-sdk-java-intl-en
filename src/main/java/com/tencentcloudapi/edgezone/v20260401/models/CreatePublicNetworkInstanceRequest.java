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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePublicNetworkInstanceRequest extends AbstractModel {

    /**
    * Availability zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Public network instance name
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * Network line
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * Routing mode
    */
    @SerializedName("RouteMode")
    @Expose
    private String RouteMode;

    /**
    * Public network bandwidth (Mbps)
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get Availability zone ID. 
     * @return ZoneId Availability zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Availability zone ID.
     * @param ZoneId Availability zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Public network instance name 
     * @return NetworkInstanceName Public network instance name
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set Public network instance name
     * @param NetworkInstanceName Public network instance name
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get Network line 
     * @return Line Network line
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set Network line
     * @param Line Network line
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get Routing mode 
     * @return RouteMode Routing mode
     */
    public String getRouteMode() {
        return this.RouteMode;
    }

    /**
     * Set Routing mode
     * @param RouteMode Routing mode
     */
    public void setRouteMode(String RouteMode) {
        this.RouteMode = RouteMode;
    }

    /**
     * Get Public network bandwidth (Mbps) 
     * @return Bandwidth Public network bandwidth (Mbps)
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Public network bandwidth (Mbps)
     * @param Bandwidth Public network bandwidth (Mbps)
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public CreatePublicNetworkInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePublicNetworkInstanceRequest(CreatePublicNetworkInstanceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.RouteMode != null) {
            this.RouteMode = new String(source.RouteMode);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "RouteMode", this.RouteMode);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

