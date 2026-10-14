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

public class ImageEraseLogoConfig extends AbstractModel {

    /**
    * <p>Capability configuration switch. Available values: </p><li>ON: Enable;</li><li>OFF: Disable.</li>Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Multiple box selection regions to erase, with up to 16 regions enabled.<br>Note: This field may return null, indicating that no valid value can be obtained.</p>
    */
    @SerializedName("ImageAreaBoxes")
    @Expose
    private ImageAreaBoxInfo [] ImageAreaBoxes;

    /**
    * <p>Watermark removal capacity gear selection. Available values:</p><p>Enumeration values:</p><ul><li>low: quick removal gear</li><li>mid: balanced removal effect and speed gear</li><li>high: advanced removal effect gear</li></ul><p>Note: Select the corresponding removal gear based on the complexity of the removal scenario.</p>
    */
    @SerializedName("EraseStrength")
    @Expose
    private String EraseStrength;

    /**
    * <p>When erasing image watermarks, select a specific watermark type. Available values:</p><p>Enumeration values:</p><ul><li>corner_watermark: Erase a normal fixed-location watermark</li><li>tiled_watermark: Erase a tile watermark across the entire image</li><li>auto_detect_type: Automatically identify the watermark type and erase it</li><li>selected_watermark: Skip automatic removal and perform watermark removal at a specified position</li></ul>
    */
    @SerializedName("WatermarkType")
    @Expose
    private String WatermarkType;

    /**
     * Get <p>Capability configuration switch. Available values: </p><li>ON: Enable;</li><li>OFF: Disable.</li>Default value: ON. 
     * @return Switch <p>Capability configuration switch. Available values: </p><li>ON: Enable;</li><li>OFF: Disable.</li>Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch. Available values: </p><li>ON: Enable;</li><li>OFF: Disable.</li>Default value: ON.
     * @param Switch <p>Capability configuration switch. Available values: </p><li>ON: Enable;</li><li>OFF: Disable.</li>Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Multiple box selection regions to erase, with up to 16 regions enabled.<br>Note: This field may return null, indicating that no valid value can be obtained.</p> 
     * @return ImageAreaBoxes <p>Multiple box selection regions to erase, with up to 16 regions enabled.<br>Note: This field may return null, indicating that no valid value can be obtained.</p>
     */
    public ImageAreaBoxInfo [] getImageAreaBoxes() {
        return this.ImageAreaBoxes;
    }

    /**
     * Set <p>Multiple box selection regions to erase, with up to 16 regions enabled.<br>Note: This field may return null, indicating that no valid value can be obtained.</p>
     * @param ImageAreaBoxes <p>Multiple box selection regions to erase, with up to 16 regions enabled.<br>Note: This field may return null, indicating that no valid value can be obtained.</p>
     */
    public void setImageAreaBoxes(ImageAreaBoxInfo [] ImageAreaBoxes) {
        this.ImageAreaBoxes = ImageAreaBoxes;
    }

    /**
     * Get <p>Watermark removal capacity gear selection. Available values:</p><p>Enumeration values:</p><ul><li>low: quick removal gear</li><li>mid: balanced removal effect and speed gear</li><li>high: advanced removal effect gear</li></ul><p>Note: Select the corresponding removal gear based on the complexity of the removal scenario.</p> 
     * @return EraseStrength <p>Watermark removal capacity gear selection. Available values:</p><p>Enumeration values:</p><ul><li>low: quick removal gear</li><li>mid: balanced removal effect and speed gear</li><li>high: advanced removal effect gear</li></ul><p>Note: Select the corresponding removal gear based on the complexity of the removal scenario.</p>
     */
    public String getEraseStrength() {
        return this.EraseStrength;
    }

    /**
     * Set <p>Watermark removal capacity gear selection. Available values:</p><p>Enumeration values:</p><ul><li>low: quick removal gear</li><li>mid: balanced removal effect and speed gear</li><li>high: advanced removal effect gear</li></ul><p>Note: Select the corresponding removal gear based on the complexity of the removal scenario.</p>
     * @param EraseStrength <p>Watermark removal capacity gear selection. Available values:</p><p>Enumeration values:</p><ul><li>low: quick removal gear</li><li>mid: balanced removal effect and speed gear</li><li>high: advanced removal effect gear</li></ul><p>Note: Select the corresponding removal gear based on the complexity of the removal scenario.</p>
     */
    public void setEraseStrength(String EraseStrength) {
        this.EraseStrength = EraseStrength;
    }

    /**
     * Get <p>When erasing image watermarks, select a specific watermark type. Available values:</p><p>Enumeration values:</p><ul><li>corner_watermark: Erase a normal fixed-location watermark</li><li>tiled_watermark: Erase a tile watermark across the entire image</li><li>auto_detect_type: Automatically identify the watermark type and erase it</li><li>selected_watermark: Skip automatic removal and perform watermark removal at a specified position</li></ul> 
     * @return WatermarkType <p>When erasing image watermarks, select a specific watermark type. Available values:</p><p>Enumeration values:</p><ul><li>corner_watermark: Erase a normal fixed-location watermark</li><li>tiled_watermark: Erase a tile watermark across the entire image</li><li>auto_detect_type: Automatically identify the watermark type and erase it</li><li>selected_watermark: Skip automatic removal and perform watermark removal at a specified position</li></ul>
     */
    public String getWatermarkType() {
        return this.WatermarkType;
    }

    /**
     * Set <p>When erasing image watermarks, select a specific watermark type. Available values:</p><p>Enumeration values:</p><ul><li>corner_watermark: Erase a normal fixed-location watermark</li><li>tiled_watermark: Erase a tile watermark across the entire image</li><li>auto_detect_type: Automatically identify the watermark type and erase it</li><li>selected_watermark: Skip automatic removal and perform watermark removal at a specified position</li></ul>
     * @param WatermarkType <p>When erasing image watermarks, select a specific watermark type. Available values:</p><p>Enumeration values:</p><ul><li>corner_watermark: Erase a normal fixed-location watermark</li><li>tiled_watermark: Erase a tile watermark across the entire image</li><li>auto_detect_type: Automatically identify the watermark type and erase it</li><li>selected_watermark: Skip automatic removal and perform watermark removal at a specified position</li></ul>
     */
    public void setWatermarkType(String WatermarkType) {
        this.WatermarkType = WatermarkType;
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
        if (source.EraseStrength != null) {
            this.EraseStrength = new String(source.EraseStrength);
        }
        if (source.WatermarkType != null) {
            this.WatermarkType = new String(source.WatermarkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ImageAreaBoxes.", this.ImageAreaBoxes);
        this.setParamSimple(map, prefix + "EraseStrength", this.EraseStrength);
        this.setParamSimple(map, prefix + "WatermarkType", this.WatermarkType);

    }
}

