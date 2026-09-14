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

public class ModifyForwardingRuleRequest extends AbstractModel {

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
    * <p>Policy ID.</p>
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
    * <p>Conditional information of Layer 7 forwarding rules.</p><p>Input parameter limit: The array length cannot exceed 1.</p>
    */
    @SerializedName("RuleConditions")
    @Expose
    private RuleCondition [] RuleConditions;

    /**
    * <p>Layer 7 forwarding rule behavior information.</p><p>Input parameter limit: array length cannot exceed 1.</p>
    */
    @SerializedName("RuleActions")
    @Expose
    private RuleAction [] RuleActions;

    /**
    * <p>Origin-pull Header information.</p><p>Input limitation: The length of the array is between 1 and 5.</p>
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * <p>Whether to enable origin-pull sni.</p>
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin sni is enabled.</p>
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * <p>Origin-pull host.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin-pull sni is enabled.</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>Origin server response headers</p><p>Input limitation: The array length cannot exceed 5.</p>
    */
    @SerializedName("ResponseHeaders")
    @Expose
    private ResponseHeaders [] ResponseHeaders;

    /**
    * <p>Delete origin response headers</p><p>Input parameter limit: array length cannot exceed 5.</p>
    */
    @SerializedName("HideResponseHeaders")
    @Expose
    private HideResponseHeaders [] HideResponseHeaders;

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
     * Get <p>Policy ID.</p> 
     * @return ForwardingPolicyId <p>Policy ID.</p>
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param ForwardingPolicyId <p>Policy ID.</p>
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
     * Get <p>Conditional information of Layer 7 forwarding rules.</p><p>Input parameter limit: The array length cannot exceed 1.</p> 
     * @return RuleConditions <p>Conditional information of Layer 7 forwarding rules.</p><p>Input parameter limit: The array length cannot exceed 1.</p>
     */
    public RuleCondition [] getRuleConditions() {
        return this.RuleConditions;
    }

    /**
     * Set <p>Conditional information of Layer 7 forwarding rules.</p><p>Input parameter limit: The array length cannot exceed 1.</p>
     * @param RuleConditions <p>Conditional information of Layer 7 forwarding rules.</p><p>Input parameter limit: The array length cannot exceed 1.</p>
     */
    public void setRuleConditions(RuleCondition [] RuleConditions) {
        this.RuleConditions = RuleConditions;
    }

    /**
     * Get <p>Layer 7 forwarding rule behavior information.</p><p>Input parameter limit: array length cannot exceed 1.</p> 
     * @return RuleActions <p>Layer 7 forwarding rule behavior information.</p><p>Input parameter limit: array length cannot exceed 1.</p>
     */
    public RuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set <p>Layer 7 forwarding rule behavior information.</p><p>Input parameter limit: array length cannot exceed 1.</p>
     * @param RuleActions <p>Layer 7 forwarding rule behavior information.</p><p>Input parameter limit: array length cannot exceed 1.</p>
     */
    public void setRuleActions(RuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get <p>Origin-pull Header information.</p><p>Input limitation: The length of the array is between 1 and 5.</p> 
     * @return OriginHeaders <p>Origin-pull Header information.</p><p>Input limitation: The length of the array is between 1 and 5.</p>
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set <p>Origin-pull Header information.</p><p>Input limitation: The length of the array is between 1 and 5.</p>
     * @param OriginHeaders <p>Origin-pull Header information.</p><p>Input limitation: The length of the array is between 1 and 5.</p>
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get <p>Whether to enable origin-pull sni.</p> 
     * @return EnableOriginSni <p>Whether to enable origin-pull sni.</p>
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set <p>Whether to enable origin-pull sni.</p>
     * @param EnableOriginSni <p>Whether to enable origin-pull sni.</p>
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin sni is enabled.</p> 
     * @return OriginSni <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin sni is enabled.</p>
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin sni is enabled.</p>
     * @param OriginSni <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin sni is enabled.</p>
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get <p>Origin-pull host.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin-pull sni is enabled.</p> 
     * @return OriginHost <p>Origin-pull host.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin-pull sni is enabled.</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>Origin-pull host.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin-pull sni is enabled.</p>
     * @param OriginHost <p>Origin-pull host.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when origin-pull sni is enabled.</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>Origin server response headers</p><p>Input limitation: The array length cannot exceed 5.</p> 
     * @return ResponseHeaders <p>Origin server response headers</p><p>Input limitation: The array length cannot exceed 5.</p>
     */
    public ResponseHeaders [] getResponseHeaders() {
        return this.ResponseHeaders;
    }

    /**
     * Set <p>Origin server response headers</p><p>Input limitation: The array length cannot exceed 5.</p>
     * @param ResponseHeaders <p>Origin server response headers</p><p>Input limitation: The array length cannot exceed 5.</p>
     */
    public void setResponseHeaders(ResponseHeaders [] ResponseHeaders) {
        this.ResponseHeaders = ResponseHeaders;
    }

    /**
     * Get <p>Delete origin response headers</p><p>Input parameter limit: array length cannot exceed 5.</p> 
     * @return HideResponseHeaders <p>Delete origin response headers</p><p>Input parameter limit: array length cannot exceed 5.</p>
     */
    public HideResponseHeaders [] getHideResponseHeaders() {
        return this.HideResponseHeaders;
    }

    /**
     * Set <p>Delete origin response headers</p><p>Input parameter limit: array length cannot exceed 5.</p>
     * @param HideResponseHeaders <p>Delete origin response headers</p><p>Input parameter limit: array length cannot exceed 5.</p>
     */
    public void setHideResponseHeaders(HideResponseHeaders [] HideResponseHeaders) {
        this.HideResponseHeaders = HideResponseHeaders;
    }

    public ModifyForwardingRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyForwardingRuleRequest(ModifyForwardingRuleRequest source) {
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
        if (source.RuleConditions != null) {
            this.RuleConditions = new RuleCondition[source.RuleConditions.length];
            for (int i = 0; i < source.RuleConditions.length; i++) {
                this.RuleConditions[i] = new RuleCondition(source.RuleConditions[i]);
            }
        }
        if (source.RuleActions != null) {
            this.RuleActions = new RuleAction[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new RuleAction(source.RuleActions[i]);
            }
        }
        if (source.OriginHeaders != null) {
            this.OriginHeaders = new OriginHeader[source.OriginHeaders.length];
            for (int i = 0; i < source.OriginHeaders.length; i++) {
                this.OriginHeaders[i] = new OriginHeader(source.OriginHeaders[i]);
            }
        }
        if (source.EnableOriginSni != null) {
            this.EnableOriginSni = new Boolean(source.EnableOriginSni);
        }
        if (source.OriginSni != null) {
            this.OriginSni = new String(source.OriginSni);
        }
        if (source.OriginHost != null) {
            this.OriginHost = new String(source.OriginHost);
        }
        if (source.ResponseHeaders != null) {
            this.ResponseHeaders = new ResponseHeaders[source.ResponseHeaders.length];
            for (int i = 0; i < source.ResponseHeaders.length; i++) {
                this.ResponseHeaders[i] = new ResponseHeaders(source.ResponseHeaders[i]);
            }
        }
        if (source.HideResponseHeaders != null) {
            this.HideResponseHeaders = new HideResponseHeaders[source.HideResponseHeaders.length];
            for (int i = 0; i < source.HideResponseHeaders.length; i++) {
                this.HideResponseHeaders[i] = new HideResponseHeaders(source.HideResponseHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ForwardingPolicyId", this.ForwardingPolicyId);
        this.setParamSimple(map, prefix + "ForwardingRuleId", this.ForwardingRuleId);
        this.setParamArrayObj(map, prefix + "RuleConditions.", this.RuleConditions);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamArrayObj(map, prefix + "OriginHeaders.", this.OriginHeaders);
        this.setParamSimple(map, prefix + "EnableOriginSni", this.EnableOriginSni);
        this.setParamSimple(map, prefix + "OriginSni", this.OriginSni);
        this.setParamSimple(map, prefix + "OriginHost", this.OriginHost);
        this.setParamArrayObj(map, prefix + "ResponseHeaders.", this.ResponseHeaders);
        this.setParamArrayObj(map, prefix + "HideResponseHeaders.", this.HideResponseHeaders);

    }
}

