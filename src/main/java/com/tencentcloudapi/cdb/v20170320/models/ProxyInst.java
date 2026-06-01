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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyInst extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance type: 1 master primary instance; 2 read-only instance; 3 dr disaster recovery instance; 4 sdr (small disaster recovery) instance
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance status. Valid values: 0: creating; 1: running; 4: isolation; 5: isolated.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Read-only weight. If the weight is automatically assigned by the system, this value does not take effect and only indicates whether the instance is enabled or not.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Availability zone to which the instance belongs
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance Node ID
    */
    @SerializedName("InstNodeId")
    @Expose
    private String InstNodeId;

    /**
    * Node role
    */
    @SerializedName("InstNodeRole")
    @Expose
    private String InstNodeRole;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance type: 1 master primary instance; 2 read-only instance; 3 dr disaster recovery instance; 4 sdr (small disaster recovery) instance 
     * @return InstanceType Instance type: 1 master primary instance; 2 read-only instance; 3 dr disaster recovery instance; 4 sdr (small disaster recovery) instance
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type: 1 master primary instance; 2 read-only instance; 3 dr disaster recovery instance; 4 sdr (small disaster recovery) instance
     * @param InstanceType Instance type: 1 master primary instance; 2 read-only instance; 3 dr disaster recovery instance; 4 sdr (small disaster recovery) instance
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance status. Valid values: 0: creating; 1: running; 4: isolation; 5: isolated. 
     * @return Status Instance status. Valid values: 0: creating; 1: running; 4: isolation; 5: isolated.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: 0: creating; 1: running; 4: isolation; 5: isolated.
     * @param Status Instance status. Valid values: 0: creating; 1: running; 4: isolation; 5: isolated.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Read-only weight. If the weight is automatically assigned by the system, this value does not take effect and only indicates whether the instance is enabled or not. 
     * @return Weight Read-only weight. If the weight is automatically assigned by the system, this value does not take effect and only indicates whether the instance is enabled or not.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Read-only weight. If the weight is automatically assigned by the system, this value does not take effect and only indicates whether the instance is enabled or not.
     * @param Weight Read-only weight. If the weight is automatically assigned by the system, this value does not take effect and only indicates whether the instance is enabled or not.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Instance region 
     * @return Region Instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
     * @param Region Instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Availability zone to which the instance belongs 
     * @return Zone Availability zone to which the instance belongs
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone to which the instance belongs
     * @param Zone Availability zone to which the instance belongs
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance Node ID 
     * @return InstNodeId Instance Node ID
     */
    public String getInstNodeId() {
        return this.InstNodeId;
    }

    /**
     * Set Instance Node ID
     * @param InstNodeId Instance Node ID
     */
    public void setInstNodeId(String InstNodeId) {
        this.InstNodeId = InstNodeId;
    }

    /**
     * Get Node role 
     * @return InstNodeRole Node role
     */
    public String getInstNodeRole() {
        return this.InstNodeRole;
    }

    /**
     * Set Node role
     * @param InstNodeRole Node role
     */
    public void setInstNodeRole(String InstNodeRole) {
        this.InstNodeRole = InstNodeRole;
    }

    public ProxyInst() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyInst(ProxyInst source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstNodeId != null) {
            this.InstNodeId = new String(source.InstNodeId);
        }
        if (source.InstNodeRole != null) {
            this.InstNodeRole = new String(source.InstNodeRole);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstNodeId", this.InstNodeId);
        this.setParamSimple(map, prefix + "InstNodeRole", this.InstNodeRole);

    }
}

