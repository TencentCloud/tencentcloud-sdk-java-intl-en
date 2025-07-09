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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceModifyDBInstanceSpecRequest extends AbstractModel {

    /**
    * Instance ID in the format of cmgo-p8vn****. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance memory size in GB after specification adjustment.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB after specification adjustment.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Number of instance nodes. The number of nodes is left unchanged by default and cannot be changed currently.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Number of instance shards. The number of shards is left unchanged by default and cannot be changed currently.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
     * Get Instance ID in the format of cmgo-p8vn****. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of cmgo-p8vn****. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cmgo-p8vn****. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of cmgo-p8vn****. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance memory size in GB after specification adjustment. 
     * @return Memory Instance memory size in GB after specification adjustment.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB after specification adjustment.
     * @param Memory Instance memory size in GB after specification adjustment.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB after specification adjustment. 
     * @return Volume Instance disk size in GB after specification adjustment.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in GB after specification adjustment.
     * @param Volume Instance disk size in GB after specification adjustment.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Number of instance nodes. The number of nodes is left unchanged by default and cannot be changed currently. 
     * @return NodeNum Number of instance nodes. The number of nodes is left unchanged by default and cannot be changed currently.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of instance nodes. The number of nodes is left unchanged by default and cannot be changed currently.
     * @param NodeNum Number of instance nodes. The number of nodes is left unchanged by default and cannot be changed currently.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Number of instance shards. The number of shards is left unchanged by default and cannot be changed currently. 
     * @return ReplicateSetNum Number of instance shards. The number of shards is left unchanged by default and cannot be changed currently.
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set Number of instance shards. The number of shards is left unchanged by default and cannot be changed currently.
     * @param ReplicateSetNum Number of instance shards. The number of shards is left unchanged by default and cannot be changed currently.
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    public InquirePriceModifyDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceModifyDBInstanceSpecRequest(InquirePriceModifyDBInstanceSpecRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);

    }
}

