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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraDBNodeInfo extends AbstractModel {

    /**
    * LibraDB Node ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * syncing data
    */
    @SerializedName("DataStatus")
    @Expose
    private String DataStatus;

    /**
    * Number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size. Unit: GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk size, in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Error message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get LibraDB Node ID 
     * @return NodeId LibraDB Node ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set LibraDB Node ID
     * @param NodeId LibraDB Node ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node status 
     * @return Status Node status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Node status
     * @param Status Node status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get syncing data 
     * @return DataStatus syncing data
     */
    public String getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set syncing data
     * @param DataStatus syncing data
     */
    public void setDataStatus(String DataStatus) {
        this.DataStatus = DataStatus;
    }

    /**
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size. Unit: GB. 
     * @return Memory Memory size. Unit: GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size. Unit: GB.
     * @param Memory Memory size. Unit: GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk size, in GB 
     * @return Storage Disk size, in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Disk size, in GB
     * @param Storage Disk size, in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Error message 
     * @return Message Error message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message
     * @param Message Error message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public LibraDBNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBNodeInfo(LibraDBNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DataStatus != null) {
            this.DataStatus = new String(source.DataStatus);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DataStatus", this.DataStatus);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

