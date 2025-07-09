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

public class BindStaffSkillGroupListRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Agent email.
    */
    @SerializedName("StaffEmail")
    @Expose
    private String StaffEmail;

    /**
    * Bound skill group list.
    */
    @SerializedName("SkillGroupList")
    @Expose
    private Long [] SkillGroupList;

    /**
    * Bound skill group list (required).
    */
    @SerializedName("StaffSkillGroupList")
    @Expose
    private StaffSkillGroupList [] StaffSkillGroupList;

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Agent email. 
     * @return StaffEmail Agent email.
     */
    public String getStaffEmail() {
        return this.StaffEmail;
    }

    /**
     * Set Agent email.
     * @param StaffEmail Agent email.
     */
    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    /**
     * Get Bound skill group list. 
     * @return SkillGroupList Bound skill group list.
     * @deprecated
     */
    @Deprecated
    public Long [] getSkillGroupList() {
        return this.SkillGroupList;
    }

    /**
     * Set Bound skill group list.
     * @param SkillGroupList Bound skill group list.
     * @deprecated
     */
    @Deprecated
    public void setSkillGroupList(Long [] SkillGroupList) {
        this.SkillGroupList = SkillGroupList;
    }

    /**
     * Get Bound skill group list (required). 
     * @return StaffSkillGroupList Bound skill group list (required).
     */
    public StaffSkillGroupList [] getStaffSkillGroupList() {
        return this.StaffSkillGroupList;
    }

    /**
     * Set Bound skill group list (required).
     * @param StaffSkillGroupList Bound skill group list (required).
     */
    public void setStaffSkillGroupList(StaffSkillGroupList [] StaffSkillGroupList) {
        this.StaffSkillGroupList = StaffSkillGroupList;
    }

    public BindStaffSkillGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindStaffSkillGroupListRequest(BindStaffSkillGroupListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StaffEmail != null) {
            this.StaffEmail = new String(source.StaffEmail);
        }
        if (source.SkillGroupList != null) {
            this.SkillGroupList = new Long[source.SkillGroupList.length];
            for (int i = 0; i < source.SkillGroupList.length; i++) {
                this.SkillGroupList[i] = new Long(source.SkillGroupList[i]);
            }
        }
        if (source.StaffSkillGroupList != null) {
            this.StaffSkillGroupList = new StaffSkillGroupList[source.StaffSkillGroupList.length];
            for (int i = 0; i < source.StaffSkillGroupList.length; i++) {
                this.StaffSkillGroupList[i] = new StaffSkillGroupList(source.StaffSkillGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StaffEmail", this.StaffEmail);
        this.setParamArraySimple(map, prefix + "SkillGroupList.", this.SkillGroupList);
        this.setParamArrayObj(map, prefix + "StaffSkillGroupList.", this.StaffSkillGroupList);

    }
}

