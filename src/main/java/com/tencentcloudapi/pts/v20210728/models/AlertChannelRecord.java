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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertChannelRecord extends AbstractModel {

    /**
    * Notice ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * Consumer ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AMPConsumerId")
    @Expose
    private String AMPConsumerId;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Status.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Create time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * App ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub account uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get Notice ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return NoticeId Notice ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Notice ID.

Note: This field may return null, indicating that no valid value is found.
     * @param NoticeId Notice ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get Consumer ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return AMPConsumerId Consumer ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getAMPConsumerId() {
        return this.AMPConsumerId;
    }

    /**
     * Set Consumer ID.

Note: This field may return null, indicating that no valid value is found.
     * @param AMPConsumerId Consumer ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAMPConsumerId(String AMPConsumerId) {
        this.AMPConsumerId = AMPConsumerId;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Status.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Status.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.

Note: This field may return null, indicating that no valid value is found.
     * @param Status Status.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Create time.

Note: This field may return null, indicating that no valid value is found. 
     * @return CreatedAt Create time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create time.

Note: This field may return null, indicating that no valid value is found.
     * @param CreatedAt Create time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time.

Note: This field may return null, indicating that no valid value is found. 
     * @return UpdatedAt Update time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.

Note: This field may return null, indicating that no valid value is found.
     * @param UpdatedAt Update time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get App ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return AppId App ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID.

Note: This field may return null, indicating that no valid value is found.
     * @param AppId App ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return Uin Account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account uin.

Note: This field may return null, indicating that no valid value is found.
     * @param Uin Account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub account uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     * @param SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    public AlertChannelRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertChannelRecord(AlertChannelRecord source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.AMPConsumerId != null) {
            this.AMPConsumerId = new String(source.AMPConsumerId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "AMPConsumerId", this.AMPConsumerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

