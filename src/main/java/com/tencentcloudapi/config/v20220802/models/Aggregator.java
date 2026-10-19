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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Aggregator extends AbstractModel {

    /**
    * Account group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Account group description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creator user ID.
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Number of account group members.
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * RD: global account group.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Account group ID.
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * Account group status.
    */
    @SerializedName("AggregatorStatus")
    @Expose
    private Long AggregatorStatus;

    /**
    * Account group name
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
     * Get Account group name 
     * @return Name Account group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account group name
     * @param Name Account group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Account group description 
     * @return Description Account group description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Account group description
     * @param Description Account group description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creator user ID. 
     * @return OwnerUin Creator user ID.
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Creator user ID.
     * @param OwnerUin Creator user ID.
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Number of account group members. 
     * @return AccountCount Number of account group members.
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set Number of account group members.
     * @param AccountCount Number of account group members.
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get RD: global account group. 
     * @return Type RD: global account group.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set RD: global account group.
     * @param Type RD: global account group.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Account group ID. 
     * @return AccountGroupId Account group ID.
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set Account group ID.
     * @param AccountGroupId Account group ID.
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get Account group status. 
     * @return AggregatorStatus Account group status.
     */
    public Long getAggregatorStatus() {
        return this.AggregatorStatus;
    }

    /**
     * Set Account group status.
     * @param AggregatorStatus Account group status.
     */
    public void setAggregatorStatus(Long AggregatorStatus) {
        this.AggregatorStatus = AggregatorStatus;
    }

    /**
     * Get Account group name 
     * @return MemberName Account group name
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set Account group name
     * @param MemberName Account group name
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public Aggregator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Aggregator(Aggregator source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.AggregatorStatus != null) {
            this.AggregatorStatus = new Long(source.AggregatorStatus);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "AggregatorStatus", this.AggregatorStatus);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);

    }
}

