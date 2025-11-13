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

public class UpdateSmartEraseWatermarkConfig extends AbstractModel {

    /**
    * Watermark erasing method.
**Automatic erasing: ** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When automatic erasing is used, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
 **Specified area erasing: ** For static watermarks in fixed positions, you are recommended to specify the erasing area directly.When you choose specified area erasing, specify at least one area.
- auto: automatic erasing.
- custom: specified area erasing.
    */
    @SerializedName("WatermarkEraseMethod")
    @Expose
    private String WatermarkEraseMethod;

    /**
    * Watermark erasing model.
Basic Edition: provide average effects and high cost performance. It applies to animations or videos with clean backgrounds.
Advanced Edition: provide better effects. It applies to reality-style videos, such as short dramas.
- basic: Basic Edition.
- advanced: Advanced Edition.
    */
    @SerializedName("WatermarkModel")
    @Expose
    private String WatermarkModel;

    /**
    * Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get Watermark erasing method.
**Automatic erasing: ** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When automatic erasing is used, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
 **Specified area erasing: ** For static watermarks in fixed positions, you are recommended to specify the erasing area directly.When you choose specified area erasing, specify at least one area.
- auto: automatic erasing.
- custom: specified area erasing. 
     * @return WatermarkEraseMethod Watermark erasing method.
**Automatic erasing: ** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When automatic erasing is used, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
 **Specified area erasing: ** For static watermarks in fixed positions, you are recommended to specify the erasing area directly.When you choose specified area erasing, specify at least one area.
- auto: automatic erasing.
- custom: specified area erasing.
     */
    public String getWatermarkEraseMethod() {
        return this.WatermarkEraseMethod;
    }

    /**
     * Set Watermark erasing method.
**Automatic erasing: ** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When automatic erasing is used, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
 **Specified area erasing: ** For static watermarks in fixed positions, you are recommended to specify the erasing area directly.When you choose specified area erasing, specify at least one area.
- auto: automatic erasing.
- custom: specified area erasing.
     * @param WatermarkEraseMethod Watermark erasing method.
**Automatic erasing: ** Video watermarks are automatically recognized using an AI model and are erased to generate a new video. It applies to dynamic watermarks.
When automatic erasing is used, if AutoAreas is not specified, the full-screen video image area will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
 **Specified area erasing: ** For static watermarks in fixed positions, you are recommended to specify the erasing area directly.When you choose specified area erasing, specify at least one area.
- auto: automatic erasing.
- custom: specified area erasing.
     */
    public void setWatermarkEraseMethod(String WatermarkEraseMethod) {
        this.WatermarkEraseMethod = WatermarkEraseMethod;
    }

    /**
     * Get Watermark erasing model.
Basic Edition: provide average effects and high cost performance. It applies to animations or videos with clean backgrounds.
Advanced Edition: provide better effects. It applies to reality-style videos, such as short dramas.
- basic: Basic Edition.
- advanced: Advanced Edition. 
     * @return WatermarkModel Watermark erasing model.
Basic Edition: provide average effects and high cost performance. It applies to animations or videos with clean backgrounds.
Advanced Edition: provide better effects. It applies to reality-style videos, such as short dramas.
- basic: Basic Edition.
- advanced: Advanced Edition.
     */
    public String getWatermarkModel() {
        return this.WatermarkModel;
    }

    /**
     * Set Watermark erasing model.
Basic Edition: provide average effects and high cost performance. It applies to animations or videos with clean backgrounds.
Advanced Edition: provide better effects. It applies to reality-style videos, such as short dramas.
- basic: Basic Edition.
- advanced: Advanced Edition.
     * @param WatermarkModel Watermark erasing model.
Basic Edition: provide average effects and high cost performance. It applies to animations or videos with clean backgrounds.
Advanced Edition: provide better effects. It applies to reality-style videos, such as short dramas.
- basic: Basic Edition.
- advanced: Advanced Edition.
     */
    public void setWatermarkModel(String WatermarkModel) {
        this.WatermarkModel = WatermarkModel;
    }

    /**
     * Get Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return AutoAreas Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param AutoAreas Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return CustomAreas Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param CustomAreas Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: Input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public void setCustomAreas(EraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public UpdateSmartEraseWatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSmartEraseWatermarkConfig(UpdateSmartEraseWatermarkConfig source) {
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

