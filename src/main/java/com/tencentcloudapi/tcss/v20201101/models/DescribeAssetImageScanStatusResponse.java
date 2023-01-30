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

public class DescribeAssetImageScanStatusResponse extends AbstractModel{

    /**
    * Number of images
    */
    @SerializedName("ImageTotal")
    @Expose
    private Long ImageTotal;

    /**
    * Number of scanned images
    */
    @SerializedName("ImageScanCnt")
    @Expose
    private Long ImageScanCnt;

    /**
    * Scanning status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Scanning progress, the value of which is calculated as `ImageScanCnt`/`ImageTotal` * 100.
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * Number of successfully scanned images
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of risks
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * Remaining scan time
    */
    @SerializedName("LeftSeconds")
    @Expose
    private Long LeftSeconds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of images 
     * @return ImageTotal Number of images
     */
    public Long getImageTotal() {
        return this.ImageTotal;
    }

    /**
     * Set Number of images
     * @param ImageTotal Number of images
     */
    public void setImageTotal(Long ImageTotal) {
        this.ImageTotal = ImageTotal;
    }

    /**
     * Get Number of scanned images 
     * @return ImageScanCnt Number of scanned images
     */
    public Long getImageScanCnt() {
        return this.ImageScanCnt;
    }

    /**
     * Set Number of scanned images
     * @param ImageScanCnt Number of scanned images
     */
    public void setImageScanCnt(Long ImageScanCnt) {
        this.ImageScanCnt = ImageScanCnt;
    }

    /**
     * Get Scanning status 
     * @return Status Scanning status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Scanning status
     * @param Status Scanning status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Scanning progress, the value of which is calculated as `ImageScanCnt`/`ImageTotal` * 100. 
     * @return Schedule Scanning progress, the value of which is calculated as `ImageScanCnt`/`ImageTotal` * 100.
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set Scanning progress, the value of which is calculated as `ImageScanCnt`/`ImageTotal` * 100.
     * @param Schedule Scanning progress, the value of which is calculated as `ImageScanCnt`/`ImageTotal` * 100.
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get Number of successfully scanned images 
     * @return SuccessCount Number of successfully scanned images
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successfully scanned images
     * @param SuccessCount Number of successfully scanned images
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of risks 
     * @return RiskCount Number of risks
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set Number of risks
     * @param RiskCount Number of risks
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get Remaining scan time 
     * @return LeftSeconds Remaining scan time
     */
    public Long getLeftSeconds() {
        return this.LeftSeconds;
    }

    /**
     * Set Remaining scan time
     * @param LeftSeconds Remaining scan time
     */
    public void setLeftSeconds(Long LeftSeconds) {
        this.LeftSeconds = LeftSeconds;
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

    public DescribeAssetImageScanStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageScanStatusResponse(DescribeAssetImageScanStatusResponse source) {
        if (source.ImageTotal != null) {
            this.ImageTotal = new Long(source.ImageTotal);
        }
        if (source.ImageScanCnt != null) {
            this.ImageScanCnt = new Long(source.ImageScanCnt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.LeftSeconds != null) {
            this.LeftSeconds = new Long(source.LeftSeconds);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageTotal", this.ImageTotal);
        this.setParamSimple(map, prefix + "ImageScanCnt", this.ImageScanCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "LeftSeconds", this.LeftSeconds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

