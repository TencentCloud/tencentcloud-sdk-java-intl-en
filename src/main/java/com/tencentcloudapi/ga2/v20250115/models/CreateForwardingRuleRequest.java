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

public class CreateForwardingRuleRequest extends AbstractModel {

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
    * <p>Layer 7 forwarding rule conditional information.</p><p>Array length cannot exceed 1.</p>
    */
    @SerializedName("RuleConditions")
    @Expose
    private RuleCondition [] RuleConditions;

    /**
    * <p>Layer 7 forwarding rule behavior information.</p><p>The length of the array cannot exceed 1.</p>
    */
    @SerializedName("RuleActions")
    @Expose
    private RuleAction [] RuleActions;

    /**
    * <p>Origin-pull Header information.</p><p>The maximum length of the array cannot exceed 5. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
    */
    @SerializedName("OriginHeaders")
    @Expose
    private OriginHeader [] OriginHeaders;

    /**
    * <p>Whether origin-pull sni is enabled.</p><p>Default value: False</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
    */
    @SerializedName("EnableOriginSni")
    @Expose
    private Boolean EnableOriginSni;

    /**
    * <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when EnableOriginSni is True. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
    */
    @SerializedName("OriginSni")
    @Expose
    private String OriginSni;

    /**
    * <p>Origin-pull host.</p><p>Input parameter limit: length not exceeding 80.</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
    */
    @SerializedName("OriginHost")
    @Expose
    private String OriginHost;

    /**
    * <p>Origin response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
    */
    @SerializedName("ResponseHeaders")
    @Expose
    private ResponseHeaders [] ResponseHeaders;

    /**
    * <p>Delete origin server response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
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
     * Get <p>Layer 7 forwarding rule conditional information.</p><p>Array length cannot exceed 1.</p> 
     * @return RuleConditions <p>Layer 7 forwarding rule conditional information.</p><p>Array length cannot exceed 1.</p>
     */
    public RuleCondition [] getRuleConditions() {
        return this.RuleConditions;
    }

    /**
     * Set <p>Layer 7 forwarding rule conditional information.</p><p>Array length cannot exceed 1.</p>
     * @param RuleConditions <p>Layer 7 forwarding rule conditional information.</p><p>Array length cannot exceed 1.</p>
     */
    public void setRuleConditions(RuleCondition [] RuleConditions) {
        this.RuleConditions = RuleConditions;
    }

    /**
     * Get <p>Layer 7 forwarding rule behavior information.</p><p>The length of the array cannot exceed 1.</p> 
     * @return RuleActions <p>Layer 7 forwarding rule behavior information.</p><p>The length of the array cannot exceed 1.</p>
     */
    public RuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set <p>Layer 7 forwarding rule behavior information.</p><p>The length of the array cannot exceed 1.</p>
     * @param RuleActions <p>Layer 7 forwarding rule behavior information.</p><p>The length of the array cannot exceed 1.</p>
     */
    public void setRuleActions(RuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get <p>Origin-pull Header information.</p><p>The maximum length of the array cannot exceed 5. This field is required when RuleActions.RuleActionType is ForwardGroup.</p> 
     * @return OriginHeaders <p>Origin-pull Header information.</p><p>The maximum length of the array cannot exceed 5. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public OriginHeader [] getOriginHeaders() {
        return this.OriginHeaders;
    }

    /**
     * Set <p>Origin-pull Header information.</p><p>The maximum length of the array cannot exceed 5. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     * @param OriginHeaders <p>Origin-pull Header information.</p><p>The maximum length of the array cannot exceed 5. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public void setOriginHeaders(OriginHeader [] OriginHeaders) {
        this.OriginHeaders = OriginHeaders;
    }

    /**
     * Get <p>Whether origin-pull sni is enabled.</p><p>Default value: False</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p> 
     * @return EnableOriginSni <p>Whether origin-pull sni is enabled.</p><p>Default value: False</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public Boolean getEnableOriginSni() {
        return this.EnableOriginSni;
    }

    /**
     * Set <p>Whether origin-pull sni is enabled.</p><p>Default value: False</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     * @param EnableOriginSni <p>Whether origin-pull sni is enabled.</p><p>Default value: False</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public void setEnableOriginSni(Boolean EnableOriginSni) {
        this.EnableOriginSni = EnableOriginSni;
    }

    /**
     * Get <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when EnableOriginSni is True. This field is required when RuleActions.RuleActionType is ForwardGroup.</p> 
     * @return OriginSni <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when EnableOriginSni is True. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public String getOriginSni() {
        return this.OriginSni;
    }

    /**
     * Set <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when EnableOriginSni is True. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     * @param OriginSni <p>Origin sni.</p><p>Input parameter limit: length cannot exceed 80.</p><p>This field is required when EnableOriginSni is True. This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public void setOriginSni(String OriginSni) {
        this.OriginSni = OriginSni;
    }

    /**
     * Get <p>Origin-pull host.</p><p>Input parameter limit: length not exceeding 80.</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p> 
     * @return OriginHost <p>Origin-pull host.</p><p>Input parameter limit: length not exceeding 80.</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public String getOriginHost() {
        return this.OriginHost;
    }

    /**
     * Set <p>Origin-pull host.</p><p>Input parameter limit: length not exceeding 80.</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     * @param OriginHost <p>Origin-pull host.</p><p>Input parameter limit: length not exceeding 80.</p><p>This field is required when RuleActions.RuleActionType is ForwardGroup.</p>
     */
    public void setOriginHost(String OriginHost) {
        this.OriginHost = OriginHost;
    }

    /**
     * Get <p>Origin response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p> 
     * @return ResponseHeaders <p>Origin response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
     */
    public ResponseHeaders [] getResponseHeaders() {
        return this.ResponseHeaders;
    }

    /**
     * Set <p>Origin response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
     * @param ResponseHeaders <p>Origin response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
     */
    public void setResponseHeaders(ResponseHeaders [] ResponseHeaders) {
        this.ResponseHeaders = ResponseHeaders;
    }

    /**
     * Get <p>Delete origin server response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p> 
     * @return HideResponseHeaders <p>Delete origin server response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
     */
    public HideResponseHeaders [] getHideResponseHeaders() {
        return this.HideResponseHeaders;
    }

    /**
     * Set <p>Delete origin server response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
     * @param HideResponseHeaders <p>Delete origin server response headers</p><p>Array length not exceeding 5. An empty array can be passed, representing configuration clearing.</p>
     */
    public void setHideResponseHeaders(HideResponseHeaders [] HideResponseHeaders) {
        this.HideResponseHeaders = HideResponseHeaders;
    }

    public CreateForwardingRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateForwardingRuleRequest(CreateForwardingRuleRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ForwardingPolicyId != null) {
            this.ForwardingPolicyId = new String(source.ForwardingPolicyId);
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

