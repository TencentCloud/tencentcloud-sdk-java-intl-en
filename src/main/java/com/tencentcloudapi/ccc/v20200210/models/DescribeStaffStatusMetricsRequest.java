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

public class DescribeStaffStatusMetricsRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Filter agent list. By default, do not pass all returned agent information.
    */
    @SerializedName("StaffList")
    @Expose
    private String [] StaffList;

    /**
    * Filter skill group ID list.
    */
    @SerializedName("GroupIdList")
    @Expose
    private Long [] GroupIdList;

    /**
    * Filter agent status list Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

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
     * Get Filter agent list. By default, do not pass all returned agent information. 
     * @return StaffList Filter agent list. By default, do not pass all returned agent information.
     */
    public String [] getStaffList() {
        return this.StaffList;
    }

    /**
     * Set Filter agent list. By default, do not pass all returned agent information.
     * @param StaffList Filter agent list. By default, do not pass all returned agent information.
     */
    public void setStaffList(String [] StaffList) {
        this.StaffList = StaffList;
    }

    /**
     * Get Filter skill group ID list. 
     * @return GroupIdList Filter skill group ID list.
     */
    public Long [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * Set Filter skill group ID list.
     * @param GroupIdList Filter skill group ID list.
     */
    public void setGroupIdList(Long [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    /**
     * Get Filter agent status list Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline 
     * @return StatusList Filter agent status list Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Filter agent status list Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
     * @param StatusList Filter agent status list Agent status free Available | busy Busy | rest On Break | notReady Not Ready | afterCallWork Post-call Adjustment | offline Offline
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    public DescribeStaffStatusMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStaffStatusMetricsRequest(DescribeStaffStatusMetricsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StaffList != null) {
            this.StaffList = new String[source.StaffList.length];
            for (int i = 0; i < source.StaffList.length; i++) {
                this.StaffList[i] = new String(source.StaffList[i]);
            }
        }
        if (source.GroupIdList != null) {
            this.GroupIdList = new Long[source.GroupIdList.length];
            for (int i = 0; i < source.GroupIdList.length; i++) {
                this.GroupIdList[i] = new Long(source.GroupIdList[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "StaffList.", this.StaffList);
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}

