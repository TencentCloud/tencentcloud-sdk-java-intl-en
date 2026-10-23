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

public class DescribeChangedParamsAfterUpgradeRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CPU after configuration change
    */
    @SerializedName("DstCpu")
    @Expose
    private Long DstCpu;

    /**
    * MEM after specification modification, in GB
    */
    @SerializedName("DstMem")
    @Expose
    private Long DstMem;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CPU after configuration change 
     * @return DstCpu CPU after configuration change
     */
    public Long getDstCpu() {
        return this.DstCpu;
    }

    /**
     * Set CPU after configuration change
     * @param DstCpu CPU after configuration change
     */
    public void setDstCpu(Long DstCpu) {
        this.DstCpu = DstCpu;
    }

    /**
     * Get MEM after specification modification, in GB 
     * @return DstMem MEM after specification modification, in GB
     */
    public Long getDstMem() {
        return this.DstMem;
    }

    /**
     * Set MEM after specification modification, in GB
     * @param DstMem MEM after specification modification, in GB
     */
    public void setDstMem(Long DstMem) {
        this.DstMem = DstMem;
    }

    public DescribeChangedParamsAfterUpgradeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChangedParamsAfterUpgradeRequest(DescribeChangedParamsAfterUpgradeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstCpu != null) {
            this.DstCpu = new Long(source.DstCpu);
        }
        if (source.DstMem != null) {
            this.DstMem = new Long(source.DstMem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstCpu", this.DstCpu);
        this.setParamSimple(map, prefix + "DstMem", this.DstMem);

    }
}

