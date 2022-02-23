/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RumInstanceInfo extends AbstractModel{

    /**
    * Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: deleted)
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Region ID
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * Instance description
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * Billing status (1: in use; 2: expired; 3: terminated; 4: assigning; 5: assignment failed)
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * Billing type (1: free; 2: prepaid; 3: postpaid)
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Update time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Data retention period (in days)
    */
    @SerializedName("DataRetentionDays")
    @Expose
    private Long DataRetentionDays;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: deleted) 
     * @return InstanceStatus Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: deleted)
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: deleted)
     * @param InstanceStatus Instance status (1: creating; 2: running; 3: exceptional; 4: restarting; 5: stopping; 6: stopped; 7: deleted)
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Region ID 
     * @return AreaId Region ID
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set Region ID
     * @param AreaId Region ID
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance description 
     * @return InstanceDesc Instance description
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set Instance description
     * @param InstanceDesc Instance description
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get Billing status (1: in use; 2: expired; 3: terminated; 4: assigning; 5: assignment failed) 
     * @return ChargeStatus Billing status (1: in use; 2: expired; 3: terminated; 4: assigning; 5: assignment failed)
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set Billing status (1: in use; 2: expired; 3: terminated; 4: assigning; 5: assignment failed)
     * @param ChargeStatus Billing status (1: in use; 2: expired; 3: terminated; 4: assigning; 5: assignment failed)
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get Billing type (1: free; 2: prepaid; 3: postpaid) 
     * @return ChargeType Billing type (1: free; 2: prepaid; 3: postpaid)
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type (1: free; 2: prepaid; 3: postpaid)
     * @param ChargeType Billing type (1: free; 2: prepaid; 3: postpaid)
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Update time 
     * @return UpdatedAt Update time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time
     * @param UpdatedAt Update time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Data retention period (in days) 
     * @return DataRetentionDays Data retention period (in days)
     */
    public Long getDataRetentionDays() {
        return this.DataRetentionDays;
    }

    /**
     * Set Data retention period (in days)
     * @param DataRetentionDays Data retention period (in days)
     */
    public void setDataRetentionDays(Long DataRetentionDays) {
        this.DataRetentionDays = DataRetentionDays;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public RumInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RumInstanceInfo(RumInstanceInfo source) {
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.DataRetentionDays != null) {
            this.DataRetentionDays = new Long(source.DataRetentionDays);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "DataRetentionDays", this.DataRetentionDays);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

