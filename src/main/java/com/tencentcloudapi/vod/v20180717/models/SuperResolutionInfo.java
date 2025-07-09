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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuperResolutionInfo extends AbstractModel {

    /**
    * Whether to enable super resolution. Valid values:
<li>ON</li>
<li>`OFF`</li>
If super resolution is enabled, the output resolution will double.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The super resolution type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`lq`: For low-resolution videos with obvious noise</li>
<li>`hq`: For high-resolution videos</li>
Default value: `lq`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The ratio of the target resolution to the original resolution. Valid values: `2`.
Default value: `2`.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Whether to enable super resolution. Valid values:
<li>ON</li>
<li>`OFF`</li>
If super resolution is enabled, the output resolution will double. 
     * @return Switch Whether to enable super resolution. Valid values:
<li>ON</li>
<li>`OFF`</li>
If super resolution is enabled, the output resolution will double.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable super resolution. Valid values:
<li>ON</li>
<li>`OFF`</li>
If super resolution is enabled, the output resolution will double.
     * @param Switch Whether to enable super resolution. Valid values:
<li>ON</li>
<li>`OFF`</li>
If super resolution is enabled, the output resolution will double.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The super resolution type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`lq`: For low-resolution videos with obvious noise</li>
<li>`hq`: For high-resolution videos</li>
Default value: `lq`. 
     * @return Type The super resolution type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`lq`: For low-resolution videos with obvious noise</li>
<li>`hq`: For high-resolution videos</li>
Default value: `lq`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The super resolution type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`lq`: For low-resolution videos with obvious noise</li>
<li>`hq`: For high-resolution videos</li>
Default value: `lq`.
     * @param Type The super resolution type. This parameter is valid only if `Switch` is `ON`. Valid values:
<li>`lq`: For low-resolution videos with obvious noise</li>
<li>`hq`: For high-resolution videos</li>
Default value: `lq`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The ratio of the target resolution to the original resolution. Valid values: `2`.
Default value: `2`. 
     * @return Size The ratio of the target resolution to the original resolution. Valid values: `2`.
Default value: `2`.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The ratio of the target resolution to the original resolution. Valid values: `2`.
Default value: `2`.
     * @param Size The ratio of the target resolution to the original resolution. Valid values: `2`.
Default value: `2`.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public SuperResolutionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperResolutionInfo(SuperResolutionInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

