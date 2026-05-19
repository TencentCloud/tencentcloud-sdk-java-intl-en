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
    * Subject name cannot exceed 20 characters.
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * Subject description.

Up to 100 characters.
    */
    @SerializedName("ElementDescription")
    @Expose
    private String ElementDescription;

    /**
    * Front reference image of the subject.
Support input image URL (underwrite accessible).
Image format. Valid values: .jpg, .jpeg, and .png.
The image file size must not exceed 10MB, with image width and height not less than 300px and image aspect ratio between 1:2.5 and 2.5:1.
    */
    @SerializedName("ElementFrontalImage")
    @Expose
    private String ElementFrontalImage;

    /**
    * Reference list of other subjects. Upload multiple subject reference images from different angles to define the subject appearance. Upload at least 1 reference image, up to 3 reference images.
    */
    @SerializedName("ElementReferList")
    @Expose
    private ElementReferInfo [] ElementReferList;

    /**
     * Get Subject name cannot exceed 20 characters. 
     * @return ElementName Subject name cannot exceed 20 characters.
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set Subject name cannot exceed 20 characters.
     * @param ElementName Subject name cannot exceed 20 characters.
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get Subject description.

Up to 100 characters. 
     * @return ElementDescription Subject description.

Up to 100 characters.
     */
    public String getElementDescription() {
        return this.ElementDescription;
    }

    /**
     * Set Subject description.

Up to 100 characters.
     * @param ElementDescription Subject description.

Up to 100 characters.
     */
    public void setElementDescription(String ElementDescription) {
        this.ElementDescription = ElementDescription;
    }

    /**
     * Get Front reference image of the subject.
Support input image URL (underwrite accessible).
Image format. Valid values: .jpg, .jpeg, and .png.
The image file size must not exceed 10MB, with image width and height not less than 300px and image aspect ratio between 1:2.5 and 2.5:1. 
     * @return ElementFrontalImage Front reference image of the subject.
Support input image URL (underwrite accessible).
Image format. Valid values: .jpg, .jpeg, and .png.
The image file size must not exceed 10MB, with image width and height not less than 300px and image aspect ratio between 1:2.5 and 2.5:1.
     */
    public String getElementFrontalImage() {
        return this.ElementFrontalImage;
    }

    /**
     * Set Front reference image of the subject.
Support input image URL (underwrite accessible).
Image format. Valid values: .jpg, .jpeg, and .png.
The image file size must not exceed 10MB, with image width and height not less than 300px and image aspect ratio between 1:2.5 and 2.5:1.
     * @param ElementFrontalImage Front reference image of the subject.
Support input image URL (underwrite accessible).
Image format. Valid values: .jpg, .jpeg, and .png.
The image file size must not exceed 10MB, with image width and height not less than 300px and image aspect ratio between 1:2.5 and 2.5:1.
     */
    public void setElementFrontalImage(String ElementFrontalImage) {
        this.ElementFrontalImage = ElementFrontalImage;
    }

    /**
     * Get Reference list of other subjects. Upload multiple subject reference images from different angles to define the subject appearance. Upload at least 1 reference image, up to 3 reference images. 
     * @return ElementReferList Reference list of other subjects. Upload multiple subject reference images from different angles to define the subject appearance. Upload at least 1 reference image, up to 3 reference images.
     */
    public ElementReferInfo [] getElementReferList() {
        return this.ElementReferList;
    }

    /**
     * Set Reference list of other subjects. Upload multiple subject reference images from different angles to define the subject appearance. Upload at least 1 reference image, up to 3 reference images.
     * @param ElementReferList Reference list of other subjects. Upload multiple subject reference images from different angles to define the subject appearance. Upload at least 1 reference image, up to 3 reference images.
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

