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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Project ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Instance status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Substatus of the instance in process returned.</p><p>Enumeration value:</p><ul><li>0: Read-only disk.</li></ul>
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Zone</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Degradation policy, measurement unit: ms. After the instance P99 reaches the degradation policy, audit data is automatically discarded to prioritize business availability. Default value: 500 ms. Range value: 300-1000 ms.</p>
    */
    @SerializedName("DegradeStrategy")
    @Expose
    private Long DegradeStrategy;

    /**
    * <p>Tag information</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>Architecture edition</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Project ID</p> 
     * @return ProjectId <p>Project ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
     * @param ProjectId <p>Project ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Instance status 
     * @return Status <p>Instance status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status
     * @param Status <p>Instance status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Substatus of the instance in process returned.</p><p>Enumeration value:</p><ul><li>0: Read-only disk.</li></ul> 
     * @return SubStatus <p>Substatus of the instance in process returned.</p><p>Enumeration value:</p><ul><li>0: Read-only disk.</li></ul>
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>Substatus of the instance in process returned.</p><p>Enumeration value:</p><ul><li>0: Read-only disk.</li></ul>
     * @param SubStatus <p>Substatus of the instance in process returned.</p><p>Enumeration value:</p><ul><li>0: Read-only disk.</li></ul>
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Zone</p> 
     * @return Zone <p>Zone</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Zone</p>
     * @param Zone <p>Zone</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Degradation policy, measurement unit: ms. After the instance P99 reaches the degradation policy, audit data is automatically discarded to prioritize business availability. Default value: 500 ms. Range value: 300-1000 ms.</p> 
     * @return DegradeStrategy <p>Degradation policy, measurement unit: ms. After the instance P99 reaches the degradation policy, audit data is automatically discarded to prioritize business availability. Default value: 500 ms. Range value: 300-1000 ms.</p>
     */
    public Long getDegradeStrategy() {
        return this.DegradeStrategy;
    }

    /**
     * Set <p>Degradation policy, measurement unit: ms. After the instance P99 reaches the degradation policy, audit data is automatically discarded to prioritize business availability. Default value: 500 ms. Range value: 300-1000 ms.</p>
     * @param DegradeStrategy <p>Degradation policy, measurement unit: ms. After the instance P99 reaches the degradation policy, audit data is automatically discarded to prioritize business availability. Default value: 500 ms. Range value: 300-1000 ms.</p>
     */
    public void setDegradeStrategy(Long DegradeStrategy) {
        this.DegradeStrategy = DegradeStrategy;
    }

    /**
     * Get <p>Tag information</p> 
     * @return InstanceTags <p>Tag information</p>
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>Tag information</p>
     * @param InstanceTags <p>Tag information</p>
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>Architecture edition</p> 
     * @return Type <p>Architecture edition</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Architecture edition</p>
     * @param Type <p>Architecture edition</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DegradeStrategy != null) {
            this.DegradeStrategy = new Long(source.DegradeStrategy);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DegradeStrategy", this.DegradeStrategy);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

