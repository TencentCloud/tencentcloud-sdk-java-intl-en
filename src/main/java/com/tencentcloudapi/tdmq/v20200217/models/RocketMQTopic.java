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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQTopic extends AbstractModel {

    /**
    * Topic name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Topic type. Enumerated values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`, `Retry`, and `DeadLetter`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The number of subscription groups
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * Description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * The number of read/write partitions.
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Creation time in milliseconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Creation time in milliseconds.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Topic name. 
     * @return Name Topic name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Topic name.
     * @param Name Topic name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Topic type. Enumerated values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`, `Retry`, and `DeadLetter`. 
     * @return Type Topic type. Enumerated values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`, `Retry`, and `DeadLetter`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Topic type. Enumerated values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`, `Retry`, and `DeadLetter`.
     * @param Type Topic type. Enumerated values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`, `Retry`, and `DeadLetter`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The number of subscription groups 
     * @return GroupNum The number of subscription groups
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set The number of subscription groups
     * @param GroupNum The number of subscription groups
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get Description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get The number of read/write partitions. 
     * @return PartitionNum The number of read/write partitions.
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set The number of read/write partitions.
     * @param PartitionNum The number of read/write partitions.
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Creation time in milliseconds. 
     * @return CreateTime Creation time in milliseconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in milliseconds.
     * @param CreateTime Creation time in milliseconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creation time in milliseconds. 
     * @return UpdateTime Creation time in milliseconds.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Creation time in milliseconds.
     * @param UpdateTime Creation time in milliseconds.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RocketMQTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQTopic(RocketMQTopic source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

