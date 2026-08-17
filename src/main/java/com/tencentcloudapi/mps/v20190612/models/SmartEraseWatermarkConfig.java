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

public class SmartEraseWatermarkConfig extends AbstractModel {

    /**
    * Watermark removal method.
**Automatic erasing:** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When using automatic erasing, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasure:** For static watermarks with a relatively fixed position, we recommend you directly specify the area to erase.
When you choose specified area erasure, import at least a specified region.

-. auto: automatic removal
- custom: specified area erasing.
    */
    @SerializedName("WatermarkEraseMethod")
    @Expose
    private String WatermarkEraseMethod;

    /**
    * Watermark removal model.
Basic Edition: Provides average effects and high cost performance. Suitable for animations or videos with clean backgrounds.
Advanced edition: Better effectiveness, suitable for reality style videos such as short drama.
-.
- advanced: Advanced Edition.
    */
    @SerializedName("WatermarkModel")
    @Expose
    private String WatermarkModel;

    /**
    * Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get Watermark removal method.
**Automatic erasing:** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When using automatic erasing, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasure:** For static watermarks with a relatively fixed position, we recommend you directly specify the area to erase.
When you choose specified area erasure, import at least a specified region.

-. auto: automatic removal
- custom: specified area erasing. 
     * @return WatermarkEraseMethod Watermark removal method.
**Automatic erasing:** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When using automatic erasing, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasure:** For static watermarks with a relatively fixed position, we recommend you directly specify the area to erase.
When you choose specified area erasure, import at least a specified region.

-. auto: automatic removal
- custom: specified area erasing.
     */
    public String getWatermarkEraseMethod() {
        return this.WatermarkEraseMethod;
    }

    /**
     * Set Watermark removal method.
**Automatic erasing:** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When using automatic erasing, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasure:** For static watermarks with a relatively fixed position, we recommend you directly specify the area to erase.
When you choose specified area erasure, import at least a specified region.

-. auto: automatic removal
- custom: specified area erasing.
     * @param WatermarkEraseMethod Watermark removal method.
**Automatic erasing:** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When using automatic erasing, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasure:** For static watermarks with a relatively fixed position, we recommend you directly specify the area to erase.
When you choose specified area erasure, import at least a specified region.

-. auto: automatic removal
- custom: specified area erasing.
     */
    public void setWatermarkEraseMethod(String WatermarkEraseMethod) {
        this.WatermarkEraseMethod = WatermarkEraseMethod;
    }

    /**
     * Get Watermark removal model.
Basic Edition: Provides average effects and high cost performance. Suitable for animations or videos with clean backgrounds.
Advanced edition: Better effectiveness, suitable for reality style videos such as short drama.
-.
- advanced: Advanced Edition. 
     * @return WatermarkModel Watermark removal model.
Basic Edition: Provides average effects and high cost performance. Suitable for animations or videos with clean backgrounds.
Advanced edition: Better effectiveness, suitable for reality style videos such as short drama.
-.
- advanced: Advanced Edition.
     */
    public String getWatermarkModel() {
        return this.WatermarkModel;
    }

    /**
     * Set Watermark removal model.
Basic Edition: Provides average effects and high cost performance. Suitable for animations or videos with clean backgrounds.
Advanced edition: Better effectiveness, suitable for reality style videos such as short drama.
-.
- advanced: Advanced Edition.
     * @param WatermarkModel Watermark removal model.
Basic Edition: Provides average effects and high cost performance. Suitable for animations or videos with clean backgrounds.
Advanced edition: Better effectiveness, suitable for reality style videos such as short drama.
-.
- advanced: Advanced Edition.
     */
    public void setWatermarkModel(String WatermarkModel) {
        this.WatermarkModel = WatermarkModel;
    }

    /**
     * Get Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return AutoAreas Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param AutoAreas Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return CustomAreas Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param CustomAreas Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public void setCustomAreas(EraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public SmartEraseWatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseWatermarkConfig(SmartEraseWatermarkConfig source) {
        if (source.WatermarkEraseMethod != null) {
            this.WatermarkEraseMethod = new String(source.WatermarkEraseMethod);
        }
        if (source.WatermarkModel != null) {
            this.WatermarkModel = new String(source.WatermarkModel);
        }
        if (source.AutoAreas != null) {
            this.AutoAreas = new EraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new EraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new EraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new EraseTimeArea(source.CustomAreas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkEraseMethod", this.WatermarkEraseMethod);
        this.setParamSimple(map, prefix + "WatermarkModel", this.WatermarkModel);
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamArrayObj(map, prefix + "CustomAreas.", this.CustomAreas);

    }
}

