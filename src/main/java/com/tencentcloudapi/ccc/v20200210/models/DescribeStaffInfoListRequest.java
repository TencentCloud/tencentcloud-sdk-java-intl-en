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

public class DescribeStaffInfoListRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Page size, upper limit 9,999
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number starting from 0.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Agent account used when querying a single agent.
    */
    @SerializedName("StaffMail")
    @Expose
    private String StaffMail;

    /**
    * Use when querying for agents with a modification time greater or equal to ModifiedTime.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * Skill group ID.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

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
     * Get Page size, upper limit 9,999 
     * @return PageSize Page size, upper limit 9,999
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size, upper limit 9,999
     * @param PageSize Page size, upper limit 9,999
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number starting from 0. 
     * @return PageNumber Page number starting from 0.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number starting from 0.
     * @param PageNumber Page number starting from 0.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Agent account used when querying a single agent. 
     * @return StaffMail Agent account used when querying a single agent.
     */
    public String getStaffMail() {
        return this.StaffMail;
    }

    /**
     * Set Agent account used when querying a single agent.
     * @param StaffMail Agent account used when querying a single agent.
     */
    public void setStaffMail(String StaffMail) {
        this.StaffMail = StaffMail;
    }

    /**
     * Get Use when querying for agents with a modification time greater or equal to ModifiedTime. 
     * @return ModifiedTime Use when querying for agents with a modification time greater or equal to ModifiedTime.
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Use when querying for agents with a modification time greater or equal to ModifiedTime.
     * @param ModifiedTime Use when querying for agents with a modification time greater or equal to ModifiedTime.
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Skill group ID. 
     * @return SkillGroupId Skill group ID.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group ID.
     * @param SkillGroupId Skill group ID.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    public DescribeStaffInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStaffInfoListRequest(DescribeStaffInfoListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.StaffMail != null) {
            this.StaffMail = new String(source.StaffMail);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "StaffMail", this.StaffMail);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);

    }
}

