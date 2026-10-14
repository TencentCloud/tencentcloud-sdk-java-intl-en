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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConcurrencyConfig extends AbstractModel {

    /**
    * Whether intelligent dynamic concurrency is enabled. If set to `FALSE`, static concurrency is used. If set to `''`, the multi-concurrency configuration is canceled.
    */
    @SerializedName("DynamicEnabled")
    @Expose
    private String DynamicEnabled;

    /**
    * Maximum number of concurrent requests per instance. Value range: [1,100]
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * Safety isolation switch
    */
    @SerializedName("InstanceIsolationEnabled")
    @Expose
    private String InstanceIsolationEnabled;

    /**
    * Session-Based or Request-Based. Choose one.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Dynamic concurrency parameter
    */
    @SerializedName("MixNodeConfig")
    @Expose
    private MixNodeConfig [] MixNodeConfig;

    /**
    * Session configuration parameters
    */
    @SerializedName("SessionConfig")
    @Expose
    private SessionConfig SessionConfig;

    /**
     * Get Whether intelligent dynamic concurrency is enabled. If set to `FALSE`, static concurrency is used. If set to `''`, the multi-concurrency configuration is canceled. 
     * @return DynamicEnabled Whether intelligent dynamic concurrency is enabled. If set to `FALSE`, static concurrency is used. If set to `''`, the multi-concurrency configuration is canceled.
     */
    public String getDynamicEnabled() {
        return this.DynamicEnabled;
    }

    /**
     * Set Whether intelligent dynamic concurrency is enabled. If set to `FALSE`, static concurrency is used. If set to `''`, the multi-concurrency configuration is canceled.
     * @param DynamicEnabled Whether intelligent dynamic concurrency is enabled. If set to `FALSE`, static concurrency is used. If set to `''`, the multi-concurrency configuration is canceled.
     */
    public void setDynamicEnabled(String DynamicEnabled) {
        this.DynamicEnabled = DynamicEnabled;
    }

    /**
     * Get Maximum number of concurrent requests per instance. Value range: [1,100] 
     * @return MaxConcurrency Maximum number of concurrent requests per instance. Value range: [1,100]
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set Maximum number of concurrent requests per instance. Value range: [1,100]
     * @param MaxConcurrency Maximum number of concurrent requests per instance. Value range: [1,100]
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get Safety isolation switch 
     * @return InstanceIsolationEnabled Safety isolation switch
     */
    public String getInstanceIsolationEnabled() {
        return this.InstanceIsolationEnabled;
    }

    /**
     * Set Safety isolation switch
     * @param InstanceIsolationEnabled Safety isolation switch
     */
    public void setInstanceIsolationEnabled(String InstanceIsolationEnabled) {
        this.InstanceIsolationEnabled = InstanceIsolationEnabled;
    }

    /**
     * Get Session-Based or Request-Based. Choose one. 
     * @return Type Session-Based or Request-Based. Choose one.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Session-Based or Request-Based. Choose one.
     * @param Type Session-Based or Request-Based. Choose one.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Dynamic concurrency parameter 
     * @return MixNodeConfig Dynamic concurrency parameter
     */
    public MixNodeConfig [] getMixNodeConfig() {
        return this.MixNodeConfig;
    }

    /**
     * Set Dynamic concurrency parameter
     * @param MixNodeConfig Dynamic concurrency parameter
     */
    public void setMixNodeConfig(MixNodeConfig [] MixNodeConfig) {
        this.MixNodeConfig = MixNodeConfig;
    }

    /**
     * Get Session configuration parameters 
     * @return SessionConfig Session configuration parameters
     */
    public SessionConfig getSessionConfig() {
        return this.SessionConfig;
    }

    /**
     * Set Session configuration parameters
     * @param SessionConfig Session configuration parameters
     */
    public void setSessionConfig(SessionConfig SessionConfig) {
        this.SessionConfig = SessionConfig;
    }

    public InstanceConcurrencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConcurrencyConfig(InstanceConcurrencyConfig source) {
        if (source.DynamicEnabled != null) {
            this.DynamicEnabled = new String(source.DynamicEnabled);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.InstanceIsolationEnabled != null) {
            this.InstanceIsolationEnabled = new String(source.InstanceIsolationEnabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MixNodeConfig != null) {
            this.MixNodeConfig = new MixNodeConfig[source.MixNodeConfig.length];
            for (int i = 0; i < source.MixNodeConfig.length; i++) {
                this.MixNodeConfig[i] = new MixNodeConfig(source.MixNodeConfig[i]);
            }
        }
        if (source.SessionConfig != null) {
            this.SessionConfig = new SessionConfig(source.SessionConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DynamicEnabled", this.DynamicEnabled);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "InstanceIsolationEnabled", this.InstanceIsolationEnabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "MixNodeConfig.", this.MixNodeConfig);
        this.setParamObj(map, prefix + "SessionConfig.", this.SessionConfig);

    }
}

