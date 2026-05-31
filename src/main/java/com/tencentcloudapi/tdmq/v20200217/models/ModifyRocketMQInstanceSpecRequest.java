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
    * <p>Dedicated Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance specification,<br>rocket-vip-basic-1 basic<br>rocket-vip-basic-2 standard type<br>rocket-vip-basic-3 higher-order type I<br>rocket-vip-basic-4 higher-order type II</p>
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * <p>Node count</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>Storage space in GB</p>
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * <p>Deploy availability zone list</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
     * Get <p>Dedicated Instance ID</p> 
     * @return InstanceId <p>Dedicated Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Dedicated Instance ID</p>
     * @param InstanceId <p>Dedicated Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance specification,<br>rocket-vip-basic-1 basic<br>rocket-vip-basic-2 standard type<br>rocket-vip-basic-3 higher-order type I<br>rocket-vip-basic-4 higher-order type II</p> 
     * @return Specification <p>Instance specification,<br>rocket-vip-basic-1 basic<br>rocket-vip-basic-2 standard type<br>rocket-vip-basic-3 higher-order type I<br>rocket-vip-basic-4 higher-order type II</p>
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set <p>Instance specification,<br>rocket-vip-basic-1 basic<br>rocket-vip-basic-2 standard type<br>rocket-vip-basic-3 higher-order type I<br>rocket-vip-basic-4 higher-order type II</p>
     * @param Specification <p>Instance specification,<br>rocket-vip-basic-1 basic<br>rocket-vip-basic-2 standard type<br>rocket-vip-basic-3 higher-order type I<br>rocket-vip-basic-4 higher-order type II</p>
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get <p>Node count</p> 
     * @return NodeCount <p>Node count</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>Node count</p>
     * @param NodeCount <p>Node count</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>Storage space in GB</p> 
     * @return StorageSize <p>Storage space in GB</p>
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set <p>Storage space in GB</p>
     * @param StorageSize <p>Storage space in GB</p>
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get <p>Deploy availability zone list</p> 
     * @return ZoneIds <p>Deploy availability zone list</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Deploy availability zone list</p>
     * @param ZoneIds <p>Deploy availability zone list</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
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
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

