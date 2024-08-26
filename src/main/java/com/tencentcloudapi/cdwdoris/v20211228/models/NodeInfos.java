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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfos extends AbstractModel {

    /**
    * Node name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Node IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Node role
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * Component name
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Last restart time
    */
    @SerializedName("LastRestartTime")
    @Expose
    private String LastRestartTime;

    /**
     * Get Node name 
     * @return NodeName Node name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
     * @param NodeName Node name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node status 
     * @return Status Node status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Node status
     * @param Status Node status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Node IP 
     * @return Ip Node IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Node IP
     * @param Ip Node IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Node role 
     * @return NodeRole Node role
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Node role
     * @param NodeRole Node role
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get Component name 
     * @return ComponentName Component name
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name
     * @param ComponentName Component name
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Last restart time 
     * @return LastRestartTime Last restart time
     */
    public String getLastRestartTime() {
        return this.LastRestartTime;
    }

    /**
     * Set Last restart time
     * @param LastRestartTime Last restart time
     */
    public void setLastRestartTime(String LastRestartTime) {
        this.LastRestartTime = LastRestartTime;
    }

    public NodeInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfos(NodeInfos source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.LastRestartTime != null) {
            this.LastRestartTime = new String(source.LastRestartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "LastRestartTime", this.LastRestartTime);

    }
}

