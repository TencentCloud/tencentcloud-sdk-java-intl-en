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

public class CreateImageRequest extends AbstractModel {

    /**
    * Image name.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * ID of the instance for which to make an image.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Image description.
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Whether to perform a forced shutdown to make an image. Valid values:
TRUE: yes
FALSE: no
Default value: FALSE.
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

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
     * Get ID of the instance for which to make an image. 
     * @return InstanceId ID of the instance for which to make an image.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance for which to make an image.
     * @param InstanceId ID of the instance for which to make an image.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Image description. 
     * @return ImageDescription Image description.
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set Image description.
     * @param ImageDescription Image description.
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get Whether to perform a forced shutdown to make an image. Valid values:
TRUE: yes
FALSE: no
Default value: FALSE. 
     * @return ForcePoweroff Whether to perform a forced shutdown to make an image. Valid values:
TRUE: yes
FALSE: no
Default value: FALSE.
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * Set Whether to perform a forced shutdown to make an image. Valid values:
TRUE: yes
FALSE: no
Default value: FALSE.
     * @param ForcePoweroff Whether to perform a forced shutdown to make an image. Valid values:
TRUE: yes
FALSE: no
Default value: FALSE.
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    public CreateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRequest(CreateImageRequest source) {
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ForcePoweroff != null) {
            this.ForcePoweroff = new String(source.ForcePoweroff);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);

    }
}

