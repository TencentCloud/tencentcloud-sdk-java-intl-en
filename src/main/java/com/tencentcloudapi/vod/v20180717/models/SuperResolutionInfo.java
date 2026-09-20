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
    * Super resolution control switch. Optional values:
<li>ON: Turn on super resolution;</li>
<li>OFF: Disable super resolution.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Super resolution type. Valid only when the super resolution control switch is ON. Available values:
<li>lq: super resolution for low-resolution videos with considerable noise;</li>
<li>hq: For high resolution video super-resolution.</li>
Default value: lq.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Super resolution multiple. Available value: 2.
Default value: 2.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Super resolution control switch. Optional values:
<li>ON: Turn on super resolution;</li>
<li>OFF: Disable super resolution.</li> 
     * @return Switch Super resolution control switch. Optional values:
<li>ON: Turn on super resolution;</li>
<li>OFF: Disable super resolution.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Super resolution control switch. Optional values:
<li>ON: Turn on super resolution;</li>
<li>OFF: Disable super resolution.</li>
     * @param Switch Super resolution control switch. Optional values:
<li>ON: Turn on super resolution;</li>
<li>OFF: Disable super resolution.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Super resolution type. Valid only when the super resolution control switch is ON. Available values:
<li>lq: super resolution for low-resolution videos with considerable noise;</li>
<li>hq: For high resolution video super-resolution.</li>
Default value: lq. 
     * @return Type Super resolution type. Valid only when the super resolution control switch is ON. Available values:
<li>lq: super resolution for low-resolution videos with considerable noise;</li>
<li>hq: For high resolution video super-resolution.</li>
Default value: lq.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Super resolution type. Valid only when the super resolution control switch is ON. Available values:
<li>lq: super resolution for low-resolution videos with considerable noise;</li>
<li>hq: For high resolution video super-resolution.</li>
Default value: lq.
     * @param Type Super resolution type. Valid only when the super resolution control switch is ON. Available values:
<li>lq: super resolution for low-resolution videos with considerable noise;</li>
<li>hq: For high resolution video super-resolution.</li>
Default value: lq.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Super resolution multiple. Available value: 2.
Default value: 2. 
     * @return Size Super resolution multiple. Available value: 2.
Default value: 2.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Super resolution multiple. Available value: 2.
Default value: 2.
     * @param Size Super resolution multiple. Available value: 2.
Default value: 2.
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

