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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogJoinObjectInfo extends AbstractModel {

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP address
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Server status
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Public IP address
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Access status. Valid values: `true` (accessed); `false` (not accessed).
    */
    @SerializedName("JoinState")
    @Expose
    private Boolean JoinState;

    /**
    * cluster edition
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Master node address of the cluster
    */
    @SerializedName("ClusterMainAddress")
    @Expose
    private String ClusterMainAddress;

    /**
    * Number of containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Cluster type.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Cluster status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

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
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host IP address 
     * @return HostIP Host IP address
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Host IP address
     * @param HostIP Host IP address
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Server status 
     * @return HostStatus Server status
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set Server status
     * @param HostStatus Server status
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

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
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Public IP address 
     * @return PublicIP Public IP address
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP address
     * @param PublicIP Public IP address
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Access status. Valid values: `true` (accessed); `false` (not accessed). 
     * @return JoinState Access status. Valid values: `true` (accessed); `false` (not accessed).
     */
    public Boolean getJoinState() {
        return this.JoinState;
    }

    /**
     * Set Access status. Valid values: `true` (accessed); `false` (not accessed).
     * @param JoinState Access status. Valid values: `true` (accessed); `false` (not accessed).
     */
    public void setJoinState(Boolean JoinState) {
        this.JoinState = JoinState;
    }

    /**
     * Get cluster edition 
     * @return ClusterVersion cluster edition
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set cluster edition
     * @param ClusterVersion cluster edition
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Master node address of the cluster 
     * @return ClusterMainAddress Master node address of the cluster
     */
    public String getClusterMainAddress() {
        return this.ClusterMainAddress;
    }

    /**
     * Set Master node address of the cluster
     * @param ClusterMainAddress Master node address of the cluster
     */
    public void setClusterMainAddress(String ClusterMainAddress) {
        this.ClusterMainAddress = ClusterMainAddress;
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
     * Get Cluster type. 
     * @return ClusterType Cluster type.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type.
     * @param ClusterType Cluster type.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Cluster status 
     * @return ClusterStatus Cluster status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status
     * @param ClusterStatus Cluster status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    public SecLogJoinObjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogJoinObjectInfo(SecLogJoinObjectInfo source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.JoinState != null) {
            this.JoinState = new Boolean(source.JoinState);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterMainAddress != null) {
            this.ClusterMainAddress = new String(source.ClusterMainAddress);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "JoinState", this.JoinState);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterMainAddress", this.ClusterMainAddress);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);

    }
}

