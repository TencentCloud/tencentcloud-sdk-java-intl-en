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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RayCluster extends AbstractModel {

    /**
    * <p>RayCluster cluster name.</p>
    */
    @SerializedName("RayClusterName")
    @Expose
    private String RayClusterName;

    /**
    * <p>RayCluster cluster ID.</p>
    */
    @SerializedName("RayClusterId")
    @Expose
    private Long RayClusterId;

    /**
    * <p>Number of Pods.</p>
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * <p>Cluster creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Number of Redis instances.</p>
    */
    @SerializedName("RedisCount")
    @Expose
    private Long RedisCount;

    /**
    * <p>Creation type.</p><p>Enumeration values:</p><ul><li>1: form creation</li><li>2: YAML creation</li></ul>
    */
    @SerializedName("SubmitType")
    @Expose
    private Long SubmitType;

    /**
    * <p>Head access address, which is also the dashboard address.</p>
    */
    @SerializedName("DashboardUrl")
    @Expose
    private String DashboardUrl;

    /**
    * <p>Namespace.</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>Number of volumes mounted by the RayCluster.</p>
    */
    @SerializedName("StorageCount")
    @Expose
    private Long StorageCount;

    /**
     * Get <p>RayCluster cluster name.</p> 
     * @return RayClusterName <p>RayCluster cluster name.</p>
     */
    public String getRayClusterName() {
        return this.RayClusterName;
    }

    /**
     * Set <p>RayCluster cluster name.</p>
     * @param RayClusterName <p>RayCluster cluster name.</p>
     */
    public void setRayClusterName(String RayClusterName) {
        this.RayClusterName = RayClusterName;
    }

    /**
     * Get <p>RayCluster cluster ID.</p> 
     * @return RayClusterId <p>RayCluster cluster ID.</p>
     */
    public Long getRayClusterId() {
        return this.RayClusterId;
    }

    /**
     * Set <p>RayCluster cluster ID.</p>
     * @param RayClusterId <p>RayCluster cluster ID.</p>
     */
    public void setRayClusterId(Long RayClusterId) {
        this.RayClusterId = RayClusterId;
    }

    /**
     * Get <p>Number of Pods.</p> 
     * @return PodCount <p>Number of Pods.</p>
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set <p>Number of Pods.</p>
     * @param PodCount <p>Number of Pods.</p>
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get <p>Cluster creation time.</p> 
     * @return CreateTime <p>Cluster creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Cluster creation time.</p>
     * @param CreateTime <p>Cluster creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Number of Redis instances.</p> 
     * @return RedisCount <p>Number of Redis instances.</p>
     */
    public Long getRedisCount() {
        return this.RedisCount;
    }

    /**
     * Set <p>Number of Redis instances.</p>
     * @param RedisCount <p>Number of Redis instances.</p>
     */
    public void setRedisCount(Long RedisCount) {
        this.RedisCount = RedisCount;
    }

    /**
     * Get <p>Creation type.</p><p>Enumeration values:</p><ul><li>1: form creation</li><li>2: YAML creation</li></ul> 
     * @return SubmitType <p>Creation type.</p><p>Enumeration values:</p><ul><li>1: form creation</li><li>2: YAML creation</li></ul>
     */
    public Long getSubmitType() {
        return this.SubmitType;
    }

    /**
     * Set <p>Creation type.</p><p>Enumeration values:</p><ul><li>1: form creation</li><li>2: YAML creation</li></ul>
     * @param SubmitType <p>Creation type.</p><p>Enumeration values:</p><ul><li>1: form creation</li><li>2: YAML creation</li></ul>
     */
    public void setSubmitType(Long SubmitType) {
        this.SubmitType = SubmitType;
    }

    /**
     * Get <p>Head access address, which is also the dashboard address.</p> 
     * @return DashboardUrl <p>Head access address, which is also the dashboard address.</p>
     */
    public String getDashboardUrl() {
        return this.DashboardUrl;
    }

    /**
     * Set <p>Head access address, which is also the dashboard address.</p>
     * @param DashboardUrl <p>Head access address, which is also the dashboard address.</p>
     */
    public void setDashboardUrl(String DashboardUrl) {
        this.DashboardUrl = DashboardUrl;
    }

    /**
     * Get <p>Namespace.</p> 
     * @return Namespace <p>Namespace.</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Namespace.</p>
     * @param Namespace <p>Namespace.</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>Number of volumes mounted by the RayCluster.</p> 
     * @return StorageCount <p>Number of volumes mounted by the RayCluster.</p>
     */
    public Long getStorageCount() {
        return this.StorageCount;
    }

    /**
     * Set <p>Number of volumes mounted by the RayCluster.</p>
     * @param StorageCount <p>Number of volumes mounted by the RayCluster.</p>
     */
    public void setStorageCount(Long StorageCount) {
        this.StorageCount = StorageCount;
    }

    public RayCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RayCluster(RayCluster source) {
        if (source.RayClusterName != null) {
            this.RayClusterName = new String(source.RayClusterName);
        }
        if (source.RayClusterId != null) {
            this.RayClusterId = new Long(source.RayClusterId);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RedisCount != null) {
            this.RedisCount = new Long(source.RedisCount);
        }
        if (source.SubmitType != null) {
            this.SubmitType = new Long(source.SubmitType);
        }
        if (source.DashboardUrl != null) {
            this.DashboardUrl = new String(source.DashboardUrl);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.StorageCount != null) {
            this.StorageCount = new Long(source.StorageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RayClusterName", this.RayClusterName);
        this.setParamSimple(map, prefix + "RayClusterId", this.RayClusterId);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RedisCount", this.RedisCount);
        this.setParamSimple(map, prefix + "SubmitType", this.SubmitType);
        this.setParamSimple(map, prefix + "DashboardUrl", this.DashboardUrl);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "StorageCount", this.StorageCount);

    }
}

