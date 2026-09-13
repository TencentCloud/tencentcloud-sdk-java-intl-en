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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGAuditDetailAppAuditInfo extends AbstractModel {

    /**
    * <p>Approval number.</p>
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * <p>Superapp ID.</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Superapp name.</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Superapp icon.</p>
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * <p>Approver.</p>
    */
    @SerializedName("AuditUser")
    @Expose
    private String AuditUser;

    /**
    * <p>Approval time.</p>
    */
    @SerializedName("AuditTime")
    @Expose
    private String AuditTime;

    /**
    * <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * <p>Approval note.</p>
    */
    @SerializedName("AuditNote")
    @Expose
    private String AuditNote;

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
     * Get <p>Approval number.</p> 
     * @return AuditNo <p>Approval number.</p>
     */
    public String getAuditNo() {
        return this.AuditNo;
    }

    /**
     * Set <p>Approval number.</p>
     * @param AuditNo <p>Approval number.</p>
     */
    public void setAuditNo(String AuditNo) {
        this.AuditNo = AuditNo;
    }

    /**
     * Get <p>Superapp ID.</p> 
     * @return ApplicationId <p>Superapp ID.</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID.</p>
     * @param ApplicationId <p>Superapp ID.</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Superapp name.</p> 
     * @return ApplicationName <p>Superapp name.</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name.</p>
     * @param ApplicationName <p>Superapp name.</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>Superapp icon.</p> 
     * @return ApplicationLogo <p>Superapp icon.</p>
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set <p>Superapp icon.</p>
     * @param ApplicationLogo <p>Superapp icon.</p>
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get <p>Approver.</p> 
     * @return AuditUser <p>Approver.</p>
     */
    public String getAuditUser() {
        return this.AuditUser;
    }

    /**
     * Set <p>Approver.</p>
     * @param AuditUser <p>Approver.</p>
     */
    public void setAuditUser(String AuditUser) {
        this.AuditUser = AuditUser;
    }

    /**
     * Get <p>Approval time.</p> 
     * @return AuditTime <p>Approval time.</p>
     */
    public String getAuditTime() {
        return this.AuditTime;
    }

    /**
     * Set <p>Approval time.</p>
     * @param AuditTime <p>Approval time.</p>
     */
    public void setAuditTime(String AuditTime) {
        this.AuditTime = AuditTime;
    }

    /**
     * Get <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p> 
     * @return AuditStatus <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     * @param AuditStatus <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get <p>Approval note.</p> 
     * @return AuditNote <p>Approval note.</p>
     */
    public String getAuditNote() {
        return this.AuditNote;
    }

    /**
     * Set <p>Approval note.</p>
     * @param AuditNote <p>Approval note.</p>
     */
    public void setAuditNote(String AuditNote) {
        this.AuditNote = AuditNote;
    }

    /**
     * Get <p>Team ID.</p> 
     * @return TeamId <p>Team ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Team ID.</p>
     * @param TeamId <p>Team ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Team name.</p> 
     * @return TeamName <p>Team name.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param TeamName <p>Team name.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    public DescribeMNGAuditDetailAppAuditInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGAuditDetailAppAuditInfo(DescribeMNGAuditDetailAppAuditInfo source) {
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationLogo != null) {
            this.ApplicationLogo = new String(source.ApplicationLogo);
        }
        if (source.AuditUser != null) {
            this.AuditUser = new String(source.AuditUser);
        }
        if (source.AuditTime != null) {
            this.AuditTime = new String(source.AuditTime);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.AuditNote != null) {
            this.AuditNote = new String(source.AuditNote);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationLogo", this.ApplicationLogo);
        this.setParamSimple(map, prefix + "AuditUser", this.AuditUser);
        this.setParamSimple(map, prefix + "AuditTime", this.AuditTime);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditNote", this.AuditNote);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);

    }
}

