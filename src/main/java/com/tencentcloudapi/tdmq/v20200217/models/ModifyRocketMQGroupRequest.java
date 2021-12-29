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

public class ModifyRocketMQGroupRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Consumer group name
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Remarks (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get Namespace 
     * @return NamespaceId Namespace
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace
     * @param NamespaceId Namespace
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Consumer group name 
     * @return GroupId Consumer group name
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Consumer group name
     * @param GroupId Consumer group name
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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

    public ModifyRocketMQGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQGroupRequest(ModifyRocketMQGroupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReadEnable != null) {
            this.ReadEnable = new Boolean(source.ReadEnable);
        }
        if (source.BroadcastEnable != null) {
            this.BroadcastEnable = new Boolean(source.BroadcastEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReadEnable", this.ReadEnable);
        this.setParamSimple(map, prefix + "BroadcastEnable", this.BroadcastEnable);

    }
}

