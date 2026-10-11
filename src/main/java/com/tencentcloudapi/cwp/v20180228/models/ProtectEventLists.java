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

public class ProtectEventLists extends AbstractModel {

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
    * Event address
    */
    @SerializedName("EventDir")
    @Expose
    private String EventDir;

    /**
    * Event type. 0: Content Modification Recovery; 1: Permission Modification Recovery; 2: Ownership Modification Recovery; 3: Deletion Recovery; 4: Newly-added Deletion
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Event status. 1: restored. 0: unrecovered
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * Detection time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Recovery time
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * File type. 0: normal file; 1: directory; 2: soft link
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * Host Additional Information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Machine instance UUID.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

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
     * Get Event address 
     * @return EventDir Event address
     */
    public String getEventDir() {
        return this.EventDir;
    }

    /**
     * Set Event address
     * @param EventDir Event address
     */
    public void setEventDir(String EventDir) {
        this.EventDir = EventDir;
    }

    /**
     * Get Event type. 0: Content Modification Recovery; 1: Permission Modification Recovery; 2: Ownership Modification Recovery; 3: Deletion Recovery; 4: Newly-added Deletion 
     * @return EventType Event type. 0: Content Modification Recovery; 1: Permission Modification Recovery; 2: Ownership Modification Recovery; 3: Deletion Recovery; 4: Newly-added Deletion
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. 0: Content Modification Recovery; 1: Permission Modification Recovery; 2: Ownership Modification Recovery; 3: Deletion Recovery; 4: Newly-added Deletion
     * @param EventType Event type. 0: Content Modification Recovery; 1: Permission Modification Recovery; 2: Ownership Modification Recovery; 3: Deletion Recovery; 4: Newly-added Deletion
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Event status. 1: restored. 0: unrecovered 
     * @return EventStatus Event status. 1: restored. 0: unrecovered
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set Event status. 1: restored. 0: unrecovered
     * @param EventStatus Event status. 1: restored. 0: unrecovered
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get Detection time 
     * @return CreateTime Detection time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Detection time
     * @param CreateTime Detection time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Recovery time 
     * @return RestoreTime Recovery time
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set Recovery time
     * @param RestoreTime Recovery time
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get File type. 0: normal file; 1: directory; 2: soft link 
     * @return FileType File type. 0: normal file; 1: directory; 2: soft link
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set File type. 0: normal file; 1: directory; 2: soft link
     * @param FileType File type. 0: normal file; 1: directory; 2: soft link
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
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

    /**
     * Get Machine instance UUID. 
     * @return Quuid Machine instance UUID.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine instance UUID.
     * @param Quuid Machine instance UUID.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public ProtectEventLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectEventLists(ProtectEventLists source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.EventDir != null) {
            this.EventDir = new String(source.EventDir);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "EventDir", this.EventDir);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

