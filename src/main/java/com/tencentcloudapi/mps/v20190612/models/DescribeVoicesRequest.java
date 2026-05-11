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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoicesRequest extends AbstractModel {

    /**
    * <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul> 
     * @return VoiceType <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
     * @param VoiceType <p>Voice type. </p><p>Enumeration value: </p><ul><li>system: System audio.</li></ul>
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string. </p><p>Other filter criteria:
voiceName (String): Voice name, fuzzy matching. labels (Array of String): Tags. Matches voices that contain these tags.</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DescribeVoicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoicesRequest(DescribeVoicesRequest source) {
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

