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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionItem extends AbstractModel {

    /**
    * Type to match
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Start Mode
    */
    @SerializedName("KeyOrStartMat")
    @Expose
    private String KeyOrStartMat;

    /**
    * End Mode
    */
    @SerializedName("EndMat")
    @Expose
    private String EndMat;

    /**
    * Starting Offset
    */
    @SerializedName("StartOffset")
    @Expose
    private String StartOffset;

    /**
    * End Offset
    */
    @SerializedName("EndOffset")
    @Expose
    private String EndOffset;

    /**
    * Data source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Update Timestamp
    */
    @SerializedName("TsVersion")
    @Expose
    private String TsVersion;

    /**
    * SessionID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionId")
    @Expose
    private Long SessionId;

    /**
    * Session Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * Whether the session is being enabled

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionInUsed")
    @Expose
    private Boolean SessionInUsed;

    /**
    * Session-related CC Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RelatedRuleID")
    @Expose
    private Long [] RelatedRuleID;

    /**
     * Get Type to match 
     * @return Category Type to match
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Type to match
     * @param Category Type to match
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Start Mode 
     * @return KeyOrStartMat Start Mode
     */
    public String getKeyOrStartMat() {
        return this.KeyOrStartMat;
    }

    /**
     * Set Start Mode
     * @param KeyOrStartMat Start Mode
     */
    public void setKeyOrStartMat(String KeyOrStartMat) {
        this.KeyOrStartMat = KeyOrStartMat;
    }

    /**
     * Get End Mode 
     * @return EndMat End Mode
     */
    public String getEndMat() {
        return this.EndMat;
    }

    /**
     * Set End Mode
     * @param EndMat End Mode
     */
    public void setEndMat(String EndMat) {
        this.EndMat = EndMat;
    }

    /**
     * Get Starting Offset 
     * @return StartOffset Starting Offset
     */
    public String getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set Starting Offset
     * @param StartOffset Starting Offset
     */
    public void setStartOffset(String StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get End Offset 
     * @return EndOffset End Offset
     */
    public String getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set End Offset
     * @param EndOffset End Offset
     */
    public void setEndOffset(String EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get Data source 
     * @return Source Data source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Data source
     * @param Source Data source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Update Timestamp 
     * @return TsVersion Update Timestamp
     */
    public String getTsVersion() {
        return this.TsVersion;
    }

    /**
     * Set Update Timestamp
     * @param TsVersion Update Timestamp
     */
    public void setTsVersion(String TsVersion) {
        this.TsVersion = TsVersion;
    }

    /**
     * Get SessionID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionId SessionID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionId() {
        return this.SessionId;
    }

    /**
     * Set SessionID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionId SessionID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionId(Long SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Session Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionName Session Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set Session Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionName Session Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get Whether the session is being enabled

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionInUsed Whether the session is being enabled

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSessionInUsed() {
        return this.SessionInUsed;
    }

    /**
     * Set Whether the session is being enabled

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionInUsed Whether the session is being enabled

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionInUsed(Boolean SessionInUsed) {
        this.SessionInUsed = SessionInUsed;
    }

    /**
     * Get Session-related CC Rule ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RelatedRuleID Session-related CC Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getRelatedRuleID() {
        return this.RelatedRuleID;
    }

    /**
     * Set Session-related CC Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RelatedRuleID Session-related CC Rule ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRelatedRuleID(Long [] RelatedRuleID) {
        this.RelatedRuleID = RelatedRuleID;
    }

    public SessionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionItem(SessionItem source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.KeyOrStartMat != null) {
            this.KeyOrStartMat = new String(source.KeyOrStartMat);
        }
        if (source.EndMat != null) {
            this.EndMat = new String(source.EndMat);
        }
        if (source.StartOffset != null) {
            this.StartOffset = new String(source.StartOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new String(source.EndOffset);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TsVersion != null) {
            this.TsVersion = new String(source.TsVersion);
        }
        if (source.SessionId != null) {
            this.SessionId = new Long(source.SessionId);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.SessionInUsed != null) {
            this.SessionInUsed = new Boolean(source.SessionInUsed);
        }
        if (source.RelatedRuleID != null) {
            this.RelatedRuleID = new Long[source.RelatedRuleID.length];
            for (int i = 0; i < source.RelatedRuleID.length; i++) {
                this.RelatedRuleID[i] = new Long(source.RelatedRuleID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "KeyOrStartMat", this.KeyOrStartMat);
        this.setParamSimple(map, prefix + "EndMat", this.EndMat);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TsVersion", this.TsVersion);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "SessionInUsed", this.SessionInUsed);
        this.setParamArraySimple(map, prefix + "RelatedRuleID.", this.RelatedRuleID);

    }
}

