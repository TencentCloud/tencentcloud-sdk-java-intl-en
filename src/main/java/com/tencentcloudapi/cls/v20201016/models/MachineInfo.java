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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineInfo extends AbstractModel{

    /**
    * Machine IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Machine status. Valid values: `0`: exceptional; `1`: normal
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Machine disconnection time. If the value is empty, the machine is normal. If the machine is exceptional, a specific value will be returned.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Whether to enable automatic update for the machine. Valid values: `0`: no; `1`: yes
    */
    @SerializedName("AutoUpdate")
    @Expose
    private Long AutoUpdate;

    /**
    * Current machine version number
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Machine update feature status
    */
    @SerializedName("UpdateStatus")
    @Expose
    private Long UpdateStatus;

    /**
    * Machine update result flag
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Machine update result information
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get Machine IP 
     * @return Ip Machine IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Machine IP
     * @param Ip Machine IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Machine status. Valid values: `0`: exceptional; `1`: normal 
     * @return Status Machine status. Valid values: `0`: exceptional; `1`: normal
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Machine status. Valid values: `0`: exceptional; `1`: normal
     * @param Status Machine status. Valid values: `0`: exceptional; `1`: normal
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Machine disconnection time. If the value is empty, the machine is normal. If the machine is exceptional, a specific value will be returned. 
     * @return OfflineTime Machine disconnection time. If the value is empty, the machine is normal. If the machine is exceptional, a specific value will be returned.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Machine disconnection time. If the value is empty, the machine is normal. If the machine is exceptional, a specific value will be returned.
     * @param OfflineTime Machine disconnection time. If the value is empty, the machine is normal. If the machine is exceptional, a specific value will be returned.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Whether to enable automatic update for the machine. Valid values: `0`: no; `1`: yes 
     * @return AutoUpdate Whether to enable automatic update for the machine. Valid values: `0`: no; `1`: yes
     */
    public Long getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set Whether to enable automatic update for the machine. Valid values: `0`: no; `1`: yes
     * @param AutoUpdate Whether to enable automatic update for the machine. Valid values: `0`: no; `1`: yes
     */
    public void setAutoUpdate(Long AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get Current machine version number 
     * @return Version Current machine version number
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Current machine version number
     * @param Version Current machine version number
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Machine update feature status 
     * @return UpdateStatus Machine update feature status
     */
    public Long getUpdateStatus() {
        return this.UpdateStatus;
    }

    /**
     * Set Machine update feature status
     * @param UpdateStatus Machine update feature status
     */
    public void setUpdateStatus(Long UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    /**
     * Get Machine update result flag 
     * @return ErrCode Machine update result flag
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Machine update result flag
     * @param ErrCode Machine update result flag
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Machine update result information 
     * @return ErrMsg Machine update result information
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Machine update result information
     * @param ErrMsg Machine update result information
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public MachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineInfo(MachineInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new Long(source.AutoUpdate);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.UpdateStatus != null) {
            this.UpdateStatus = new Long(source.UpdateStatus);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpdateStatus", this.UpdateStatus);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

