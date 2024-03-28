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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallInMetricsRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Whether to return skill group dimension information or not (the default is "Yes").
    */
    @SerializedName("EnabledSkillGroup")
    @Expose
    private Boolean EnabledSkillGroup;

    /**
    * Whether to return line dimension information or not (the default is "No").
    */
    @SerializedName("EnabledNumber")
    @Expose
    private Boolean EnabledNumber;

    /**
    * Filter skill group list.
    */
    @SerializedName("GroupIdList")
    @Expose
    private Long [] GroupIdList;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Whether to return skill group dimension information or not (the default is "Yes"). 
     * @return EnabledSkillGroup Whether to return skill group dimension information or not (the default is "Yes").
     */
    public Boolean getEnabledSkillGroup() {
        return this.EnabledSkillGroup;
    }

    /**
     * Set Whether to return skill group dimension information or not (the default is "Yes").
     * @param EnabledSkillGroup Whether to return skill group dimension information or not (the default is "Yes").
     */
    public void setEnabledSkillGroup(Boolean EnabledSkillGroup) {
        this.EnabledSkillGroup = EnabledSkillGroup;
    }

    /**
     * Get Whether to return line dimension information or not (the default is "No"). 
     * @return EnabledNumber Whether to return line dimension information or not (the default is "No").
     */
    public Boolean getEnabledNumber() {
        return this.EnabledNumber;
    }

    /**
     * Set Whether to return line dimension information or not (the default is "No").
     * @param EnabledNumber Whether to return line dimension information or not (the default is "No").
     */
    public void setEnabledNumber(Boolean EnabledNumber) {
        this.EnabledNumber = EnabledNumber;
    }

    /**
     * Get Filter skill group list. 
     * @return GroupIdList Filter skill group list.
     */
    public Long [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * Set Filter skill group list.
     * @param GroupIdList Filter skill group list.
     */
    public void setGroupIdList(Long [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    public DescribeCallInMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallInMetricsRequest(DescribeCallInMetricsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.EnabledSkillGroup != null) {
            this.EnabledSkillGroup = new Boolean(source.EnabledSkillGroup);
        }
        if (source.EnabledNumber != null) {
            this.EnabledNumber = new Boolean(source.EnabledNumber);
        }
        if (source.GroupIdList != null) {
            this.GroupIdList = new Long[source.GroupIdList.length];
            for (int i = 0; i < source.GroupIdList.length; i++) {
                this.GroupIdList[i] = new Long(source.GroupIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "EnabledSkillGroup", this.EnabledSkillGroup);
        this.setParamSimple(map, prefix + "EnabledNumber", this.EnabledNumber);
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);

    }
}

