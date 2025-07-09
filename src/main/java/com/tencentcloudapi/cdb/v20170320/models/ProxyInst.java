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
    * Instance ID Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance type. Valid values:  `master` (source instance), `ro` (read-only instance), `dr` (disaster recovery instance), `sdr` (disaster recovery instance of small specifications). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Instance status. Valid values:  `0` (creating), `1` (running), `4` (isolating), `5` (isolated). Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Read weight. If it is assigned by the system automatically, the modification will not take effect but represents whether the instance is enabled. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Instance region Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Instance ID Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance type. Valid values:  `master` (source instance), `ro` (read-only instance), `dr` (disaster recovery instance), `sdr` (disaster recovery instance of small specifications). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type. Valid values:  `master` (source instance), `ro` (read-only instance), `dr` (disaster recovery instance), `sdr` (disaster recovery instance of small specifications). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values:  `master` (source instance), `ro` (read-only instance), `dr` (disaster recovery instance), `sdr` (disaster recovery instance of small specifications). Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance type. Valid values:  `master` (source instance), `ro` (read-only instance), `dr` (disaster recovery instance), `sdr` (disaster recovery instance of small specifications). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance status. Valid values:  `0` (creating), `1` (running), `4` (isolating), `5` (isolated). Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance status. Valid values:  `0` (creating), `1` (running), `4` (isolating), `5` (isolated). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values:  `0` (creating), `1` (running), `4` (isolating), `5` (isolated). Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance status. Valid values:  `0` (creating), `1` (running), `4` (isolating), `5` (isolated). Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Read weight. If it is assigned by the system automatically, the modification will not take effect but represents whether the instance is enabled. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Read weight. If it is assigned by the system automatically, the modification will not take effect but represents whether the instance is enabled. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Read weight. If it is assigned by the system automatically, the modification will not take effect but represents whether the instance is enabled. Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Read weight. If it is assigned by the system automatically, the modification will not take effect but represents whether the instance is enabled. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Instance region Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Instance region Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Instance region Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Instance AZ Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Instance AZ Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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

    }
}

