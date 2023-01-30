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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAndPublishNetworkFirewallPolicyDetailRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Policy ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * Outbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
    */
    @SerializedName("ToPolicyRule")
    @Expose
    private Long ToPolicyRule;

    /**
    * Pod selector
    */
    @SerializedName("PodSelector")
    @Expose
    private String PodSelector;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Policy description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Custom rule
    */
    @SerializedName("CustomPolicy")
    @Expose
    private NetworkCustomPolicy [] CustomPolicy;

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
     * Get Policy ID 
     * @return Id Policy ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Policy ID
     * @param Id Policy ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get Outbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom. 
     * @return ToPolicyRule Outbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     */
    public Long getToPolicyRule() {
        return this.ToPolicyRule;
    }

    /**
     * Set Outbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     * @param ToPolicyRule Outbound rule

`1`: Allow all.

`2`: Reject all.

`3`: Custom.
     */
    public void setToPolicyRule(Long ToPolicyRule) {
        this.ToPolicyRule = ToPolicyRule;
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
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Policy description 
     * @return Description Policy description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
     * @param Description Policy description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Custom rule 
     * @return CustomPolicy Custom rule
     */
    public NetworkCustomPolicy [] getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set Custom rule
     * @param CustomPolicy Custom rule
     */
    public void setCustomPolicy(NetworkCustomPolicy [] CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    public UpdateAndPublishNetworkFirewallPolicyDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAndPublishNetworkFirewallPolicyDetailRequest(UpdateAndPublishNetworkFirewallPolicyDetailRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new NetworkCustomPolicy[source.CustomPolicy.length];
            for (int i = 0; i < source.CustomPolicy.length; i++) {
                this.CustomPolicy[i] = new NetworkCustomPolicy(source.CustomPolicy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FromPolicyRule", this.FromPolicyRule);
        this.setParamSimple(map, prefix + "ToPolicyRule", this.ToPolicyRule);
        this.setParamSimple(map, prefix + "PodSelector", this.PodSelector);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "CustomPolicy.", this.CustomPolicy);

    }
}

