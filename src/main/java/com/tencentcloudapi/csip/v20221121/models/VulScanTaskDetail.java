/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulScanTaskDetail extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Creator AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Public ip address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Private ip</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>os</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>Scan status (SUCCESS: Scan complete/successful, OFFLINE: Client offline, TIMEOUT: Scan timeout, FAILED: Scan failed, UNSUPPORTED: Client version too low/Do not support scanning, TERMINATED: Terminated, TERMINATING: Terminating)</p><p>Enumeration value:</p><ul><li>SCANNING: Scanning</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Scan start time</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Scan end time</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Vulnerability count</p>
    */
    @SerializedName("Vuls")
    @Expose
    private Long Vuls;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Task ID.</p> 
     * @return Id <p>Task ID.</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Task ID.</p>
     * @param Id <p>Task ID.</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Creator AppId</p> 
     * @return AppId <p>Creator AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Creator AppId</p>
     * @param AppId <p>Creator AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Public ip address</p> 
     * @return PublicIp <p>Public ip address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public ip address</p>
     * @param PublicIp <p>Public ip address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Private ip</p> 
     * @return PrivateIp <p>Private ip</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Private ip</p>
     * @param PrivateIp <p>Private ip</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>os</p> 
     * @return OS <p>os</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>os</p>
     * @param OS <p>os</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>Scan status (SUCCESS: Scan complete/successful, OFFLINE: Client offline, TIMEOUT: Scan timeout, FAILED: Scan failed, UNSUPPORTED: Client version too low/Do not support scanning, TERMINATED: Terminated, TERMINATING: Terminating)</p><p>Enumeration value:</p><ul><li>SCANNING: Scanning</li></ul> 
     * @return Status <p>Scan status (SUCCESS: Scan complete/successful, OFFLINE: Client offline, TIMEOUT: Scan timeout, FAILED: Scan failed, UNSUPPORTED: Client version too low/Do not support scanning, TERMINATED: Terminated, TERMINATING: Terminating)</p><p>Enumeration value:</p><ul><li>SCANNING: Scanning</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Scan status (SUCCESS: Scan complete/successful, OFFLINE: Client offline, TIMEOUT: Scan timeout, FAILED: Scan failed, UNSUPPORTED: Client version too low/Do not support scanning, TERMINATED: Terminated, TERMINATING: Terminating)</p><p>Enumeration value:</p><ul><li>SCANNING: Scanning</li></ul>
     * @param Status <p>Scan status (SUCCESS: Scan complete/successful, OFFLINE: Client offline, TIMEOUT: Scan timeout, FAILED: Scan failed, UNSUPPORTED: Client version too low/Do not support scanning, TERMINATED: Terminated, TERMINATING: Terminating)</p><p>Enumeration value:</p><ul><li>SCANNING: Scanning</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Scan start time</p> 
     * @return StartTime <p>Scan start time</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Scan start time</p>
     * @param StartTime <p>Scan start time</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Scan end time</p> 
     * @return EndTime <p>Scan end time</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Scan end time</p>
     * @param EndTime <p>Scan end time</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Vulnerability count</p> 
     * @return Vuls <p>Vulnerability count</p>
     */
    public Long getVuls() {
        return this.Vuls;
    }

    /**
     * Set <p>Vulnerability count</p>
     * @param Vuls <p>Vulnerability count</p>
     */
    public void setVuls(Long Vuls) {
        this.Vuls = Vuls;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return Description <p>Failure reason</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Failure reason</p>
     * @param Description <p>Failure reason</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public VulScanTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulScanTaskDetail(VulScanTaskDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Vuls != null) {
            this.Vuls = new Long(source.Vuls);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Vuls", this.Vuls);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

