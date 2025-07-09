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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySensitiveAPIAuditStatusRequest extends AbstractModel {

    /**
    * Approval ticket ID
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * Approval status 20 Rejected 30 Approved
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Approval notes
    */
    @SerializedName("AuditNote")
    @Expose
    private String AuditNote;

    /**
     * Get Approval ticket ID 
     * @return AuditNo Approval ticket ID
     */
    public String getAuditNo() {
        return this.AuditNo;
    }

    /**
     * Set Approval ticket ID
     * @param AuditNo Approval ticket ID
     */
    public void setAuditNo(String AuditNo) {
        this.AuditNo = AuditNo;
    }

    /**
     * Get Approval status 20 Rejected 30 Approved 
     * @return AuditStatus Approval status 20 Rejected 30 Approved
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Approval status 20 Rejected 30 Approved
     * @param AuditStatus Approval status 20 Rejected 30 Approved
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Approval notes 
     * @return AuditNote Approval notes
     */
    public String getAuditNote() {
        return this.AuditNote;
    }

    /**
     * Set Approval notes
     * @param AuditNote Approval notes
     */
    public void setAuditNote(String AuditNote) {
        this.AuditNote = AuditNote;
    }

    public ModifySensitiveAPIAuditStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySensitiveAPIAuditStatusRequest(ModifySensitiveAPIAuditStatusRequest source) {
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.AuditNote != null) {
            this.AuditNote = new String(source.AuditNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AuditNote", this.AuditNote);

    }
}

