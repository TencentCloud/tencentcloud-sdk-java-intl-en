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

public class SuperResolutionConfig extends AbstractModel {

    /**
    * Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The strength. Valid values:
<li>lq: For low-resolution videos with obvious noise</li>
<li>hq: For high-resolution videos</li>
Default value: lq.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The ratio of the target resolution to the original resolution. Valid values:
<li>2</li>
Default value: 2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON. 
     * @return Switch Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     * @param Switch Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The strength. Valid values:
<li>lq: For low-resolution videos with obvious noise</li>
<li>hq: For high-resolution videos</li>
Default value: lq.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type The strength. Valid values:
<li>lq: For low-resolution videos with obvious noise</li>
<li>hq: For high-resolution videos</li>
Default value: lq.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The strength. Valid values:
<li>lq: For low-resolution videos with obvious noise</li>
<li>hq: For high-resolution videos</li>
Default value: lq.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type The strength. Valid values:
<li>lq: For low-resolution videos with obvious noise</li>
<li>hq: For high-resolution videos</li>
Default value: lq.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The ratio of the target resolution to the original resolution. Valid values:
<li>2</li>
Default value: 2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size The ratio of the target resolution to the original resolution. Valid values:
<li>2</li>
Default value: 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The ratio of the target resolution to the original resolution. Valid values:
<li>2</li>
Default value: 2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size The ratio of the target resolution to the original resolution. Valid values:
<li>2</li>
Default value: 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public SuperResolutionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperResolutionConfig(SuperResolutionConfig source) {
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

