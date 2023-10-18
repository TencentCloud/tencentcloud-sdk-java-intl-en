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

public class NetworkPolicyInfoItem extends AbstractModel {

    /**
    * Network policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Network policy description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Publishing status:

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
    */
    @SerializedName("PublishStatus")
    @Expose
    private String PublishStatus;

    /**
    * Policy type:

`System`: Synched from the cluster.

`Manual`: Added manually.
    */
    @SerializedName("PolicySourceType")
    @Expose
    private String PolicySourceType;

    /**
    * Policy space
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Policy creation date
    */
    @SerializedName("PolicyCreateTime")
    @Expose
    private String PolicyCreateTime;

    /**
    * Policy type

kube-router: KubeRouter

cilium: Cilium
    */
    @SerializedName("NetworkPolicyPlugin")
    @Expose
    private String NetworkPolicyPlugin;

    /**
    * Policy publishing result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublishResult")
    @Expose
    private String PublishResult;

    /**
    * Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
    */
    @SerializedName("FromPolicyRule")
    @Expose
    private Long FromPolicyRule;

    /**
    * Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
    */
    @SerializedName("ToPolicyRule")
    @Expose
    private Long ToPolicyRule;

    /**
    * Object
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * Network policy ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Network policy name 
     * @return Name Network policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Network policy name
     * @param Name Network policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Network policy description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Network policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Network policy description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Network policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Publishing status:

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled. 
     * @return PublishStatus Publishing status:

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
     */
    public String getPublishStatus() {
        return this.PublishStatus;
    }

    /**
     * Set Publishing status:

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
     * @param PublishStatus Publishing status:

`PublishedNoConfirm`: Enabled and to be confirmed.

`PublishedConfirmed`: Enabled and confirmed.

`unPublishing`: Disabled.

`Publishing`: Enabled.

`unPublishEdit`: To be enabled.
     */
    public void setPublishStatus(String PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    /**
     * Get Policy type:

`System`: Synched from the cluster.

`Manual`: Added manually. 
     * @return PolicySourceType Policy type:

`System`: Synched from the cluster.

`Manual`: Added manually.
     */
    public String getPolicySourceType() {
        return this.PolicySourceType;
    }

    /**
     * Set Policy type:

`System`: Synched from the cluster.

`Manual`: Added manually.
     * @param PolicySourceType Policy type:

`System`: Synched from the cluster.

`Manual`: Added manually.
     */
    public void setPolicySourceType(String PolicySourceType) {
        this.PolicySourceType = PolicySourceType;
    }

    /**
     * Get Policy space 
     * @return Namespace Policy space
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Policy space
     * @param Namespace Policy space
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Policy creation date 
     * @return PolicyCreateTime Policy creation date
     */
    public String getPolicyCreateTime() {
        return this.PolicyCreateTime;
    }

    /**
     * Set Policy creation date
     * @param PolicyCreateTime Policy creation date
     */
    public void setPolicyCreateTime(String PolicyCreateTime) {
        this.PolicyCreateTime = PolicyCreateTime;
    }

    /**
     * Get Policy type

kube-router: KubeRouter

cilium: Cilium 
     * @return NetworkPolicyPlugin Policy type

kube-router: KubeRouter

cilium: Cilium
     */
    public String getNetworkPolicyPlugin() {
        return this.NetworkPolicyPlugin;
    }

    /**
     * Set Policy type

kube-router: KubeRouter

cilium: Cilium
     * @param NetworkPolicyPlugin Policy type

kube-router: KubeRouter

cilium: Cilium
     */
    public void setNetworkPolicyPlugin(String NetworkPolicyPlugin) {
        this.NetworkPolicyPlugin = NetworkPolicyPlugin;
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
     * Get Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom. 
     * @return FromPolicyRule Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     */
    public Long getFromPolicyRule() {
        return this.FromPolicyRule;
    }

    /**
     * Set Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     * @param FromPolicyRule Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     */
    public void setFromPolicyRule(Long FromPolicyRule) {
        this.FromPolicyRule = FromPolicyRule;
    }

    /**
     * Get Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom. 
     * @return ToPolicyRule Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     */
    public Long getToPolicyRule() {
        return this.ToPolicyRule;
    }

    /**
     * Set Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     * @param ToPolicyRule Inbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     */
    public void setToPolicyRule(Long ToPolicyRule) {
        this.ToPolicyRule = ToPolicyRule;
    }

    /**
     * Get Object
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodSelector Object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPodSelector() {
        return this.PodSelector;
    }

    /**
     * Set Object
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodSelector Object
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodSelector(String PodSelector) {
        this.PodSelector = PodSelector;
    }

    /**
     * Get Network policy ID 
     * @return Id Network policy ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Network policy ID
     * @param Id Network policy ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public NetworkPolicyInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkPolicyInfoItem(NetworkPolicyInfoItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PublishStatus != null) {
            this.PublishStatus = new String(source.PublishStatus);
        }
        if (source.PolicySourceType != null) {
            this.PolicySourceType = new String(source.PolicySourceType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.PolicyCreateTime != null) {
            this.PolicyCreateTime = new String(source.PolicyCreateTime);
        }
        if (source.NetworkPolicyPlugin != null) {
            this.NetworkPolicyPlugin = new String(source.NetworkPolicyPlugin);
        }
        if (source.PublishResult != null) {
            this.PublishResult = new String(source.PublishResult);
        }
        if (source.FromPolicyRule != null) {
            this.FromPolicyRule = new Long(source.FromPolicyRule);
        }
        if (source.ToPolicyRule != null) {
            this.ToPolicyRule = new Long(source.ToPolicyRule);
        }
        if (source.PodSelector != null) {
            this.PodSelector = new String(source.PodSelector);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublishStatus", this.PublishStatus);
        this.setParamSimple(map, prefix + "PolicySourceType", this.PolicySourceType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PolicyCreateTime", this.PolicyCreateTime);
        this.setParamSimple(map, prefix + "NetworkPolicyPlugin", this.NetworkPolicyPlugin);
        this.setParamSimple(map, prefix + "PublishResult", this.PublishResult);
        this.setParamSimple(map, prefix + "FromPolicyRule", this.FromPolicyRule);
        this.setParamSimple(map, prefix + "ToPolicyRule", this.ToPolicyRule);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

