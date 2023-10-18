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

public class DescribeContainerSecEventSummaryResponse extends AbstractModel {

    /**
    * Pending escape event
    */
    @SerializedName("UnhandledEscapeCnt")
    @Expose
    private Long UnhandledEscapeCnt;

    /**
    * Pending reverse shell event
    */
    @SerializedName("UnhandledReverseShellCnt")
    @Expose
    private Long UnhandledReverseShellCnt;

    /**
    * Pending high-risk syscall
    */
    @SerializedName("UnhandledRiskSyscallCnt")
    @Expose
    private Long UnhandledRiskSyscallCnt;

    /**
    * Pending abnormal process
    */
    @SerializedName("UnhandledAbnormalProcessCnt")
    @Expose
    private Long UnhandledAbnormalProcessCnt;

    /**
    * Pending file tampering event
    */
    @SerializedName("UnhandledFileCnt")
    @Expose
    private Long UnhandledFileCnt;

    /**
    * Pending trojan event
    */
    @SerializedName("UnhandledVirusEventCnt")
    @Expose
    private Long UnhandledVirusEventCnt;

    /**
    * Unhandled malicious outgoing connections
    */
    @SerializedName("UnhandledMaliciousConnectionEventCnt")
    @Expose
    private Long UnhandledMaliciousConnectionEventCnt;

    /**
    * Unhandled K8sApi events
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UnhandledK8sApiEventCnt")
    @Expose
    private Long UnhandledK8sApiEventCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Pending escape event 
     * @return UnhandledEscapeCnt Pending escape event
     */
    public Long getUnhandledEscapeCnt() {
        return this.UnhandledEscapeCnt;
    }

    /**
     * Set Pending escape event
     * @param UnhandledEscapeCnt Pending escape event
     */
    public void setUnhandledEscapeCnt(Long UnhandledEscapeCnt) {
        this.UnhandledEscapeCnt = UnhandledEscapeCnt;
    }

    /**
     * Get Pending reverse shell event 
     * @return UnhandledReverseShellCnt Pending reverse shell event
     */
    public Long getUnhandledReverseShellCnt() {
        return this.UnhandledReverseShellCnt;
    }

    /**
     * Set Pending reverse shell event
     * @param UnhandledReverseShellCnt Pending reverse shell event
     */
    public void setUnhandledReverseShellCnt(Long UnhandledReverseShellCnt) {
        this.UnhandledReverseShellCnt = UnhandledReverseShellCnt;
    }

    /**
     * Get Pending high-risk syscall 
     * @return UnhandledRiskSyscallCnt Pending high-risk syscall
     */
    public Long getUnhandledRiskSyscallCnt() {
        return this.UnhandledRiskSyscallCnt;
    }

    /**
     * Set Pending high-risk syscall
     * @param UnhandledRiskSyscallCnt Pending high-risk syscall
     */
    public void setUnhandledRiskSyscallCnt(Long UnhandledRiskSyscallCnt) {
        this.UnhandledRiskSyscallCnt = UnhandledRiskSyscallCnt;
    }

    /**
     * Get Pending abnormal process 
     * @return UnhandledAbnormalProcessCnt Pending abnormal process
     */
    public Long getUnhandledAbnormalProcessCnt() {
        return this.UnhandledAbnormalProcessCnt;
    }

    /**
     * Set Pending abnormal process
     * @param UnhandledAbnormalProcessCnt Pending abnormal process
     */
    public void setUnhandledAbnormalProcessCnt(Long UnhandledAbnormalProcessCnt) {
        this.UnhandledAbnormalProcessCnt = UnhandledAbnormalProcessCnt;
    }

    /**
     * Get Pending file tampering event 
     * @return UnhandledFileCnt Pending file tampering event
     */
    public Long getUnhandledFileCnt() {
        return this.UnhandledFileCnt;
    }

    /**
     * Set Pending file tampering event
     * @param UnhandledFileCnt Pending file tampering event
     */
    public void setUnhandledFileCnt(Long UnhandledFileCnt) {
        this.UnhandledFileCnt = UnhandledFileCnt;
    }

    /**
     * Get Pending trojan event 
     * @return UnhandledVirusEventCnt Pending trojan event
     */
    public Long getUnhandledVirusEventCnt() {
        return this.UnhandledVirusEventCnt;
    }

    /**
     * Set Pending trojan event
     * @param UnhandledVirusEventCnt Pending trojan event
     */
    public void setUnhandledVirusEventCnt(Long UnhandledVirusEventCnt) {
        this.UnhandledVirusEventCnt = UnhandledVirusEventCnt;
    }

    /**
     * Get Unhandled malicious outgoing connections 
     * @return UnhandledMaliciousConnectionEventCnt Unhandled malicious outgoing connections
     */
    public Long getUnhandledMaliciousConnectionEventCnt() {
        return this.UnhandledMaliciousConnectionEventCnt;
    }

    /**
     * Set Unhandled malicious outgoing connections
     * @param UnhandledMaliciousConnectionEventCnt Unhandled malicious outgoing connections
     */
    public void setUnhandledMaliciousConnectionEventCnt(Long UnhandledMaliciousConnectionEventCnt) {
        this.UnhandledMaliciousConnectionEventCnt = UnhandledMaliciousConnectionEventCnt;
    }

    /**
     * Get Unhandled K8sApi events
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UnhandledK8sApiEventCnt Unhandled K8sApi events
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getUnhandledK8sApiEventCnt() {
        return this.UnhandledK8sApiEventCnt;
    }

    /**
     * Set Unhandled K8sApi events
Note: This field may return `null`, indicating that no valid value was found.
     * @param UnhandledK8sApiEventCnt Unhandled K8sApi events
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUnhandledK8sApiEventCnt(Long UnhandledK8sApiEventCnt) {
        this.UnhandledK8sApiEventCnt = UnhandledK8sApiEventCnt;
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

    public DescribeContainerSecEventSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerSecEventSummaryResponse(DescribeContainerSecEventSummaryResponse source) {
        if (source.UnhandledEscapeCnt != null) {
            this.UnhandledEscapeCnt = new Long(source.UnhandledEscapeCnt);
        }
        if (source.UnhandledReverseShellCnt != null) {
            this.UnhandledReverseShellCnt = new Long(source.UnhandledReverseShellCnt);
        }
        if (source.UnhandledRiskSyscallCnt != null) {
            this.UnhandledRiskSyscallCnt = new Long(source.UnhandledRiskSyscallCnt);
        }
        if (source.UnhandledAbnormalProcessCnt != null) {
            this.UnhandledAbnormalProcessCnt = new Long(source.UnhandledAbnormalProcessCnt);
        }
        if (source.UnhandledFileCnt != null) {
            this.UnhandledFileCnt = new Long(source.UnhandledFileCnt);
        }
        if (source.UnhandledVirusEventCnt != null) {
            this.UnhandledVirusEventCnt = new Long(source.UnhandledVirusEventCnt);
        }
        if (source.UnhandledMaliciousConnectionEventCnt != null) {
            this.UnhandledMaliciousConnectionEventCnt = new Long(source.UnhandledMaliciousConnectionEventCnt);
        }
        if (source.UnhandledK8sApiEventCnt != null) {
            this.UnhandledK8sApiEventCnt = new Long(source.UnhandledK8sApiEventCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnhandledEscapeCnt", this.UnhandledEscapeCnt);
        this.setParamSimple(map, prefix + "UnhandledReverseShellCnt", this.UnhandledReverseShellCnt);
        this.setParamSimple(map, prefix + "UnhandledRiskSyscallCnt", this.UnhandledRiskSyscallCnt);
        this.setParamSimple(map, prefix + "UnhandledAbnormalProcessCnt", this.UnhandledAbnormalProcessCnt);
        this.setParamSimple(map, prefix + "UnhandledFileCnt", this.UnhandledFileCnt);
        this.setParamSimple(map, prefix + "UnhandledVirusEventCnt", this.UnhandledVirusEventCnt);
        this.setParamSimple(map, prefix + "UnhandledMaliciousConnectionEventCnt", this.UnhandledMaliciousConnectionEventCnt);
        this.setParamSimple(map, prefix + "UnhandledK8sApiEventCnt", this.UnhandledK8sApiEventCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

