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

public class DescribeContainerAssetSummaryResponse extends AbstractModel {

    /**
    * Total number of containers
    */
    @SerializedName("ContainerTotalCnt")
    @Expose
    private Long ContainerTotalCnt;

    /**
    * Number of running containers
    */
    @SerializedName("ContainerRunningCnt")
    @Expose
    private Long ContainerRunningCnt;

    /**
    * Number of suspended containers
    */
    @SerializedName("ContainerPauseCnt")
    @Expose
    private Long ContainerPauseCnt;

    /**
    * Number of stopped containers
    */
    @SerializedName("ContainerStopped")
    @Expose
    private Long ContainerStopped;

    /**
    * Number of local images
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * Number of server nodes
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * Number of running nodes on the server
    */
    @SerializedName("HostRunningCnt")
    @Expose
    private Long HostRunningCnt;

    /**
    * Number of offline nodes on the server
    */
    @SerializedName("HostOfflineCnt")
    @Expose
    private Long HostOfflineCnt;

    /**
    * Number of image repositories
    */
    @SerializedName("ImageRegistryCnt")
    @Expose
    private Long ImageRegistryCnt;

    /**
    * Total number of images
    */
    @SerializedName("ImageTotalCnt")
    @Expose
    private Long ImageTotalCnt;

    /**
    * Number of servers not installed with the agent
    */
    @SerializedName("HostUnInstallCnt")
    @Expose
    private Long HostUnInstallCnt;

    /**
    * Number of super nodes
    */
    @SerializedName("HostSuperNodeCnt")
    @Expose
    private Long HostSuperNodeCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of containers 
     * @return ContainerTotalCnt Total number of containers
     */
    public Long getContainerTotalCnt() {
        return this.ContainerTotalCnt;
    }

    /**
     * Set Total number of containers
     * @param ContainerTotalCnt Total number of containers
     */
    public void setContainerTotalCnt(Long ContainerTotalCnt) {
        this.ContainerTotalCnt = ContainerTotalCnt;
    }

    /**
     * Get Number of running containers 
     * @return ContainerRunningCnt Number of running containers
     */
    public Long getContainerRunningCnt() {
        return this.ContainerRunningCnt;
    }

    /**
     * Set Number of running containers
     * @param ContainerRunningCnt Number of running containers
     */
    public void setContainerRunningCnt(Long ContainerRunningCnt) {
        this.ContainerRunningCnt = ContainerRunningCnt;
    }

    /**
     * Get Number of suspended containers 
     * @return ContainerPauseCnt Number of suspended containers
     */
    public Long getContainerPauseCnt() {
        return this.ContainerPauseCnt;
    }

    /**
     * Set Number of suspended containers
     * @param ContainerPauseCnt Number of suspended containers
     */
    public void setContainerPauseCnt(Long ContainerPauseCnt) {
        this.ContainerPauseCnt = ContainerPauseCnt;
    }

    /**
     * Get Number of stopped containers 
     * @return ContainerStopped Number of stopped containers
     */
    public Long getContainerStopped() {
        return this.ContainerStopped;
    }

    /**
     * Set Number of stopped containers
     * @param ContainerStopped Number of stopped containers
     */
    public void setContainerStopped(Long ContainerStopped) {
        this.ContainerStopped = ContainerStopped;
    }

    /**
     * Get Number of local images 
     * @return ImageCnt Number of local images
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set Number of local images
     * @param ImageCnt Number of local images
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get Number of server nodes 
     * @return HostCnt Number of server nodes
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set Number of server nodes
     * @param HostCnt Number of server nodes
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get Number of running nodes on the server 
     * @return HostRunningCnt Number of running nodes on the server
     */
    public Long getHostRunningCnt() {
        return this.HostRunningCnt;
    }

    /**
     * Set Number of running nodes on the server
     * @param HostRunningCnt Number of running nodes on the server
     */
    public void setHostRunningCnt(Long HostRunningCnt) {
        this.HostRunningCnt = HostRunningCnt;
    }

    /**
     * Get Number of offline nodes on the server 
     * @return HostOfflineCnt Number of offline nodes on the server
     */
    public Long getHostOfflineCnt() {
        return this.HostOfflineCnt;
    }

    /**
     * Set Number of offline nodes on the server
     * @param HostOfflineCnt Number of offline nodes on the server
     */
    public void setHostOfflineCnt(Long HostOfflineCnt) {
        this.HostOfflineCnt = HostOfflineCnt;
    }

    /**
     * Get Number of image repositories 
     * @return ImageRegistryCnt Number of image repositories
     */
    public Long getImageRegistryCnt() {
        return this.ImageRegistryCnt;
    }

    /**
     * Set Number of image repositories
     * @param ImageRegistryCnt Number of image repositories
     */
    public void setImageRegistryCnt(Long ImageRegistryCnt) {
        this.ImageRegistryCnt = ImageRegistryCnt;
    }

    /**
     * Get Total number of images 
     * @return ImageTotalCnt Total number of images
     */
    public Long getImageTotalCnt() {
        return this.ImageTotalCnt;
    }

    /**
     * Set Total number of images
     * @param ImageTotalCnt Total number of images
     */
    public void setImageTotalCnt(Long ImageTotalCnt) {
        this.ImageTotalCnt = ImageTotalCnt;
    }

    /**
     * Get Number of servers not installed with the agent 
     * @return HostUnInstallCnt Number of servers not installed with the agent
     */
    public Long getHostUnInstallCnt() {
        return this.HostUnInstallCnt;
    }

    /**
     * Set Number of servers not installed with the agent
     * @param HostUnInstallCnt Number of servers not installed with the agent
     */
    public void setHostUnInstallCnt(Long HostUnInstallCnt) {
        this.HostUnInstallCnt = HostUnInstallCnt;
    }

    /**
     * Get Number of super nodes 
     * @return HostSuperNodeCnt Number of super nodes
     */
    public Long getHostSuperNodeCnt() {
        return this.HostSuperNodeCnt;
    }

    /**
     * Set Number of super nodes
     * @param HostSuperNodeCnt Number of super nodes
     */
    public void setHostSuperNodeCnt(Long HostSuperNodeCnt) {
        this.HostSuperNodeCnt = HostSuperNodeCnt;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeContainerAssetSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerAssetSummaryResponse(DescribeContainerAssetSummaryResponse source) {
        if (source.ContainerTotalCnt != null) {
            this.ContainerTotalCnt = new Long(source.ContainerTotalCnt);
        }
        if (source.ContainerRunningCnt != null) {
            this.ContainerRunningCnt = new Long(source.ContainerRunningCnt);
        }
        if (source.ContainerPauseCnt != null) {
            this.ContainerPauseCnt = new Long(source.ContainerPauseCnt);
        }
        if (source.ContainerStopped != null) {
            this.ContainerStopped = new Long(source.ContainerStopped);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.HostRunningCnt != null) {
            this.HostRunningCnt = new Long(source.HostRunningCnt);
        }
        if (source.HostOfflineCnt != null) {
            this.HostOfflineCnt = new Long(source.HostOfflineCnt);
        }
        if (source.ImageRegistryCnt != null) {
            this.ImageRegistryCnt = new Long(source.ImageRegistryCnt);
        }
        if (source.ImageTotalCnt != null) {
            this.ImageTotalCnt = new Long(source.ImageTotalCnt);
        }
        if (source.HostUnInstallCnt != null) {
            this.HostUnInstallCnt = new Long(source.HostUnInstallCnt);
        }
        if (source.HostSuperNodeCnt != null) {
            this.HostSuperNodeCnt = new Long(source.HostSuperNodeCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerTotalCnt", this.ContainerTotalCnt);
        this.setParamSimple(map, prefix + "ContainerRunningCnt", this.ContainerRunningCnt);
        this.setParamSimple(map, prefix + "ContainerPauseCnt", this.ContainerPauseCnt);
        this.setParamSimple(map, prefix + "ContainerStopped", this.ContainerStopped);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "HostRunningCnt", this.HostRunningCnt);
        this.setParamSimple(map, prefix + "HostOfflineCnt", this.HostOfflineCnt);
        this.setParamSimple(map, prefix + "ImageRegistryCnt", this.ImageRegistryCnt);
        this.setParamSimple(map, prefix + "ImageTotalCnt", this.ImageTotalCnt);
        this.setParamSimple(map, prefix + "HostUnInstallCnt", this.HostUnInstallCnt);
        this.setParamSimple(map, prefix + "HostSuperNodeCnt", this.HostSuperNodeCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

