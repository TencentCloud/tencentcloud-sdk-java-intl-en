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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQGroupRequest extends AbstractModel{

    /**
    * Group name (8–64 characters)
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Namespace. Currently, only one namespace is supported
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * Whether to enable consumption
    */
    @SerializedName("ReadEnable")
    @Expose
    private Boolean ReadEnable;

    /**
    * Whether to enable broadcast consumption
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
    * Remarks (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Group type (`TCP`, `HTTP`)
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * The maximum number of retries for a group
    */
    @SerializedName("RetryMaxTimes")
    @Expose
    private Long RetryMaxTimes;

    /**
     * Get Group name (8–64 characters) 
     * @return GroupId Group name (8–64 characters)
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group name (8–64 characters)
     * @param GroupId Group name (8–64 characters)
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Namespace. Currently, only one namespace is supported 
     * @return Namespaces Namespace. Currently, only one namespace is supported
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set Namespace. Currently, only one namespace is supported
     * @param Namespaces Namespace. Currently, only one namespace is supported
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get Whether to enable consumption 
     * @return ReadEnable Whether to enable consumption
     */
    public Boolean getReadEnable() {
        return this.ReadEnable;
    }

    /**
     * Set Whether to enable consumption
     * @param ReadEnable Whether to enable consumption
     */
    public void setReadEnable(Boolean ReadEnable) {
        this.ReadEnable = ReadEnable;
    }

    /**
     * Get Whether to enable broadcast consumption 
     * @return BroadcastEnable Whether to enable broadcast consumption
     */
    public Boolean getBroadcastEnable() {
        return this.BroadcastEnable;
    }

    /**
     * Set Whether to enable broadcast consumption
     * @param BroadcastEnable Whether to enable broadcast consumption
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
     * Get Remarks (up to 128 characters) 
     * @return Remark Remarks (up to 128 characters)
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters)
     * @param Remark Remarks (up to 128 characters)
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Group type (`TCP`, `HTTP`) 
     * @return GroupType Group type (`TCP`, `HTTP`)
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set Group type (`TCP`, `HTTP`)
     * @param GroupType Group type (`TCP`, `HTTP`)
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get The maximum number of retries for a group 
     * @return RetryMaxTimes The maximum number of retries for a group
     */
    public Long getRetryMaxTimes() {
        return this.RetryMaxTimes;
    }

    /**
     * Set The maximum number of retries for a group
     * @param RetryMaxTimes The maximum number of retries for a group
     */
    public void setRetryMaxTimes(Long RetryMaxTimes) {
        this.RetryMaxTimes = RetryMaxTimes;
    }

    public CreateRocketMQGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQGroupRequest(CreateRocketMQGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "ReadEnable", this.ReadEnable);
        this.setParamSimple(map, prefix + "BroadcastEnable", this.BroadcastEnable);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "RetryMaxTimes", this.RetryMaxTimes);

    }
}

