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

public class DescribeTcssSummaryResponse extends AbstractModel {

    /**
    * Total number of images
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * Number of scanned images
    */
    @SerializedName("ScannedImageCnt")
    @Expose
    private Long ScannedImageCnt;

    /**
    * Number of images to be scanned
    */
    @SerializedName("UnScannedImageCnt")
    @Expose
    private Long UnScannedImageCnt;

    /**
    * Number of local images
    */
    @SerializedName("LocalImageCnt")
    @Expose
    private Long LocalImageCnt;

    /**
    * Number of repository images
    */
    @SerializedName("RepositoryImageCnt")
    @Expose
    private Long RepositoryImageCnt;

    /**
    * Number of local images at risk
    */
    @SerializedName("RiskLocalImageCnt")
    @Expose
    private Long RiskLocalImageCnt;

    /**
    * Number of repository images at risk
    */
    @SerializedName("RiskRepositoryImageCnt")
    @Expose
    private Long RiskRepositoryImageCnt;

    /**
    * Number of containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Number of containers at risk
    */
    @SerializedName("RiskContainerCnt")
    @Expose
    private Long RiskContainerCnt;

    /**
    * Number of clusters
    */
    @SerializedName("ClusterCnt")
    @Expose
    private Long ClusterCnt;

    /**
    * Number of clusters at risk
    */
    @SerializedName("RiskClusterCnt")
    @Expose
    private Long RiskClusterCnt;

    /**
    * Number of vulnerabilities to be scanned
    */
    @SerializedName("UnScannedVulCnt")
    @Expose
    private Long UnScannedVulCnt;

    /**
    * Number of risk vulnerabilities
    */
    @SerializedName("RiskVulCnt")
    @Expose
    private Long RiskVulCnt;

    /**
    * Number of security baseline items to be scanned
    */
    @SerializedName("UnScannedBaseLineCnt")
    @Expose
    private Long UnScannedBaseLineCnt;

    /**
    * Number of security baseline risks
    */
    @SerializedName("RiskBaseLineCnt")
    @Expose
    private Long RiskBaseLineCnt;

    /**
    * Number of pending (high-risk) events at runtime
    */
    @SerializedName("RuntimeUnhandleEventCnt")
    @Expose
    private Long RuntimeUnhandleEventCnt;

    /**
    * Number of clusters to be scanned
    */
    @SerializedName("UnScannedClusterCnt")
    @Expose
    private Long UnScannedClusterCnt;

    /**
    * Whether images are scanned
    */
    @SerializedName("ScanImageStatus")
    @Expose
    private Boolean ScanImageStatus;

    /**
    * Whether clusters are scanned
    */
    @SerializedName("ScanClusterStatus")
    @Expose
    private Boolean ScanClusterStatus;

    /**
    * Whether baseline items are scanned
    */
    @SerializedName("ScanBaseLineStatus")
    @Expose
    private Boolean ScanBaseLineStatus;

    /**
    * Whether vulnerabilities are scanned for
    */
    @SerializedName("ScanVulStatus")
    @Expose
    private Boolean ScanVulStatus;

    /**
    * Number of images affected by vulnerabilities
    */
    @SerializedName("VulRiskImageCnt")
    @Expose
    private Long VulRiskImageCnt;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of images 
     * @return ImageCnt Total number of images
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set Total number of images
     * @param ImageCnt Total number of images
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get Number of scanned images 
     * @return ScannedImageCnt Number of scanned images
     */
    public Long getScannedImageCnt() {
        return this.ScannedImageCnt;
    }

    /**
     * Set Number of scanned images
     * @param ScannedImageCnt Number of scanned images
     */
    public void setScannedImageCnt(Long ScannedImageCnt) {
        this.ScannedImageCnt = ScannedImageCnt;
    }

    /**
     * Get Number of images to be scanned 
     * @return UnScannedImageCnt Number of images to be scanned
     */
    public Long getUnScannedImageCnt() {
        return this.UnScannedImageCnt;
    }

    /**
     * Set Number of images to be scanned
     * @param UnScannedImageCnt Number of images to be scanned
     */
    public void setUnScannedImageCnt(Long UnScannedImageCnt) {
        this.UnScannedImageCnt = UnScannedImageCnt;
    }

    /**
     * Get Number of local images 
     * @return LocalImageCnt Number of local images
     */
    public Long getLocalImageCnt() {
        return this.LocalImageCnt;
    }

    /**
     * Set Number of local images
     * @param LocalImageCnt Number of local images
     */
    public void setLocalImageCnt(Long LocalImageCnt) {
        this.LocalImageCnt = LocalImageCnt;
    }

    /**
     * Get Number of repository images 
     * @return RepositoryImageCnt Number of repository images
     */
    public Long getRepositoryImageCnt() {
        return this.RepositoryImageCnt;
    }

    /**
     * Set Number of repository images
     * @param RepositoryImageCnt Number of repository images
     */
    public void setRepositoryImageCnt(Long RepositoryImageCnt) {
        this.RepositoryImageCnt = RepositoryImageCnt;
    }

    /**
     * Get Number of local images at risk 
     * @return RiskLocalImageCnt Number of local images at risk
     */
    public Long getRiskLocalImageCnt() {
        return this.RiskLocalImageCnt;
    }

    /**
     * Set Number of local images at risk
     * @param RiskLocalImageCnt Number of local images at risk
     */
    public void setRiskLocalImageCnt(Long RiskLocalImageCnt) {
        this.RiskLocalImageCnt = RiskLocalImageCnt;
    }

    /**
     * Get Number of repository images at risk 
     * @return RiskRepositoryImageCnt Number of repository images at risk
     */
    public Long getRiskRepositoryImageCnt() {
        return this.RiskRepositoryImageCnt;
    }

    /**
     * Set Number of repository images at risk
     * @param RiskRepositoryImageCnt Number of repository images at risk
     */
    public void setRiskRepositoryImageCnt(Long RiskRepositoryImageCnt) {
        this.RiskRepositoryImageCnt = RiskRepositoryImageCnt;
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
     * Get Number of containers at risk 
     * @return RiskContainerCnt Number of containers at risk
     */
    public Long getRiskContainerCnt() {
        return this.RiskContainerCnt;
    }

    /**
     * Set Number of containers at risk
     * @param RiskContainerCnt Number of containers at risk
     */
    public void setRiskContainerCnt(Long RiskContainerCnt) {
        this.RiskContainerCnt = RiskContainerCnt;
    }

    /**
     * Get Number of clusters 
     * @return ClusterCnt Number of clusters
     */
    public Long getClusterCnt() {
        return this.ClusterCnt;
    }

    /**
     * Set Number of clusters
     * @param ClusterCnt Number of clusters
     */
    public void setClusterCnt(Long ClusterCnt) {
        this.ClusterCnt = ClusterCnt;
    }

    /**
     * Get Number of clusters at risk 
     * @return RiskClusterCnt Number of clusters at risk
     */
    public Long getRiskClusterCnt() {
        return this.RiskClusterCnt;
    }

    /**
     * Set Number of clusters at risk
     * @param RiskClusterCnt Number of clusters at risk
     */
    public void setRiskClusterCnt(Long RiskClusterCnt) {
        this.RiskClusterCnt = RiskClusterCnt;
    }

    /**
     * Get Number of vulnerabilities to be scanned 
     * @return UnScannedVulCnt Number of vulnerabilities to be scanned
     */
    public Long getUnScannedVulCnt() {
        return this.UnScannedVulCnt;
    }

    /**
     * Set Number of vulnerabilities to be scanned
     * @param UnScannedVulCnt Number of vulnerabilities to be scanned
     */
    public void setUnScannedVulCnt(Long UnScannedVulCnt) {
        this.UnScannedVulCnt = UnScannedVulCnt;
    }

    /**
     * Get Number of risk vulnerabilities 
     * @return RiskVulCnt Number of risk vulnerabilities
     */
    public Long getRiskVulCnt() {
        return this.RiskVulCnt;
    }

    /**
     * Set Number of risk vulnerabilities
     * @param RiskVulCnt Number of risk vulnerabilities
     */
    public void setRiskVulCnt(Long RiskVulCnt) {
        this.RiskVulCnt = RiskVulCnt;
    }

    /**
     * Get Number of security baseline items to be scanned 
     * @return UnScannedBaseLineCnt Number of security baseline items to be scanned
     */
    public Long getUnScannedBaseLineCnt() {
        return this.UnScannedBaseLineCnt;
    }

    /**
     * Set Number of security baseline items to be scanned
     * @param UnScannedBaseLineCnt Number of security baseline items to be scanned
     */
    public void setUnScannedBaseLineCnt(Long UnScannedBaseLineCnt) {
        this.UnScannedBaseLineCnt = UnScannedBaseLineCnt;
    }

    /**
     * Get Number of security baseline risks 
     * @return RiskBaseLineCnt Number of security baseline risks
     */
    public Long getRiskBaseLineCnt() {
        return this.RiskBaseLineCnt;
    }

    /**
     * Set Number of security baseline risks
     * @param RiskBaseLineCnt Number of security baseline risks
     */
    public void setRiskBaseLineCnt(Long RiskBaseLineCnt) {
        this.RiskBaseLineCnt = RiskBaseLineCnt;
    }

    /**
     * Get Number of pending (high-risk) events at runtime 
     * @return RuntimeUnhandleEventCnt Number of pending (high-risk) events at runtime
     */
    public Long getRuntimeUnhandleEventCnt() {
        return this.RuntimeUnhandleEventCnt;
    }

    /**
     * Set Number of pending (high-risk) events at runtime
     * @param RuntimeUnhandleEventCnt Number of pending (high-risk) events at runtime
     */
    public void setRuntimeUnhandleEventCnt(Long RuntimeUnhandleEventCnt) {
        this.RuntimeUnhandleEventCnt = RuntimeUnhandleEventCnt;
    }

    /**
     * Get Number of clusters to be scanned 
     * @return UnScannedClusterCnt Number of clusters to be scanned
     */
    public Long getUnScannedClusterCnt() {
        return this.UnScannedClusterCnt;
    }

    /**
     * Set Number of clusters to be scanned
     * @param UnScannedClusterCnt Number of clusters to be scanned
     */
    public void setUnScannedClusterCnt(Long UnScannedClusterCnt) {
        this.UnScannedClusterCnt = UnScannedClusterCnt;
    }

    /**
     * Get Whether images are scanned 
     * @return ScanImageStatus Whether images are scanned
     */
    public Boolean getScanImageStatus() {
        return this.ScanImageStatus;
    }

    /**
     * Set Whether images are scanned
     * @param ScanImageStatus Whether images are scanned
     */
    public void setScanImageStatus(Boolean ScanImageStatus) {
        this.ScanImageStatus = ScanImageStatus;
    }

    /**
     * Get Whether clusters are scanned 
     * @return ScanClusterStatus Whether clusters are scanned
     */
    public Boolean getScanClusterStatus() {
        return this.ScanClusterStatus;
    }

    /**
     * Set Whether clusters are scanned
     * @param ScanClusterStatus Whether clusters are scanned
     */
    public void setScanClusterStatus(Boolean ScanClusterStatus) {
        this.ScanClusterStatus = ScanClusterStatus;
    }

    /**
     * Get Whether baseline items are scanned 
     * @return ScanBaseLineStatus Whether baseline items are scanned
     */
    public Boolean getScanBaseLineStatus() {
        return this.ScanBaseLineStatus;
    }

    /**
     * Set Whether baseline items are scanned
     * @param ScanBaseLineStatus Whether baseline items are scanned
     */
    public void setScanBaseLineStatus(Boolean ScanBaseLineStatus) {
        this.ScanBaseLineStatus = ScanBaseLineStatus;
    }

    /**
     * Get Whether vulnerabilities are scanned for 
     * @return ScanVulStatus Whether vulnerabilities are scanned for
     */
    public Boolean getScanVulStatus() {
        return this.ScanVulStatus;
    }

    /**
     * Set Whether vulnerabilities are scanned for
     * @param ScanVulStatus Whether vulnerabilities are scanned for
     */
    public void setScanVulStatus(Boolean ScanVulStatus) {
        this.ScanVulStatus = ScanVulStatus;
    }

    /**
     * Get Number of images affected by vulnerabilities 
     * @return VulRiskImageCnt Number of images affected by vulnerabilities
     */
    public Long getVulRiskImageCnt() {
        return this.VulRiskImageCnt;
    }

    /**
     * Set Number of images affected by vulnerabilities
     * @param VulRiskImageCnt Number of images affected by vulnerabilities
     */
    public void setVulRiskImageCnt(Long VulRiskImageCnt) {
        this.VulRiskImageCnt = VulRiskImageCnt;
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

    public DescribeTcssSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTcssSummaryResponse(DescribeTcssSummaryResponse source) {
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ScannedImageCnt != null) {
            this.ScannedImageCnt = new Long(source.ScannedImageCnt);
        }
        if (source.UnScannedImageCnt != null) {
            this.UnScannedImageCnt = new Long(source.UnScannedImageCnt);
        }
        if (source.LocalImageCnt != null) {
            this.LocalImageCnt = new Long(source.LocalImageCnt);
        }
        if (source.RepositoryImageCnt != null) {
            this.RepositoryImageCnt = new Long(source.RepositoryImageCnt);
        }
        if (source.RiskLocalImageCnt != null) {
            this.RiskLocalImageCnt = new Long(source.RiskLocalImageCnt);
        }
        if (source.RiskRepositoryImageCnt != null) {
            this.RiskRepositoryImageCnt = new Long(source.RiskRepositoryImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.RiskContainerCnt != null) {
            this.RiskContainerCnt = new Long(source.RiskContainerCnt);
        }
        if (source.ClusterCnt != null) {
            this.ClusterCnt = new Long(source.ClusterCnt);
        }
        if (source.RiskClusterCnt != null) {
            this.RiskClusterCnt = new Long(source.RiskClusterCnt);
        }
        if (source.UnScannedVulCnt != null) {
            this.UnScannedVulCnt = new Long(source.UnScannedVulCnt);
        }
        if (source.RiskVulCnt != null) {
            this.RiskVulCnt = new Long(source.RiskVulCnt);
        }
        if (source.UnScannedBaseLineCnt != null) {
            this.UnScannedBaseLineCnt = new Long(source.UnScannedBaseLineCnt);
        }
        if (source.RiskBaseLineCnt != null) {
            this.RiskBaseLineCnt = new Long(source.RiskBaseLineCnt);
        }
        if (source.RuntimeUnhandleEventCnt != null) {
            this.RuntimeUnhandleEventCnt = new Long(source.RuntimeUnhandleEventCnt);
        }
        if (source.UnScannedClusterCnt != null) {
            this.UnScannedClusterCnt = new Long(source.UnScannedClusterCnt);
        }
        if (source.ScanImageStatus != null) {
            this.ScanImageStatus = new Boolean(source.ScanImageStatus);
        }
        if (source.ScanClusterStatus != null) {
            this.ScanClusterStatus = new Boolean(source.ScanClusterStatus);
        }
        if (source.ScanBaseLineStatus != null) {
            this.ScanBaseLineStatus = new Boolean(source.ScanBaseLineStatus);
        }
        if (source.ScanVulStatus != null) {
            this.ScanVulStatus = new Boolean(source.ScanVulStatus);
        }
        if (source.VulRiskImageCnt != null) {
            this.VulRiskImageCnt = new Long(source.VulRiskImageCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ScannedImageCnt", this.ScannedImageCnt);
        this.setParamSimple(map, prefix + "UnScannedImageCnt", this.UnScannedImageCnt);
        this.setParamSimple(map, prefix + "LocalImageCnt", this.LocalImageCnt);
        this.setParamSimple(map, prefix + "RepositoryImageCnt", this.RepositoryImageCnt);
        this.setParamSimple(map, prefix + "RiskLocalImageCnt", this.RiskLocalImageCnt);
        this.setParamSimple(map, prefix + "RiskRepositoryImageCnt", this.RiskRepositoryImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "RiskContainerCnt", this.RiskContainerCnt);
        this.setParamSimple(map, prefix + "ClusterCnt", this.ClusterCnt);
        this.setParamSimple(map, prefix + "RiskClusterCnt", this.RiskClusterCnt);
        this.setParamSimple(map, prefix + "UnScannedVulCnt", this.UnScannedVulCnt);
        this.setParamSimple(map, prefix + "RiskVulCnt", this.RiskVulCnt);
        this.setParamSimple(map, prefix + "UnScannedBaseLineCnt", this.UnScannedBaseLineCnt);
        this.setParamSimple(map, prefix + "RiskBaseLineCnt", this.RiskBaseLineCnt);
        this.setParamSimple(map, prefix + "RuntimeUnhandleEventCnt", this.RuntimeUnhandleEventCnt);
        this.setParamSimple(map, prefix + "UnScannedClusterCnt", this.UnScannedClusterCnt);
        this.setParamSimple(map, prefix + "ScanImageStatus", this.ScanImageStatus);
        this.setParamSimple(map, prefix + "ScanClusterStatus", this.ScanClusterStatus);
        this.setParamSimple(map, prefix + "ScanBaseLineStatus", this.ScanBaseLineStatus);
        this.setParamSimple(map, prefix + "ScanVulStatus", this.ScanVulStatus);
        this.setParamSimple(map, prefix + "VulRiskImageCnt", this.VulRiskImageCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

