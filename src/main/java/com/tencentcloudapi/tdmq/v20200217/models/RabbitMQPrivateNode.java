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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQPrivateNode extends AbstractModel {

    /**
    * Node name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Node status
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("NodeStatus")
    @Expose
    private String NodeStatus;

    /**
    * CPU utilization
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CPUUsage")
    @Expose
    private String CPUUsage;

    /**
    * Memory usage in MB
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk utilization
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * The number of RabbitMQ Erlang processes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessNumber")
    @Expose
    private Long ProcessNumber;

    /**
     * Get Node name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeName Node name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeName Node name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Node status
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return NodeStatus Node status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getNodeStatus() {
        return this.NodeStatus;
    }

    /**
     * Set Node status
Note: This field may return null, indicating that no valid value can be obtained.
     * @param NodeStatus Node status
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setNodeStatus(String NodeStatus) {
        this.NodeStatus = NodeStatus;
    }

    /**
     * Get CPU utilization
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CPUUsage CPU utilization
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCPUUsage() {
        return this.CPUUsage;
    }

    /**
     * Set CPU utilization
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CPUUsage CPU utilization
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCPUUsage(String CPUUsage) {
        this.CPUUsage = CPUUsage;
    }

    /**
     * Get Memory usage in MB
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Memory Memory usage in MB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory usage in MB
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Memory Memory usage in MB
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk utilization
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DiskUsage Disk utilization
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Disk utilization
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DiskUsage Disk utilization
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get The number of RabbitMQ Erlang processes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessNumber The number of RabbitMQ Erlang processes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProcessNumber() {
        return this.ProcessNumber;
    }

    /**
     * Set The number of RabbitMQ Erlang processes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessNumber The number of RabbitMQ Erlang processes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessNumber(Long ProcessNumber) {
        this.ProcessNumber = ProcessNumber;
    }

    public RabbitMQPrivateNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQPrivateNode(RabbitMQPrivateNode source) {
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeStatus != null) {
            this.NodeStatus = new String(source.NodeStatus);
        }
        if (source.CPUUsage != null) {
            this.CPUUsage = new String(source.CPUUsage);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.ProcessNumber != null) {
            this.ProcessNumber = new Long(source.ProcessNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeStatus", this.NodeStatus);
        this.setParamSimple(map, prefix + "CPUUsage", this.CPUUsage);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "ProcessNumber", this.ProcessNumber);

    }
}

