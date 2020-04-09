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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewStatisticsResponse extends AbstractModel{

    /**
    * Number of online servers.
    */
    @SerializedName("OnlineMachineNum")
    @Expose
    private Long OnlineMachineNum;

    /**
    * Number of servers activated CWP Pro.
    */
    @SerializedName("ProVersionMachineNum")
    @Expose
    private Long ProVersionMachineNum;

    /**
    * Number of trojan files.
    */
    @SerializedName("MalwareNum")
    @Expose
    private Long MalwareNum;

    /**
    * Number of unusual login locations.
    */
    @SerializedName("NonlocalLoginNum")
    @Expose
    private Long NonlocalLoginNum;

    /**
    * Number of successful brute force attacks.
    */
    @SerializedName("BruteAttackSuccessNum")
    @Expose
    private Long BruteAttackSuccessNum;

    /**
    * Number of vulnerabilities.
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Security baseline number
    */
    @SerializedName("BaseLineNum")
    @Expose
    private Long BaseLineNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of online servers. 
     * @return OnlineMachineNum Number of online servers.
     */
    public Long getOnlineMachineNum() {
        return this.OnlineMachineNum;
    }

    /**
     * Set Number of online servers.
     * @param OnlineMachineNum Number of online servers.
     */
    public void setOnlineMachineNum(Long OnlineMachineNum) {
        this.OnlineMachineNum = OnlineMachineNum;
    }

    /**
     * Get Number of servers activated CWP Pro. 
     * @return ProVersionMachineNum Number of servers activated CWP Pro.
     */
    public Long getProVersionMachineNum() {
        return this.ProVersionMachineNum;
    }

    /**
     * Set Number of servers activated CWP Pro.
     * @param ProVersionMachineNum Number of servers activated CWP Pro.
     */
    public void setProVersionMachineNum(Long ProVersionMachineNum) {
        this.ProVersionMachineNum = ProVersionMachineNum;
    }

    /**
     * Get Number of trojan files. 
     * @return MalwareNum Number of trojan files.
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set Number of trojan files.
     * @param MalwareNum Number of trojan files.
     */
    public void setMalwareNum(Long MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * Get Number of unusual login locations. 
     * @return NonlocalLoginNum Number of unusual login locations.
     */
    public Long getNonlocalLoginNum() {
        return this.NonlocalLoginNum;
    }

    /**
     * Set Number of unusual login locations.
     * @param NonlocalLoginNum Number of unusual login locations.
     */
    public void setNonlocalLoginNum(Long NonlocalLoginNum) {
        this.NonlocalLoginNum = NonlocalLoginNum;
    }

    /**
     * Get Number of successful brute force attacks. 
     * @return BruteAttackSuccessNum Number of successful brute force attacks.
     */
    public Long getBruteAttackSuccessNum() {
        return this.BruteAttackSuccessNum;
    }

    /**
     * Set Number of successful brute force attacks.
     * @param BruteAttackSuccessNum Number of successful brute force attacks.
     */
    public void setBruteAttackSuccessNum(Long BruteAttackSuccessNum) {
        this.BruteAttackSuccessNum = BruteAttackSuccessNum;
    }

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
     * Get Security baseline number 
     * @return BaseLineNum Security baseline number
     */
    public Long getBaseLineNum() {
        return this.BaseLineNum;
    }

    /**
     * Set Security baseline number
     * @param BaseLineNum Security baseline number
     */
    public void setBaseLineNum(Long BaseLineNum) {
        this.BaseLineNum = BaseLineNum;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OnlineMachineNum", this.OnlineMachineNum);
        this.setParamSimple(map, prefix + "ProVersionMachineNum", this.ProVersionMachineNum);
        this.setParamSimple(map, prefix + "MalwareNum", this.MalwareNum);
        this.setParamSimple(map, prefix + "NonlocalLoginNum", this.NonlocalLoginNum);
        this.setParamSimple(map, prefix + "BruteAttackSuccessNum", this.BruteAttackSuccessNum);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "BaseLineNum", this.BaseLineNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

