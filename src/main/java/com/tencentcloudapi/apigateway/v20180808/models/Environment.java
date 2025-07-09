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

public class Environment extends AbstractModel {

    /**
    * Environment name.
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * Access path.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Release status. 1: published. 0: not published.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Running version.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

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
     * Get Access path. 
     * @return Url Access path.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Access path.
     * @param Url Access path.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Release status. 1: published. 0: not published. 
     * @return Status Release status. 1: published. 0: not published.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Release status. 1: published. 0: not published.
     * @param Status Release status. 1: published. 0: not published.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Running version. 
     * @return VersionName Running version.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Running version.
     * @param VersionName Running version.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);

    }
}

