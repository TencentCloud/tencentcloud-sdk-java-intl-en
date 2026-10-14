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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceResourceEnvTKE extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetID")
    @Expose
    private String SubnetID;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Data storage address
    */
    @SerializedName("DataPath")
    @Expose
    private String DataPath;

    /**
    * node selector
    */
    @SerializedName("NodeSelector")
    @Expose
    private K8SLabel [] NodeSelector;

    /**
    * Taint and toleration
    */
    @SerializedName("Tolerations")
    @Expose
    private K8SToleration [] Tolerations;

    /**
    * Starting node port number occupied by the scf component
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * pod patch content in yaml format, for example
metadata:
  labels:
    key: value
    */
    @SerializedName("PodTemplatePatch")
    @Expose
    private String PodTemplatePatch;

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetID Subnet ID.
     */
    public String getSubnetID() {
        return this.SubnetID;
    }

    /**
     * Set Subnet ID.
     * @param SubnetID Subnet ID.
     */
    public void setSubnetID(String SubnetID) {
        this.SubnetID = SubnetID;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Data storage address 
     * @return DataPath Data storage address
     */
    public String getDataPath() {
        return this.DataPath;
    }

    /**
     * Set Data storage address
     * @param DataPath Data storage address
     */
    public void setDataPath(String DataPath) {
        this.DataPath = DataPath;
    }

    /**
     * Get node selector 
     * @return NodeSelector node selector
     */
    public K8SLabel [] getNodeSelector() {
        return this.NodeSelector;
    }

    /**
     * Set node selector
     * @param NodeSelector node selector
     */
    public void setNodeSelector(K8SLabel [] NodeSelector) {
        this.NodeSelector = NodeSelector;
    }

    /**
     * Get Taint and toleration 
     * @return Tolerations Taint and toleration
     */
    public K8SToleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set Taint and toleration
     * @param Tolerations Taint and toleration
     */
    public void setTolerations(K8SToleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get Starting node port number occupied by the scf component 
     * @return Port Starting node port number occupied by the scf component
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Starting node port number occupied by the scf component
     * @param Port Starting node port number occupied by the scf component
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get pod patch content in yaml format, for example
metadata:
  labels:
    key: value 
     * @return PodTemplatePatch pod patch content in yaml format, for example
metadata:
  labels:
    key: value
     */
    public String getPodTemplatePatch() {
        return this.PodTemplatePatch;
    }

    /**
     * Set pod patch content in yaml format, for example
metadata:
  labels:
    key: value
     * @param PodTemplatePatch pod patch content in yaml format, for example
metadata:
  labels:
    key: value
     */
    public void setPodTemplatePatch(String PodTemplatePatch) {
        this.PodTemplatePatch = PodTemplatePatch;
    }

    public NamespaceResourceEnvTKE() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceResourceEnvTKE(NamespaceResourceEnvTKE source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.SubnetID != null) {
            this.SubnetID = new String(source.SubnetID);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.DataPath != null) {
            this.DataPath = new String(source.DataPath);
        }
        if (source.NodeSelector != null) {
            this.NodeSelector = new K8SLabel[source.NodeSelector.length];
            for (int i = 0; i < source.NodeSelector.length; i++) {
                this.NodeSelector[i] = new K8SLabel(source.NodeSelector[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new K8SToleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new K8SToleration(source.Tolerations[i]);
            }
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.PodTemplatePatch != null) {
            this.PodTemplatePatch = new String(source.PodTemplatePatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "SubnetID", this.SubnetID);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "DataPath", this.DataPath);
        this.setParamArrayObj(map, prefix + "NodeSelector.", this.NodeSelector);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PodTemplatePatch", this.PodTemplatePatch);

    }
}

