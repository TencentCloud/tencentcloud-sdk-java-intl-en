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

public class MultiPathGatewayLine extends AbstractModel {

    /**
    * line ID. where line-0 and line-1 are system-reserved IDs. valid values:
<Li>line-0: direct connection line. Adding, editing, and deletion are not supported.</li>
<Li>line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but deletion is not supported.</li>
<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li>
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * Line type. valid values:
<Li>direct: Direct connection line. Editing and deletion are not supported. .</li>
<li>proxy: EdgeOne layer-4 proxy line, supports editing and modifying instances and rules, but deletion is not supported;</li>
<Li>custom: Custom line, supports editing and deletion.</li>
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * Line address in the format host:port.
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * Layer-4 proxy instance ID,returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Forwarding rule ID. returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get line ID. where line-0 and line-1 are system-reserved IDs. valid values:
<Li>line-0: direct connection line. Adding, editing, and deletion are not supported.</li>
<Li>line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but deletion is not supported.</li>
<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li> 
     * @return LineId line ID. where line-0 and line-1 are system-reserved IDs. valid values:
<Li>line-0: direct connection line. Adding, editing, and deletion are not supported.</li>
<Li>line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but deletion is not supported.</li>
<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li>
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set line ID. where line-0 and line-1 are system-reserved IDs. valid values:
<Li>line-0: direct connection line. Adding, editing, and deletion are not supported.</li>
<Li>line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but deletion is not supported.</li>
<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li>
     * @param LineId line ID. where line-0 and line-1 are system-reserved IDs. valid values:
<Li>line-0: direct connection line. Adding, editing, and deletion are not supported.</li>
<Li>line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but deletion is not supported.</li>
<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li>
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get Line type. valid values:
<Li>direct: Direct connection line. Editing and deletion are not supported. .</li>
<li>proxy: EdgeOne layer-4 proxy line, supports editing and modifying instances and rules, but deletion is not supported;</li>
<Li>custom: Custom line, supports editing and deletion.</li> 
     * @return LineType Line type. valid values:
<Li>direct: Direct connection line. Editing and deletion are not supported. .</li>
<li>proxy: EdgeOne layer-4 proxy line, supports editing and modifying instances and rules, but deletion is not supported;</li>
<Li>custom: Custom line, supports editing and deletion.</li>
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set Line type. valid values:
<Li>direct: Direct connection line. Editing and deletion are not supported. .</li>
<li>proxy: EdgeOne layer-4 proxy line, supports editing and modifying instances and rules, but deletion is not supported;</li>
<Li>custom: Custom line, supports editing and deletion.</li>
     * @param LineType Line type. valid values:
<Li>direct: Direct connection line. Editing and deletion are not supported. .</li>
<li>proxy: EdgeOne layer-4 proxy line, supports editing and modifying instances and rules, but deletion is not supported;</li>
<Li>custom: Custom line, supports editing and deletion.</li>
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get Line address in the format host:port. 
     * @return LineAddress Line address in the format host:port.
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set Line address in the format host:port.
     * @param LineAddress Line address in the format host:port.
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get Layer-4 proxy instance ID,returned only when the LineType value is proxy (EdgeOne layer-4 proxy). 
     * @return ProxyId Layer-4 proxy instance ID,returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer-4 proxy instance ID,returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
     * @param ProxyId Layer-4 proxy instance ID,returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Forwarding rule ID. returned only when the LineType value is proxy (EdgeOne layer-4 proxy). 
     * @return RuleId Forwarding rule ID. returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID. returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
     * @param RuleId Forwarding rule ID. returned only when the LineType value is proxy (EdgeOne layer-4 proxy).
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public MultiPathGatewayLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiPathGatewayLine(MultiPathGatewayLine source) {
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
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
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "LineType", this.LineType);
        this.setParamSimple(map, prefix + "LineAddress", this.LineAddress);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

