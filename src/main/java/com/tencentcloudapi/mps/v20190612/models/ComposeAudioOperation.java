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

public class ComposeAudioOperation extends AbstractModel {

    /**
    * The operation type. Valid values:
<li>`Volume`: Volume adjustment. </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    *  The volume level. This parameter is valid if `Type` is `Volume`. Value range: 0–5. 
<li>If the parameter value is `0`, the video will be muted. </li>
<li>If the parameter value is smaller than 1, the volume will be reduced. </li>
<li>If the parameter value is `1`, the original volume will be kept. </li>
<li>If the parameter value is greater than 1, the volume will be increased. </li>
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
     * Get The operation type. Valid values:
<li>`Volume`: Volume adjustment. </li> 
     * @return Type The operation type. Valid values:
<li>`Volume`: Volume adjustment. </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The operation type. Valid values:
<li>`Volume`: Volume adjustment. </li>
     * @param Type The operation type. Valid values:
<li>`Volume`: Volume adjustment. </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  The volume level. This parameter is valid if `Type` is `Volume`. Value range: 0–5. 
<li>If the parameter value is `0`, the video will be muted. </li>
<li>If the parameter value is smaller than 1, the volume will be reduced. </li>
<li>If the parameter value is `1`, the original volume will be kept. </li>
<li>If the parameter value is greater than 1, the volume will be increased. </li> 
     * @return Volume  The volume level. This parameter is valid if `Type` is `Volume`. Value range: 0–5. 
<li>If the parameter value is `0`, the video will be muted. </li>
<li>If the parameter value is smaller than 1, the volume will be reduced. </li>
<li>If the parameter value is `1`, the original volume will be kept. </li>
<li>If the parameter value is greater than 1, the volume will be increased. </li>
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set  The volume level. This parameter is valid if `Type` is `Volume`. Value range: 0–5. 
<li>If the parameter value is `0`, the video will be muted. </li>
<li>If the parameter value is smaller than 1, the volume will be reduced. </li>
<li>If the parameter value is `1`, the original volume will be kept. </li>
<li>If the parameter value is greater than 1, the volume will be increased. </li>
     * @param Volume  The volume level. This parameter is valid if `Type` is `Volume`. Value range: 0–5. 
<li>If the parameter value is `0`, the video will be muted. </li>
<li>If the parameter value is smaller than 1, the volume will be reduced. </li>
<li>If the parameter value is `1`, the original volume will be kept. </li>
<li>If the parameter value is greater than 1, the volume will be increased. </li>
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    public ComposeAudioOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeAudioOperation(ComposeAudioOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

