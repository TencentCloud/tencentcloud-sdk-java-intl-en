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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertManagerConfig extends AbstractModel{

    /**
    * AlertManager URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Type of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * ID of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get AlertManager URL 
     * @return Url AlertManager URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set AlertManager URL
     * @param Url AlertManager URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Type of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterType Type of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Type of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterType Type of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get ID of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId ID of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId ID of the cluster where AlertManager is deployed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public PrometheusAlertManagerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertManagerConfig(PrometheusAlertManagerConfig source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

