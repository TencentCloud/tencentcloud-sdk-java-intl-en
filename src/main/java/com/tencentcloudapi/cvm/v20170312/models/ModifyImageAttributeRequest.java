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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAttributeRequest extends AbstractModel {

    /**
    * Image ID, such as `img-gvbnzy6f`. You can obtain the image ID in the following ways:<li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response.</li><li>Obtain it in the [Image console](https://console.cloud.tencent.com/cvm/image).</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * New image name, which should meet the following requirements:<li>It should not exceed 60 characters.</li><li>It should be unique.</li>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * New image description, which should meet the following requirement:<li>It should not exceed 256 characters.</li>
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Sets the image family;
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * Sets whether the image is deprecated;
    */
    @SerializedName("ImageDeprecated")
    @Expose
    private Boolean ImageDeprecated;

    /**
     * Get Image ID, such as `img-gvbnzy6f`. You can obtain the image ID in the following ways:<li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response.</li><li>Obtain it in the [Image console](https://console.cloud.tencent.com/cvm/image).</li> 
     * @return ImageId Image ID, such as `img-gvbnzy6f`. You can obtain the image ID in the following ways:<li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response.</li><li>Obtain it in the [Image console](https://console.cloud.tencent.com/cvm/image).</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID, such as `img-gvbnzy6f`. You can obtain the image ID in the following ways:<li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response.</li><li>Obtain it in the [Image console](https://console.cloud.tencent.com/cvm/image).</li>
     * @param ImageId Image ID, such as `img-gvbnzy6f`. You can obtain the image ID in the following ways:<li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response.</li><li>Obtain it in the [Image console](https://console.cloud.tencent.com/cvm/image).</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get New image name, which should meet the following requirements:<li>It should not exceed 60 characters.</li><li>It should be unique.</li> 
     * @return ImageName New image name, which should meet the following requirements:<li>It should not exceed 60 characters.</li><li>It should be unique.</li>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set New image name, which should meet the following requirements:<li>It should not exceed 60 characters.</li><li>It should be unique.</li>
     * @param ImageName New image name, which should meet the following requirements:<li>It should not exceed 60 characters.</li><li>It should be unique.</li>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get New image description, which should meet the following requirement:<li>It should not exceed 256 characters.</li> 
     * @return ImageDescription New image description, which should meet the following requirement:<li>It should not exceed 256 characters.</li>
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set New image description, which should meet the following requirement:<li>It should not exceed 256 characters.</li>
     * @param ImageDescription New image description, which should meet the following requirement:<li>It should not exceed 256 characters.</li>
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get Sets the image family; 
     * @return ImageFamily Sets the image family;
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set Sets the image family;
     * @param ImageFamily Sets the image family;
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get Sets whether the image is deprecated; 
     * @return ImageDeprecated Sets whether the image is deprecated;
     */
    public Boolean getImageDeprecated() {
        return this.ImageDeprecated;
    }

    /**
     * Set Sets whether the image is deprecated;
     * @param ImageDeprecated Sets whether the image is deprecated;
     */
    public void setImageDeprecated(Boolean ImageDeprecated) {
        this.ImageDeprecated = ImageDeprecated;
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
        if (source.ImageFamily != null) {
            this.ImageFamily = new String(source.ImageFamily);
        }
        if (source.ImageDeprecated != null) {
            this.ImageDeprecated = new Boolean(source.ImageDeprecated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "ImageDeprecated", this.ImageDeprecated);

    }
}

