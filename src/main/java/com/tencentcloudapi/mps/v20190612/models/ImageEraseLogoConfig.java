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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageEraseLogoConfig extends AbstractModel {

    /**
    * Capability configuration enabling status. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Multiple box selection areas to be erased. Note: The value array of this parameter can contain up to 2 values.
Note: This field may return null, indicating that no valid value can be obtained.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ImageAreaBoxes")
    @Expose
    private ImageAreaBoxInfo [] ImageAreaBoxes;

    /**
     * Get Capability configuration enabling status. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Switch Capability configuration enabling status. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Capability configuration enabling status. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Switch Capability configuration enabling status. Valid values:
<li>ON: enabled</li>
<li>OFF: disabled</li>
Default value: ON.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Multiple box selection areas to be erased. Note: The value array of this parameter can contain up to 2 values.
Note: This field may return null, indicating that no valid value can be obtained.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ImageAreaBoxes Multiple box selection areas to be erased. Note: The value array of this parameter can contain up to 2 values.
Note: This field may return null, indicating that no valid value can be obtained.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ImageAreaBoxInfo [] getImageAreaBoxes() {
        return this.ImageAreaBoxes;
    }

    /**
     * Set Multiple box selection areas to be erased. Note: The value array of this parameter can contain up to 2 values.
Note: This field may return null, indicating that no valid value can be obtained.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param ImageAreaBoxes Multiple box selection areas to be erased. Note: The value array of this parameter can contain up to 2 values.
Note: This field may return null, indicating that no valid value can be obtained.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setImageAreaBoxes(ImageAreaBoxInfo [] ImageAreaBoxes) {
        this.ImageAreaBoxes = ImageAreaBoxes;
    }

    public ImageEraseLogoConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEraseLogoConfig(ImageEraseLogoConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ImageAreaBoxes != null) {
            this.ImageAreaBoxes = new ImageAreaBoxInfo[source.ImageAreaBoxes.length];
            for (int i = 0; i < source.ImageAreaBoxes.length; i++) {
                this.ImageAreaBoxes[i] = new ImageAreaBoxInfo(source.ImageAreaBoxes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ImageAreaBoxes.", this.ImageAreaBoxes);

    }
}

