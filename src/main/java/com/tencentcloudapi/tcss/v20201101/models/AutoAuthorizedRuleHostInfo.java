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

public class AutoAuthorizedRuleHostInfo extends AbstractModel {

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Server IP, which is the private IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Number of images
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * Number of containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Server instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Docker version
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * Agent status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get Server IP, which is the private IP 
     * @return HostIP Server IP, which is the private IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP, which is the private IP
     * @param HostIP Server IP, which is the private IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
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
     * Get Number of images 
     * @return ImageCnt Number of images
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set Number of images
     * @param ImageCnt Number of images
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get Number of containers 
     * @return ContainerCnt Number of containers
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set Number of containers
     * @param ContainerCnt Number of containers
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Server instance ID 
     * @return InstanceID Server instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Server instance ID
     * @param InstanceID Server instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances. 
     * @return MachineType Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
     * @param MachineType Server source. Valid values: `CVM`, `ECM`, `LH`, `BM`, `Other`. The first four values indicate Tencent Cloud instances, while the last one indicates non-Tencent Cloud instances.
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Docker version 
     * @return DockerVersion Docker version
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set Docker version
     * @param DockerVersion Docker version
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get Agent status 
     * @return Status Agent status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status
     * @param Status Agent status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AutoAuthorizedRuleHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoAuthorizedRuleHostInfo(AutoAuthorizedRuleHostInfo source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

