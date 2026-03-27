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

public class DescribeStaffInfoListRequest extends AbstractModel {

    /**
    * <p>App ID (required). can check https://console.cloud.tencent.com/ccc</p>.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <P>Pagination size. upper limit: 9999.</p>.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <P>Page number, starting from 0.</p>.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <P>Agent account, used when query single agent.</p>.
    */
    @SerializedName("StaffMail")
    @Expose
    private String StaffMail;

    /**
    * <p>Use when querying for agents with modified time equal to or greater than ModifiedTime</p>.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * <p>Skill group ID</p>.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
     * Get <p>App ID (required). can check https://console.cloud.tencent.com/ccc</p>. 
     * @return SdkAppId <p>App ID (required). can check https://console.cloud.tencent.com/ccc</p>.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>App ID (required). can check https://console.cloud.tencent.com/ccc</p>.
     * @param SdkAppId <p>App ID (required). can check https://console.cloud.tencent.com/ccc</p>.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <P>Pagination size. upper limit: 9999.</p>. 
     * @return PageSize <P>Pagination size. upper limit: 9999.</p>.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <P>Pagination size. upper limit: 9999.</p>.
     * @param PageSize <P>Pagination size. upper limit: 9999.</p>.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <P>Page number, starting from 0.</p>. 
     * @return PageNumber <P>Page number, starting from 0.</p>.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <P>Page number, starting from 0.</p>.
     * @param PageNumber <P>Page number, starting from 0.</p>.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <P>Agent account, used when query single agent.</p>. 
     * @return StaffMail <P>Agent account, used when query single agent.</p>.
     */
    public String getStaffMail() {
        return this.StaffMail;
    }

    /**
     * Set <P>Agent account, used when query single agent.</p>.
     * @param StaffMail <P>Agent account, used when query single agent.</p>.
     */
    public void setStaffMail(String StaffMail) {
        this.StaffMail = StaffMail;
    }

    /**
     * Get <p>Use when querying for agents with modified time equal to or greater than ModifiedTime</p>. 
     * @return ModifiedTime <p>Use when querying for agents with modified time equal to or greater than ModifiedTime</p>.
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>Use when querying for agents with modified time equal to or greater than ModifiedTime</p>.
     * @param ModifiedTime <p>Use when querying for agents with modified time equal to or greater than ModifiedTime</p>.
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>Skill group ID</p>. 
     * @return SkillGroupId <p>Skill group ID</p>.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set <p>Skill group ID</p>.
     * @param SkillGroupId <p>Skill group ID</p>.
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

