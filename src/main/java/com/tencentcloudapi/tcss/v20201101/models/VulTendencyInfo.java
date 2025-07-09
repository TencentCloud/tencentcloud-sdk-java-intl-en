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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulTendencyInfo extends AbstractModel {

    /**
    * List of vulnerability trends
    */
    @SerializedName("VulSet")
    @Expose
    private RunTimeTendencyInfo [] VulSet;

    /**
    * Image type affected by vulnerabilities:
`LOCAL`: Local image.
`REGISTRY`: Repository image.
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get List of vulnerability trends 
     * @return VulSet List of vulnerability trends
     */
    public RunTimeTendencyInfo [] getVulSet() {
        return this.VulSet;
    }

    /**
     * Set List of vulnerability trends
     * @param VulSet List of vulnerability trends
     */
    public void setVulSet(RunTimeTendencyInfo [] VulSet) {
        this.VulSet = VulSet;
    }

    /**
     * Get Image type affected by vulnerabilities:
`LOCAL`: Local image.
`REGISTRY`: Repository image. 
     * @return ImageType Image type affected by vulnerabilities:
`LOCAL`: Local image.
`REGISTRY`: Repository image.
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image type affected by vulnerabilities:
`LOCAL`: Local image.
`REGISTRY`: Repository image.
     * @param ImageType Image type affected by vulnerabilities:
`LOCAL`: Local image.
`REGISTRY`: Repository image.
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public VulTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulTendencyInfo(VulTendencyInfo source) {
        if (source.VulSet != null) {
            this.VulSet = new RunTimeTendencyInfo[source.VulSet.length];
            for (int i = 0; i < source.VulSet.length; i++) {
                this.VulSet[i] = new RunTimeTendencyInfo(source.VulSet[i]);
            }
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VulSet.", this.VulSet);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

