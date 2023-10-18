/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkFirewallPolicyDetailResponse extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Namespace
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Inbound type
    */
    @SerializedName("FromPolicyRule")
    @Expose
    private Long FromPolicyRule;

    /**
    * Outbound type
    */
    @SerializedName("ToPolicyRule")
    @Expose
    private Long ToPolicyRule;

    /**
    * Custom rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomPolicy")
    @Expose
    private NetworkCustomPolicy [] CustomPolicy;

    /**
    * Pod selector
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * Policy description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Policy creation time
    */
    @SerializedName("PolicyCreateTime")
    @Expose
    private String PolicyCreateTime;

    /**
    * Policy source type. Valid values: `System` (synched from the cluster); `Manual` (added manually).
    */
    @SerializedName("PolicySourceType")
    @Expose
    private String PolicySourceType;

    /**
    * Network plugin of the network policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkPolicyPlugin")
    @Expose
    private String NetworkPolicyPlugin;

    /**
    * Network policy status
    */
    @SerializedName("PublishStatus")
    @Expose
    private String PublishStatus;

    /**
    * Policy publishing result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublishResult")
    @Expose
    private String PublishResult;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Namespace
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespace Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Inbound type 
     * @return FromPolicyRule Inbound type
     */
    public Long getFromPolicyRule() {
        return this.FromPolicyRule;
    }

    /**
     * Set Inbound type
     * @param FromPolicyRule Inbound type
     */
    public void setFromPolicyRule(Long FromPolicyRule) {
        this.FromPolicyRule = FromPolicyRule;
    }

    /**
     * Get Outbound type 
     * @return ToPolicyRule Outbound type
     */
    public Long getToPolicyRule() {
        return this.ToPolicyRule;
    }

    /**
     * Set Outbound type
     * @param ToPolicyRule Outbound type
     */
    public void setToPolicyRule(Long ToPolicyRule) {
        this.ToPolicyRule = ToPolicyRule;
    }

    /**
     * Get Custom rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomPolicy Custom rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetworkCustomPolicy [] getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set Custom rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomPolicy Custom rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomPolicy(NetworkCustomPolicy [] CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get Pod selector 
     * @return PodSelector Pod selector
     */
    public String getPodSelector() {
        return this.PodSelector;
    }

    /**
     * Set Pod selector
     * @param PodSelector Pod selector
     */
    public void setPodSelector(String PodSelector) {
        this.PodSelector = PodSelector;
    }

    /**
     * Get Policy description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Policy creation time 
     * @return PolicyCreateTime Policy creation time
     */
    public String getPolicyCreateTime() {
        return this.PolicyCreateTime;
    }

    /**
     * Set Policy creation time
     * @param PolicyCreateTime Policy creation time
     */
    public void setPolicyCreateTime(String PolicyCreateTime) {
        this.PolicyCreateTime = PolicyCreateTime;
    }

    /**
     * Get Policy source type. Valid values: `System` (synched from the cluster); `Manual` (added manually). 
     * @return PolicySourceType Policy source type. Valid values: `System` (synched from the cluster); `Manual` (added manually).
     */
    public String getPolicySourceType() {
        return this.PolicySourceType;
    }

    /**
     * Set Policy source type. Valid values: `System` (synched from the cluster); `Manual` (added manually).
     * @param PolicySourceType Policy source type. Valid values: `System` (synched from the cluster); `Manual` (added manually).
     */
    public void setPolicySourceType(String PolicySourceType) {
        this.PolicySourceType = PolicySourceType;
    }

    /**
     * Get Network plugin of the network policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetworkPolicyPlugin Network plugin of the network policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkPolicyPlugin() {
        return this.NetworkPolicyPlugin;
    }

    /**
     * Set Network plugin of the network policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetworkPolicyPlugin Network plugin of the network policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkPolicyPlugin(String NetworkPolicyPlugin) {
        this.NetworkPolicyPlugin = NetworkPolicyPlugin;
    }

    /**
     * Get Network policy status 
     * @return PublishStatus Network policy status
     */
    public String getPublishStatus() {
        return this.PublishStatus;
    }

    /**
     * Set Network policy status
     * @param PublishStatus Network policy status
     */
    public void setPublishStatus(String PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    /**
     * Get Policy publishing result
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublishResult Policy publishing result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublishResult() {
        return this.PublishResult;
    }

    /**
     * Set Policy publishing result
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublishResult Policy publishing result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublishResult(String PublishResult) {
        this.PublishResult = PublishResult;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNetworkFirewallPolicyDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkFirewallPolicyDetailResponse(DescribeNetworkFirewallPolicyDetailResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FromPolicyRule != null) {
            this.FromPolicyRule = new Long(source.FromPolicyRule);
        }
        if (source.ToPolicyRule != null) {
            this.ToPolicyRule = new Long(source.ToPolicyRule);
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new NetworkCustomPolicy[source.CustomPolicy.length];
            for (int i = 0; i < source.CustomPolicy.length; i++) {
                this.CustomPolicy[i] = new NetworkCustomPolicy(source.CustomPolicy[i]);
            }
        }
        if (source.PodSelector != null) {
            this.PodSelector = new String(source.PodSelector);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PolicyCreateTime != null) {
            this.PolicyCreateTime = new String(source.PolicyCreateTime);
        }
        if (source.PolicySourceType != null) {
            this.PolicySourceType = new String(source.PolicySourceType);
        }
        if (source.NetworkPolicyPlugin != null) {
            this.NetworkPolicyPlugin = new String(source.NetworkPolicyPlugin);
        }
        if (source.PublishStatus != null) {
            this.PublishStatus = new String(source.PublishStatus);
        }
        if (source.PublishResult != null) {
            this.PublishResult = new String(source.PublishResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FromPolicyRule", this.FromPolicyRule);
        this.setParamSimple(map, prefix + "ToPolicyRule", this.ToPolicyRule);
        this.setParamArrayObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PolicyCreateTime", this.PolicyCreateTime);
        this.setParamSimple(map, prefix + "PolicySourceType", this.PolicySourceType);
        this.setParamSimple(map, prefix + "NetworkPolicyPlugin", this.NetworkPolicyPlugin);
        this.setParamSimple(map, prefix + "PublishStatus", this.PublishStatus);
        this.setParamSimple(map, prefix + "PublishResult", this.PublishResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

