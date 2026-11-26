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

public class CreateMultiPathGatewayLineRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Multi-channel security gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Line type. Valid values:
<li>direct: direct connection line, modification and deletion are not supported.</li> <li>proxy: EdgeOne Layer 4 proxy line, supports modifying instance ID and rule ID, deletion is not supported.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * Line address in the format of ip:port.
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * Layer 4 proxy instance ID. It is required when the line type `LineType` value is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4Proxy](https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Forwarding rule ID. Required when the line type `LineType` is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4ProxyRules](https://www.tencentcloud.com/document/api/1552/103412?from_cn_redirect=1) API.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Multi-channel security gateway ID. 
     * @return GatewayId Multi-channel security gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Multi-channel security gateway ID.
     * @param GatewayId Multi-channel security gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Line type. Valid values:
<li>direct: direct connection line, modification and deletion are not supported.</li> <li>proxy: EdgeOne Layer 4 proxy line, supports modifying instance ID and rule ID, deletion is not supported.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li> 
     * @return LineType Line type. Valid values:
<li>direct: direct connection line, modification and deletion are not supported.</li> <li>proxy: EdgeOne Layer 4 proxy line, supports modifying instance ID and rule ID, deletion is not supported.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set Line type. Valid values:
<li>direct: direct connection line, modification and deletion are not supported.</li> <li>proxy: EdgeOne Layer 4 proxy line, supports modifying instance ID and rule ID, deletion is not supported.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
     * @param LineType Line type. Valid values:
<li>direct: direct connection line, modification and deletion are not supported.</li> <li>proxy: EdgeOne Layer 4 proxy line, supports modifying instance ID and rule ID, deletion is not supported.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get Line address in the format of ip:port. 
     * @return LineAddress Line address in the format of ip:port.
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set Line address in the format of ip:port.
     * @param LineAddress Line address in the format of ip:port.
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get Layer 4 proxy instance ID. It is required when the line type `LineType` value is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4Proxy](https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1) API. 
     * @return ProxyId Layer 4 proxy instance ID. It is required when the line type `LineType` value is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4Proxy](https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1) API.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer 4 proxy instance ID. It is required when the line type `LineType` value is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4Proxy](https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1) API.
     * @param ProxyId Layer 4 proxy instance ID. It is required when the line type `LineType` value is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4Proxy](https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1) API.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Forwarding rule ID. Required when the line type `LineType` is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4ProxyRules](https://www.tencentcloud.com/document/api/1552/103412?from_cn_redirect=1) API. 
     * @return RuleId Forwarding rule ID. Required when the line type `LineType` is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4ProxyRules](https://www.tencentcloud.com/document/api/1552/103412?from_cn_redirect=1) API.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID. Required when the line type `LineType` is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4ProxyRules](https://www.tencentcloud.com/document/api/1552/103412?from_cn_redirect=1) API.
     * @param RuleId Forwarding rule ID. Required when the line type `LineType` is `proxy` (EdgeOne Layer 4 proxy). You can obtain it via the [DescribeL4ProxyRules](https://www.tencentcloud.com/document/api/1552/103412?from_cn_redirect=1) API.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public CreateMultiPathGatewayLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMultiPathGatewayLineRequest(CreateMultiPathGatewayLineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.LineType != null) {
            this.LineType = new String(source.LineType);
        }
        if (source.LineAddress != null) {
            this.LineAddress = new String(source.LineAddress);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "LineType", this.LineType);
        this.setParamSimple(map, prefix + "LineAddress", this.LineAddress);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

