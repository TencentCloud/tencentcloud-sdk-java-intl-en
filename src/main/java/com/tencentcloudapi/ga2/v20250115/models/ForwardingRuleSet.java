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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForwardingRuleSet extends AbstractModel {

    /**
    * <p>Conditional information of Layer 7 forwarding rules.</p>
    */
    @SerializedName("RuleCondition")
    @Expose
    private RuleCondition [] RuleCondition;

    /**
    * <p>Behavior information of the Layer 7 forwarding rule.</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private RuleAction [] RuleAction;

    /**
    * <p>Whether to enable origin-pull Sni.</p>
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * <p>Origin-pull Sni.</p>
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * <p>Origin-pull Header information.</p>
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * <p>Origin-pull Host.</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Listener ID.</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Layer-7 forwarding policy ID.</p>
    */
    @SerializedName("ForwardingPolicyId")
    @Expose
    private String ForwardingPolicyId;

    /**
    * <p>Layer 7 forwarding rule ID.</p>
    */
    @SerializedName("ForwardingRuleId")
    @Expose
    private String ForwardingRuleId;

    /**
    * <p>Origin server response header</p>
    */
    @SerializedName("HideResponseHeaders")
    @Expose
    private HideResponseHeaders [] HideResponseHeaders;

    /**
    * <p>Delete origin server response headers</p>
    */
    @SerializedName("ResponseHeaders")
    @Expose
    private ResponseHeaders [] ResponseHeaders;

    /**
     * Get <p>Conditional information of Layer 7 forwarding rules.</p> 
     * @return RuleCondition <p>Conditional information of Layer 7 forwarding rules.</p>
     */
    public RuleCondition [] getRuleCondition() {
        return this.RuleCondition;
    }

    /**
     * Set <p>Conditional information of Layer 7 forwarding rules.</p>
     * @param RuleCondition <p>Conditional information of Layer 7 forwarding rules.</p>
     */
    public void setRuleCondition(RuleCondition [] RuleCondition) {
        this.RuleCondition = RuleCondition;
    }

    /**
     * Get <p>Behavior information of the Layer 7 forwarding rule.</p> 
     * @return RuleAction <p>Behavior information of the Layer 7 forwarding rule.</p>
     */
    public RuleAction [] getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>Behavior information of the Layer 7 forwarding rule.</p>
     * @param RuleAction <p>Behavior information of the Layer 7 forwarding rule.</p>
     */
    public void setRuleAction(RuleAction [] RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>Whether to enable origin-pull Sni.</p> 
     * @return EnableOriginSni <p>Whether to enable origin-pull Sni.</p>
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set <p>Whether to enable origin-pull Sni.</p>
     * @param EnableOriginSni <p>Whether to enable origin-pull Sni.</p>
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get <p>Origin-pull Sni.</p> 
     * @return OriginSni <p>Origin-pull Sni.</p>
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set <p>Origin-pull Sni.</p>
     * @param OriginSni <p>Origin-pull Sni.</p>
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get <p>Origin-pull Header information.</p> 
     * @return OriginHeaders <p>Origin-pull Header information.</p>
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set <p>Origin-pull Header information.</p>
     * @param OriginHeaders <p>Origin-pull Header information.</p>
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get <p>Origin-pull Host.</p> 
     * @return OriginHost <p>Origin-pull Host.</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>Origin-pull Host.</p>
     * @param OriginHost <p>Origin-pull Host.</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Listener ID.</p> 
     * @return ListenerId <p>Listener ID.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Listener ID.</p>
     * @param ListenerId <p>Listener ID.</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Layer-7 forwarding policy ID.</p> 
     * @return ForwardingPolicyId <p>Layer-7 forwarding policy ID.</p>
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set <p>Layer-7 forwarding policy ID.</p>
     * @param ForwardingPolicyId <p>Layer-7 forwarding policy ID.</p>
     */
    public void setForwardingPolicyId(String ForwardingPolicyId) {
        this.ForwardingPolicyId = ForwardingPolicyId;
    }

    /**
     * Get <p>Layer 7 forwarding rule ID.</p> 
     * @return ForwardingRuleId <p>Layer 7 forwarding rule ID.</p>
     */
    public String getForwardingRuleId() {
        return this.ForwardingRuleId;
    }

    /**
     * Set <p>Layer 7 forwarding rule ID.</p>
     * @param ForwardingRuleId <p>Layer 7 forwarding rule ID.</p>
     */
    public void setForwardingRuleId(String ForwardingRuleId) {
        this.ForwardingRuleId = ForwardingRuleId;
    }

    /**
     * Get <p>Origin server response header</p> 
     * @return HideResponseHeaders <p>Origin server response header</p>
     */
    public HideResponseHeaders [] getHideResponseHeaders() {
        return this.HideResponseHeaders;
    }

    /**
     * Set <p>Origin server response header</p>
     * @param HideResponseHeaders <p>Origin server response header</p>
     */
    public void setHideResponseHeaders(HideResponseHeaders [] HideResponseHeaders) {
        this.HideResponseHeaders = HideResponseHeaders;
    }

    /**
     * Get <p>Delete origin server response headers</p> 
     * @return ResponseHeaders <p>Delete origin server response headers</p>
     */
    public ResponseHeaders [] getResponseHeaders() {
        return this.ResponseHeaders;
    }

    /**
     * Set <p>Delete origin server response headers</p>
     * @param ResponseHeaders <p>Delete origin server response headers</p>
     */
    public void setResponseHeaders(ResponseHeaders [] ResponseHeaders) {
        this.ResponseHeaders = ResponseHeaders;
    }

    public ForwardingRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardingRuleSet(ForwardingRuleSet source) {
        if (source.RuleCondition != null) {
            this.RuleCondition = new RuleCondition[source.RuleCondition.length];
            for (int i = 0; i < source.RuleCondition.length; i++) {
                this.RuleCondition[i] = new RuleCondition(source.RuleCondition[i]);
            }
        }
        if (source.RuleAction != null) {
            this.RuleAction = new RuleAction[source.RuleAction.length];
            for (int i = 0; i < source.RuleAction.length; i++) {
                this.RuleAction[i] = new RuleAction(source.RuleAction[i]);
            }
        }
        if (source.EnableOriginSni != null) {
            this.EnableOriginSni = new Boolean(source.EnableOriginSni);
        }
        if (source.OriginSni != null) {
            this.OriginSni = new String(source.OriginSni);
        }
        if (source.OriginHeaders != null) {
            this.OriginHeaders = new OriginHeader[source.OriginHeaders.length];
            for (int i = 0; i < source.OriginHeaders.length; i++) {
                this.OriginHeaders[i] = new OriginHeader(source.OriginHeaders[i]);
            }
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ForwardingPolicyId != null) {
            this.ForwardingPolicyId = new String(source.ForwardingPolicyId);
        }
        if (source.ForwardingRuleId != null) {
            this.ForwardingRuleId = new String(source.ForwardingRuleId);
        }
        if (source.HideResponseHeaders != null) {
            this.HideResponseHeaders = new HideResponseHeaders[source.HideResponseHeaders.length];
            for (int i = 0; i < source.HideResponseHeaders.length; i++) {
                this.HideResponseHeaders[i] = new HideResponseHeaders(source.HideResponseHeaders[i]);
            }
        }
        if (source.ResponseHeaders != null) {
            this.ResponseHeaders = new ResponseHeaders[source.ResponseHeaders.length];
            for (int i = 0; i < source.ResponseHeaders.length; i++) {
                this.ResponseHeaders[i] = new ResponseHeaders(source.ResponseHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleCondition.", this.RuleCondition);
        this.setParamArrayObj(map, prefix + "RuleAction.", this.RuleAction);
        this.setParamSimple(map, prefix + "EnableOriginSni", this.EnableOriginSni);
        this.setParamSimple(map, prefix + "OriginSni", this.OriginSni);
        this.setParamArrayObj(map, prefix + "OriginHeaders.", this.OriginHeaders);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ForwardingPolicyId", this.ForwardingPolicyId);
        this.setParamSimple(map, prefix + "ForwardingRuleId", this.ForwardingRuleId);
        this.setParamArrayObj(map, prefix + "HideResponseHeaders.", this.HideResponseHeaders);
        this.setParamArrayObj(map, prefix + "ResponseHeaders.", this.ResponseHeaders);

    }
}

