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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancePreRequest extends AbstractModel {

    /**
    * Instance name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Estimated disk capacity, which can be increased by increment.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Estimated bandwidth, which can be increased by increment.
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * Estimated partition count, which can be increased by increment.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get Instance name. 
     * @return InstanceId Instance name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name.
     * @param InstanceId Instance name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Estimated disk capacity, which can be increased by increment. 
     * @return DiskSize Estimated disk capacity, which can be increased by increment.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Estimated disk capacity, which can be increased by increment.
     * @param DiskSize Estimated disk capacity, which can be increased by increment.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Estimated bandwidth, which can be increased by increment. 
     * @return BandWidth Estimated bandwidth, which can be increased by increment.
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set Estimated bandwidth, which can be increased by increment.
     * @param BandWidth Estimated bandwidth, which can be increased by increment.
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get Estimated partition count, which can be increased by increment. 
     * @return Partition Estimated partition count, which can be increased by increment.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Estimated partition count, which can be increased by increment.
     * @param Partition Estimated partition count, which can be increased by increment.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public ModifyInstancePreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePreRequest(ModifyInstancePreRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

