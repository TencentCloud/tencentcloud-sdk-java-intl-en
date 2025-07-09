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

public class PrometheusClusterAgentBasic extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Cluster type
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Whether to enable public network CLB
    */
    @SerializedName("EnableExternal")
    @Expose
    private Boolean EnableExternal;

    /**
    * Pod configurations of components deployed in the cluster
    */
    @SerializedName("InClusterPodConfig")
    @Expose
    private PrometheusClusterAgentPodConfig InClusterPodConfig;

    /**
    * External labels, which will be attached to all metrics collected by this cluster
    */
    @SerializedName("ExternalLabels")
    @Expose
    private Label [] ExternalLabels;

    /**
    * Whether to install the default collection configuration.
    */
    @SerializedName("NotInstallBasicScrape")
    @Expose
    private Boolean NotInstallBasicScrape;

    /**
    * Whether to collect metrics (`true`: Drop all metrics; `false`: Collect default metrics)
    */
    @SerializedName("NotScrape")
    @Expose
    private Boolean NotScrape;

    /**
    * Whether to enable the default recording rule
    */
    @SerializedName("OpenDefaultRecord")
    @Expose
    private Boolean OpenDefaultRecord;

    /**
     * Get Cluster ID 
     * @return Region Cluster ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster ID
     * @param Region Cluster ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Cluster type 
     * @return ClusterType Cluster type
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type
     * @param ClusterType Cluster type
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

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
     * Get Whether to enable public network CLB 
     * @return EnableExternal Whether to enable public network CLB
     */
    public Boolean getEnableExternal() {
        return this.EnableExternal;
    }

    /**
     * Set Whether to enable public network CLB
     * @param EnableExternal Whether to enable public network CLB
     */
    public void setEnableExternal(Boolean EnableExternal) {
        this.EnableExternal = EnableExternal;
    }

    /**
     * Get Pod configurations of components deployed in the cluster 
     * @return InClusterPodConfig Pod configurations of components deployed in the cluster
     */
    public PrometheusClusterAgentPodConfig getInClusterPodConfig() {
        return this.InClusterPodConfig;
    }

    /**
     * Set Pod configurations of components deployed in the cluster
     * @param InClusterPodConfig Pod configurations of components deployed in the cluster
     */
    public void setInClusterPodConfig(PrometheusClusterAgentPodConfig InClusterPodConfig) {
        this.InClusterPodConfig = InClusterPodConfig;
    }

    /**
     * Get External labels, which will be attached to all metrics collected by this cluster 
     * @return ExternalLabels External labels, which will be attached to all metrics collected by this cluster
     */
    public Label [] getExternalLabels() {
        return this.ExternalLabels;
    }

    /**
     * Set External labels, which will be attached to all metrics collected by this cluster
     * @param ExternalLabels External labels, which will be attached to all metrics collected by this cluster
     */
    public void setExternalLabels(Label [] ExternalLabels) {
        this.ExternalLabels = ExternalLabels;
    }

    /**
     * Get Whether to install the default collection configuration. 
     * @return NotInstallBasicScrape Whether to install the default collection configuration.
     */
    public Boolean getNotInstallBasicScrape() {
        return this.NotInstallBasicScrape;
    }

    /**
     * Set Whether to install the default collection configuration.
     * @param NotInstallBasicScrape Whether to install the default collection configuration.
     */
    public void setNotInstallBasicScrape(Boolean NotInstallBasicScrape) {
        this.NotInstallBasicScrape = NotInstallBasicScrape;
    }

    /**
     * Get Whether to collect metrics (`true`: Drop all metrics; `false`: Collect default metrics) 
     * @return NotScrape Whether to collect metrics (`true`: Drop all metrics; `false`: Collect default metrics)
     */
    public Boolean getNotScrape() {
        return this.NotScrape;
    }

    /**
     * Set Whether to collect metrics (`true`: Drop all metrics; `false`: Collect default metrics)
     * @param NotScrape Whether to collect metrics (`true`: Drop all metrics; `false`: Collect default metrics)
     */
    public void setNotScrape(Boolean NotScrape) {
        this.NotScrape = NotScrape;
    }

    /**
     * Get Whether to enable the default recording rule 
     * @return OpenDefaultRecord Whether to enable the default recording rule
     */
    public Boolean getOpenDefaultRecord() {
        return this.OpenDefaultRecord;
    }

    /**
     * Set Whether to enable the default recording rule
     * @param OpenDefaultRecord Whether to enable the default recording rule
     */
    public void setOpenDefaultRecord(Boolean OpenDefaultRecord) {
        this.OpenDefaultRecord = OpenDefaultRecord;
    }

    public PrometheusClusterAgentBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusClusterAgentBasic(PrometheusClusterAgentBasic source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EnableExternal != null) {
            this.EnableExternal = new Boolean(source.EnableExternal);
        }
        if (source.InClusterPodConfig != null) {
            this.InClusterPodConfig = new PrometheusClusterAgentPodConfig(source.InClusterPodConfig);
        }
        if (source.ExternalLabels != null) {
            this.ExternalLabels = new Label[source.ExternalLabels.length];
            for (int i = 0; i < source.ExternalLabels.length; i++) {
                this.ExternalLabels[i] = new Label(source.ExternalLabels[i]);
            }
        }
        if (source.NotInstallBasicScrape != null) {
            this.NotInstallBasicScrape = new Boolean(source.NotInstallBasicScrape);
        }
        if (source.NotScrape != null) {
            this.NotScrape = new Boolean(source.NotScrape);
        }
        if (source.OpenDefaultRecord != null) {
            this.OpenDefaultRecord = new Boolean(source.OpenDefaultRecord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EnableExternal", this.EnableExternal);
        this.setParamObj(map, prefix + "InClusterPodConfig.", this.InClusterPodConfig);
        this.setParamArrayObj(map, prefix + "ExternalLabels.", this.ExternalLabels);
        this.setParamSimple(map, prefix + "NotInstallBasicScrape", this.NotInstallBasicScrape);
        this.setParamSimple(map, prefix + "NotScrape", this.NotScrape);
        this.setParamSimple(map, prefix + "OpenDefaultRecord", this.OpenDefaultRecord);

    }
}

