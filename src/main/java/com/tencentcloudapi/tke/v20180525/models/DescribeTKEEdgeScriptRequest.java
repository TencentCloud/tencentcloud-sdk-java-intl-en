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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeScriptRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Network Card Name, specifies the network card used by the kubelet on edge nodes to register with the apiserver.
    */
    @SerializedName("Interface")
    @Expose
    private String Interface;

    /**
    * Name of the name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node configuration in JSON format 
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * A legacy version of edgectl script can be downloaded. The latest version is downloaded by default. The version information can be checked in the script.
    */
    @SerializedName("ScriptVersion")
    @Expose
    private String ScriptVersion;

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
     * Get Network Card Name, specifies the network card used by the kubelet on edge nodes to register with the apiserver. 
     * @return Interface Network Card Name, specifies the network card used by the kubelet on edge nodes to register with the apiserver.
     */
    public String getInterface() {
        return this.Interface;
    }

    /**
     * Set Network Card Name, specifies the network card used by the kubelet on edge nodes to register with the apiserver.
     * @param Interface Network Card Name, specifies the network card used by the kubelet on edge nodes to register with the apiserver.
     */
    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    /**
     * Get Name of the name 
     * @return NodeName Name of the name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Name of the name
     * @param NodeName Name of the name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node configuration in JSON format  
     * @return Config Node configuration in JSON format 
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Node configuration in JSON format 
     * @param Config Node configuration in JSON format 
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get A legacy version of edgectl script can be downloaded. The latest version is downloaded by default. The version information can be checked in the script. 
     * @return ScriptVersion A legacy version of edgectl script can be downloaded. The latest version is downloaded by default. The version information can be checked in the script.
     */
    public String getScriptVersion() {
        return this.ScriptVersion;
    }

    /**
     * Set A legacy version of edgectl script can be downloaded. The latest version is downloaded by default. The version information can be checked in the script.
     * @param ScriptVersion A legacy version of edgectl script can be downloaded. The latest version is downloaded by default. The version information can be checked in the script.
     */
    public void setScriptVersion(String ScriptVersion) {
        this.ScriptVersion = ScriptVersion;
    }

    public DescribeTKEEdgeScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeScriptRequest(DescribeTKEEdgeScriptRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Interface != null) {
            this.Interface = new String(source.Interface);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ScriptVersion != null) {
            this.ScriptVersion = new String(source.ScriptVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Interface", this.Interface);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ScriptVersion", this.ScriptVersion);

    }
}

