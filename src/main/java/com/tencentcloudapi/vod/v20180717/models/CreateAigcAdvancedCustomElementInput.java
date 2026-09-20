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
    * <p>Subject name.</p>
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * <p>Subject description.</p>
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * <p>Subject reference method.</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>Main timbre.</p>
    */
    @SerializedName("ElementVoiceId")
    @Expose
    private String ElementVoiceId;

    /**
    * <p>Subject reference video.</p>
    */
    @SerializedName("ElementVideoList")
    @Expose
    private String ElementVideoList;

    /**
    * <p>Main body reference image.</p>
    */
    @SerializedName("ElementImageList")
    @Expose
    private String ElementImageList;

    /**
    * <p>Subject configuration tag.</p>
    */
    @SerializedName("TagList")
    @Expose
    private String TagList;

    /**
     * Get <p>Subject name.</p> 
     * @return ElementName <p>Subject name.</p>
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set <p>Subject name.</p>
     * @param ElementName <p>Subject name.</p>
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get <p>Subject description.</p> 
     * @return ElementDescription <p>Subject description.</p>
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set <p>Subject description.</p>
     * @param ElementDescription <p>Subject description.</p>
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get <p>Subject reference method.</p> 
     * @return ReferenceType <p>Subject reference method.</p>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>Subject reference method.</p>
     * @param ReferenceType <p>Subject reference method.</p>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>Main timbre.</p> 
     * @return ElementVoiceId <p>Main timbre.</p>
     */
    public String getElementVoiceId() {
        return this.ElementVoiceId;
    }

    /**
     * Set <p>Main timbre.</p>
     * @param ElementVoiceId <p>Main timbre.</p>
     */
    public void setElementVoiceId(String ElementVoiceId) {
        this.ElementVoiceId = ElementVoiceId;
    }

    /**
     * Get <p>Subject reference video.</p> 
     * @return ElementVideoList <p>Subject reference video.</p>
     */
    public String getElementVideoList() {
        return this.ElementVideoList;
    }

    /**
     * Set <p>Subject reference video.</p>
     * @param ElementVideoList <p>Subject reference video.</p>
     */
    public void setElementVideoList(String ElementVideoList) {
        this.ElementVideoList = ElementVideoList;
    }

    /**
     * Get <p>Main body reference image.</p> 
     * @return ElementImageList <p>Main body reference image.</p>
     */
    public String getElementImageList() {
        return this.ElementImageList;
    }

    /**
     * Set <p>Main body reference image.</p>
     * @param ElementImageList <p>Main body reference image.</p>
     */
    public void setElementImageList(String ElementImageList) {
        this.ElementImageList = ElementImageList;
    }

    /**
     * Get <p>Subject configuration tag.</p> 
     * @return TagList <p>Subject configuration tag.</p>
     */
    public String getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Subject configuration tag.</p>
     * @param TagList <p>Subject configuration tag.</p>
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

