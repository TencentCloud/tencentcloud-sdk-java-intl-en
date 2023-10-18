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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRiskTendencyInfo extends AbstractModel {

    /**
    * List of trends
    */
    @SerializedName("ImageRiskSet")
    @Expose
    private RunTimeTendencyInfo [] ImageRiskSet;

    /**
    * Risk type:
`IRT_VULNERABILITY`: Vulnerability.
`IRT_MALWARE_VIRUS`: Virus and trojan.
`IRT_RISK`: Sensitive data.
    */
    @SerializedName("ImageRiskType")
    @Expose
    private String ImageRiskType;

    /**
     * Get List of trends 
     * @return ImageRiskSet List of trends
     */
    public RunTimeTendencyInfo [] getImageRiskSet() {
        return this.ImageRiskSet;
    }

    /**
     * Set List of trends
     * @param ImageRiskSet List of trends
     */
    public void setImageRiskSet(RunTimeTendencyInfo [] ImageRiskSet) {
        this.ImageRiskSet = ImageRiskSet;
    }

    /**
     * Get Risk type:
`IRT_VULNERABILITY`: Vulnerability.
`IRT_MALWARE_VIRUS`: Virus and trojan.
`IRT_RISK`: Sensitive data. 
     * @return ImageRiskType Risk type:
`IRT_VULNERABILITY`: Vulnerability.
`IRT_MALWARE_VIRUS`: Virus and trojan.
`IRT_RISK`: Sensitive data.
     */
    public String getImageRiskType() {
        return this.ImageRiskType;
    }

    /**
     * Set Risk type:
`IRT_VULNERABILITY`: Vulnerability.
`IRT_MALWARE_VIRUS`: Virus and trojan.
`IRT_RISK`: Sensitive data.
     * @param ImageRiskType Risk type:
`IRT_VULNERABILITY`: Vulnerability.
`IRT_MALWARE_VIRUS`: Virus and trojan.
`IRT_RISK`: Sensitive data.
     */
    public void setImageRiskType(String ImageRiskType) {
        this.ImageRiskType = ImageRiskType;
    }

    public ImageRiskTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRiskTendencyInfo(ImageRiskTendencyInfo source) {
        if (source.ImageRiskSet != null) {
            this.ImageRiskSet = new RunTimeTendencyInfo[source.ImageRiskSet.length];
            for (int i = 0; i < source.ImageRiskSet.length; i++) {
                this.ImageRiskSet[i] = new RunTimeTendencyInfo(source.ImageRiskSet[i]);
            }
        }
        if (source.ImageRiskType != null) {
            this.ImageRiskType = new String(source.ImageRiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageRiskSet.", this.ImageRiskSet);
        this.setParamSimple(map, prefix + "ImageRiskType", this.ImageRiskType);

    }
}

