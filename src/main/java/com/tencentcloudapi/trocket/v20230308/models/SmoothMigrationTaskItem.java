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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmoothMigrationTaskItem extends AbstractModel {

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Source cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceClusterName")
    @Expose
    private String SourceClusterName;

    /**
    * Destination cluster instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the network connection type. 
PUBLIC network. 
Specifies the VPC virtual private cloud. 
OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * Source cluster NameServer address.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceNameServer")
    @Expose
    private String SourceNameServer;

    /**
    * Task status.
Migration Configuration. specifies the migration Configuration.
SourceConnecting specifies connecting to source cluster.
MetaDataImport specifies metadata import.
EndpointSetup specifies the access point switchover.
Service migration is in progress.
Completed.
Cancelled: canceled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Specifies the target cluster instance version.
4 indicates version 4.x.
5 indicates version 5.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Source cluster name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceClusterName Source cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceClusterName() {
        return this.SourceClusterName;
    }

    /**
     * Set Source cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceClusterName Source cluster name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceClusterName(String SourceClusterName) {
        this.SourceClusterName = SourceClusterName;
    }

    /**
     * Get Destination cluster instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Destination cluster instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Destination cluster instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Destination cluster instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the network connection type. 
PUBLIC network. 
Specifies the VPC virtual private cloud. 
OTHER.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConnectionType Specifies the network connection type. 
PUBLIC network. 
Specifies the VPC virtual private cloud. 
OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set Specifies the network connection type. 
PUBLIC network. 
Specifies the VPC virtual private cloud. 
OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConnectionType Specifies the network connection type. 
PUBLIC network. 
Specifies the VPC virtual private cloud. 
OTHER.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get Source cluster NameServer address.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceNameServer Source cluster NameServer address.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceNameServer() {
        return this.SourceNameServer;
    }

    /**
     * Set Source cluster NameServer address.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceNameServer Source cluster NameServer address.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceNameServer(String SourceNameServer) {
        this.SourceNameServer = SourceNameServer;
    }

    /**
     * Get Task status.
Migration Configuration. specifies the migration Configuration.
SourceConnecting specifies connecting to source cluster.
MetaDataImport specifies metadata import.
EndpointSetup specifies the access point switchover.
Service migration is in progress.
Completed.
Cancelled: canceled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus Task status.
Migration Configuration. specifies the migration Configuration.
SourceConnecting specifies connecting to source cluster.
MetaDataImport specifies metadata import.
EndpointSetup specifies the access point switchover.
Service migration is in progress.
Completed.
Cancelled: canceled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status.
Migration Configuration. specifies the migration Configuration.
SourceConnecting specifies connecting to source cluster.
MetaDataImport specifies metadata import.
EndpointSetup specifies the access point switchover.
Service migration is in progress.
Completed.
Cancelled: canceled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus Task status.
Migration Configuration. specifies the migration Configuration.
SourceConnecting specifies connecting to source cluster.
MetaDataImport specifies metadata import.
EndpointSetup specifies the access point switchover.
Service migration is in progress.
Completed.
Cancelled: canceled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Specifies the target cluster instance version.
4 indicates version 4.x.
5 indicates version 5.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceVersion Specifies the target cluster instance version.
4 indicates version 4.x.
5 indicates version 5.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Specifies the target cluster instance version.
4 indicates version 4.x.
5 indicates version 5.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceVersion Specifies the target cluster instance version.
4 indicates version 4.x.
5 indicates version 5.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    public SmoothMigrationTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmoothMigrationTaskItem(SmoothMigrationTaskItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceClusterName != null) {
            this.SourceClusterName = new String(source.SourceClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.SourceNameServer != null) {
            this.SourceNameServer = new String(source.SourceNameServer);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SourceClusterName", this.SourceClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SourceNameServer", this.SourceNameServer);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);

    }
}

