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

public class ModifyRocketMQInstanceSpecRequest extends AbstractModel {

    /**
    * ID of the exclusive instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance specification.
Valid values: `rocket-vip-basic-1` (Basic),
`rocket-vip-basic-2` (Standard),
`rocket-vip-basic-3` (Advanced I),
`rocket-vip-basic-4` (Advanced II).
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * Node count
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Storage space in GB
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
     * Get ID of the exclusive instance 
     * @return InstanceId ID of the exclusive instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the exclusive instance
     * @param InstanceId ID of the exclusive instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance specification.
Valid values: `rocket-vip-basic-1` (Basic),
`rocket-vip-basic-2` (Standard),
`rocket-vip-basic-3` (Advanced I),
`rocket-vip-basic-4` (Advanced II). 
     * @return Specification Instance specification.
Valid values: `rocket-vip-basic-1` (Basic),
`rocket-vip-basic-2` (Standard),
`rocket-vip-basic-3` (Advanced I),
`rocket-vip-basic-4` (Advanced II).
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set Instance specification.
Valid values: `rocket-vip-basic-1` (Basic),
`rocket-vip-basic-2` (Standard),
`rocket-vip-basic-3` (Advanced I),
`rocket-vip-basic-4` (Advanced II).
     * @param Specification Instance specification.
Valid values: `rocket-vip-basic-1` (Basic),
`rocket-vip-basic-2` (Standard),
`rocket-vip-basic-3` (Advanced I),
`rocket-vip-basic-4` (Advanced II).
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get Node count 
     * @return NodeCount Node count
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Node count
     * @param NodeCount Node count
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Storage space in GB 
     * @return StorageSize Storage space in GB
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Storage space in GB
     * @param StorageSize Storage space in GB
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    public ModifyRocketMQInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQInstanceSpecRequest(ModifyRocketMQInstanceSpecRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);

    }
}

