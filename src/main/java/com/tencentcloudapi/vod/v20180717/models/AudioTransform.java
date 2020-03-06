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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioTransform extends AbstractModel{

    /**
    * Audio operation type. Valid values:
<li>Volume: volume adjustment.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Volume adjustment parameter, which is valid if `Type` is `Volume`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VolumeParam")
    @Expose
    private AudioVolumeParam VolumeParam;

    /**
     * Get Audio operation type. Valid values:
<li>Volume: volume adjustment.</li> 
     * @return Type Audio operation type. Valid values:
<li>Volume: volume adjustment.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Audio operation type. Valid values:
<li>Volume: volume adjustment.</li>
     * @param Type Audio operation type. Valid values:
<li>Volume: volume adjustment.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Volume adjustment parameter, which is valid if `Type` is `Volume`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VolumeParam Volume adjustment parameter, which is valid if `Type` is `Volume`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioVolumeParam getVolumeParam() {
        return this.VolumeParam;
    }

    /**
     * Set Volume adjustment parameter, which is valid if `Type` is `Volume`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VolumeParam Volume adjustment parameter, which is valid if `Type` is `Volume`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVolumeParam(AudioVolumeParam VolumeParam) {
        this.VolumeParam = VolumeParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VolumeParam.", this.VolumeParam);

    }
}

