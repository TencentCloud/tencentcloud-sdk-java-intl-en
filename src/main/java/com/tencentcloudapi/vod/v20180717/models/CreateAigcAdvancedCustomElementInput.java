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

public class CreateAigcAdvancedCustomElementInput extends AbstractModel {

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

    public CreateAigcAdvancedCustomElementInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementInput(CreateAigcAdvancedCustomElementInput source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ElementVoiceId", this.ElementVoiceId);
        this.setParamSimple(map, prefix + "ElementVideoList", this.ElementVideoList);
        this.setParamSimple(map, prefix + "ElementImageList", this.ElementImageList);
        this.setParamSimple(map, prefix + "TagList", this.TagList);

    }
}

