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

public class PrometheusTemplateSyncTarget extends AbstractModel {

    /**
    * Target region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Target instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster ID, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Last sync time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SyncTime")
    @Expose
    private String SyncTime;

    /**
    * The currently used template version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Cluster type, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Instance name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Cluster name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get Target region 
     * @return Region Target region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Target region
     * @param Region Target region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Target instance 
     * @return InstanceId Target instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Target instance
     * @param InstanceId Target instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cluster ID, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Last sync time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SyncTime Last sync time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSyncTime() {
        return this.SyncTime;
    }

    /**
     * Set Last sync time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SyncTime Last sync time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSyncTime(String SyncTime) {
        this.SyncTime = SyncTime;
    }

    /**
     * Get The currently used template version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version The currently used template version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set The currently used template version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version The currently used template version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Cluster type, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterType Cluster type, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterType Cluster type, which is required only if the `Level` of the collection template is `cluster`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Instance name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Cluster name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterName Cluster name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterName Cluster name, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public PrometheusTemplateSyncTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusTemplateSyncTarget(PrometheusTemplateSyncTarget source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SyncTime != null) {
            this.SyncTime = new String(source.SyncTime);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SyncTime", this.SyncTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

