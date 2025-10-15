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
    * Specifies the watermark removal method.
**Auto-Removal:** automatically identifies watermarks in the video using model a and generates a new video after removal. suitable for dynamic watermarks.
When using automated removal, if you do not specify AutoAreas, the full-screen video will be erased automatically. if AutoAreas is specified, it will change to erase the designated areas.
**Specified area erasure:** for static watermarks with fixed locations, we recommend you directly specify the erasure area.
When you choose specified area erasure, import at least one specified region.

-Automated removal.
-Specifies the custom specified area erasure.
    */
    @SerializedName("WatermarkEraseMethod")
    @Expose
    private String WatermarkEraseMethod;

    /**
    * Specifies the watermark removal model.
Basic version: average effect, cost-effective, suitable for videos with clean backgrounds or animations.
Advanced edition: better effectiveness, suitable for mini-drama and reality style video.
**Supported values**:
- basic
- advanced
    */
    @SerializedName("WatermarkModel")
    @Expose
    private String WatermarkModel;

    /**
    * Automatically erase the custom region.
Automatically detects and erases the targeted removal in the specified region using the AI model.
Note that this parameter will not take effect when the removal method is custom. to modify the template, input [] for the clean-up region. if not provided, the template region information remains unchanged.
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * Specifies the removal of a custom region.
Specifies to directly perform removal without detection and recognition within a selected time range for the specified region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get Specifies the watermark removal method.
**Auto-Removal:** automatically identifies watermarks in the video using model a and generates a new video after removal. suitable for dynamic watermarks.
When using automated removal, if you do not specify AutoAreas, the full-screen video will be erased automatically. if AutoAreas is specified, it will change to erase the designated areas.
**Specified area erasure:** for static watermarks with fixed locations, we recommend you directly specify the erasure area.
When you choose specified area erasure, import at least one specified region.

-Automated removal.
-Specifies the custom specified area erasure. 
     * @return WatermarkEraseMethod Specifies the watermark removal method.
**Auto-Removal:** automatically identifies watermarks in the video using model a and generates a new video after removal. suitable for dynamic watermarks.
When using automated removal, if you do not specify AutoAreas, the full-screen video will be erased automatically. if AutoAreas is specified, it will change to erase the designated areas.
**Specified area erasure:** for static watermarks with fixed locations, we recommend you directly specify the erasure area.
When you choose specified area erasure, import at least one specified region.

-Automated removal.
-Specifies the custom specified area erasure.
     */
    public String getWatermarkEraseMethod() {
        return this.WatermarkEraseMethod;
    }

    /**
     * Set Specifies the watermark removal method.
**Auto-Removal:** automatically identifies watermarks in the video using model a and generates a new video after removal. suitable for dynamic watermarks.
When using automated removal, if you do not specify AutoAreas, the full-screen video will be erased automatically. if AutoAreas is specified, it will change to erase the designated areas.
**Specified area erasure:** for static watermarks with fixed locations, we recommend you directly specify the erasure area.
When you choose specified area erasure, import at least one specified region.

-Automated removal.
-Specifies the custom specified area erasure.
     * @param WatermarkEraseMethod Specifies the watermark removal method.
**Auto-Removal:** automatically identifies watermarks in the video using model a and generates a new video after removal. suitable for dynamic watermarks.
When using automated removal, if you do not specify AutoAreas, the full-screen video will be erased automatically. if AutoAreas is specified, it will change to erase the designated areas.
**Specified area erasure:** for static watermarks with fixed locations, we recommend you directly specify the erasure area.
When you choose specified area erasure, import at least one specified region.

-Automated removal.
-Specifies the custom specified area erasure.
     */
    public void setWatermarkEraseMethod(String WatermarkEraseMethod) {
        this.WatermarkEraseMethod = WatermarkEraseMethod;
    }

    /**
     * Get Specifies the watermark removal model.
Basic version: average effect, cost-effective, suitable for videos with clean backgrounds or animations.
Advanced edition: better effectiveness, suitable for mini-drama and reality style video.
**Supported values**:
- basic
- advanced 
     * @return WatermarkModel Specifies the watermark removal model.
Basic version: average effect, cost-effective, suitable for videos with clean backgrounds or animations.
Advanced edition: better effectiveness, suitable for mini-drama and reality style video.
**Supported values**:
- basic
- advanced
     */
    public String getWatermarkModel() {
        return this.WatermarkModel;
    }

    /**
     * Set Specifies the watermark removal model.
Basic version: average effect, cost-effective, suitable for videos with clean backgrounds or animations.
Advanced edition: better effectiveness, suitable for mini-drama and reality style video.
**Supported values**:
- basic
- advanced
     * @param WatermarkModel Specifies the watermark removal model.
Basic version: average effect, cost-effective, suitable for videos with clean backgrounds or animations.
Advanced edition: better effectiveness, suitable for mini-drama and reality style video.
**Supported values**:
- basic
- advanced
     */
    public void setWatermarkModel(String WatermarkModel) {
        this.WatermarkModel = WatermarkModel;
    }

    /**
     * Get Automatically erase the custom region.
Automatically detects and erases the targeted removal in the specified region using the AI model.
Note that this parameter will not take effect when the removal method is custom. to modify the template, input [] for the clean-up region. if not provided, the template region information remains unchanged. 
     * @return AutoAreas Automatically erase the custom region.
Automatically detects and erases the targeted removal in the specified region using the AI model.
Note that this parameter will not take effect when the removal method is custom. to modify the template, input [] for the clean-up region. if not provided, the template region information remains unchanged.
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set Automatically erase the custom region.
Automatically detects and erases the targeted removal in the specified region using the AI model.
Note that this parameter will not take effect when the removal method is custom. to modify the template, input [] for the clean-up region. if not provided, the template region information remains unchanged.
     * @param AutoAreas Automatically erase the custom region.
Automatically detects and erases the targeted removal in the specified region using the AI model.
Note that this parameter will not take effect when the removal method is custom. to modify the template, input [] for the clean-up region. if not provided, the template region information remains unchanged.
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get Specifies the removal of a custom region.
Specifies to directly perform removal without detection and recognition within a selected time range for the specified region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed. 
     * @return CustomAreas Specifies the removal of a custom region.
Specifies to directly perform removal without detection and recognition within a selected time range for the specified region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set Specifies the removal of a custom region.
Specifies to directly perform removal without detection and recognition within a selected time range for the specified region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
     * @param CustomAreas Specifies the removal of a custom region.
Specifies to directly perform removal without detection and recognition within a selected time range for the specified region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
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

