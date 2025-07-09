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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaseOverviewResponse extends AbstractModel {

    /**
    * Number of modules
    */
    @SerializedName("ModuleNum")
    @Expose
    private Long ModuleNum;

    /**
    * Number of nodes
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Number of CPU cores
    */
    @SerializedName("VcpuNum")
    @Expose
    private Long VcpuNum;

    /**
    * Memory size in GB
    */
    @SerializedName("MemoryNum")
    @Expose
    private Long MemoryNum;

    /**
    * Disk size in GB
    */
    @SerializedName("StorageNum")
    @Expose
    private Long StorageNum;

    /**
    * Yesterday's network peak in Mbps
    */
    @SerializedName("NetworkNum")
    @Expose
    private Long NetworkNum;

    /**
    * Number of instances
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * Number of running instances
    */
    @SerializedName("RunningNum")
    @Expose
    private Long RunningNum;

    /**
    * Number of isolated instances
    */
    @SerializedName("IsolationNum")
    @Expose
    private Long IsolationNum;

    /**
    * Number of expired instances
    */
    @SerializedName("ExpiredNum")
    @Expose
    private Long ExpiredNum;

    /**
    * Number of instances about to expire
    */
    @SerializedName("WillExpireNum")
    @Expose
    private Long WillExpireNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of modules 
     * @return ModuleNum Number of modules
     */
    public Long getModuleNum() {
        return this.ModuleNum;
    }

    /**
     * Set Number of modules
     * @param ModuleNum Number of modules
     */
    public void setModuleNum(Long ModuleNum) {
        this.ModuleNum = ModuleNum;
    }

    /**
     * Get Number of nodes 
     * @return NodeNum Number of nodes
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of nodes
     * @param NodeNum Number of nodes
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Number of CPU cores 
     * @return VcpuNum Number of CPU cores
     */
    public Long getVcpuNum() {
        return this.VcpuNum;
    }

    /**
     * Set Number of CPU cores
     * @param VcpuNum Number of CPU cores
     */
    public void setVcpuNum(Long VcpuNum) {
        this.VcpuNum = VcpuNum;
    }

    /**
     * Get Memory size in GB 
     * @return MemoryNum Memory size in GB
     */
    public Long getMemoryNum() {
        return this.MemoryNum;
    }

    /**
     * Set Memory size in GB
     * @param MemoryNum Memory size in GB
     */
    public void setMemoryNum(Long MemoryNum) {
        this.MemoryNum = MemoryNum;
    }

    /**
     * Get Disk size in GB 
     * @return StorageNum Disk size in GB
     */
    public Long getStorageNum() {
        return this.StorageNum;
    }

    /**
     * Set Disk size in GB
     * @param StorageNum Disk size in GB
     */
    public void setStorageNum(Long StorageNum) {
        this.StorageNum = StorageNum;
    }

    /**
     * Get Yesterday's network peak in Mbps 
     * @return NetworkNum Yesterday's network peak in Mbps
     */
    public Long getNetworkNum() {
        return this.NetworkNum;
    }

    /**
     * Set Yesterday's network peak in Mbps
     * @param NetworkNum Yesterday's network peak in Mbps
     */
    public void setNetworkNum(Long NetworkNum) {
        this.NetworkNum = NetworkNum;
    }

    /**
     * Get Number of instances 
     * @return InstanceNum Number of instances
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of instances
     * @param InstanceNum Number of instances
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get Number of running instances 
     * @return RunningNum Number of running instances
     */
    public Long getRunningNum() {
        return this.RunningNum;
    }

    /**
     * Set Number of running instances
     * @param RunningNum Number of running instances
     */
    public void setRunningNum(Long RunningNum) {
        this.RunningNum = RunningNum;
    }

    /**
     * Get Number of isolated instances 
     * @return IsolationNum Number of isolated instances
     */
    public Long getIsolationNum() {
        return this.IsolationNum;
    }

    /**
     * Set Number of isolated instances
     * @param IsolationNum Number of isolated instances
     */
    public void setIsolationNum(Long IsolationNum) {
        this.IsolationNum = IsolationNum;
    }

    /**
     * Get Number of expired instances 
     * @return ExpiredNum Number of expired instances
     */
    public Long getExpiredNum() {
        return this.ExpiredNum;
    }

    /**
     * Set Number of expired instances
     * @param ExpiredNum Number of expired instances
     */
    public void setExpiredNum(Long ExpiredNum) {
        this.ExpiredNum = ExpiredNum;
    }

    /**
     * Get Number of instances about to expire 
     * @return WillExpireNum Number of instances about to expire
     */
    public Long getWillExpireNum() {
        return this.WillExpireNum;
    }

    /**
     * Set Number of instances about to expire
     * @param WillExpireNum Number of instances about to expire
     */
    public void setWillExpireNum(Long WillExpireNum) {
        this.WillExpireNum = WillExpireNum;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBaseOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaseOverviewResponse(DescribeBaseOverviewResponse source) {
        if (source.ModuleNum != null) {
            this.ModuleNum = new Long(source.ModuleNum);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.VcpuNum != null) {
            this.VcpuNum = new Long(source.VcpuNum);
        }
        if (source.MemoryNum != null) {
            this.MemoryNum = new Long(source.MemoryNum);
        }
        if (source.StorageNum != null) {
            this.StorageNum = new Long(source.StorageNum);
        }
        if (source.NetworkNum != null) {
            this.NetworkNum = new Long(source.NetworkNum);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.RunningNum != null) {
            this.RunningNum = new Long(source.RunningNum);
        }
        if (source.IsolationNum != null) {
            this.IsolationNum = new Long(source.IsolationNum);
        }
        if (source.ExpiredNum != null) {
            this.ExpiredNum = new Long(source.ExpiredNum);
        }
        if (source.WillExpireNum != null) {
            this.WillExpireNum = new Long(source.WillExpireNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleNum", this.ModuleNum);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "VcpuNum", this.VcpuNum);
        this.setParamSimple(map, prefix + "MemoryNum", this.MemoryNum);
        this.setParamSimple(map, prefix + "StorageNum", this.StorageNum);
        this.setParamSimple(map, prefix + "NetworkNum", this.NetworkNum);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "RunningNum", this.RunningNum);
        this.setParamSimple(map, prefix + "IsolationNum", this.IsolationNum);
        this.setParamSimple(map, prefix + "ExpiredNum", this.ExpiredNum);
        this.setParamSimple(map, prefix + "WillExpireNum", this.WillExpireNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

