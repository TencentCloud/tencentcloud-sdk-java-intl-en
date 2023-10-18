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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulAffectedContainerInfo extends AbstractModel {

    /**
    * Private IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Container ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Pod IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Public IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
     * Get Private IP 
     * @return HostIP Private IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Private IP
     * @param HostIP Private IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Container ID 
     * @return ContainerID Container ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set Container ID
     * @param ContainerID Container ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get Pod name 
     * @return PodName Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
     * @param PodName Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Pod IP 
     * @return PodIP Pod IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod IP
     * @param PodIP Pod IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Server ID 
     * @return HostID Server ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server ID
     * @param HostID Server ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Public IP 
     * @return PublicIP Public IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP
     * @param PublicIP Public IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    public VulAffectedContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulAffectedContainerInfo(VulAffectedContainerInfo source) {
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);

    }
}

