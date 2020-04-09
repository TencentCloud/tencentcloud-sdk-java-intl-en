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

public class DescribeWeeklyReportInfoResponse extends AbstractModel{

    /**
    * Account owner name.
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * Total number of servers.
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
    * Number of online CWP agents
    */
    @SerializedName("OnlineMachineNum")
    @Expose
    private Long OnlineMachineNum;

    /**
    * Number of offline CWP agents.
    */
    @SerializedName("OfflineMachineNum")
    @Expose
    private Long OfflineMachineNum;

    /**
    * Number of servers on CWP Pro.
    */
    @SerializedName("ProVersionMachineNum")
    @Expose
    private Long ProVersionMachineNum;

    /**
    * Weekly report start time
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * Weekly report end time
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Security level
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Number of trojan records.
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
    * Download address for exported file.
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Account owner name. 
     * @return CompanyName Account owner name.
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set Account owner name.
     * @param CompanyName Account owner name.
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get Total number of servers. 
     * @return MachineNum Total number of servers.
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set Total number of servers.
     * @param MachineNum Total number of servers.
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    /**
     * Get Number of online CWP agents 
     * @return OnlineMachineNum Number of online CWP agents
     */
    public Long getOnlineMachineNum() {
        return this.OnlineMachineNum;
    }

    /**
     * Set Number of online CWP agents
     * @param OnlineMachineNum Number of online CWP agents
     */
    public void setOnlineMachineNum(Long OnlineMachineNum) {
        this.OnlineMachineNum = OnlineMachineNum;
    }

    /**
     * Get Number of offline CWP agents. 
     * @return OfflineMachineNum Number of offline CWP agents.
     */
    public Long getOfflineMachineNum() {
        return this.OfflineMachineNum;
    }

    /**
     * Set Number of offline CWP agents.
     * @param OfflineMachineNum Number of offline CWP agents.
     */
    public void setOfflineMachineNum(Long OfflineMachineNum) {
        this.OfflineMachineNum = OfflineMachineNum;
    }

    /**
     * Get Number of servers on CWP Pro. 
     * @return ProVersionMachineNum Number of servers on CWP Pro.
     */
    public Long getProVersionMachineNum() {
        return this.ProVersionMachineNum;
    }

    /**
     * Set Number of servers on CWP Pro.
     * @param ProVersionMachineNum Number of servers on CWP Pro.
     */
    public void setProVersionMachineNum(Long ProVersionMachineNum) {
        this.ProVersionMachineNum = ProVersionMachineNum;
    }

    /**
     * Get Weekly report start time 
     * @return BeginDate Weekly report start time
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set Weekly report start time
     * @param BeginDate Weekly report start time
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get Weekly report end time 
     * @return EndDate Weekly report end time
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set Weekly report end time
     * @param EndDate Weekly report end time
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Security level
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li> 
     * @return Level Security level
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Security level
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
     * @param Level Security level
<li>HIGH: high</li>
<li>MIDDLE: medium</li>
<li>LOW: low</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Number of trojan records. 
     * @return MalwareNum Number of trojan records.
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set Number of trojan records.
     * @param MalwareNum Number of trojan records.
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
     * Get Download address for exported file. 
     * @return DownloadUrl Download address for exported file.
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Download address for exported file.
     * @param DownloadUrl Download address for exported file.
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
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
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);
        this.setParamSimple(map, prefix + "OnlineMachineNum", this.OnlineMachineNum);
        this.setParamSimple(map, prefix + "OfflineMachineNum", this.OfflineMachineNum);
        this.setParamSimple(map, prefix + "ProVersionMachineNum", this.ProVersionMachineNum);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "MalwareNum", this.MalwareNum);
        this.setParamSimple(map, prefix + "NonlocalLoginNum", this.NonlocalLoginNum);
        this.setParamSimple(map, prefix + "BruteAttackSuccessNum", this.BruteAttackSuccessNum);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

