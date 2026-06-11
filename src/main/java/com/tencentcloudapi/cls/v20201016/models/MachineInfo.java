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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineInfo extends AbstractModel {

    /**
    * Machine IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Machine instance ID.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Machine status. Valid values: `0`: exceptional; `1`: normal
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Machine offline time. Null indicates normal. Return a specific time in case of exceptions. Time format: YYYY-MM-DD HH:mm:ss.
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
    * Machine upgrade status. 0: Upgrade successful; 1: Upgrading; -1: Upgrade failed.
    */
    @SerializedName("UpdateStatus")
    @Expose
    private Long UpdateStatus;

    /**
    * Machine upgrade result identifier.0: Success; 1200: Upgrade successful; Other values indicate exceptions.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Machine upgrade result information."ok": Success; "update success": Upgrade successful; Other values indicate the reason for failure.
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
     * Get Machine instance ID. 
     * @return InstanceID Machine instance ID.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Machine instance ID.
     * @param InstanceID Machine instance ID.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
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
     * Get Machine offline time. Null indicates normal. Return a specific time in case of exceptions. Time format: YYYY-MM-DD HH:mm:ss. 
     * @return OfflineTime Machine offline time. Null indicates normal. Return a specific time in case of exceptions. Time format: YYYY-MM-DD HH:mm:ss.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Machine offline time. Null indicates normal. Return a specific time in case of exceptions. Time format: YYYY-MM-DD HH:mm:ss.
     * @param OfflineTime Machine offline time. Null indicates normal. Return a specific time in case of exceptions. Time format: YYYY-MM-DD HH:mm:ss.
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
     * Get Machine upgrade status. 0: Upgrade successful; 1: Upgrading; -1: Upgrade failed. 
     * @return UpdateStatus Machine upgrade status. 0: Upgrade successful; 1: Upgrading; -1: Upgrade failed.
     */
    public Long getUpdateStatus() {
        return this.UpdateStatus;
    }

    /**
     * Set Machine upgrade status. 0: Upgrade successful; 1: Upgrading; -1: Upgrade failed.
     * @param UpdateStatus Machine upgrade status. 0: Upgrade successful; 1: Upgrading; -1: Upgrade failed.
     */
    public void setUpdateStatus(Long UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    /**
     * Get Machine upgrade result identifier.0: Success; 1200: Upgrade successful; Other values indicate exceptions. 
     * @return ErrCode Machine upgrade result identifier.0: Success; 1200: Upgrade successful; Other values indicate exceptions.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Machine upgrade result identifier.0: Success; 1200: Upgrade successful; Other values indicate exceptions.
     * @param ErrCode Machine upgrade result identifier.0: Success; 1200: Upgrade successful; Other values indicate exceptions.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Machine upgrade result information."ok": Success; "update success": Upgrade successful; Other values indicate the reason for failure. 
     * @return ErrMsg Machine upgrade result information."ok": Success; "update success": Upgrade successful; Other values indicate the reason for failure.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Machine upgrade result information."ok": Success; "update success": Upgrade successful; Other values indicate the reason for failure.
     * @param ErrMsg Machine upgrade result information."ok": Success; "update success": Upgrade successful; Other values indicate the reason for failure.
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
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
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
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpdateStatus", this.UpdateStatus);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

