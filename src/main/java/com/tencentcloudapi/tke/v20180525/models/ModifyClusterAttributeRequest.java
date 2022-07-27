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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterAttributeRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Project of the Cluster
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster description
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * Cluster specification
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * Auto-upgrades cluster specification
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private AutoUpgradeClusterLevel AutoUpgradeClusterLevel;

    /**
    * Whether to enable qGPU Sharing
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

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
     * Get Project of the Cluster 
     * @return ProjectId Project of the Cluster
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project of the Cluster
     * @param ProjectId Project of the Cluster
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster description 
     * @return ClusterDesc Cluster description
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set Cluster description
     * @param ClusterDesc Cluster description
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get Cluster specification 
     * @return ClusterLevel Cluster specification
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set Cluster specification
     * @param ClusterLevel Cluster specification
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get Auto-upgrades cluster specification 
     * @return AutoUpgradeClusterLevel Auto-upgrades cluster specification
     */
    public AutoUpgradeClusterLevel getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set Auto-upgrades cluster specification
     * @param AutoUpgradeClusterLevel Auto-upgrades cluster specification
     */
    public void setAutoUpgradeClusterLevel(AutoUpgradeClusterLevel AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get Whether to enable qGPU Sharing 
     * @return QGPUShareEnable Whether to enable qGPU Sharing
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set Whether to enable qGPU Sharing
     * @param QGPUShareEnable Whether to enable qGPU Sharing
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    public ModifyClusterAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAttributeRequest(ModifyClusterAttributeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new AutoUpgradeClusterLevel(source.AutoUpgradeClusterLevel);
        }
        if (source.QGPUShareEnable != null) {
            this.QGPUShareEnable = new Boolean(source.QGPUShareEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamObj(map, prefix + "AutoUpgradeClusterLevel.", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "QGPUShareEnable", this.QGPUShareEnable);

    }
}

