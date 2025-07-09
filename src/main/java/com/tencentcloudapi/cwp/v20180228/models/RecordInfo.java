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

public class RecordInfo extends AbstractModel {

    /**
    * Host IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Host Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Client Offline Time
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Client Uninstallation Time
    */
    @SerializedName("UninstallTime")
    @Expose
    private String UninstallTime;

    /**
    * Client Uninstallation Call Chain
    */
    @SerializedName("UninstallCmd")
    @Expose
    private String UninstallCmd;

    /**
    * Client UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Host IP 
     * @return HostIP Host IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Host IP
     * @param HostIP Host IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Host Instance ID 
     * @return InstanceID Host Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Host Instance ID
     * @param InstanceID Host Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Client Offline Time 
     * @return OfflineTime Client Offline Time
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Client Offline Time
     * @param OfflineTime Client Offline Time
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Client Uninstallation Time 
     * @return UninstallTime Client Uninstallation Time
     */
    public String getUninstallTime() {
        return this.UninstallTime;
    }

    /**
     * Set Client Uninstallation Time
     * @param UninstallTime Client Uninstallation Time
     */
    public void setUninstallTime(String UninstallTime) {
        this.UninstallTime = UninstallTime;
    }

    /**
     * Get Client Uninstallation Call Chain 
     * @return UninstallCmd Client Uninstallation Call Chain
     */
    public String getUninstallCmd() {
        return this.UninstallCmd;
    }

    /**
     * Set Client Uninstallation Call Chain
     * @param UninstallCmd Client Uninstallation Call Chain
     */
    public void setUninstallCmd(String UninstallCmd) {
        this.UninstallCmd = UninstallCmd;
    }

    /**
     * Get Client UUID 
     * @return Uuid Client UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Client UUID
     * @param Uuid Client UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.UninstallTime != null) {
            this.UninstallTime = new String(source.UninstallTime);
        }
        if (source.UninstallCmd != null) {
            this.UninstallCmd = new String(source.UninstallCmd);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "UninstallTime", this.UninstallTime);
        this.setParamSimple(map, prefix + "UninstallCmd", this.UninstallCmd);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

