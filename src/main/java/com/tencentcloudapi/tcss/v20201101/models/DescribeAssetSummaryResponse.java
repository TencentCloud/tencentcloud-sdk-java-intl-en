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

public class DescribeAssetSummaryResponse extends AbstractModel {

    /**
    * Number of applications
    */
    @SerializedName("AppCnt")
    @Expose
    private Long AppCnt;

    /**
    * Number of containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Number of paused containers
    */
    @SerializedName("ContainerPause")
    @Expose
    private Long ContainerPause;

    /**
    * Number of running containers
    */
    @SerializedName("ContainerRunning")
    @Expose
    private Long ContainerRunning;

    /**
    * Number of stopped containers
    */
    @SerializedName("ContainerStop")
    @Expose
    private Long ContainerStop;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of databases
    */
    @SerializedName("DbCnt")
    @Expose
    private Long DbCnt;

    /**
    * Number of images
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * Number of online servers
    */
    @SerializedName("HostOnline")
    @Expose
    private Long HostOnline;

    /**
    * Number of servers
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * Number of images at risk
    */
    @SerializedName("ImageHasRiskInfoCnt")
    @Expose
    private Long ImageHasRiskInfoCnt;

    /**
    * Number of images with viruses
    */
    @SerializedName("ImageHasVirusCnt")
    @Expose
    private Long ImageHasVirusCnt;

    /**
    * Number of images with vulnerabilities
    */
    @SerializedName("ImageHasVulsCnt")
    @Expose
    private Long ImageHasVulsCnt;

    /**
    * Number of untrusted images
    */
    @SerializedName("ImageUntrustCnt")
    @Expose
    private Long ImageUntrustCnt;

    /**
    * Number of listened ports
    */
    @SerializedName("ListenPortCnt")
    @Expose
    private Long ListenPortCnt;

    /**
    * Number of processes
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
    * Number of web services
    */
    @SerializedName("WebServiceCnt")
    @Expose
    private Long WebServiceCnt;

    /**
    * Last image scan time
    */
    @SerializedName("LatestImageScanTime")
    @Expose
    private String LatestImageScanTime;

    /**
    * Number of images at risk
    */
    @SerializedName("ImageUnsafeCnt")
    @Expose
    private Long ImageUnsafeCnt;

    /**
    * Number of servers not installed with the agent
    */
    @SerializedName("HostUnInstallCnt")
    @Expose
    private Long HostUnInstallCnt;

    /**
    * Number of super nodes
    */
    @SerializedName("SuperNodeCnt")
    @Expose
    private Long SuperNodeCnt;

    /**
    * Number of running super nodes
    */
    @SerializedName("SuperNodeRunningCnt")
    @Expose
    private Long SuperNodeRunningCnt;

    /**
    * 
    */
    @SerializedName("TodayNewImageCnt")
    @Expose
    private Long TodayNewImageCnt;

    /**
    * 
    */
    @SerializedName("TodayUnsafeImageCnt")
    @Expose
    private Long TodayUnsafeImageCnt;

    /**
    * 
    */
    @SerializedName("RecommendedFixImageCnt")
    @Expose
    private Long RecommendedFixImageCnt;

    /**
    * 
    */
    @SerializedName("ScannedImageCnt")
    @Expose
    private Long ScannedImageCnt;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of applications 
     * @return AppCnt Number of applications
     */
    public Long getAppCnt() {
        return this.AppCnt;
    }

    /**
     * Set Number of applications
     * @param AppCnt Number of applications
     */
    public void setAppCnt(Long AppCnt) {
        this.AppCnt = AppCnt;
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
     * Get Number of paused containers 
     * @return ContainerPause Number of paused containers
     */
    public Long getContainerPause() {
        return this.ContainerPause;
    }

    /**
     * Set Number of paused containers
     * @param ContainerPause Number of paused containers
     */
    public void setContainerPause(Long ContainerPause) {
        this.ContainerPause = ContainerPause;
    }

    /**
     * Get Number of running containers 
     * @return ContainerRunning Number of running containers
     */
    public Long getContainerRunning() {
        return this.ContainerRunning;
    }

    /**
     * Set Number of running containers
     * @param ContainerRunning Number of running containers
     */
    public void setContainerRunning(Long ContainerRunning) {
        this.ContainerRunning = ContainerRunning;
    }

    /**
     * Get Number of stopped containers 
     * @return ContainerStop Number of stopped containers
     */
    public Long getContainerStop() {
        return this.ContainerStop;
    }

    /**
     * Set Number of stopped containers
     * @param ContainerStop Number of stopped containers
     */
    public void setContainerStop(Long ContainerStop) {
        this.ContainerStop = ContainerStop;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of databases 
     * @return DbCnt Number of databases
     */
    public Long getDbCnt() {
        return this.DbCnt;
    }

    /**
     * Set Number of databases
     * @param DbCnt Number of databases
     */
    public void setDbCnt(Long DbCnt) {
        this.DbCnt = DbCnt;
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
     * Get Number of online servers 
     * @return HostOnline Number of online servers
     */
    public Long getHostOnline() {
        return this.HostOnline;
    }

    /**
     * Set Number of online servers
     * @param HostOnline Number of online servers
     */
    public void setHostOnline(Long HostOnline) {
        this.HostOnline = HostOnline;
    }

    /**
     * Get Number of servers 
     * @return HostCnt Number of servers
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set Number of servers
     * @param HostCnt Number of servers
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get Number of images at risk 
     * @return ImageHasRiskInfoCnt Number of images at risk
     */
    public Long getImageHasRiskInfoCnt() {
        return this.ImageHasRiskInfoCnt;
    }

    /**
     * Set Number of images at risk
     * @param ImageHasRiskInfoCnt Number of images at risk
     */
    public void setImageHasRiskInfoCnt(Long ImageHasRiskInfoCnt) {
        this.ImageHasRiskInfoCnt = ImageHasRiskInfoCnt;
    }

    /**
     * Get Number of images with viruses 
     * @return ImageHasVirusCnt Number of images with viruses
     */
    public Long getImageHasVirusCnt() {
        return this.ImageHasVirusCnt;
    }

    /**
     * Set Number of images with viruses
     * @param ImageHasVirusCnt Number of images with viruses
     */
    public void setImageHasVirusCnt(Long ImageHasVirusCnt) {
        this.ImageHasVirusCnt = ImageHasVirusCnt;
    }

    /**
     * Get Number of images with vulnerabilities 
     * @return ImageHasVulsCnt Number of images with vulnerabilities
     */
    public Long getImageHasVulsCnt() {
        return this.ImageHasVulsCnt;
    }

    /**
     * Set Number of images with vulnerabilities
     * @param ImageHasVulsCnt Number of images with vulnerabilities
     */
    public void setImageHasVulsCnt(Long ImageHasVulsCnt) {
        this.ImageHasVulsCnt = ImageHasVulsCnt;
    }

    /**
     * Get Number of untrusted images 
     * @return ImageUntrustCnt Number of untrusted images
     */
    public Long getImageUntrustCnt() {
        return this.ImageUntrustCnt;
    }

    /**
     * Set Number of untrusted images
     * @param ImageUntrustCnt Number of untrusted images
     */
    public void setImageUntrustCnt(Long ImageUntrustCnt) {
        this.ImageUntrustCnt = ImageUntrustCnt;
    }

    /**
     * Get Number of listened ports 
     * @return ListenPortCnt Number of listened ports
     */
    public Long getListenPortCnt() {
        return this.ListenPortCnt;
    }

    /**
     * Set Number of listened ports
     * @param ListenPortCnt Number of listened ports
     */
    public void setListenPortCnt(Long ListenPortCnt) {
        this.ListenPortCnt = ListenPortCnt;
    }

    /**
     * Get Number of processes 
     * @return ProcessCnt Number of processes
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set Number of processes
     * @param ProcessCnt Number of processes
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    /**
     * Get Number of web services 
     * @return WebServiceCnt Number of web services
     */
    public Long getWebServiceCnt() {
        return this.WebServiceCnt;
    }

    /**
     * Set Number of web services
     * @param WebServiceCnt Number of web services
     */
    public void setWebServiceCnt(Long WebServiceCnt) {
        this.WebServiceCnt = WebServiceCnt;
    }

    /**
     * Get Last image scan time 
     * @return LatestImageScanTime Last image scan time
     */
    public String getLatestImageScanTime() {
        return this.LatestImageScanTime;
    }

    /**
     * Set Last image scan time
     * @param LatestImageScanTime Last image scan time
     */
    public void setLatestImageScanTime(String LatestImageScanTime) {
        this.LatestImageScanTime = LatestImageScanTime;
    }

    /**
     * Get Number of images at risk 
     * @return ImageUnsafeCnt Number of images at risk
     */
    public Long getImageUnsafeCnt() {
        return this.ImageUnsafeCnt;
    }

    /**
     * Set Number of images at risk
     * @param ImageUnsafeCnt Number of images at risk
     */
    public void setImageUnsafeCnt(Long ImageUnsafeCnt) {
        this.ImageUnsafeCnt = ImageUnsafeCnt;
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
     * @return SuperNodeCnt Number of super nodes
     */
    public Long getSuperNodeCnt() {
        return this.SuperNodeCnt;
    }

    /**
     * Set Number of super nodes
     * @param SuperNodeCnt Number of super nodes
     */
    public void setSuperNodeCnt(Long SuperNodeCnt) {
        this.SuperNodeCnt = SuperNodeCnt;
    }

    /**
     * Get Number of running super nodes 
     * @return SuperNodeRunningCnt Number of running super nodes
     */
    public Long getSuperNodeRunningCnt() {
        return this.SuperNodeRunningCnt;
    }

    /**
     * Set Number of running super nodes
     * @param SuperNodeRunningCnt Number of running super nodes
     */
    public void setSuperNodeRunningCnt(Long SuperNodeRunningCnt) {
        this.SuperNodeRunningCnt = SuperNodeRunningCnt;
    }

    /**
     * Get  
     * @return TodayNewImageCnt 
     */
    public Long getTodayNewImageCnt() {
        return this.TodayNewImageCnt;
    }

    /**
     * Set 
     * @param TodayNewImageCnt 
     */
    public void setTodayNewImageCnt(Long TodayNewImageCnt) {
        this.TodayNewImageCnt = TodayNewImageCnt;
    }

    /**
     * Get  
     * @return TodayUnsafeImageCnt 
     */
    public Long getTodayUnsafeImageCnt() {
        return this.TodayUnsafeImageCnt;
    }

    /**
     * Set 
     * @param TodayUnsafeImageCnt 
     */
    public void setTodayUnsafeImageCnt(Long TodayUnsafeImageCnt) {
        this.TodayUnsafeImageCnt = TodayUnsafeImageCnt;
    }

    /**
     * Get  
     * @return RecommendedFixImageCnt 
     */
    public Long getRecommendedFixImageCnt() {
        return this.RecommendedFixImageCnt;
    }

    /**
     * Set 
     * @param RecommendedFixImageCnt 
     */
    public void setRecommendedFixImageCnt(Long RecommendedFixImageCnt) {
        this.RecommendedFixImageCnt = RecommendedFixImageCnt;
    }

    /**
     * Get  
     * @return ScannedImageCnt 
     */
    public Long getScannedImageCnt() {
        return this.ScannedImageCnt;
    }

    /**
     * Set 
     * @param ScannedImageCnt 
     */
    public void setScannedImageCnt(Long ScannedImageCnt) {
        this.ScannedImageCnt = ScannedImageCnt;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetSummaryResponse(DescribeAssetSummaryResponse source) {
        if (source.AppCnt != null) {
            this.AppCnt = new Long(source.AppCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ContainerPause != null) {
            this.ContainerPause = new Long(source.ContainerPause);
        }
        if (source.ContainerRunning != null) {
            this.ContainerRunning = new Long(source.ContainerRunning);
        }
        if (source.ContainerStop != null) {
            this.ContainerStop = new Long(source.ContainerStop);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbCnt != null) {
            this.DbCnt = new Long(source.DbCnt);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.HostOnline != null) {
            this.HostOnline = new Long(source.HostOnline);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.ImageHasRiskInfoCnt != null) {
            this.ImageHasRiskInfoCnt = new Long(source.ImageHasRiskInfoCnt);
        }
        if (source.ImageHasVirusCnt != null) {
            this.ImageHasVirusCnt = new Long(source.ImageHasVirusCnt);
        }
        if (source.ImageHasVulsCnt != null) {
            this.ImageHasVulsCnt = new Long(source.ImageHasVulsCnt);
        }
        if (source.ImageUntrustCnt != null) {
            this.ImageUntrustCnt = new Long(source.ImageUntrustCnt);
        }
        if (source.ListenPortCnt != null) {
            this.ListenPortCnt = new Long(source.ListenPortCnt);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
        if (source.WebServiceCnt != null) {
            this.WebServiceCnt = new Long(source.WebServiceCnt);
        }
        if (source.LatestImageScanTime != null) {
            this.LatestImageScanTime = new String(source.LatestImageScanTime);
        }
        if (source.ImageUnsafeCnt != null) {
            this.ImageUnsafeCnt = new Long(source.ImageUnsafeCnt);
        }
        if (source.HostUnInstallCnt != null) {
            this.HostUnInstallCnt = new Long(source.HostUnInstallCnt);
        }
        if (source.SuperNodeCnt != null) {
            this.SuperNodeCnt = new Long(source.SuperNodeCnt);
        }
        if (source.SuperNodeRunningCnt != null) {
            this.SuperNodeRunningCnt = new Long(source.SuperNodeRunningCnt);
        }
        if (source.TodayNewImageCnt != null) {
            this.TodayNewImageCnt = new Long(source.TodayNewImageCnt);
        }
        if (source.TodayUnsafeImageCnt != null) {
            this.TodayUnsafeImageCnt = new Long(source.TodayUnsafeImageCnt);
        }
        if (source.RecommendedFixImageCnt != null) {
            this.RecommendedFixImageCnt = new Long(source.RecommendedFixImageCnt);
        }
        if (source.ScannedImageCnt != null) {
            this.ScannedImageCnt = new Long(source.ScannedImageCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppCnt", this.AppCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ContainerPause", this.ContainerPause);
        this.setParamSimple(map, prefix + "ContainerRunning", this.ContainerRunning);
        this.setParamSimple(map, prefix + "ContainerStop", this.ContainerStop);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbCnt", this.DbCnt);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "HostOnline", this.HostOnline);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "ImageHasRiskInfoCnt", this.ImageHasRiskInfoCnt);
        this.setParamSimple(map, prefix + "ImageHasVirusCnt", this.ImageHasVirusCnt);
        this.setParamSimple(map, prefix + "ImageHasVulsCnt", this.ImageHasVulsCnt);
        this.setParamSimple(map, prefix + "ImageUntrustCnt", this.ImageUntrustCnt);
        this.setParamSimple(map, prefix + "ListenPortCnt", this.ListenPortCnt);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);
        this.setParamSimple(map, prefix + "WebServiceCnt", this.WebServiceCnt);
        this.setParamSimple(map, prefix + "LatestImageScanTime", this.LatestImageScanTime);
        this.setParamSimple(map, prefix + "ImageUnsafeCnt", this.ImageUnsafeCnt);
        this.setParamSimple(map, prefix + "HostUnInstallCnt", this.HostUnInstallCnt);
        this.setParamSimple(map, prefix + "SuperNodeCnt", this.SuperNodeCnt);
        this.setParamSimple(map, prefix + "SuperNodeRunningCnt", this.SuperNodeRunningCnt);
        this.setParamSimple(map, prefix + "TodayNewImageCnt", this.TodayNewImageCnt);
        this.setParamSimple(map, prefix + "TodayUnsafeImageCnt", this.TodayUnsafeImageCnt);
        this.setParamSimple(map, prefix + "RecommendedFixImageCnt", this.RecommendedFixImageCnt);
        this.setParamSimple(map, prefix + "ScannedImageCnt", this.ScannedImageCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

