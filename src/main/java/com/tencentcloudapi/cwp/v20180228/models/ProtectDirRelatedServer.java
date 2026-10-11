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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectDirRelatedServer extends AbstractModel {

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Server system
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * Number of associated directories
    */
    @SerializedName("RelateDirNum")
    @Expose
    private Long RelateDirNum;

    /**
    * Protection status
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * Protection switch
    */
    @SerializedName("ProtectSwitch")
    @Expose
    private Long ProtectSwitch;

    /**
    * Auto recovery switch
    */
    @SerializedName("AutoRestoreSwitchStatus")
    @Expose
    private Long AutoRestoreSwitchStatus;

    /**
    * Unique server ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Whether it has been authorized
    */
    @SerializedName("Authorization")
    @Expose
    private Boolean Authorization;

    /**
    * Abnormal status
    */
    @SerializedName("Exception")
    @Expose
    private Long Exception;

    /**
    * Transition progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Exception message
    */
    @SerializedName("ExceptionMessage")
    @Expose
    private String ExceptionMessage;

    /**
    * Host Additional Information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Server IP address 
     * @return HostIp Server IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server IP address
     * @param HostIp Server IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Server system 
     * @return MachineOs Server system
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set Server system
     * @param MachineOs Server system
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get Number of associated directories 
     * @return RelateDirNum Number of associated directories
     */
    public Long getRelateDirNum() {
        return this.RelateDirNum;
    }

    /**
     * Set Number of associated directories
     * @param RelateDirNum Number of associated directories
     */
    public void setRelateDirNum(Long RelateDirNum) {
        this.RelateDirNum = RelateDirNum;
    }

    /**
     * Get Protection status 
     * @return ProtectStatus Protection status
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set Protection status
     * @param ProtectStatus Protection status
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get Protection switch 
     * @return ProtectSwitch Protection switch
     */
    public Long getProtectSwitch() {
        return this.ProtectSwitch;
    }

    /**
     * Set Protection switch
     * @param ProtectSwitch Protection switch
     */
    public void setProtectSwitch(Long ProtectSwitch) {
        this.ProtectSwitch = ProtectSwitch;
    }

    /**
     * Get Auto recovery switch 
     * @return AutoRestoreSwitchStatus Auto recovery switch
     */
    public Long getAutoRestoreSwitchStatus() {
        return this.AutoRestoreSwitchStatus;
    }

    /**
     * Set Auto recovery switch
     * @param AutoRestoreSwitchStatus Auto recovery switch
     */
    public void setAutoRestoreSwitchStatus(Long AutoRestoreSwitchStatus) {
        this.AutoRestoreSwitchStatus = AutoRestoreSwitchStatus;
    }

    /**
     * Get Unique server ID 
     * @return Quuid Unique server ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Unique server ID
     * @param Quuid Unique server ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Whether it has been authorized 
     * @return Authorization Whether it has been authorized
     */
    public Boolean getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set Whether it has been authorized
     * @param Authorization Whether it has been authorized
     */
    public void setAuthorization(Boolean Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get Abnormal status 
     * @return Exception Abnormal status
     */
    public Long getException() {
        return this.Exception;
    }

    /**
     * Set Abnormal status
     * @param Exception Abnormal status
     */
    public void setException(Long Exception) {
        this.Exception = Exception;
    }

    /**
     * Get Transition progress 
     * @return Progress Transition progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Transition progress
     * @param Progress Transition progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Exception message 
     * @return ExceptionMessage Exception message
     */
    public String getExceptionMessage() {
        return this.ExceptionMessage;
    }

    /**
     * Set Exception message
     * @param ExceptionMessage Exception message
     */
    public void setExceptionMessage(String ExceptionMessage) {
        this.ExceptionMessage = ExceptionMessage;
    }

    /**
     * Get Host Additional Information 
     * @return MachineExtraInfo Host Additional Information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
     * @param MachineExtraInfo Host Additional Information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public ProtectDirRelatedServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectDirRelatedServer(ProtectDirRelatedServer source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.RelateDirNum != null) {
            this.RelateDirNum = new Long(source.RelateDirNum);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.ProtectSwitch != null) {
            this.ProtectSwitch = new Long(source.ProtectSwitch);
        }
        if (source.AutoRestoreSwitchStatus != null) {
            this.AutoRestoreSwitchStatus = new Long(source.AutoRestoreSwitchStatus);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Authorization != null) {
            this.Authorization = new Boolean(source.Authorization);
        }
        if (source.Exception != null) {
            this.Exception = new Long(source.Exception);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.ExceptionMessage != null) {
            this.ExceptionMessage = new String(source.ExceptionMessage);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "RelateDirNum", this.RelateDirNum);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "ProtectSwitch", this.ProtectSwitch);
        this.setParamSimple(map, prefix + "AutoRestoreSwitchStatus", this.AutoRestoreSwitchStatus);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "Exception", this.Exception);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ExceptionMessage", this.ExceptionMessage);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

