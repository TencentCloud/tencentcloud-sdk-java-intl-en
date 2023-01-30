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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceImageDetailInfo extends AbstractModel{

    /**
    * Image ID on the server
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image tag
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * Path of the remote repository of the image
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
     * Get Image ID on the server 
     * @return ImageId Image ID on the server
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID on the server
     * @param ImageId Image ID on the server
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image tag 
     * @return ImageTag Image tag
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set Image tag
     * @param ImageTag Image tag
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get Path of the remote repository of the image
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Repository Path of the remote repository of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set Path of the remote repository of the image
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Repository Path of the remote repository of the image
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    public ComplianceImageDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceImageDetailInfo(ComplianceImageDetailInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "Repository", this.Repository);

    }
}

