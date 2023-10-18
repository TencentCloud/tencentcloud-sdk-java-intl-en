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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulScanResultResponse extends AbstractModel {

    /**
    * Number of vulnerabilities.
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Number of servers activated CWP Pro
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Long ProVersionNum;

    /**
    * Number of affected activated CWP Pro.
    */
    @SerializedName("ImpactedHostNum")
    @Expose
    private Long ImpactedHostNum;

    /**
    * Total number of servers.
    */
    @SerializedName("HostNum")
    @Expose
    private Long HostNum;

    /**
    * Number of servers on CWP Basic.
    */
    @SerializedName("BasicVersionNum")
    @Expose
    private Long BasicVersionNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of vulnerabilities. 
     * @return VulNum Number of vulnerabilities.
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set Number of vulnerabilities.
     * @param VulNum Number of vulnerabilities.
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get Number of servers activated CWP Pro 
     * @return ProVersionNum Number of servers activated CWP Pro
     */
    public Long getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * Set Number of servers activated CWP Pro
     * @param ProVersionNum Number of servers activated CWP Pro
     */
    public void setProVersionNum(Long ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
    }

    /**
     * Get Number of affected activated CWP Pro. 
     * @return ImpactedHostNum Number of affected activated CWP Pro.
     */
    public Long getImpactedHostNum() {
        return this.ImpactedHostNum;
    }

    /**
     * Set Number of affected activated CWP Pro.
     * @param ImpactedHostNum Number of affected activated CWP Pro.
     */
    public void setImpactedHostNum(Long ImpactedHostNum) {
        this.ImpactedHostNum = ImpactedHostNum;
    }

    /**
     * Get Total number of servers. 
     * @return HostNum Total number of servers.
     */
    public Long getHostNum() {
        return this.HostNum;
    }

    /**
     * Set Total number of servers.
     * @param HostNum Total number of servers.
     */
    public void setHostNum(Long HostNum) {
        this.HostNum = HostNum;
    }

    /**
     * Get Number of servers on CWP Basic. 
     * @return BasicVersionNum Number of servers on CWP Basic.
     */
    public Long getBasicVersionNum() {
        return this.BasicVersionNum;
    }

    /**
     * Set Number of servers on CWP Basic.
     * @param BasicVersionNum Number of servers on CWP Basic.
     */
    public void setBasicVersionNum(Long BasicVersionNum) {
        this.BasicVersionNum = BasicVersionNum;
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

    public DescribeVulScanResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanResultResponse(DescribeVulScanResultResponse source) {
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.ProVersionNum != null) {
            this.ProVersionNum = new Long(source.ProVersionNum);
        }
        if (source.ImpactedHostNum != null) {
            this.ImpactedHostNum = new Long(source.ImpactedHostNum);
        }
        if (source.HostNum != null) {
            this.HostNum = new Long(source.HostNum);
        }
        if (source.BasicVersionNum != null) {
            this.BasicVersionNum = new Long(source.BasicVersionNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "ImpactedHostNum", this.ImpactedHostNum);
        this.setParamSimple(map, prefix + "HostNum", this.HostNum);
        this.setParamSimple(map, prefix + "BasicVersionNum", this.BasicVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

