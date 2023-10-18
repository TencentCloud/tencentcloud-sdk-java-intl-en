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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusGlobalConfigRequest extends AbstractModel {

    /**
    * Instance-level scrape configuration
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether to disable statistics
    */
    @SerializedName("DisableStatistics")
    @Expose
    private Boolean DisableStatistics;

    /**
     * Get Instance-level scrape configuration 
     * @return InstanceId Instance-level scrape configuration
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance-level scrape configuration
     * @param InstanceId Instance-level scrape configuration
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Whether to disable statistics 
     * @return DisableStatistics Whether to disable statistics
     */
    public Boolean getDisableStatistics() {
        return this.DisableStatistics;
    }

    /**
     * Set Whether to disable statistics
     * @param DisableStatistics Whether to disable statistics
     */
    public void setDisableStatistics(Boolean DisableStatistics) {
        this.DisableStatistics = DisableStatistics;
    }

    public DescribePrometheusGlobalConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusGlobalConfigRequest(DescribePrometheusGlobalConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DisableStatistics != null) {
            this.DisableStatistics = new Boolean(source.DisableStatistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DisableStatistics", this.DisableStatistics);

    }
}

