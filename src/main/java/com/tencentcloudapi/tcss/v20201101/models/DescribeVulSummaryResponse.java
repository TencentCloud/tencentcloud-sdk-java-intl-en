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

public class DescribeVulSummaryResponse extends AbstractModel{

    /**
    * Total number of vulnerabilities
    */
    @SerializedName("VulTotalCount")
    @Expose
    private Long VulTotalCount;

    /**
    * Number of critical and high-risk vulnerabilities
    */
    @SerializedName("SeriousVulCount")
    @Expose
    private Long SeriousVulCount;

    /**
    * Number of high-priority vulnerabilities
    */
    @SerializedName("SuggestVulCount")
    @Expose
    private Long SuggestVulCount;

    /**
    * Number of vulnerabilities with POC or EXP
    */
    @SerializedName("PocExpLevelVulCount")
    @Expose
    private Long PocExpLevelVulCount;

    /**
    * Number of vulnerabilities with remote EXP
    */
    @SerializedName("RemoteExpLevelVulCount")
    @Expose
    private Long RemoteExpLevelVulCount;

    /**
    * Number of images on the latest version affected by critical or high-risk vulnerabilities
    */
    @SerializedName("SeriousVulNewestImageCount")
    @Expose
    private Long SeriousVulNewestImageCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get Number of critical and high-risk vulnerabilities 
     * @return SeriousVulCount Number of critical and high-risk vulnerabilities
     */
    public Long getSeriousVulCount() {
        return this.SeriousVulCount;
    }

    /**
     * Set Number of critical and high-risk vulnerabilities
     * @param SeriousVulCount Number of critical and high-risk vulnerabilities
     */
    public void setSeriousVulCount(Long SeriousVulCount) {
        this.SeriousVulCount = SeriousVulCount;
    }

    /**
     * Get Number of high-priority vulnerabilities 
     * @return SuggestVulCount Number of high-priority vulnerabilities
     */
    public Long getSuggestVulCount() {
        return this.SuggestVulCount;
    }

    /**
     * Set Number of high-priority vulnerabilities
     * @param SuggestVulCount Number of high-priority vulnerabilities
     */
    public void setSuggestVulCount(Long SuggestVulCount) {
        this.SuggestVulCount = SuggestVulCount;
    }

    /**
     * Get Number of vulnerabilities with POC or EXP 
     * @return PocExpLevelVulCount Number of vulnerabilities with POC or EXP
     */
    public Long getPocExpLevelVulCount() {
        return this.PocExpLevelVulCount;
    }

    /**
     * Set Number of vulnerabilities with POC or EXP
     * @param PocExpLevelVulCount Number of vulnerabilities with POC or EXP
     */
    public void setPocExpLevelVulCount(Long PocExpLevelVulCount) {
        this.PocExpLevelVulCount = PocExpLevelVulCount;
    }

    /**
     * Get Number of vulnerabilities with remote EXP 
     * @return RemoteExpLevelVulCount Number of vulnerabilities with remote EXP
     */
    public Long getRemoteExpLevelVulCount() {
        return this.RemoteExpLevelVulCount;
    }

    /**
     * Set Number of vulnerabilities with remote EXP
     * @param RemoteExpLevelVulCount Number of vulnerabilities with remote EXP
     */
    public void setRemoteExpLevelVulCount(Long RemoteExpLevelVulCount) {
        this.RemoteExpLevelVulCount = RemoteExpLevelVulCount;
    }

    /**
     * Get Number of images on the latest version affected by critical or high-risk vulnerabilities 
     * @return SeriousVulNewestImageCount Number of images on the latest version affected by critical or high-risk vulnerabilities
     */
    public Long getSeriousVulNewestImageCount() {
        return this.SeriousVulNewestImageCount;
    }

    /**
     * Set Number of images on the latest version affected by critical or high-risk vulnerabilities
     * @param SeriousVulNewestImageCount Number of images on the latest version affected by critical or high-risk vulnerabilities
     */
    public void setSeriousVulNewestImageCount(Long SeriousVulNewestImageCount) {
        this.SeriousVulNewestImageCount = SeriousVulNewestImageCount;
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

    public DescribeVulSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulSummaryResponse(DescribeVulSummaryResponse source) {
        if (source.VulTotalCount != null) {
            this.VulTotalCount = new Long(source.VulTotalCount);
        }
        if (source.SeriousVulCount != null) {
            this.SeriousVulCount = new Long(source.SeriousVulCount);
        }
        if (source.SuggestVulCount != null) {
            this.SuggestVulCount = new Long(source.SuggestVulCount);
        }
        if (source.PocExpLevelVulCount != null) {
            this.PocExpLevelVulCount = new Long(source.PocExpLevelVulCount);
        }
        if (source.RemoteExpLevelVulCount != null) {
            this.RemoteExpLevelVulCount = new Long(source.RemoteExpLevelVulCount);
        }
        if (source.SeriousVulNewestImageCount != null) {
            this.SeriousVulNewestImageCount = new Long(source.SeriousVulNewestImageCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulTotalCount", this.VulTotalCount);
        this.setParamSimple(map, prefix + "SeriousVulCount", this.SeriousVulCount);
        this.setParamSimple(map, prefix + "SuggestVulCount", this.SuggestVulCount);
        this.setParamSimple(map, prefix + "PocExpLevelVulCount", this.PocExpLevelVulCount);
        this.setParamSimple(map, prefix + "RemoteExpLevelVulCount", this.RemoteExpLevelVulCount);
        this.setParamSimple(map, prefix + "SeriousVulNewestImageCount", this.SeriousVulNewestImageCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

