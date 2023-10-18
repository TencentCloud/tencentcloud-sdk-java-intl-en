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

public class DescribeVulLevelImageSummaryResponse extends AbstractModel {

    /**
    * Percentage of high-risk vulnerabilities in the latest local images
    */
    @SerializedName("HighLevelVulLocalImagePercent")
    @Expose
    private Float HighLevelVulLocalImagePercent;

    /**
    * Percentage of medium-risk vulnerabilities in the latest local images
    */
    @SerializedName("MediumLevelVulLocalImagePercent")
    @Expose
    private Float MediumLevelVulLocalImagePercent;

    /**
    * Percentage of low-risk vulnerabilities in the latest local images
    */
    @SerializedName("LowLevelVulLocalImagePercent")
    @Expose
    private Float LowLevelVulLocalImagePercent;

    /**
    * Percentage of critical vulnerabilities in the latest local images
    */
    @SerializedName("CriticalLevelVulLocalImagePercent")
    @Expose
    private Float CriticalLevelVulLocalImagePercent;

    /**
    * Number of affected local images on the latest version
    */
    @SerializedName("LocalNewestImageCount")
    @Expose
    private Long LocalNewestImageCount;

    /**
    * Number of affected repository images on the latest version
    */
    @SerializedName("RegistryNewestImageCount")
    @Expose
    private Long RegistryNewestImageCount;

    /**
    * Percentage of high-risk vulnerabilities in the latest repository image
    */
    @SerializedName("HighLevelVulRegistryImagePercent")
    @Expose
    private Float HighLevelVulRegistryImagePercent;

    /**
    * Percentage of medium-risk vulnerabilities in the latest repository image
    */
    @SerializedName("MediumLevelVulRegistryImagePercent")
    @Expose
    private Float MediumLevelVulRegistryImagePercent;

    /**
    * Percentage of low-risk vulnerabilities in the latest repository image
    */
    @SerializedName("LowLevelVulRegistryImagePercent")
    @Expose
    private Float LowLevelVulRegistryImagePercent;

    /**
    * Percentage of critical vulnerabilities in the latest repository image
    */
    @SerializedName("CriticalLevelVulRegistryImagePercent")
    @Expose
    private Float CriticalLevelVulRegistryImagePercent;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Percentage of high-risk vulnerabilities in the latest local images 
     * @return HighLevelVulLocalImagePercent Percentage of high-risk vulnerabilities in the latest local images
     */
    public Float getHighLevelVulLocalImagePercent() {
        return this.HighLevelVulLocalImagePercent;
    }

    /**
     * Set Percentage of high-risk vulnerabilities in the latest local images
     * @param HighLevelVulLocalImagePercent Percentage of high-risk vulnerabilities in the latest local images
     */
    public void setHighLevelVulLocalImagePercent(Float HighLevelVulLocalImagePercent) {
        this.HighLevelVulLocalImagePercent = HighLevelVulLocalImagePercent;
    }

    /**
     * Get Percentage of medium-risk vulnerabilities in the latest local images 
     * @return MediumLevelVulLocalImagePercent Percentage of medium-risk vulnerabilities in the latest local images
     */
    public Float getMediumLevelVulLocalImagePercent() {
        return this.MediumLevelVulLocalImagePercent;
    }

    /**
     * Set Percentage of medium-risk vulnerabilities in the latest local images
     * @param MediumLevelVulLocalImagePercent Percentage of medium-risk vulnerabilities in the latest local images
     */
    public void setMediumLevelVulLocalImagePercent(Float MediumLevelVulLocalImagePercent) {
        this.MediumLevelVulLocalImagePercent = MediumLevelVulLocalImagePercent;
    }

    /**
     * Get Percentage of low-risk vulnerabilities in the latest local images 
     * @return LowLevelVulLocalImagePercent Percentage of low-risk vulnerabilities in the latest local images
     */
    public Float getLowLevelVulLocalImagePercent() {
        return this.LowLevelVulLocalImagePercent;
    }

    /**
     * Set Percentage of low-risk vulnerabilities in the latest local images
     * @param LowLevelVulLocalImagePercent Percentage of low-risk vulnerabilities in the latest local images
     */
    public void setLowLevelVulLocalImagePercent(Float LowLevelVulLocalImagePercent) {
        this.LowLevelVulLocalImagePercent = LowLevelVulLocalImagePercent;
    }

    /**
     * Get Percentage of critical vulnerabilities in the latest local images 
     * @return CriticalLevelVulLocalImagePercent Percentage of critical vulnerabilities in the latest local images
     */
    public Float getCriticalLevelVulLocalImagePercent() {
        return this.CriticalLevelVulLocalImagePercent;
    }

    /**
     * Set Percentage of critical vulnerabilities in the latest local images
     * @param CriticalLevelVulLocalImagePercent Percentage of critical vulnerabilities in the latest local images
     */
    public void setCriticalLevelVulLocalImagePercent(Float CriticalLevelVulLocalImagePercent) {
        this.CriticalLevelVulLocalImagePercent = CriticalLevelVulLocalImagePercent;
    }

    /**
     * Get Number of affected local images on the latest version 
     * @return LocalNewestImageCount Number of affected local images on the latest version
     */
    public Long getLocalNewestImageCount() {
        return this.LocalNewestImageCount;
    }

    /**
     * Set Number of affected local images on the latest version
     * @param LocalNewestImageCount Number of affected local images on the latest version
     */
    public void setLocalNewestImageCount(Long LocalNewestImageCount) {
        this.LocalNewestImageCount = LocalNewestImageCount;
    }

    /**
     * Get Number of affected repository images on the latest version 
     * @return RegistryNewestImageCount Number of affected repository images on the latest version
     */
    public Long getRegistryNewestImageCount() {
        return this.RegistryNewestImageCount;
    }

    /**
     * Set Number of affected repository images on the latest version
     * @param RegistryNewestImageCount Number of affected repository images on the latest version
     */
    public void setRegistryNewestImageCount(Long RegistryNewestImageCount) {
        this.RegistryNewestImageCount = RegistryNewestImageCount;
    }

    /**
     * Get Percentage of high-risk vulnerabilities in the latest repository image 
     * @return HighLevelVulRegistryImagePercent Percentage of high-risk vulnerabilities in the latest repository image
     */
    public Float getHighLevelVulRegistryImagePercent() {
        return this.HighLevelVulRegistryImagePercent;
    }

    /**
     * Set Percentage of high-risk vulnerabilities in the latest repository image
     * @param HighLevelVulRegistryImagePercent Percentage of high-risk vulnerabilities in the latest repository image
     */
    public void setHighLevelVulRegistryImagePercent(Float HighLevelVulRegistryImagePercent) {
        this.HighLevelVulRegistryImagePercent = HighLevelVulRegistryImagePercent;
    }

    /**
     * Get Percentage of medium-risk vulnerabilities in the latest repository image 
     * @return MediumLevelVulRegistryImagePercent Percentage of medium-risk vulnerabilities in the latest repository image
     */
    public Float getMediumLevelVulRegistryImagePercent() {
        return this.MediumLevelVulRegistryImagePercent;
    }

    /**
     * Set Percentage of medium-risk vulnerabilities in the latest repository image
     * @param MediumLevelVulRegistryImagePercent Percentage of medium-risk vulnerabilities in the latest repository image
     */
    public void setMediumLevelVulRegistryImagePercent(Float MediumLevelVulRegistryImagePercent) {
        this.MediumLevelVulRegistryImagePercent = MediumLevelVulRegistryImagePercent;
    }

    /**
     * Get Percentage of low-risk vulnerabilities in the latest repository image 
     * @return LowLevelVulRegistryImagePercent Percentage of low-risk vulnerabilities in the latest repository image
     */
    public Float getLowLevelVulRegistryImagePercent() {
        return this.LowLevelVulRegistryImagePercent;
    }

    /**
     * Set Percentage of low-risk vulnerabilities in the latest repository image
     * @param LowLevelVulRegistryImagePercent Percentage of low-risk vulnerabilities in the latest repository image
     */
    public void setLowLevelVulRegistryImagePercent(Float LowLevelVulRegistryImagePercent) {
        this.LowLevelVulRegistryImagePercent = LowLevelVulRegistryImagePercent;
    }

    /**
     * Get Percentage of critical vulnerabilities in the latest repository image 
     * @return CriticalLevelVulRegistryImagePercent Percentage of critical vulnerabilities in the latest repository image
     */
    public Float getCriticalLevelVulRegistryImagePercent() {
        return this.CriticalLevelVulRegistryImagePercent;
    }

    /**
     * Set Percentage of critical vulnerabilities in the latest repository image
     * @param CriticalLevelVulRegistryImagePercent Percentage of critical vulnerabilities in the latest repository image
     */
    public void setCriticalLevelVulRegistryImagePercent(Float CriticalLevelVulRegistryImagePercent) {
        this.CriticalLevelVulRegistryImagePercent = CriticalLevelVulRegistryImagePercent;
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

    public DescribeVulLevelImageSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulLevelImageSummaryResponse(DescribeVulLevelImageSummaryResponse source) {
        if (source.HighLevelVulLocalImagePercent != null) {
            this.HighLevelVulLocalImagePercent = new Float(source.HighLevelVulLocalImagePercent);
        }
        if (source.MediumLevelVulLocalImagePercent != null) {
            this.MediumLevelVulLocalImagePercent = new Float(source.MediumLevelVulLocalImagePercent);
        }
        if (source.LowLevelVulLocalImagePercent != null) {
            this.LowLevelVulLocalImagePercent = new Float(source.LowLevelVulLocalImagePercent);
        }
        if (source.CriticalLevelVulLocalImagePercent != null) {
            this.CriticalLevelVulLocalImagePercent = new Float(source.CriticalLevelVulLocalImagePercent);
        }
        if (source.LocalNewestImageCount != null) {
            this.LocalNewestImageCount = new Long(source.LocalNewestImageCount);
        }
        if (source.RegistryNewestImageCount != null) {
            this.RegistryNewestImageCount = new Long(source.RegistryNewestImageCount);
        }
        if (source.HighLevelVulRegistryImagePercent != null) {
            this.HighLevelVulRegistryImagePercent = new Float(source.HighLevelVulRegistryImagePercent);
        }
        if (source.MediumLevelVulRegistryImagePercent != null) {
            this.MediumLevelVulRegistryImagePercent = new Float(source.MediumLevelVulRegistryImagePercent);
        }
        if (source.LowLevelVulRegistryImagePercent != null) {
            this.LowLevelVulRegistryImagePercent = new Float(source.LowLevelVulRegistryImagePercent);
        }
        if (source.CriticalLevelVulRegistryImagePercent != null) {
            this.CriticalLevelVulRegistryImagePercent = new Float(source.CriticalLevelVulRegistryImagePercent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighLevelVulLocalImagePercent", this.HighLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "MediumLevelVulLocalImagePercent", this.MediumLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "LowLevelVulLocalImagePercent", this.LowLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "CriticalLevelVulLocalImagePercent", this.CriticalLevelVulLocalImagePercent);
        this.setParamSimple(map, prefix + "LocalNewestImageCount", this.LocalNewestImageCount);
        this.setParamSimple(map, prefix + "RegistryNewestImageCount", this.RegistryNewestImageCount);
        this.setParamSimple(map, prefix + "HighLevelVulRegistryImagePercent", this.HighLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "MediumLevelVulRegistryImagePercent", this.MediumLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "LowLevelVulRegistryImagePercent", this.LowLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "CriticalLevelVulRegistryImagePercent", this.CriticalLevelVulRegistryImagePercent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

