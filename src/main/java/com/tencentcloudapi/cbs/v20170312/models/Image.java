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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel{

    /**
    * Image instance ID.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Image name.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
     * Get Image instance ID. 
     * @return ImageId Image instance ID.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image instance ID.
     * @param ImageId Image instance ID.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Image name. 
     * @return ImageName Image name.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name.
     * @param ImageName Image name.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);

    }
}

