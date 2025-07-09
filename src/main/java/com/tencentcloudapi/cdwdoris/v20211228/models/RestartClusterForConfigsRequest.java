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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartClusterForConfigsRequest extends AbstractModel {

    /**
    * Cluster ID, such as cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Configuration file's name
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * grace_restart is an elegant scrolling restart. If this parameter is not filled in, restart now by default.
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get Cluster ID, such as cdwch-xxxx 
     * @return InstanceId Cluster ID, such as cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID, such as cdwch-xxxx
     * @param InstanceId Cluster ID, such as cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Configuration file's name 
     * @return ConfigName Configuration file's name
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration file's name
     * @param ConfigName Configuration file's name
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get grace_restart is an elegant scrolling restart. If this parameter is not filled in, restart now by default. 
     * @return OperationType grace_restart is an elegant scrolling restart. If this parameter is not filled in, restart now by default.
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set grace_restart is an elegant scrolling restart. If this parameter is not filled in, restart now by default.
     * @param OperationType grace_restart is an elegant scrolling restart. If this parameter is not filled in, restart now by default.
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public RestartClusterForConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartClusterForConfigsRequest(RestartClusterForConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

