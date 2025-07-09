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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceEnvironmentStrategy extends AbstractModel {

    /**
    * Environment name.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Access service environment URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Release status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Published version number.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Throttling value.
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Maximum quota value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxStrategy")
    @Expose
    private Long MaxStrategy;

    /**
     * Get Environment name. 
     * @return EnvironmentName Environment name.
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set Environment name.
     * @param EnvironmentName Environment name.
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get Access service environment URL. 
     * @return Url Access service environment URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Access service environment URL.
     * @param Url Access service environment URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Release status. 
     * @return Status Release status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Release status.
     * @param Status Release status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Published version number.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VersionName Published version number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Published version number.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VersionName Published version number.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Throttling value. 
     * @return Strategy Throttling value.
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Throttling value.
     * @param Strategy Throttling value.
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Maximum quota value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxStrategy Maximum quota value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxStrategy() {
        return this.MaxStrategy;
    }

    /**
     * Set Maximum quota value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxStrategy Maximum quota value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxStrategy(Long MaxStrategy) {
        this.MaxStrategy = MaxStrategy;
    }

    public ServiceEnvironmentStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceEnvironmentStrategy(ServiceEnvironmentStrategy source) {
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.MaxStrategy != null) {
            this.MaxStrategy = new Long(source.MaxStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "MaxStrategy", this.MaxStrategy);

    }
}

