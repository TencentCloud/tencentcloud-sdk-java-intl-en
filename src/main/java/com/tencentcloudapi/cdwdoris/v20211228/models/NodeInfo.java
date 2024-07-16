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

public class NodeInfo extends AbstractModel {

    /**
    * User IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Node status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Node role name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Component name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Node role
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * The time when the node was last restarted
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastRestartTime")
    @Expose
    private String LastRestartTime;

    /**
    * The availability zone where the node is located
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get User IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ip User IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set User IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ip User IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Node status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Node status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Node status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Node status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Node role name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeName Node role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node role name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeName Node role name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Component name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentName Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentName Component name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Node role
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeRole Node role
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Node role
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeRole Node role
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get The time when the node was last restarted
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastRestartTime The time when the node was last restarted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastRestartTime() {
        return this.LastRestartTime;
    }

    /**
     * Set The time when the node was last restarted
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastRestartTime The time when the node was last restarted
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastRestartTime(String LastRestartTime) {
        this.LastRestartTime = LastRestartTime;
    }

    /**
     * Get The availability zone where the node is located
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone The availability zone where the node is located
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone where the node is located
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone The availability zone where the node is located
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.LastRestartTime != null) {
            this.LastRestartTime = new String(source.LastRestartTime);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "LastRestartTime", this.LastRestartTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

