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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpandInstanceRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Expand storage nodes to how many nodes. If no change, pass the current number of nodes</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>Availability zone list</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>AZMode 3 means the primary AZ</p>
    */
    @SerializedName("PrimaryAZ")
    @Expose
    private String PrimaryAZ;

    /**
    * <p>Number of replicas, value ranges from 1 to 3</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Expand storage nodes to how many nodes. If no change, pass the current number of nodes</p> 
     * @return StorageNodeNum <p>Expand storage nodes to how many nodes. If no change, pass the current number of nodes</p>
     */
    public Long getStorageNodeNum() {
        return this.StorageNodeNum;
    }

    /**
     * Set <p>Expand storage nodes to how many nodes. If no change, pass the current number of nodes</p>
     * @param StorageNodeNum <p>Expand storage nodes to how many nodes. If no change, pass the current number of nodes</p>
     */
    public void setStorageNodeNum(Long StorageNodeNum) {
        this.StorageNodeNum = StorageNodeNum;
    }

    /**
     * Get <p>Availability zone list</p> 
     * @return Zones <p>Availability zone list</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>Availability zone list</p>
     * @param Zones <p>Availability zone list</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p> 
     * @return AZMode <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
     * @param AZMode <p>az mode. 1: Single az 2: Multi-az non-primary az mode 3: Multi-az primary az mode</p>
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>AZMode 3 means the primary AZ</p> 
     * @return PrimaryAZ <p>AZMode 3 means the primary AZ</p>
     */
    public String getPrimaryAZ() {
        return this.PrimaryAZ;
    }

    /**
     * Set <p>AZMode 3 means the primary AZ</p>
     * @param PrimaryAZ <p>AZMode 3 means the primary AZ</p>
     */
    public void setPrimaryAZ(String PrimaryAZ) {
        this.PrimaryAZ = PrimaryAZ;
    }

    /**
     * Get <p>Number of replicas, value ranges from 1 to 3</p> 
     * @return FullReplications <p>Number of replicas, value ranges from 1 to 3</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>Number of replicas, value ranges from 1 to 3</p>
     * @param FullReplications <p>Number of replicas, value ranges from 1 to 3</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    public ExpandInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpandInstanceRequest(ExpandInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.PrimaryAZ != null) {
            this.PrimaryAZ = new String(source.PrimaryAZ);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "PrimaryAZ", this.PrimaryAZ);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);

    }
}

