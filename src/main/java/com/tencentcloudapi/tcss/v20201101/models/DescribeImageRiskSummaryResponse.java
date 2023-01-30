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

public class DescribeImageRiskSummaryResponse extends AbstractModel{

    /**
    * Vulnerability
    */
    @SerializedName("VulnerabilityCnt")
    @Expose
    private RunTimeRiskInfo [] VulnerabilityCnt;

    /**
    * Virus and trojan
    */
    @SerializedName("MalwareVirusCnt")
    @Expose
    private RunTimeRiskInfo [] MalwareVirusCnt;

    /**
    * Sensitive data
    */
    @SerializedName("RiskCnt")
    @Expose
    private RunTimeRiskInfo [] RiskCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Vulnerability 
     * @return VulnerabilityCnt Vulnerability
     */
    public RunTimeRiskInfo [] getVulnerabilityCnt() {
        return this.VulnerabilityCnt;
    }

    /**
     * Set Vulnerability
     * @param VulnerabilityCnt Vulnerability
     */
    public void setVulnerabilityCnt(RunTimeRiskInfo [] VulnerabilityCnt) {
        this.VulnerabilityCnt = VulnerabilityCnt;
    }

    /**
     * Get Virus and trojan 
     * @return MalwareVirusCnt Virus and trojan
     */
    public RunTimeRiskInfo [] getMalwareVirusCnt() {
        return this.MalwareVirusCnt;
    }

    /**
     * Set Virus and trojan
     * @param MalwareVirusCnt Virus and trojan
     */
    public void setMalwareVirusCnt(RunTimeRiskInfo [] MalwareVirusCnt) {
        this.MalwareVirusCnt = MalwareVirusCnt;
    }

    /**
     * Get Sensitive data 
     * @return RiskCnt Sensitive data
     */
    public RunTimeRiskInfo [] getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Sensitive data
     * @param RiskCnt Sensitive data
     */
    public void setRiskCnt(RunTimeRiskInfo [] RiskCnt) {
        this.RiskCnt = RiskCnt;
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

    public DescribeImageRiskSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageRiskSummaryResponse(DescribeImageRiskSummaryResponse source) {
        if (source.VulnerabilityCnt != null) {
            this.VulnerabilityCnt = new RunTimeRiskInfo[source.VulnerabilityCnt.length];
            for (int i = 0; i < source.VulnerabilityCnt.length; i++) {
                this.VulnerabilityCnt[i] = new RunTimeRiskInfo(source.VulnerabilityCnt[i]);
            }
        }
        if (source.MalwareVirusCnt != null) {
            this.MalwareVirusCnt = new RunTimeRiskInfo[source.MalwareVirusCnt.length];
            for (int i = 0; i < source.MalwareVirusCnt.length; i++) {
                this.MalwareVirusCnt[i] = new RunTimeRiskInfo(source.MalwareVirusCnt[i]);
            }
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new RunTimeRiskInfo[source.RiskCnt.length];
            for (int i = 0; i < source.RiskCnt.length; i++) {
                this.RiskCnt[i] = new RunTimeRiskInfo(source.RiskCnt[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulnerabilityCnt.", this.VulnerabilityCnt);
        this.setParamArrayObj(map, prefix + "MalwareVirusCnt.", this.MalwareVirusCnt);
        this.setParamArrayObj(map, prefix + "RiskCnt.", this.RiskCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

