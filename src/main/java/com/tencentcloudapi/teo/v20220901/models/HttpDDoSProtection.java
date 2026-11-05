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

public class HttpDDoSProtection extends AbstractModel {

    /**
    * Specific configuration of adaptive frequency control.
    */
    @SerializedName("AdaptiveFrequencyControl")
    @Expose
    private AdaptiveFrequencyControl AdaptiveFrequencyControl;

    /**
    * Specific configuration for intelligent client filtering.
    */
    @SerializedName("ClientFiltering")
    @Expose
    private ClientFiltering ClientFiltering;

    /**
    * Bandwidth abuse protection configuration.
    */
    @SerializedName("BandwidthAbuseDefense")
    @Expose
    private BandwidthAbuseDefense BandwidthAbuseDefense;

    /**
    * Specific configuration of slow attack protection.
    */
    @SerializedName("SlowAttackDefense")
    @Expose
    private SlowAttackDefense SlowAttackDefense;

    /**
     * Get Specific configuration of adaptive frequency control. 
     * @return AdaptiveFrequencyControl Specific configuration of adaptive frequency control.
     */
    public AdaptiveFrequencyControl getAdaptiveFrequencyControl() {
        return this.AdaptiveFrequencyControl;
    }

    /**
     * Set Specific configuration of adaptive frequency control.
     * @param AdaptiveFrequencyControl Specific configuration of adaptive frequency control.
     */
    public void setAdaptiveFrequencyControl(AdaptiveFrequencyControl AdaptiveFrequencyControl) {
        this.AdaptiveFrequencyControl = AdaptiveFrequencyControl;
    }

    /**
     * Get Specific configuration for intelligent client filtering. 
     * @return ClientFiltering Specific configuration for intelligent client filtering.
     */
    public ClientFiltering getClientFiltering() {
        return this.ClientFiltering;
    }

    /**
     * Set Specific configuration for intelligent client filtering.
     * @param ClientFiltering Specific configuration for intelligent client filtering.
     */
    public void setClientFiltering(ClientFiltering ClientFiltering) {
        this.ClientFiltering = ClientFiltering;
    }

    /**
     * Get Bandwidth abuse protection configuration. 
     * @return BandwidthAbuseDefense Bandwidth abuse protection configuration.
     */
    public BandwidthAbuseDefense getBandwidthAbuseDefense() {
        return this.BandwidthAbuseDefense;
    }

    /**
     * Set Bandwidth abuse protection configuration.
     * @param BandwidthAbuseDefense Bandwidth abuse protection configuration.
     */
    public void setBandwidthAbuseDefense(BandwidthAbuseDefense BandwidthAbuseDefense) {
        this.BandwidthAbuseDefense = BandwidthAbuseDefense;
    }

    /**
     * Get Specific configuration of slow attack protection. 
     * @return SlowAttackDefense Specific configuration of slow attack protection.
     */
    public SlowAttackDefense getSlowAttackDefense() {
        return this.SlowAttackDefense;
    }

    /**
     * Set Specific configuration of slow attack protection.
     * @param SlowAttackDefense Specific configuration of slow attack protection.
     */
    public void setSlowAttackDefense(SlowAttackDefense SlowAttackDefense) {
        this.SlowAttackDefense = SlowAttackDefense;
    }

    public HttpDDoSProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpDDoSProtection(HttpDDoSProtection source) {
        if (source.AdaptiveFrequencyControl != null) {
            this.AdaptiveFrequencyControl = new AdaptiveFrequencyControl(source.AdaptiveFrequencyControl);
        }
        if (source.ClientFiltering != null) {
            this.ClientFiltering = new ClientFiltering(source.ClientFiltering);
        }
        if (source.BandwidthAbuseDefense != null) {
            this.BandwidthAbuseDefense = new BandwidthAbuseDefense(source.BandwidthAbuseDefense);
        }
        if (source.SlowAttackDefense != null) {
            this.SlowAttackDefense = new SlowAttackDefense(source.SlowAttackDefense);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AdaptiveFrequencyControl.", this.AdaptiveFrequencyControl);
        this.setParamObj(map, prefix + "ClientFiltering.", this.ClientFiltering);
        this.setParamObj(map, prefix + "BandwidthAbuseDefense.", this.BandwidthAbuseDefense);
        this.setParamObj(map, prefix + "SlowAttackDefense.", this.SlowAttackDefense);

    }
}

