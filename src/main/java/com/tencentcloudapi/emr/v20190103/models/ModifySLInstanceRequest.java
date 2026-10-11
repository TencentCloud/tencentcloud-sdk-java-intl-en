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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySLInstanceRequest extends AbstractModel {

    /**
    * <p>Instance unique identifier (string).</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Name of the region to be changed.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Target number of nodes in this region after the configuration change. The total number of nodes in all regions should be greater than or equal to 3 and less than or equal to 50.</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Storage space size. It must be a multiple of 100 and cannot be smaller than the current storage space (only scale-out is allowed).</p><p>Unit: GB.</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get <p>Instance unique identifier (string).</p> 
     * @return InstanceId <p>Instance unique identifier (string).</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance unique identifier (string).</p>
     * @param InstanceId <p>Instance unique identifier (string).</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Name of the region to be changed.</p> 
     * @return Zone <p>Name of the region to be changed.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Name of the region to be changed.</p>
     * @param Zone <p>Name of the region to be changed.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Target number of nodes in this region after the configuration change. The total number of nodes in all regions should be greater than or equal to 3 and less than or equal to 50.</p> 
     * @return NodeNum <p>Target number of nodes in this region after the configuration change. The total number of nodes in all regions should be greater than or equal to 3 and less than or equal to 50.</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>Target number of nodes in this region after the configuration change. The total number of nodes in all regions should be greater than or equal to 3 and less than or equal to 50.</p>
     * @param NodeNum <p>Target number of nodes in this region after the configuration change. The total number of nodes in all regions should be greater than or equal to 3 and less than or equal to 50.</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p> 
     * @return ClientToken <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
     * @param ClientToken <p>Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Storage space size. It must be a multiple of 100 and cannot be smaller than the current storage space (only scale-out is allowed).</p><p>Unit: GB.</p> 
     * @return DiskSize <p>Storage space size. It must be a multiple of 100 and cannot be smaller than the current storage space (only scale-out is allowed).</p><p>Unit: GB.</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Storage space size. It must be a multiple of 100 and cannot be smaller than the current storage space (only scale-out is allowed).</p><p>Unit: GB.</p>
     * @param DiskSize <p>Storage space size. It must be a multiple of 100 and cannot be smaller than the current storage space (only scale-out is allowed).</p><p>Unit: GB.</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public ModifySLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySLInstanceRequest(ModifySLInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

