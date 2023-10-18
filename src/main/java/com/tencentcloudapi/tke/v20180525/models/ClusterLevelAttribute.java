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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterLevelAttribute extends AbstractModel {

    /**
    * Cluster model
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Model name
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Number of nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Number of Pods
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * Number of ConfigMap
    */
    @SerializedName("ConfigMapCount")
    @Expose
    private Long ConfigMapCount;

    /**
    * Number of ReplicaSets
    */
    @SerializedName("RSCount")
    @Expose
    private Long RSCount;

    /**
    * Number of CRDs
    */
    @SerializedName("CRDCount")
    @Expose
    private Long CRDCount;

    /**
    * Whether it is enabled
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Number of other resources
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("OtherCount")
    @Expose
    private Long OtherCount;

    /**
     * Get Cluster model 
     * @return Name Cluster model
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cluster model
     * @param Name Cluster model
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Model name 
     * @return Alias Model name
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Model name
     * @param Alias Model name
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Number of nodes 
     * @return NodeCount Number of nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes
     * @param NodeCount Number of nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Number of Pods 
     * @return PodCount Number of Pods
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set Number of Pods
     * @param PodCount Number of Pods
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get Number of ConfigMap 
     * @return ConfigMapCount Number of ConfigMap
     */
    public Long getConfigMapCount() {
        return this.ConfigMapCount;
    }

    /**
     * Set Number of ConfigMap
     * @param ConfigMapCount Number of ConfigMap
     */
    public void setConfigMapCount(Long ConfigMapCount) {
        this.ConfigMapCount = ConfigMapCount;
    }

    /**
     * Get Number of ReplicaSets 
     * @return RSCount Number of ReplicaSets
     */
    public Long getRSCount() {
        return this.RSCount;
    }

    /**
     * Set Number of ReplicaSets
     * @param RSCount Number of ReplicaSets
     */
    public void setRSCount(Long RSCount) {
        this.RSCount = RSCount;
    }

    /**
     * Get Number of CRDs 
     * @return CRDCount Number of CRDs
     */
    public Long getCRDCount() {
        return this.CRDCount;
    }

    /**
     * Set Number of CRDs
     * @param CRDCount Number of CRDs
     */
    public void setCRDCount(Long CRDCount) {
        this.CRDCount = CRDCount;
    }

    /**
     * Get Whether it is enabled 
     * @return Enable Whether it is enabled
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether it is enabled
     * @param Enable Whether it is enabled
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Number of other resources
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return OtherCount Number of other resources
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getOtherCount() {
        return this.OtherCount;
    }

    /**
     * Set Number of other resources
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param OtherCount Number of other resources
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setOtherCount(Long OtherCount) {
        this.OtherCount = OtherCount;
    }

    public ClusterLevelAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterLevelAttribute(ClusterLevelAttribute source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ConfigMapCount != null) {
            this.ConfigMapCount = new Long(source.ConfigMapCount);
        }
        if (source.RSCount != null) {
            this.RSCount = new Long(source.RSCount);
        }
        if (source.CRDCount != null) {
            this.CRDCount = new Long(source.CRDCount);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.OtherCount != null) {
            this.OtherCount = new Long(source.OtherCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ConfigMapCount", this.ConfigMapCount);
        this.setParamSimple(map, prefix + "RSCount", this.RSCount);
        this.setParamSimple(map, prefix + "CRDCount", this.CRDCount);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "OtherCount", this.OtherCount);

    }
}

