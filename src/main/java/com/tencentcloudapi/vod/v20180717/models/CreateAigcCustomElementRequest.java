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

public class CreateAigcCustomElementRequest extends AbstractModel {

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
    @SerializedName("ElementFrontalImage")
    @Expose
    private String ElementFrontalImage;

    /**
    * 
    */
    @SerializedName("ElementReferList")
    @Expose
    private ElementReferInfo [] ElementReferList;

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
     * @return ElementFrontalImage 
     */
    public String getElementFrontalImage() {
        return this.ElementFrontalImage;
    }

    /**
     * Set 
     * @param ElementFrontalImage 
     */
    public void setElementFrontalImage(String ElementFrontalImage) {
        this.ElementFrontalImage = ElementFrontalImage;
    }

    /**
     * Get  
     * @return ElementReferList 
     */
    public ElementReferInfo [] getElementReferList() {
        return this.ElementReferList;
    }

    /**
     * Set 
     * @param ElementReferList 
     */
    public void setElementReferList(ElementReferInfo [] ElementReferList) {
        this.ElementReferList = ElementReferList;
    }

    public CreateAigcCustomElementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcCustomElementRequest(CreateAigcCustomElementRequest source) {
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ElementDescription != null) {
            this.ElementDescription = new String(source.ElementDescription);
        }
        if (source.ElementFrontalImage != null) {
            this.ElementFrontalImage = new String(source.ElementFrontalImage);
        }
        if (source.ElementReferList != null) {
            this.ElementReferList = new ElementReferInfo[source.ElementReferList.length];
            for (int i = 0; i < source.ElementReferList.length; i++) {
                this.ElementReferList[i] = new ElementReferInfo(source.ElementReferList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ElementDescription", this.ElementDescription);
        this.setParamSimple(map, prefix + "ElementFrontalImage", this.ElementFrontalImage);
        this.setParamArrayObj(map, prefix + "ElementReferList.", this.ElementReferList);

    }
}

