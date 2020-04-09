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

public class MaliciousRequest extends AbstractModel{

    /**
    * Record ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP agent `UUID`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP of server.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Malicious request domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Number of malicious requests.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Process name.
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Record status.
<li>UN_OPERATED: to be processed</li>
<li>TRUSTED: trusted</li>
<li>UN_TRUSTED: untrusted</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Malicious request domain name description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Reference address.
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * Discovery time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Record merge time.
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * Process MD5
Value.
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * Executed command line.
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Process `PID`.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
     * Get Record ID. 
     * @return Id Record ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID.
     * @param Id Record ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWP agent `UUID`. 
     * @return Uuid CWP agent `UUID`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `UUID`.
     * @param Uuid CWP agent `UUID`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP of server. 
     * @return MachineIp Private IP of server.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP of server.
     * @param MachineIp Private IP of server.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Malicious request domain name. 
     * @return Domain Malicious request domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Malicious request domain name.
     * @param Domain Malicious request domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Number of malicious requests. 
     * @return Count Number of malicious requests.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of malicious requests.
     * @param Count Number of malicious requests.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Process name. 
     * @return ProcessName Process name.
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name.
     * @param ProcessName Process name.
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Record status.
<li>UN_OPERATED: to be processed</li>
<li>TRUSTED: trusted</li>
<li>UN_TRUSTED: untrusted</li> 
     * @return Status Record status.
<li>UN_OPERATED: to be processed</li>
<li>TRUSTED: trusted</li>
<li>UN_TRUSTED: untrusted</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Record status.
<li>UN_OPERATED: to be processed</li>
<li>TRUSTED: trusted</li>
<li>UN_TRUSTED: untrusted</li>
     * @param Status Record status.
<li>UN_OPERATED: to be processed</li>
<li>TRUSTED: trusted</li>
<li>UN_TRUSTED: untrusted</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Malicious request domain name description. 
     * @return Description Malicious request domain name description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Malicious request domain name description.
     * @param Description Malicious request domain name description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Reference address. 
     * @return Reference Reference address.
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference address.
     * @param Reference Reference address.
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get Discovery time. 
     * @return CreateTime Discovery time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Discovery time.
     * @param CreateTime Discovery time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Record merge time. 
     * @return MergeTime Record merge time.
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Record merge time.
     * @param MergeTime Record merge time.
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get Process MD5
Value. 
     * @return ProcessMd5 Process MD5
Value.
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set Process MD5
Value.
     * @param ProcessMd5 Process MD5
Value.
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get Executed command line. 
     * @return CmdLine Executed command line.
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Executed command line.
     * @param CmdLine Executed command line.
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Process `PID`. 
     * @return Pid Process `PID`.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Process `PID`.
     * @param Pid Process `PID`.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

