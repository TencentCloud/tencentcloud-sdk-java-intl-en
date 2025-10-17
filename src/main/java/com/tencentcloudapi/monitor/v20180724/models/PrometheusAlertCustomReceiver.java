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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertCustomReceiver extends AbstractModel {

    /**
    * Notification customization type.
Alertmanager - self-built alertmanager in vpc.
webhook - webhook address in the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * alertmanager/webhook url (ip in the same vpc as the prometheus instance).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Specifies the time range for allowing Alert sending.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowedTimeRanges")
    @Expose
    private PrometheusAlertAllowTimeRange [] AllowedTimeRanges;

    /**
    * alertmanager intranet cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * alertmanager resides in the private network cluster type (tke/eks/tdcc).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get Notification customization type.
Alertmanager - self-built alertmanager in vpc.
webhook - webhook address in the vpc.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Notification customization type.
Alertmanager - self-built alertmanager in vpc.
webhook - webhook address in the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Notification customization type.
Alertmanager - self-built alertmanager in vpc.
webhook - webhook address in the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Notification customization type.
Alertmanager - self-built alertmanager in vpc.
webhook - webhook address in the vpc.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get alertmanager/webhook url (ip in the same vpc as the prometheus instance).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url alertmanager/webhook url (ip in the same vpc as the prometheus instance).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set alertmanager/webhook url (ip in the same vpc as the prometheus instance).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url alertmanager/webhook url (ip in the same vpc as the prometheus instance).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Specifies the time range for allowing Alert sending.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowedTimeRanges Specifies the time range for allowing Alert sending.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusAlertAllowTimeRange [] getAllowedTimeRanges() {
        return this.AllowedTimeRanges;
    }

    /**
     * Set Specifies the time range for allowing Alert sending.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowedTimeRanges Specifies the time range for allowing Alert sending.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowedTimeRanges(PrometheusAlertAllowTimeRange [] AllowedTimeRanges) {
        this.AllowedTimeRanges = AllowedTimeRanges;
    }

    /**
     * Get alertmanager intranet cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId alertmanager intranet cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set alertmanager intranet cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId alertmanager intranet cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get alertmanager resides in the private network cluster type (tke/eks/tdcc).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterType alertmanager resides in the private network cluster type (tke/eks/tdcc).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set alertmanager resides in the private network cluster type (tke/eks/tdcc).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterType alertmanager resides in the private network cluster type (tke/eks/tdcc).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public PrometheusAlertCustomReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertCustomReceiver(PrometheusAlertCustomReceiver source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AllowedTimeRanges != null) {
            this.AllowedTimeRanges = new PrometheusAlertAllowTimeRange[source.AllowedTimeRanges.length];
            for (int i = 0; i < source.AllowedTimeRanges.length; i++) {
                this.AllowedTimeRanges[i] = new PrometheusAlertAllowTimeRange(source.AllowedTimeRanges[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "AllowedTimeRanges.", this.AllowedTimeRanges);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

