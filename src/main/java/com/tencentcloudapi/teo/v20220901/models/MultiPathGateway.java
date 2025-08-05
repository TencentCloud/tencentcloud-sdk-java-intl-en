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
    * Specifies the gateway ID.
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
    * Gateway type. valid values:
<Li>Cloud: cloud gateway,  created and managed by Tencent cloud.</li>
<Li>Private: private gateway, deployed by cutomer.</li>
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Gateway port. value range: 1-65535 (excluding 8888).
    */
    @SerializedName("GatewayPort")
    @Expose
    private Long GatewayPort;

    /**
    * Gateway status. valid values:
<Li>creating: The gateway is being created. </li>
<Li>online: The gateway is online and operational.</li>
<Li>offline: The gateway is offline and unavailable.</li>
<Li>disabled: The gateway has been disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Gateway IP, in IPv4 format.
    */
    @SerializedName("GatewayIP")
    @Expose
    private String GatewayIP;

    /**
    * Gateway region Id. which can be obtained from the DescribeMultiPathGatewayRegions API.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Line information. The line information will be returned when querying gateway information with DescribeMultiPathGateway ande not returned when querying the gateway list with DescribeMultiPathGateways.
    */
    @SerializedName("Lines")
    @Expose
    private MultiPathGatewayLine [] Lines;

    /**
     * Get Specifies the gateway ID. 
     * @return GatewayId Specifies the gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Specifies the gateway ID.
     * @param GatewayId Specifies the gateway ID.
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
     * Get Gateway type. valid values:
<Li>Cloud: cloud gateway,  created and managed by Tencent cloud.</li>
<Li>Private: private gateway, deployed by cutomer.</li> 
     * @return GatewayType Gateway type. valid values:
<Li>Cloud: cloud gateway,  created and managed by Tencent cloud.</li>
<Li>Private: private gateway, deployed by cutomer.</li>
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Gateway type. valid values:
<Li>Cloud: cloud gateway,  created and managed by Tencent cloud.</li>
<Li>Private: private gateway, deployed by cutomer.</li>
     * @param GatewayType Gateway type. valid values:
<Li>Cloud: cloud gateway,  created and managed by Tencent cloud.</li>
<Li>Private: private gateway, deployed by cutomer.</li>
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Gateway port. value range: 1-65535 (excluding 8888). 
     * @return GatewayPort Gateway port. value range: 1-65535 (excluding 8888).
     */
    public Long getGatewayPort() {
        return this.GatewayPort;
    }

    /**
     * Set Gateway port. value range: 1-65535 (excluding 8888).
     * @param GatewayPort Gateway port. value range: 1-65535 (excluding 8888).
     */
    public void setGatewayPort(Long GatewayPort) {
        this.GatewayPort = GatewayPort;
    }

    /**
     * Get Gateway status. valid values:
<Li>creating: The gateway is being created. </li>
<Li>online: The gateway is online and operational.</li>
<Li>offline: The gateway is offline and unavailable.</li>
<Li>disabled: The gateway has been disabled.</li> 
     * @return Status Gateway status. valid values:
<Li>creating: The gateway is being created. </li>
<Li>online: The gateway is online and operational.</li>
<Li>offline: The gateway is offline and unavailable.</li>
<Li>disabled: The gateway has been disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Gateway status. valid values:
<Li>creating: The gateway is being created. </li>
<Li>online: The gateway is online and operational.</li>
<Li>offline: The gateway is offline and unavailable.</li>
<Li>disabled: The gateway has been disabled.</li>
     * @param Status Gateway status. valid values:
<Li>creating: The gateway is being created. </li>
<Li>online: The gateway is online and operational.</li>
<Li>offline: The gateway is offline and unavailable.</li>
<Li>disabled: The gateway has been disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Gateway IP, in IPv4 format. 
     * @return GatewayIP Gateway IP, in IPv4 format.
     */
    public String getGatewayIP() {
        return this.GatewayIP;
    }

    /**
     * Set Gateway IP, in IPv4 format.
     * @param GatewayIP Gateway IP, in IPv4 format.
     */
    public void setGatewayIP(String GatewayIP) {
        this.GatewayIP = GatewayIP;
    }

    /**
     * Get Gateway region Id. which can be obtained from the DescribeMultiPathGatewayRegions API. 
     * @return RegionId Gateway region Id. which can be obtained from the DescribeMultiPathGatewayRegions API.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Gateway region Id. which can be obtained from the DescribeMultiPathGatewayRegions API.
     * @param RegionId Gateway region Id. which can be obtained from the DescribeMultiPathGatewayRegions API.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Line information. The line information will be returned when querying gateway information with DescribeMultiPathGateway ande not returned when querying the gateway list with DescribeMultiPathGateways. 
     * @return Lines Line information. The line information will be returned when querying gateway information with DescribeMultiPathGateway ande not returned when querying the gateway list with DescribeMultiPathGateways.
     */
    public MultiPathGatewayLine [] getLines() {
        return this.Lines;
    }

    /**
     * Set Line information. The line information will be returned when querying gateway information with DescribeMultiPathGateway ande not returned when querying the gateway list with DescribeMultiPathGateways.
     * @param Lines Line information. The line information will be returned when querying gateway information with DescribeMultiPathGateway ande not returned when querying the gateway list with DescribeMultiPathGateways.
     */
    public void setLines(MultiPathGatewayLine [] Lines) {
        this.Lines = Lines;
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

    }
}

