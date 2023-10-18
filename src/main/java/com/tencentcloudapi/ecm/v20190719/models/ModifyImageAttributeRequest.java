/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAttributeRequest extends AbstractModel {

    /**
    * Image ID, such as `img-gvbnzy6f`
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name, which must meet the following requirements:
It can contain up to 20 characters.
- The image name cannot be the same as existing image names.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image description, which must meet the following requirements:
- It cannot exceed 60 characters.
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
     * Get Image ID, such as `img-gvbnzy6f` 
     * @return ImageId Image ID, such as `img-gvbnzy6f`
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID, such as `img-gvbnzy6f`
     * @param ImageId Image ID, such as `img-gvbnzy6f`
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name, which must meet the following requirements:
It can contain up to 20 characters.
- The image name cannot be the same as existing image names. 
     * @return ImageName Image name, which must meet the following requirements:
It can contain up to 20 characters.
- The image name cannot be the same as existing image names.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name, which must meet the following requirements:
It can contain up to 20 characters.
- The image name cannot be the same as existing image names.
     * @param ImageName Image name, which must meet the following requirements:
It can contain up to 20 characters.
- The image name cannot be the same as existing image names.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image description, which must meet the following requirements:
- It cannot exceed 60 characters. 
     * @return ImageDescription Image description, which must meet the following requirements:
- It cannot exceed 60 characters.
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set Image description, which must meet the following requirements:
- It cannot exceed 60 characters.
     * @param ImageDescription Image description, which must meet the following requirements:
- It cannot exceed 60 characters.
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    public ModifyImageAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageAttributeRequest(ModifyImageAttributeRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);

    }
}

