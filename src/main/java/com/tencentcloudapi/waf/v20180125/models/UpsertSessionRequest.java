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

public class UpsertSessionRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Session source location
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Extraction category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Extract key or initial match mode
    */
    @SerializedName("KeyOrStartMat")
    @Expose
    private String KeyOrStartMat;

    /**
    * End match mode
    */
    @SerializedName("EndMat")
    @Expose
    private String EndMat;

    /**
    * Start offset position
    */
    @SerializedName("StartOffset")
    @Expose
    private String StartOffset;

    /**
    * End offset position
    */
    @SerializedName("EndOffset")
    @Expose
    private String EndOffset;

    /**
    * Version
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * Session Name
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * ID corresponding to session
    */
    @SerializedName("SessionID")
    @Expose
    private Long SessionID;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Session source location 
     * @return Source Session source location
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Session source location
     * @param Source Session source location
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Extraction category 
     * @return Category Extraction category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Extraction category
     * @param Category Extraction category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Extract key or initial match mode 
     * @return KeyOrStartMat Extract key or initial match mode
     */
    public String getKeyOrStartMat() {
        return this.KeyOrStartMat;
    }

    /**
     * Set Extract key or initial match mode
     * @param KeyOrStartMat Extract key or initial match mode
     */
    public void setKeyOrStartMat(String KeyOrStartMat) {
        this.KeyOrStartMat = KeyOrStartMat;
    }

    /**
     * Get End match mode 
     * @return EndMat End match mode
     */
    public String getEndMat() {
        return this.EndMat;
    }

    /**
     * Set End match mode
     * @param EndMat End match mode
     */
    public void setEndMat(String EndMat) {
        this.EndMat = EndMat;
    }

    /**
     * Get Start offset position 
     * @return StartOffset Start offset position
     */
    public String getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set Start offset position
     * @param StartOffset Start offset position
     */
    public void setStartOffset(String StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get End offset position 
     * @return EndOffset End offset position
     */
    public String getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set End offset position
     * @param EndOffset End offset position
     */
    public void setEndOffset(String EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get Version 
     * @return Edition Version
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Version
     * @param Edition Version
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get Session Name 
     * @return SessionName Session Name
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set Session Name
     * @param SessionName Session Name
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get ID corresponding to session 
     * @return SessionID ID corresponding to session
     */
    public Long getSessionID() {
        return this.SessionID;
    }

    /**
     * Set ID corresponding to session
     * @param SessionID ID corresponding to session
     */
    public void setSessionID(Long SessionID) {
        this.SessionID = SessionID;
    }

    public UpsertSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertSessionRequest(UpsertSessionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
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
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.SessionID != null) {
            this.SessionID = new Long(source.SessionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "KeyOrStartMat", this.KeyOrStartMat);
        this.setParamSimple(map, prefix + "EndMat", this.EndMat);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);

    }
}

