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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseRecord extends AbstractModel {

    /**
    * Whether it can be exported
    */
    @SerializedName("CanExport")
    @Expose
    private Boolean CanExport;

    /**
    * Whether it can be rolled back
    */
    @SerializedName("CanRollback")
    @Expose
    private Boolean CanRollback;

    /**
    * Release description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of release failures
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Failure cause.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Release ID
    */
    @SerializedName("ReleaseId")
    @Expose
    private String ReleaseId;

    /**
    * Release version
    */
    @SerializedName("ReleaseVersion")
    @Expose
    private String ReleaseVersion;

    /**
    * Publishing status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Release success callback processing, 9: Release suspended, 10: Appeal under review, 11: Appeal review passed, 12: Appeal review not approved
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status description.
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * Number of successful releases
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Update time (Unix timestamp in seconds).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Releaser
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
     * Get Whether it can be exported 
     * @return CanExport Whether it can be exported
     */
    public Boolean getCanExport() {
        return this.CanExport;
    }

    /**
     * Set Whether it can be exported
     * @param CanExport Whether it can be exported
     */
    public void setCanExport(Boolean CanExport) {
        this.CanExport = CanExport;
    }

    /**
     * Get Whether it can be rolled back 
     * @return CanRollback Whether it can be rolled back
     */
    public Boolean getCanRollback() {
        return this.CanRollback;
    }

    /**
     * Set Whether it can be rolled back
     * @param CanRollback Whether it can be rolled back
     */
    public void setCanRollback(Boolean CanRollback) {
        this.CanRollback = CanRollback;
    }

    /**
     * Get Release description 
     * @return Description Release description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Release description
     * @param Description Release description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of release failures 
     * @return FailCount Number of release failures
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Number of release failures
     * @param FailCount Number of release failures
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Failure cause. 
     * @return Reason Failure cause.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Failure cause.
     * @param Reason Failure cause.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Release ID 
     * @return ReleaseId Release ID
     */
    public String getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set Release ID
     * @param ReleaseId Release ID
     */
    public void setReleaseId(String ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    /**
     * Get Release version 
     * @return ReleaseVersion Release version
     */
    public String getReleaseVersion() {
        return this.ReleaseVersion;
    }

    /**
     * Set Release version
     * @param ReleaseVersion Release version
     */
    public void setReleaseVersion(String ReleaseVersion) {
        this.ReleaseVersion = ReleaseVersion;
    }

    /**
     * Get Publishing status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Release success callback processing, 9: Release suspended, 10: Appeal under review, 11: Appeal review passed, 12: Appeal review not approved 
     * @return Status Publishing status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Release success callback processing, 9: Release suspended, 10: Appeal under review, 11: Appeal review passed, 12: Appeal review not approved
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Publishing status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Release success callback processing, 9: Release suspended, 10: Appeal under review, 11: Appeal review passed, 12: Appeal review not approved
     * @param Status Publishing status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Release success callback processing, 9: Release suspended, 10: Appeal under review, 11: Appeal review passed, 12: Appeal review not approved
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status description. 
     * @return StatusDescription Status description.
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set Status description.
     * @param StatusDescription Status description.
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get Number of successful releases 
     * @return SuccessCount Number of successful releases
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successful releases
     * @param SuccessCount Number of successful releases
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Update time (Unix timestamp in seconds). 
     * @return UpdateTime Update time (Unix timestamp in seconds).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time (Unix timestamp in seconds).
     * @param UpdateTime Update time (Unix timestamp in seconds).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Releaser 
     * @return Updater Releaser
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set Releaser
     * @param Updater Releaser
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    public ReleaseRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseRecord(ReleaseRecord source) {
        if (source.CanExport != null) {
            this.CanExport = new Boolean(source.CanExport);
        }
        if (source.CanRollback != null) {
            this.CanRollback = new Boolean(source.CanRollback);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ReleaseId != null) {
            this.ReleaseId = new String(source.ReleaseId);
        }
        if (source.ReleaseVersion != null) {
            this.ReleaseVersion = new String(source.ReleaseVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanExport", this.CanExport);
        this.setParamSimple(map, prefix + "CanRollback", this.CanRollback);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ReleaseId", this.ReleaseId);
        this.setParamSimple(map, prefix + "ReleaseVersion", this.ReleaseVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);

    }
}

