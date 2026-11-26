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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiPathGateway extends AbstractModel {

    /**
    * Gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Gateway name.
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * Gateway type. Valid values:
<li> cloud: Cloud Gateway, a gateway created and managed by Tencent Cloud.</li>
<li> private: private gateway, a Private Gateway deployed by the user.</li>
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Gateway port. Range: 1–65535 (excluding 8888).
    */
    @SerializedName("GatewayPort")
    @Expose
    private Long GatewayPort;

    /**
    * Gateway status. Valid values:
<li> creating : Creating;</li>
<li> online : Online;</li>
<li> offline : Offline;</li>
<li> disable : disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Gateway IP in IPv4 format.
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
    * Gateway region ID. You can obtain the RegionId list through the DescribeMultiPathGatewayRegions API.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Line information. It will be returned when querying gateway information details via DescribeMultiPathGateway, but not when querying the gateway list via DescribeMultiPathGateways.
    */
    @SerializedName("Lines")
    @Expose
    private MultiPathGatewayLine [] Lines;

    /**
    * Whether the origin-pull IP list of the gateway has changed and needs confirmation. Valid values: <li>true: The origin-pull IP list has changed and needs confirmation;</li><li>false: The origin-pull IP list has not changed and does not need confirmation.</li>
    */
    @SerializedName("NeedConfirm")
    @Expose
    private String NeedConfirm;

    /**
     * Get Gateway ID. 
     * @return GatewayId Gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID.
     * @param GatewayId Gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Gateway name. 
     * @return GatewayName Gateway name.
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set Gateway name.
     * @param GatewayName Gateway name.
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get Gateway type. Valid values:
<li> cloud: Cloud Gateway, a gateway created and managed by Tencent Cloud.</li>
<li> private: private gateway, a Private Gateway deployed by the user.</li> 
     * @return GatewayType Gateway type. Valid values:
<li> cloud: Cloud Gateway, a gateway created and managed by Tencent Cloud.</li>
<li> private: private gateway, a Private Gateway deployed by the user.</li>
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type. Valid values:
<li> cloud: Cloud Gateway, a gateway created and managed by Tencent Cloud.</li>
<li> private: private gateway, a Private Gateway deployed by the user.</li>
     * @param GatewayType Gateway type. Valid values:
<li> cloud: Cloud Gateway, a gateway created and managed by Tencent Cloud.</li>
<li> private: private gateway, a Private Gateway deployed by the user.</li>
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Gateway port. Range: 1–65535 (excluding 8888). 
     * @return GatewayPort Gateway port. Range: 1–65535 (excluding 8888).
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set Gateway port. Range: 1–65535 (excluding 8888).
     * @param GatewayPort Gateway port. Range: 1–65535 (excluding 8888).
     */
    public void setGatewayPort(Long GatewayPort) {
        this.GatewayPort = GatewayPort;
    }

    /**
     * Get Gateway status. Valid values:
<li> creating : Creating;</li>
<li> online : Online;</li>
<li> offline : Offline;</li>
<li> disable : disabled.</li> 
     * @return Status Gateway status. Valid values:
<li> creating : Creating;</li>
<li> online : Online;</li>
<li> offline : Offline;</li>
<li> disable : disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Gateway status. Valid values:
<li> creating : Creating;</li>
<li> online : Online;</li>
<li> offline : Offline;</li>
<li> disable : disabled.</li>
     * @param Status Gateway status. Valid values:
<li> creating : Creating;</li>
<li> online : Online;</li>
<li> offline : Offline;</li>
<li> disable : disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Gateway IP in IPv4 format. 
     * @return GatewayIP Gateway IP in IPv4 format.
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set Gateway IP in IPv4 format.
     * @param GatewayIP Gateway IP in IPv4 format.
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    /**
     * Get Gateway region ID. You can obtain the RegionId list through the DescribeMultiPathGatewayRegions API. 
     * @return RegionId Gateway region ID. You can obtain the RegionId list through the DescribeMultiPathGatewayRegions API.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Gateway region ID. You can obtain the RegionId list through the DescribeMultiPathGatewayRegions API.
     * @param RegionId Gateway region ID. You can obtain the RegionId list through the DescribeMultiPathGatewayRegions API.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Line information. It will be returned when querying gateway information details via DescribeMultiPathGateway, but not when querying the gateway list via DescribeMultiPathGateways. 
     * @return Lines Line information. It will be returned when querying gateway information details via DescribeMultiPathGateway, but not when querying the gateway list via DescribeMultiPathGateways.
     */
    public MultiPathGatewayLine [] getLines() {
        return this.Lines;
    }

    /**
     * Set Line information. It will be returned when querying gateway information details via DescribeMultiPathGateway, but not when querying the gateway list via DescribeMultiPathGateways.
     * @param Lines Line information. It will be returned when querying gateway information details via DescribeMultiPathGateway, but not when querying the gateway list via DescribeMultiPathGateways.
     */
    public void setLines(MultiPathGatewayLine [] Lines) {
        this.Lines = Lines;
    }

    /**
     * Get Whether the origin-pull IP list of the gateway has changed and needs confirmation. Valid values: <li>true: The origin-pull IP list has changed and needs confirmation;</li><li>false: The origin-pull IP list has not changed and does not need confirmation.</li> 
     * @return NeedConfirm Whether the origin-pull IP list of the gateway has changed and needs confirmation. Valid values: <li>true: The origin-pull IP list has changed and needs confirmation;</li><li>false: The origin-pull IP list has not changed and does not need confirmation.</li>
     */
    public String getNeedConfirm() {
        return this.NeedConfirm;
    }

    /**
     * Set Whether the origin-pull IP list of the gateway has changed and needs confirmation. Valid values: <li>true: The origin-pull IP list has changed and needs confirmation;</li><li>false: The origin-pull IP list has not changed and does not need confirmation.</li>
     * @param NeedConfirm Whether the origin-pull IP list of the gateway has changed and needs confirmation. Valid values: <li>true: The origin-pull IP list has changed and needs confirmation;</li><li>false: The origin-pull IP list has not changed and does not need confirmation.</li>
     */
    public void setNeedConfirm(String NeedConfirm) {
        this.NeedConfirm = NeedConfirm;
    }

    public MultiPathGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGateway(MultiPathGateway source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayPort != null) {
            this.GatewayPort = new Long(source.GatewayPort);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.GatewayIP != null) {
            this.GatewayIP = new String(source.GatewayIP);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.Lines != null) {
            this.Lines = new MultiPathGatewayLine[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new MultiPathGatewayLine(source.Lines[i]);
            }
        }
        if (source.NeedConfirm != null) {
            this.NeedConfirm = new String(source.NeedConfirm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayPort", this.GatewayPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GatewayIP", this.GatewayIP);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArrayObj(map, prefix + "Lines.", this.Lines);
        this.setParamSimple(map, prefix + "NeedConfirm", this.NeedConfirm);

    }
}

