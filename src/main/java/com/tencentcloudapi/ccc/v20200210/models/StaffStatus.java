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

public class StaffStatus extends AbstractModel {

    /**
    * Specifies the cursor used for querying in pagination scenarios.
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * Status timestamp. Unix second-level timestamp.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Agent status free | busy | rest | notReady | afterCallWork | offline.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Specifies the session Id for status association.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reason for break.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Agent email.
    */
    @SerializedName("StaffEmail")
    @Expose
    private String StaffEmail;

    /**
    * Agent id.
    */
    @SerializedName("StaffNo")
    @Expose
    private String StaffNo;

    /**
     * Get Specifies the cursor used for querying in pagination scenarios. 
     * @return Cursor Specifies the cursor used for querying in pagination scenarios.
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set Specifies the cursor used for querying in pagination scenarios.
     * @param Cursor Specifies the cursor used for querying in pagination scenarios.
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get Status timestamp. Unix second-level timestamp. 
     * @return Timestamp Status timestamp. Unix second-level timestamp.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Status timestamp. Unix second-level timestamp.
     * @param Timestamp Status timestamp. Unix second-level timestamp.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Agent status free | busy | rest | notReady | afterCallWork | offline. 
     * @return Status Agent status free | busy | rest | notReady | afterCallWork | offline.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status free | busy | rest | notReady | afterCallWork | offline.
     * @param Status Agent status free | busy | rest | notReady | afterCallWork | offline.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the session Id for status association. 
     * @return SessionId Specifies the session Id for status association.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Specifies the session Id for status association.
     * @param SessionId Specifies the session Id for status association.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reason for break. 
     * @return Reason Reason for break.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for break.
     * @param Reason Reason for break.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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
     * Get Agent id. 
     * @return StaffNo Agent id.
     */
    public String getStaffNo() {
        return this.StaffNo;
    }

    /**
     * Set Agent id.
     * @param StaffNo Agent id.
     */
    public void setStaffNo(String StaffNo) {
        this.StaffNo = StaffNo;
    }

    public StaffStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffStatus(StaffStatus source) {
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.StaffEmail != null) {
            this.StaffEmail = new String(source.StaffEmail);
        }
        if (source.StaffNo != null) {
            this.StaffNo = new String(source.StaffNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "StaffEmail", this.StaffEmail);
        this.setParamSimple(map, prefix + "StaffNo", this.StaffNo);

    }
}

