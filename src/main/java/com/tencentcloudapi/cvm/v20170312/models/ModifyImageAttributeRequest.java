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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAttributeRequest extends AbstractModel{

    /**
    * Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image).
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * New image name, which must meet the following requirements: <br> <li>No more than 20 characters. <br> <li>Must be unique.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * New image description, which must meet the following requirement: <br> <li> No more than 60 characters.
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
     * Get Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image). 
     * @return ImageId Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image).
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image).
     * @param ImageId Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image).
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get New image name, which must meet the following requirements: <br> <li>No more than 20 characters. <br> <li>Must be unique. 
     * @return ImageName New image name, which must meet the following requirements: <br> <li>No more than 20 characters. <br> <li>Must be unique.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set New image name, which must meet the following requirements: <br> <li>No more than 20 characters. <br> <li>Must be unique.
     * @param ImageName New image name, which must meet the following requirements: <br> <li>No more than 20 characters. <br> <li>Must be unique.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get New image description, which must meet the following requirement: <br> <li> No more than 60 characters. 
     * @return ImageDescription New image description, which must meet the following requirement: <br> <li> No more than 60 characters.
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set New image description, which must meet the following requirement: <br> <li> No more than 60 characters.
     * @param ImageDescription New image description, which must meet the following requirement: <br> <li> No more than 60 characters.
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
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

