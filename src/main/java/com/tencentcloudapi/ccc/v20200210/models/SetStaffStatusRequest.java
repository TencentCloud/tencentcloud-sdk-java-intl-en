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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetStaffStatusRequest extends AbstractModel {

    /**
    * App ID (required). can be checked at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Sets the agent status list. maximum number 10.
    */
    @SerializedName("StaffStatusList")
    @Expose
    private SetStaffStatusItem [] StaffStatusList;

    /**
     * Get App ID (required). can be checked at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId App ID (required). can be checked at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set App ID (required). can be checked at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId App ID (required). can be checked at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Sets the agent status list. maximum number 10. 
     * @return StaffStatusList Sets the agent status list. maximum number 10.
     */
    public SetStaffStatusItem [] getStaffStatusList() {
        return this.StaffStatusList;
    }

    /**
     * Set Sets the agent status list. maximum number 10.
     * @param StaffStatusList Sets the agent status list. maximum number 10.
     */
    public void setStaffStatusList(SetStaffStatusItem [] StaffStatusList) {
        this.StaffStatusList = StaffStatusList;
    }

    public SetStaffStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetStaffStatusRequest(SetStaffStatusRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StaffStatusList != null) {
            this.StaffStatusList = new SetStaffStatusItem[source.StaffStatusList.length];
            for (int i = 0; i < source.StaffStatusList.length; i++) {
                this.StaffStatusList[i] = new SetStaffStatusItem(source.StaffStatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "StaffStatusList.", this.StaffStatusList);

    }
}

