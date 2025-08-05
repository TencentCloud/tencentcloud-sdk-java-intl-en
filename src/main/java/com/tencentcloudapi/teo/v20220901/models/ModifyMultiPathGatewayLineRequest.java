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

public class ModifyMultiPathGatewayLineRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Multi-Channel security acceleration gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Line ID. valid values:
<Li>Line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but does not support deletion.  </li>
<li<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li> 
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * Line type. valid values:.
<li>proxy: EdgeOne layer-4 proxy line, supports modifying instances and rules, but deletion is not supported.</li>.
<Li>custom: Custom line.Supports editing, deleting instances and rules. 
    */
    @SerializedName("LineType")
    @Expose
    private String LineType;

    /**
    * Line address, formatted as host:port. Direct lines (LineType value is direct) cannot be modified, while other types support modifications.
    */
    @SerializedName("LineAddress")
    @Expose
    private String LineAddress;

    /**
    * Layer-4 proxy instance ID. when the line type value is proxy (EdgeOne layer-4 proxy),  it allows modifications to the instance.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * Forwarding rule ID. when the line type  value is proxy (EdgeOne layer-4 proxy), it allows input to modify.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Multi-Channel security acceleration gateway ID. 
     * @return GatewayId Multi-Channel security acceleration gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Multi-Channel security acceleration gateway ID.
     * @param GatewayId Multi-Channel security acceleration gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Line ID. valid values:
<Li>Line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but does not support deletion.  </li>
<li<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li>  
     * @return LineId Line ID. valid values:
<Li>Line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but does not support deletion.  </li>
<li<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li> 
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set Line ID. valid values:
<Li>Line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but does not support deletion.  </li>
<li<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li> 
     * @param LineId Line ID. valid values:
<Li>Line-1: EdgeOne layer-4 proxy line. Supports modifying instances and rules, but does not support deletion.  </li>
<li<li>line-2 and above: EdgeOne layer-4 proxy lines or custom lines, supports modifying, deleting instances and rules.</li> 
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get Line type. valid values:.
<li>proxy: EdgeOne layer-4 proxy line, supports modifying instances and rules, but deletion is not supported.</li>.
<Li>custom: Custom line.Supports editing, deleting instances and rules.  
     * @return LineType Line type. valid values:.
<li>proxy: EdgeOne layer-4 proxy line, supports modifying instances and rules, but deletion is not supported.</li>.
<Li>custom: Custom line.Supports editing, deleting instances and rules. 
     */
    public String getLineType() {
        return this.LineType;
    }

    /**
     * Set Line type. valid values:.
<li>proxy: EdgeOne layer-4 proxy line, supports modifying instances and rules, but deletion is not supported.</li>.
<Li>custom: Custom line.Supports editing, deleting instances and rules. 
     * @param LineType Line type. valid values:.
<li>proxy: EdgeOne layer-4 proxy line, supports modifying instances and rules, but deletion is not supported.</li>.
<Li>custom: Custom line.Supports editing, deleting instances and rules. 
     */
    public void setLineType(String LineType) {
        this.LineType = LineType;
    }

    /**
     * Get Line address, formatted as host:port. Direct lines (LineType value is direct) cannot be modified, while other types support modifications. 
     * @return LineAddress Line address, formatted as host:port. Direct lines (LineType value is direct) cannot be modified, while other types support modifications.
     */
    public String getLineAddress() {
        return this.LineAddress;
    }

    /**
     * Set Line address, formatted as host:port. Direct lines (LineType value is direct) cannot be modified, while other types support modifications.
     * @param LineAddress Line address, formatted as host:port. Direct lines (LineType value is direct) cannot be modified, while other types support modifications.
     */
    public void setLineAddress(String LineAddress) {
        this.LineAddress = LineAddress;
    }

    /**
     * Get Layer-4 proxy instance ID. when the line type value is proxy (EdgeOne layer-4 proxy),  it allows modifications to the instance. 
     * @return ProxyId Layer-4 proxy instance ID. when the line type value is proxy (EdgeOne layer-4 proxy),  it allows modifications to the instance.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Layer-4 proxy instance ID. when the line type value is proxy (EdgeOne layer-4 proxy),  it allows modifications to the instance.
     * @param ProxyId Layer-4 proxy instance ID. when the line type value is proxy (EdgeOne layer-4 proxy),  it allows modifications to the instance.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get Forwarding rule ID. when the line type  value is proxy (EdgeOne layer-4 proxy), it allows input to modify. 
     * @return RuleId Forwarding rule ID. when the line type  value is proxy (EdgeOne layer-4 proxy), it allows input to modify.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID. when the line type  value is proxy (EdgeOne layer-4 proxy), it allows input to modify.
     * @param RuleId Forwarding rule ID. when the line type  value is proxy (EdgeOne layer-4 proxy), it allows input to modify.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public ModifyMultiPathGatewayLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMultiPathGatewayLineRequest(ModifyMultiPathGatewayLineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "LineType", this.LineType);
        this.setParamSimple(map, prefix + "LineAddress", this.LineAddress);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

