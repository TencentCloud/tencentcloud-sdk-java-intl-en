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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsWeightRule extends AbstractModel {

    /**
    * CLB listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * List of real servers whose weights to modify.
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * Forwarding rule ID, which is required only for layer-7 rules.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * Target rule domain name. This parameter does not take effect if LocationId is specified
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Target rule URL. This parameter does not take effect if LocationId is specified
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The new forwarding weight of the real server. Value range: [0, 100]. This parameter takes lower precedence than `Weight` in [`Targets`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target), which means that this parameter only takes effect when the `Weight` in `RsWeightRule` is left empty.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get CLB listener ID. 
     * @return ListenerId CLB listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set CLB listener ID.
     * @param ListenerId CLB listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get List of real servers whose weights to modify. 
     * @return Targets List of real servers whose weights to modify.
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set List of real servers whose weights to modify.
     * @param Targets List of real servers whose weights to modify.
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Forwarding rule ID, which is required only for layer-7 rules. 
     * @return LocationId Forwarding rule ID, which is required only for layer-7 rules.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Forwarding rule ID, which is required only for layer-7 rules.
     * @param LocationId Forwarding rule ID, which is required only for layer-7 rules.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get Target rule domain name. This parameter does not take effect if LocationId is specified 
     * @return Domain Target rule domain name. This parameter does not take effect if LocationId is specified
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Target rule domain name. This parameter does not take effect if LocationId is specified
     * @param Domain Target rule domain name. This parameter does not take effect if LocationId is specified
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Target rule URL. This parameter does not take effect if LocationId is specified 
     * @return Url Target rule URL. This parameter does not take effect if LocationId is specified
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Target rule URL. This parameter does not take effect if LocationId is specified
     * @param Url Target rule URL. This parameter does not take effect if LocationId is specified
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The new forwarding weight of the real server. Value range: [0, 100]. This parameter takes lower precedence than `Weight` in [`Targets`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target), which means that this parameter only takes effect when the `Weight` in `RsWeightRule` is left empty. 
     * @return Weight The new forwarding weight of the real server. Value range: [0, 100]. This parameter takes lower precedence than `Weight` in [`Targets`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target), which means that this parameter only takes effect when the `Weight` in `RsWeightRule` is left empty.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set The new forwarding weight of the real server. Value range: [0, 100]. This parameter takes lower precedence than `Weight` in [`Targets`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target), which means that this parameter only takes effect when the `Weight` in `RsWeightRule` is left empty.
     * @param Weight The new forwarding weight of the real server. Value range: [0, 100]. This parameter takes lower precedence than `Weight` in [`Targets`](https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#Target), which means that this parameter only takes effect when the `Weight` in `RsWeightRule` is left empty.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public RsWeightRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RsWeightRule(RsWeightRule source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

