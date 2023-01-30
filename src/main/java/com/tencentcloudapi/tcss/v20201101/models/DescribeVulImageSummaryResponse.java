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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulImageSummaryResponse extends AbstractModel{

    /**
    * Number of images affected by critical or high-risk vulnerabilities
    */
    @SerializedName("SeriousVulImageCount")
    @Expose
    private Long SeriousVulImageCount;

    /**
    * Number of scanned images
    */
    @SerializedName("ScannedImageCount")
    @Expose
    private Long ScannedImageCount;

    /**
    * Total number of vulnerabilities
    */
    @SerializedName("VulTotalCount")
    @Expose
    private Long VulTotalCount;

    /**
    * Number of system vulnerabilities
    */
    @SerializedName("SysTemVulCount")
    @Expose
    private Long SysTemVulCount;

    /**
    * Number of web application vulnerabilities
    */
    @SerializedName("WebVulCount")
    @Expose
    private Long WebVulCount;

    /**
    * Number of licensed images
    */
    @SerializedName("AllAuthorizedImageCount")
    @Expose
    private Long AllAuthorizedImageCount;

    /**
    * Number of emergency vulnerabilities
    */
    @SerializedName("EmergencyVulCount")
    @Expose
    private Long EmergencyVulCount;

    /**
    * Total number of vulnerabilities that can be scanned for
    */
    @SerializedName("SupportVulTotalCount")
    @Expose
    private Long SupportVulTotalCount;

    /**
    * Vulnerability library update time
    */
    @SerializedName("VulLibraryUpdateTime")
    @Expose
    private String VulLibraryUpdateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of images affected by critical or high-risk vulnerabilities 
     * @return SeriousVulImageCount Number of images affected by critical or high-risk vulnerabilities
     */
    public Long getSeriousVulImageCount() {
        return this.SeriousVulImageCount;
    }

    /**
     * Set Number of images affected by critical or high-risk vulnerabilities
     * @param SeriousVulImageCount Number of images affected by critical or high-risk vulnerabilities
     */
    public void setSeriousVulImageCount(Long SeriousVulImageCount) {
        this.SeriousVulImageCount = SeriousVulImageCount;
    }

    /**
     * Get Number of scanned images 
     * @return ScannedImageCount Number of scanned images
     */
    public Long getScannedImageCount() {
        return this.ScannedImageCount;
    }

    /**
     * Set Number of scanned images
     * @param ScannedImageCount Number of scanned images
     */
    public void setScannedImageCount(Long ScannedImageCount) {
        this.ScannedImageCount = ScannedImageCount;
    }

    /**
     * Get Total number of vulnerabilities 
     * @return VulTotalCount Total number of vulnerabilities
     */
    public Long getVulTotalCount() {
        return this.VulTotalCount;
    }

    /**
     * Set Total number of vulnerabilities
     * @param VulTotalCount Total number of vulnerabilities
     */
    public void setVulTotalCount(Long VulTotalCount) {
        this.VulTotalCount = VulTotalCount;
    }

    /**
     * Get Number of system vulnerabilities 
     * @return SysTemVulCount Number of system vulnerabilities
     */
    public Long getSysTemVulCount() {
        return this.SysTemVulCount;
    }

    /**
     * Set Number of system vulnerabilities
     * @param SysTemVulCount Number of system vulnerabilities
     */
    public void setSysTemVulCount(Long SysTemVulCount) {
        this.SysTemVulCount = SysTemVulCount;
    }

    /**
     * Get Number of web application vulnerabilities 
     * @return WebVulCount Number of web application vulnerabilities
     */
    public Long getWebVulCount() {
        return this.WebVulCount;
    }

    /**
     * Set Number of web application vulnerabilities
     * @param WebVulCount Number of web application vulnerabilities
     */
    public void setWebVulCount(Long WebVulCount) {
        this.WebVulCount = WebVulCount;
    }

    /**
     * Get Number of licensed images 
     * @return AllAuthorizedImageCount Number of licensed images
     */
    public Long getAllAuthorizedImageCount() {
        return this.AllAuthorizedImageCount;
    }

    /**
     * Set Number of licensed images
     * @param AllAuthorizedImageCount Number of licensed images
     */
    public void setAllAuthorizedImageCount(Long AllAuthorizedImageCount) {
        this.AllAuthorizedImageCount = AllAuthorizedImageCount;
    }

    /**
     * Get Number of emergency vulnerabilities 
     * @return EmergencyVulCount Number of emergency vulnerabilities
     */
    public Long getEmergencyVulCount() {
        return this.EmergencyVulCount;
    }

    /**
     * Set Number of emergency vulnerabilities
     * @param EmergencyVulCount Number of emergency vulnerabilities
     */
    public void setEmergencyVulCount(Long EmergencyVulCount) {
        this.EmergencyVulCount = EmergencyVulCount;
    }

    /**
     * Get Total number of vulnerabilities that can be scanned for 
     * @return SupportVulTotalCount Total number of vulnerabilities that can be scanned for
     */
    public Long getSupportVulTotalCount() {
        return this.SupportVulTotalCount;
    }

    /**
     * Set Total number of vulnerabilities that can be scanned for
     * @param SupportVulTotalCount Total number of vulnerabilities that can be scanned for
     */
    public void setSupportVulTotalCount(Long SupportVulTotalCount) {
        this.SupportVulTotalCount = SupportVulTotalCount;
    }

    /**
     * Get Vulnerability library update time 
     * @return VulLibraryUpdateTime Vulnerability library update time
     */
    public String getVulLibraryUpdateTime() {
        return this.VulLibraryUpdateTime;
    }

    /**
     * Set Vulnerability library update time
     * @param VulLibraryUpdateTime Vulnerability library update time
     */
    public void setVulLibraryUpdateTime(String VulLibraryUpdateTime) {
        this.VulLibraryUpdateTime = VulLibraryUpdateTime;
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

    public DescribeVulImageSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulImageSummaryResponse(DescribeVulImageSummaryResponse source) {
        if (source.SeriousVulImageCount != null) {
            this.SeriousVulImageCount = new Long(source.SeriousVulImageCount);
        }
        if (source.ScannedImageCount != null) {
            this.ScannedImageCount = new Long(source.ScannedImageCount);
        }
        if (source.VulTotalCount != null) {
            this.VulTotalCount = new Long(source.VulTotalCount);
        }
        if (source.SysTemVulCount != null) {
            this.SysTemVulCount = new Long(source.SysTemVulCount);
        }
        if (source.WebVulCount != null) {
            this.WebVulCount = new Long(source.WebVulCount);
        }
        if (source.AllAuthorizedImageCount != null) {
            this.AllAuthorizedImageCount = new Long(source.AllAuthorizedImageCount);
        }
        if (source.EmergencyVulCount != null) {
            this.EmergencyVulCount = new Long(source.EmergencyVulCount);
        }
        if (source.SupportVulTotalCount != null) {
            this.SupportVulTotalCount = new Long(source.SupportVulTotalCount);
        }
        if (source.VulLibraryUpdateTime != null) {
            this.VulLibraryUpdateTime = new String(source.VulLibraryUpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeriousVulImageCount", this.SeriousVulImageCount);
        this.setParamSimple(map, prefix + "ScannedImageCount", this.ScannedImageCount);
        this.setParamSimple(map, prefix + "VulTotalCount", this.VulTotalCount);
        this.setParamSimple(map, prefix + "SysTemVulCount", this.SysTemVulCount);
        this.setParamSimple(map, prefix + "WebVulCount", this.WebVulCount);
        this.setParamSimple(map, prefix + "AllAuthorizedImageCount", this.AllAuthorizedImageCount);
        this.setParamSimple(map, prefix + "EmergencyVulCount", this.EmergencyVulCount);
        this.setParamSimple(map, prefix + "SupportVulTotalCount", this.SupportVulTotalCount);
        this.setParamSimple(map, prefix + "VulLibraryUpdateTime", this.VulLibraryUpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

