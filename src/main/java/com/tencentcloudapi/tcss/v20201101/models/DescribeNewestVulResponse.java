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

public class DescribeNewestVulResponse extends AbstractModel{

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Disclosure time
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Vulnerability CVE ID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Disclosure time 
     * @return SubmitTime Disclosure time
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set Disclosure time
     * @param SubmitTime Disclosure time
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned). 
     * @return Status Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned).
     * @param Status Emergency vulnerability risk information. Valid values: `NOT_SCAN` (not scanned); `SCANNING` (scanning); `SCANNED` (scanned).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Vulnerability CVE ID 
     * @return CVEID Vulnerability CVE ID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set Vulnerability CVE ID
     * @param CVEID Vulnerability CVE ID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
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

    public DescribeNewestVulResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewestVulResponse(DescribeNewestVulResponse source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

