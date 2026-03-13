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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataFlowInfo extends AbstractModel {

    /**
    * Data flow manage ID.
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * Data flow name.
    */
    @SerializedName("DataFlowName")
    @Expose
    private String DataFlowName;

    /**
    * Source data type.
    */
    @SerializedName("SourceStorageType")
    @Expose
    private String SourceStorageType;

    /**
    * Source storage address.
    */
    @SerializedName("SourceStorageAddress")
    @Expose
    private String SourceStorageAddress;

    /**
    * Source path.
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * Directory path.
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * available: effective.
pending: configuring.
unavailable.
Deleting: deleting.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time.
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 0: disable auto-update.

1: enable auto-update.
    */
    @SerializedName("AutoRefresh")
    @Expose
    private Long AutoRefresh;

    /**
    * Topic Parameter used by KafkaConsumer during consumption
    */
    @SerializedName("UserKafkaTopic")
    @Expose
    private String UserKafkaTopic;

    /**
    * Service address.
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
    * Kafka consuming user name.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Auto refresh status, available: in effect.
pending: configuring.
unavailable.
    */
    @SerializedName("AutoRefreshStatus")
    @Expose
    private String AutoRefreshStatus;

    /**
    * Automatically refresh start time.
    */
    @SerializedName("AutoRefreshTime")
    @Expose
    private String AutoRefreshTime;

    /**
     * Get Data flow manage ID. 
     * @return DataFlowId Data flow manage ID.
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set Data flow manage ID.
     * @param DataFlowId Data flow manage ID.
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get Data flow name. 
     * @return DataFlowName Data flow name.
     */
    public String getDataFlowName() {
        return this.DataFlowName;
    }

    /**
     * Set Data flow name.
     * @param DataFlowName Data flow name.
     */
    public void setDataFlowName(String DataFlowName) {
        this.DataFlowName = DataFlowName;
    }

    /**
     * Get Source data type. 
     * @return SourceStorageType Source data type.
     */
    public String getSourceStorageType() {
        return this.SourceStorageType;
    }

    /**
     * Set Source data type.
     * @param SourceStorageType Source data type.
     */
    public void setSourceStorageType(String SourceStorageType) {
        this.SourceStorageType = SourceStorageType;
    }

    /**
     * Get Source storage address. 
     * @return SourceStorageAddress Source storage address.
     */
    public String getSourceStorageAddress() {
        return this.SourceStorageAddress;
    }

    /**
     * Set Source storage address.
     * @param SourceStorageAddress Source storage address.
     */
    public void setSourceStorageAddress(String SourceStorageAddress) {
        this.SourceStorageAddress = SourceStorageAddress;
    }

    /**
     * Get Source path. 
     * @return SourcePath Source path.
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set Source path.
     * @param SourcePath Source path.
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get Directory path. 
     * @return TargetPath Directory path.
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set Directory path.
     * @param TargetPath Directory path.
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get available: effective.
pending: configuring.
unavailable.
Deleting: deleting. 
     * @return Status available: effective.
pending: configuring.
unavailable.
Deleting: deleting.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set available: effective.
pending: configuring.
unavailable.
Deleting: deleting.
     * @param Status available: effective.
pending: configuring.
unavailable.
Deleting: deleting.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time. 
     * @return CreationTime Creation time.
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time.
     * @param CreationTime Creation time.
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 0: disable auto-update.

1: enable auto-update. 
     * @return AutoRefresh 0: disable auto-update.

1: enable auto-update.
     */
    public Long getAutoRefresh() {
        return this.AutoRefresh;
    }

    /**
     * Set 0: disable auto-update.

1: enable auto-update.
     * @param AutoRefresh 0: disable auto-update.

1: enable auto-update.
     */
    public void setAutoRefresh(Long AutoRefresh) {
        this.AutoRefresh = AutoRefresh;
    }

    /**
     * Get Topic Parameter used by KafkaConsumer during consumption 
     * @return UserKafkaTopic Topic Parameter used by KafkaConsumer during consumption
     */
    public String getUserKafkaTopic() {
        return this.UserKafkaTopic;
    }

    /**
     * Set Topic Parameter used by KafkaConsumer during consumption
     * @param UserKafkaTopic Topic Parameter used by KafkaConsumer during consumption
     */
    public void setUserKafkaTopic(String UserKafkaTopic) {
        this.UserKafkaTopic = UserKafkaTopic;
    }

    /**
     * Get Service address. 
     * @return ServerAddr Service address.
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set Service address.
     * @param ServerAddr Service address.
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    /**
     * Get Kafka consuming user name. 
     * @return UserName Kafka consuming user name.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Kafka consuming user name.
     * @param UserName Kafka consuming user name.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Auto refresh status, available: in effect.
pending: configuring.
unavailable. 
     * @return AutoRefreshStatus Auto refresh status, available: in effect.
pending: configuring.
unavailable.
     */
    public String getAutoRefreshStatus() {
        return this.AutoRefreshStatus;
    }

    /**
     * Set Auto refresh status, available: in effect.
pending: configuring.
unavailable.
     * @param AutoRefreshStatus Auto refresh status, available: in effect.
pending: configuring.
unavailable.
     */
    public void setAutoRefreshStatus(String AutoRefreshStatus) {
        this.AutoRefreshStatus = AutoRefreshStatus;
    }

    /**
     * Get Automatically refresh start time. 
     * @return AutoRefreshTime Automatically refresh start time.
     */
    public String getAutoRefreshTime() {
        return this.AutoRefreshTime;
    }

    /**
     * Set Automatically refresh start time.
     * @param AutoRefreshTime Automatically refresh start time.
     */
    public void setAutoRefreshTime(String AutoRefreshTime) {
        this.AutoRefreshTime = AutoRefreshTime;
    }

    public DataFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataFlowInfo(DataFlowInfo source) {
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.DataFlowName != null) {
            this.DataFlowName = new String(source.DataFlowName);
        }
        if (source.SourceStorageType != null) {
            this.SourceStorageType = new String(source.SourceStorageType);
        }
        if (source.SourceStorageAddress != null) {
            this.SourceStorageAddress = new String(source.SourceStorageAddress);
        }
        if (source.SourcePath != null) {
            this.SourcePath = new String(source.SourcePath);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.AutoRefresh != null) {
            this.AutoRefresh = new Long(source.AutoRefresh);
        }
        if (source.UserKafkaTopic != null) {
            this.UserKafkaTopic = new String(source.UserKafkaTopic);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AutoRefreshStatus != null) {
            this.AutoRefreshStatus = new String(source.AutoRefreshStatus);
        }
        if (source.AutoRefreshTime != null) {
            this.AutoRefreshTime = new String(source.AutoRefreshTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "DataFlowName", this.DataFlowName);
        this.setParamSimple(map, prefix + "SourceStorageType", this.SourceStorageType);
        this.setParamSimple(map, prefix + "SourceStorageAddress", this.SourceStorageAddress);
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "AutoRefresh", this.AutoRefresh);
        this.setParamSimple(map, prefix + "UserKafkaTopic", this.UserKafkaTopic);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AutoRefreshStatus", this.AutoRefreshStatus);
        this.setParamSimple(map, prefix + "AutoRefreshTime", this.AutoRefreshTime);

    }
}

