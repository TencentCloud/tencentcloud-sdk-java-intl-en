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

public class ModifyPlatformAuditStatusRequest extends AbstractModel {

    /**
    * Approval ticket ID
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * Approval result
    */
    @SerializedName("AuditResult")
    @Expose
    private Long AuditResult;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Approval description
    */
    @SerializedName("AuditNote")
    @Expose
    private String AuditNote;

    /**
    * Approval details
    */
    @SerializedName("AuditItems")
    @Expose
    private AuditInfoReq [] AuditItems;

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
     * Get Approval result 
     * @return AuditResult Approval result
     */
    public Long getAuditResult() {
        return this.AuditResult;
    }

    /**
     * Set Approval result
     * @param AuditResult Approval result
     */
    public void setAuditResult(Long AuditResult) {
        this.AuditResult = AuditResult;
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
     * Get Approval description 
     * @return AuditNote Approval description
     */
    public String getAuditNote() {
        return this.AuditNote;
    }

    /**
     * Set Approval description
     * @param AuditNote Approval description
     */
    public void setAuditNote(String AuditNote) {
        this.AuditNote = AuditNote;
    }

    /**
     * Get Approval details 
     * @return AuditItems Approval details
     */
    public AuditInfoReq [] getAuditItems() {
        return this.AuditItems;
    }

    /**
     * Set Approval details
     * @param AuditItems Approval details
     */
    public void setAuditItems(AuditInfoReq [] AuditItems) {
        this.AuditItems = AuditItems;
    }

    public ModifyPlatformAuditStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPlatformAuditStatusRequest(ModifyPlatformAuditStatusRequest source) {
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
        }
        if (source.AuditResult != null) {
            this.AuditResult = new Long(source.AuditResult);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.AuditNote != null) {
            this.AuditNote = new String(source.AuditNote);
        }
        if (source.AuditItems != null) {
            this.AuditItems = new AuditInfoReq[source.AuditItems.length];
            for (int i = 0; i < source.AuditItems.length; i++) {
                this.AuditItems[i] = new AuditInfoReq(source.AuditItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "AuditResult", this.AuditResult);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "AuditNote", this.AuditNote);
        this.setParamArrayObj(map, prefix + "AuditItems.", this.AuditItems);

    }
}

