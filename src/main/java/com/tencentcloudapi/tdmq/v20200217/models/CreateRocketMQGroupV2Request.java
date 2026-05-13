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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQGroupV2Request extends AbstractModel {

    /**
    * consumer group name
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Namespace of the consumption group. The 4.x common Cluster Namespace is fixed as: tdmq_default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Enable consumption
    */
    @SerializedName("ReadEnable")
    @Expose
    private Boolean ReadEnable;

    /**
    * Enable broadcast consumption
    */
    @SerializedName("BroadcastEnable")
    @Expose
    private Boolean BroadcastEnable;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Group Type (TCP/HTTP)
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * Group Max Retry Count
    */
    @SerializedName("RetryMaxTimes")
    @Expose
    private Long RetryMaxTimes;

    /**
    * Tag list
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get consumer group name 
     * @return GroupId consumer group name
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set consumer group name
     * @param GroupId consumer group name
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Namespace of the consumption group. The 4.x common Cluster Namespace is fixed as: tdmq_default 
     * @return Namespace Namespace of the consumption group. The 4.x common Cluster Namespace is fixed as: tdmq_default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the consumption group. The 4.x common Cluster Namespace is fixed as: tdmq_default
     * @param Namespace Namespace of the consumption group. The 4.x common Cluster Namespace is fixed as: tdmq_default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Enable consumption 
     * @return ReadEnable Enable consumption
     */
    public Boolean getReadEnable() {
        return this.ReadEnable;
    }

    /**
     * Set Enable consumption
     * @param ReadEnable Enable consumption
     */
    public void setReadEnable(Boolean ReadEnable) {
        this.ReadEnable = ReadEnable;
    }

    /**
     * Get Enable broadcast consumption 
     * @return BroadcastEnable Enable broadcast consumption
     */
    public Boolean getBroadcastEnable() {
        return this.BroadcastEnable;
    }

    /**
     * Set Enable broadcast consumption
     * @param BroadcastEnable Enable broadcast consumption
     */
    public void setBroadcastEnable(Boolean BroadcastEnable) {
        this.BroadcastEnable = BroadcastEnable;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Group Type (TCP/HTTP) 
     * @return GroupType Group Type (TCP/HTTP)
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set Group Type (TCP/HTTP)
     * @param GroupType Group Type (TCP/HTTP)
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get Group Max Retry Count 
     * @return RetryMaxTimes Group Max Retry Count
     */
    public Long getRetryMaxTimes() {
        return this.RetryMaxTimes;
    }

    /**
     * Set Group Max Retry Count
     * @param RetryMaxTimes Group Max Retry Count
     */
    public void setRetryMaxTimes(Long RetryMaxTimes) {
        this.RetryMaxTimes = RetryMaxTimes;
    }

    /**
     * Get Tag list 
     * @return TagList Tag list
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag list
     * @param TagList Tag list
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateRocketMQGroupV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQGroupV2Request(CreateRocketMQGroupV2Request source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ReadEnable != null) {
            this.ReadEnable = new Boolean(source.ReadEnable);
        }
        if (source.BroadcastEnable != null) {
            this.BroadcastEnable = new Boolean(source.BroadcastEnable);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.RetryMaxTimes != null) {
            this.RetryMaxTimes = new Long(source.RetryMaxTimes);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ReadEnable", this.ReadEnable);
        this.setParamSimple(map, prefix + "BroadcastEnable", this.BroadcastEnable);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "RetryMaxTimes", this.RetryMaxTimes);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

