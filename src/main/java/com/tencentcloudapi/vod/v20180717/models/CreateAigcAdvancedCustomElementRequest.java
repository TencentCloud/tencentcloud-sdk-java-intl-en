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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcAdvancedCustomElementRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * 
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * 
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * 
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * 
    */
    @SerializedName("ElementVideoList")
    @Expose
    private String ElementVideoList;

    /**
    * 
    */
    @SerializedName("ElementImageList")
    @Expose
    private String ElementImageList;

    /**
    * 
    */
    @SerializedName("TagList")
    @Expose
    private String TagList;

    /**
    * 
    */
    @SerializedName("DisableModeration")
    @Expose
    private String DisableModeration;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return ElementName 
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set 
     * @param ElementName 
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get  
     * @return ElementDescription 
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set 
     * @param ElementDescription 
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get  
     * @return ReferenceType 
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set 
     * @param ReferenceType 
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get  
     * @return ElementVoiceId 
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set 
     * @param ElementVoiceId 
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get  
     * @return ElementVideoList 
     */
    public String getElementVideoList() {
        return this.ElementVideoList;
    }

    /**
     * Set 
     * @param ElementVideoList 
     */
    public void setElementVideoList(String ElementVideoList) {
        this.ElementVideoList = ElementVideoList;
    }

    /**
     * Get  
     * @return ElementImageList 
     */
    public String getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set 
     * @param ElementImageList 
     */
    public void setElementImageList(String ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get  
     * @return TagList 
     */
    public String getTagList() {
        return this.TagList;
    }

    /**
     * Set 
     * @param TagList 
     */
    public void setTagList(String TagList) {
        this.TagList = TagList;
    }

    /**
     * Get  
     * @return DisableModeration 
     */
    public String getDisableModeration() {
        return this.DisableModeration;
    }

    /**
     * Set 
     * @param DisableModeration 
     */
    public void setDisableModeration(String DisableModeration) {
        this.DisableModeration = DisableModeration;
    }

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return TasksPriority 
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 
     * @param TasksPriority 
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public CreateAigcAdvancedCustomElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementRequest(CreateAigcAdvancedCustomElementRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ElementDescription != null) {
            this.ElementDescription = new String(source.ElementDescription);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ElementVoiceId != null) {
            this.ElementVoiceId = new String(source.ElementVoiceId);
        }
        if (source.ElementVideoList != null) {
            this.ElementVideoList = new String(source.ElementVideoList);
        }
        if (source.ElementImageList != null) {
            this.ElementImageList = new String(source.ElementImageList);
        }
        if (source.TagList != null) {
            this.TagList = new String(source.TagList);
        }
        if (source.DisableModeration != null) {
            this.DisableModeration = new String(source.DisableModeration);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);
        this.setParamSimple(map, prefix + "ElementVideoList", this.ElementVideoList);
        this.setParamSimple(map, prefix + "ElementImageList", this.ElementImageList);
        this.setParamSimple(map, prefix + "TagList", this.TagList);
        this.setParamSimple(map, prefix + "DisableModeration", this.DisableModeration);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

