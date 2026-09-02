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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerPortItem extends AbstractModel {

    /**
    * Name of the listening process
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Listening port in container
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * Process running user
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Containerized process ID
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * Host private IP address
    */
    @SerializedName("HostInnerIP")
    @Expose
    private String HostInnerIP;

    /**
    * Public network IP address of the host machine.
    */
    @SerializedName("HostPublicIP")
    @Expose
    private String HostPublicIP;

    /**
    * Host machine mapping port
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * Network protocol type.
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
     * Get Name of the listening process 
     * @return ProcessName Name of the listening process
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Name of the listening process
     * @param ProcessName Name of the listening process
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Listening port in container 
     * @return ContainerPort Listening port in container
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set Listening port in container
     * @param ContainerPort Listening port in container
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get Process running user 
     * @return RunAs Process running user
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Process running user
     * @param RunAs Process running user
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Containerized process ID 
     * @return ContainerPID Containerized process ID
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set Containerized process ID
     * @param ContainerPID Containerized process ID
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get Host private IP address 
     * @return HostInnerIP Host private IP address
     */
    public String getHostInnerIP() {
        return this.HostInnerIP;
    }

    /**
     * Set Host private IP address
     * @param HostInnerIP Host private IP address
     */
    public void setHostInnerIP(String HostInnerIP) {
        this.HostInnerIP = HostInnerIP;
    }

    /**
     * Get Public network IP address of the host machine. 
     * @return HostPublicIP Public network IP address of the host machine.
     */
    public String getHostPublicIP() {
        return this.HostPublicIP;
    }

    /**
     * Set Public network IP address of the host machine.
     * @param HostPublicIP Public network IP address of the host machine.
     */
    public void setHostPublicIP(String HostPublicIP) {
        this.HostPublicIP = HostPublicIP;
    }

    /**
     * Get Host machine mapping port 
     * @return PublicPort Host machine mapping port
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set Host machine mapping port
     * @param PublicPort Host machine mapping port
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get Network protocol type. 
     * @return ProtocolType Network protocol type.
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set Network protocol type.
     * @param ProtocolType Network protocol type.
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    public ContainerPortItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerPortItem(ContainerPortItem source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.HostInnerIP != null) {
            this.HostInnerIP = new String(source.HostInnerIP);
        }
        if (source.HostPublicIP != null) {
            this.HostPublicIP = new String(source.HostPublicIP);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "HostInnerIP", this.HostInnerIP);
        this.setParamSimple(map, prefix + "HostPublicIP", this.HostPublicIP);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);

    }
}

