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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgeLogConfigRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Log collection configuration in json form
    */
    @SerializedName("LogConfig")
    @Expose
    private String LogConfig;

    /**
    * CLS logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

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
     * Get Log collection configuration in json form 
     * @return LogConfig Log collection configuration in json form
     */
    public String getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set Log collection configuration in json form
     * @param LogConfig Log collection configuration in json form
     */
    public void setLogConfig(String LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get CLS logset ID 
     * @return LogsetId CLS logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set CLS logset ID
     * @param LogsetId CLS logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public CreateEdgeLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeLogConfigRequest(CreateEdgeLogConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new String(source.LogConfig);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "LogConfig", this.LogConfig);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

