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
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Multi-Channel security gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Line type. valid values:
<li>direct: direct connection line, cannot be modified or deleted.</li>
 <li>proxy: EdgeOne layer-4 proxy line, supports modifying instance ID and rule ID, but cannot be deleted.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * Line address format: ip:port.
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * The layer-4 proxy instance ID is required when the LineType value is proxy (EdgeOne layer-4 proxy) and can be obtained via the api [DescribeL4proxy](https://intl.cloud.tencent.com/document/api/1552/103413?from_cn_redirect=1).
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Forwarding rule ID, this field is required when the line type LineType value is proxy (EdgeOne layer-4 proxy). you can obtain it from the api [DescribeL4ProxyRules](https://intl.cloud.tencent.com/document/api/1552/103412?from_cn_redirect=1).
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Multi-Channel security gateway ID. 
     * @return GatewayId Multi-Channel security gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Multi-Channel security gateway ID.
     * @param GatewayId Multi-Channel security gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Line type. valid values:
<li>direct: direct connection line, cannot be modified or deleted.</li>
 <li>proxy: EdgeOne layer-4 proxy line, supports modifying instance ID and rule ID, but cannot be deleted.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li> 
     * @return LineType Line type. valid values:
<li>direct: direct connection line, cannot be modified or deleted.</li>
 <li>proxy: EdgeOne layer-4 proxy line, supports modifying instance ID and rule ID, but cannot be deleted.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set Line type. valid values:
<li>direct: direct connection line, cannot be modified or deleted.</li>
 <li>proxy: EdgeOne layer-4 proxy line, supports modifying instance ID and rule ID, but cannot be deleted.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
     * @param LineType Line type. valid values:
<li>direct: direct connection line, cannot be modified or deleted.</li>
 <li>proxy: EdgeOne layer-4 proxy line, supports modifying instance ID and rule ID, but cannot be deleted.</li> <li>custom: custom line, supports modifying and deleting instance ID and rule ID.</li>
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get Line address format: ip:port. 
     * @return LineAddress Line address format: ip:port.
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set Line address format: ip:port.
     * @param LineAddress Line address format: ip:port.
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get The layer-4 proxy instance ID is required when the LineType value is proxy (EdgeOne layer-4 proxy) and can be obtained via the api [DescribeL4proxy](https://intl.cloud.tencent.com/document/api/1552/103413?from_cn_redirect=1). 
     * @return ProxyId The layer-4 proxy instance ID is required when the LineType value is proxy (EdgeOne layer-4 proxy) and can be obtained via the api [DescribeL4proxy](https://intl.cloud.tencent.com/document/api/1552/103413?from_cn_redirect=1).
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set The layer-4 proxy instance ID is required when the LineType value is proxy (EdgeOne layer-4 proxy) and can be obtained via the api [DescribeL4proxy](https://intl.cloud.tencent.com/document/api/1552/103413?from_cn_redirect=1).
     * @param ProxyId The layer-4 proxy instance ID is required when the LineType value is proxy (EdgeOne layer-4 proxy) and can be obtained via the api [DescribeL4proxy](https://intl.cloud.tencent.com/document/api/1552/103413?from_cn_redirect=1).
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Forwarding rule ID, this field is required when the line type LineType value is proxy (EdgeOne layer-4 proxy). you can obtain it from the api [DescribeL4ProxyRules](https://intl.cloud.tencent.com/document/api/1552/103412?from_cn_redirect=1). 
     * @return RuleId Forwarding rule ID, this field is required when the line type LineType value is proxy (EdgeOne layer-4 proxy). you can obtain it from the api [DescribeL4ProxyRules](https://intl.cloud.tencent.com/document/api/1552/103412?from_cn_redirect=1).
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID, this field is required when the line type LineType value is proxy (EdgeOne layer-4 proxy). you can obtain it from the api [DescribeL4ProxyRules](https://intl.cloud.tencent.com/document/api/1552/103412?from_cn_redirect=1).
     * @param RuleId Forwarding rule ID, this field is required when the line type LineType value is proxy (EdgeOne layer-4 proxy). you can obtain it from the api [DescribeL4ProxyRules](https://intl.cloud.tencent.com/document/api/1552/103412?from_cn_redirect=1).
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

