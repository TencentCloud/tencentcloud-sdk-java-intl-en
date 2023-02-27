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

public class PrometheusClusterAgentPodConfig extends AbstractModel{

    /**
    * Whether to use HostNetWork
    */
    @SerializedName("HostNet")
    @Expose
    private Boolean HostNet;

    /**
    * A parameter used to specify the running nodes for a pod
    */
    @SerializedName("NodeSelector")
    @Expose
    private Label [] NodeSelector;

    /**
    * Tolerable taints
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
     * Get Whether to use HostNetWork 
     * @return HostNet Whether to use HostNetWork
     */
    public Boolean getHostNet() {
        return this.HostNet;
    }

    /**
     * Set Whether to use HostNetWork
     * @param HostNet Whether to use HostNetWork
     */
    public void setHostNet(Boolean HostNet) {
        this.HostNet = HostNet;
    }

    /**
     * Get A parameter used to specify the running nodes for a pod 
     * @return NodeSelector A parameter used to specify the running nodes for a pod
     */
    public Label [] getNodeSelector() {
        return this.NodeSelector;
    }

    /**
     * Set A parameter used to specify the running nodes for a pod
     * @param NodeSelector A parameter used to specify the running nodes for a pod
     */
    public void setNodeSelector(Label [] NodeSelector) {
        this.NodeSelector = NodeSelector;
    }

    /**
     * Get Tolerable taints 
     * @return Tolerations Tolerable taints
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set Tolerable taints
     * @param Tolerations Tolerable taints
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    public PrometheusClusterAgentPodConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusClusterAgentPodConfig(PrometheusClusterAgentPodConfig source) {
        if (source.HostNet != null) {
            this.HostNet = new Boolean(source.HostNet);
        }
        if (source.NodeSelector != null) {
            this.NodeSelector = new Label[source.NodeSelector.length];
            for (int i = 0; i < source.NodeSelector.length; i++) {
                this.NodeSelector[i] = new Label(source.NodeSelector[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostNet", this.HostNet);
        this.setParamArrayObj(map, prefix + "NodeSelector.", this.NodeSelector);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);

    }
}

