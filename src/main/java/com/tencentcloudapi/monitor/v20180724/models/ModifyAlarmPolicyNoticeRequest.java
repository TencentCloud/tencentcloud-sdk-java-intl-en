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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmPolicyNoticeRequest extends AbstractModel {

    /**
    * Module name, which is specified as `monitor`.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Alarm policy ID. If both `PolicyIds` and this parameter are returned, only `PolicyIds` takes effect.
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * List of alarm notification template IDs.
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * Alarm policy ID array, which can be used to associate notification templates with multiple alarm policies. Max value: 30.
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
    * Notification rules for different alarm levels
    */
    @SerializedName("HierarchicalNotices")
    @Expose
    private AlarmHierarchicalNotice [] HierarchicalNotices;

    /**
     * Get Module name, which is specified as `monitor`. 
     * @return Module Module name, which is specified as `monitor`.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name, which is specified as `monitor`.
     * @param Module Module name, which is specified as `monitor`.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Alarm policy ID. If both `PolicyIds` and this parameter are returned, only `PolicyIds` takes effect. 
     * @return PolicyId Alarm policy ID. If both `PolicyIds` and this parameter are returned, only `PolicyIds` takes effect.
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID. If both `PolicyIds` and this parameter are returned, only `PolicyIds` takes effect.
     * @param PolicyId Alarm policy ID. If both `PolicyIds` and this parameter are returned, only `PolicyIds` takes effect.
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get List of alarm notification template IDs. 
     * @return NoticeIds List of alarm notification template IDs.
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set List of alarm notification template IDs.
     * @param NoticeIds List of alarm notification template IDs.
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get Alarm policy ID array, which can be used to associate notification templates with multiple alarm policies. Max value: 30. 
     * @return PolicyIds Alarm policy ID array, which can be used to associate notification templates with multiple alarm policies. Max value: 30.
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set Alarm policy ID array, which can be used to associate notification templates with multiple alarm policies. Max value: 30.
     * @param PolicyIds Alarm policy ID array, which can be used to associate notification templates with multiple alarm policies. Max value: 30.
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get Notification rules for different alarm levels 
     * @return HierarchicalNotices Notification rules for different alarm levels
     */
    public AlarmHierarchicalNotice [] getHierarchicalNotices() {
        return this.HierarchicalNotices;
    }

    /**
     * Set Notification rules for different alarm levels
     * @param HierarchicalNotices Notification rules for different alarm levels
     */
    public void setHierarchicalNotices(AlarmHierarchicalNotice [] HierarchicalNotices) {
        this.HierarchicalNotices = HierarchicalNotices;
    }

    public ModifyAlarmPolicyNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmPolicyNoticeRequest(ModifyAlarmPolicyNoticeRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
        if (source.HierarchicalNotices != null) {
            this.HierarchicalNotices = new AlarmHierarchicalNotice[source.HierarchicalNotices.length];
            for (int i = 0; i < source.HierarchicalNotices.length; i++) {
                this.HierarchicalNotices[i] = new AlarmHierarchicalNotice(source.HierarchicalNotices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArrayObj(map, prefix + "HierarchicalNotices.", this.HierarchicalNotices);

    }
}

