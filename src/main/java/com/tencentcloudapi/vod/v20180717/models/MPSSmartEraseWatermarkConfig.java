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

public class MPSSmartEraseWatermarkConfig extends AbstractModel {

    /**
    * <p>Watermark removal method. <strong>Auto erasure:</strong> Automatically identify watermarks in the video through Model A and generate a new video after removal. Suitable for dynamic watermarks. When using auto erasure, if you do not specify AutoAreas, the system will perform full-screen auto erasure on the video; if AutoAreas are specified, it will change to auto erasure on your designated regions. <strong>Specified area erasure:</strong> For static watermarks with fixed positions, it is recommended to directly specify the removal area. When you choose specified area erasure, import at least one designated region. - auto Auto erasure - custom Specified area erasure</p>
    */
    @SerializedName("WatermarkEraseMethod")
    @Expose
    private String WatermarkEraseMethod;

    /**
    * <p>Watermark removal model. basic Edition: provides average effects and high cost performance. It applies to animations or videos with clean backgrounds. advanced Edition: offers better effectiveness and is suitable for mini-dramas or reality-style videos. - basic Edition - advanced Edition</p>
    */
    @SerializedName("WatermarkModel")
    @Expose
    private String WatermarkModel;

    /**
    * <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets. Note: When the erase method is set to custom, this parameter will not take effect. To clear regions, input []. If not provided, the template region information remains unchanged.</p>
    */
    @SerializedName("AutoAreas")
    @Expose
    private MPSEraseArea [] AutoAreas;

    /**
    * <p>Specify the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: Import [] to clear regions. The template region information remains unchanged if not imported.</p>
    */
    @SerializedName("CustomAreas")
    @Expose
    private MPSEraseTimeArea [] CustomAreas;

    /**
     * Get <p>Watermark removal method. <strong>Auto erasure:</strong> Automatically identify watermarks in the video through Model A and generate a new video after removal. Suitable for dynamic watermarks. When using auto erasure, if you do not specify AutoAreas, the system will perform full-screen auto erasure on the video; if AutoAreas are specified, it will change to auto erasure on your designated regions. <strong>Specified area erasure:</strong> For static watermarks with fixed positions, it is recommended to directly specify the removal area. When you choose specified area erasure, import at least one designated region. - auto Auto erasure - custom Specified area erasure</p> 
     * @return WatermarkEraseMethod <p>Watermark removal method. <strong>Auto erasure:</strong> Automatically identify watermarks in the video through Model A and generate a new video after removal. Suitable for dynamic watermarks. When using auto erasure, if you do not specify AutoAreas, the system will perform full-screen auto erasure on the video; if AutoAreas are specified, it will change to auto erasure on your designated regions. <strong>Specified area erasure:</strong> For static watermarks with fixed positions, it is recommended to directly specify the removal area. When you choose specified area erasure, import at least one designated region. - auto Auto erasure - custom Specified area erasure</p>
     */
    public String getWatermarkEraseMethod() {
        return this.WatermarkEraseMethod;
    }

    /**
     * Set <p>Watermark removal method. <strong>Auto erasure:</strong> Automatically identify watermarks in the video through Model A and generate a new video after removal. Suitable for dynamic watermarks. When using auto erasure, if you do not specify AutoAreas, the system will perform full-screen auto erasure on the video; if AutoAreas are specified, it will change to auto erasure on your designated regions. <strong>Specified area erasure:</strong> For static watermarks with fixed positions, it is recommended to directly specify the removal area. When you choose specified area erasure, import at least one designated region. - auto Auto erasure - custom Specified area erasure</p>
     * @param WatermarkEraseMethod <p>Watermark removal method. <strong>Auto erasure:</strong> Automatically identify watermarks in the video through Model A and generate a new video after removal. Suitable for dynamic watermarks. When using auto erasure, if you do not specify AutoAreas, the system will perform full-screen auto erasure on the video; if AutoAreas are specified, it will change to auto erasure on your designated regions. <strong>Specified area erasure:</strong> For static watermarks with fixed positions, it is recommended to directly specify the removal area. When you choose specified area erasure, import at least one designated region. - auto Auto erasure - custom Specified area erasure</p>
     */
    public void setWatermarkEraseMethod(String WatermarkEraseMethod) {
        this.WatermarkEraseMethod = WatermarkEraseMethod;
    }

    /**
     * Get <p>Watermark removal model. basic Edition: provides average effects and high cost performance. It applies to animations or videos with clean backgrounds. advanced Edition: offers better effectiveness and is suitable for mini-dramas or reality-style videos. - basic Edition - advanced Edition</p> 
     * @return WatermarkModel <p>Watermark removal model. basic Edition: provides average effects and high cost performance. It applies to animations or videos with clean backgrounds. advanced Edition: offers better effectiveness and is suitable for mini-dramas or reality-style videos. - basic Edition - advanced Edition</p>
     */
    public String getWatermarkModel() {
        return this.WatermarkModel;
    }

    /**
     * Set <p>Watermark removal model. basic Edition: provides average effects and high cost performance. It applies to animations or videos with clean backgrounds. advanced Edition: offers better effectiveness and is suitable for mini-dramas or reality-style videos. - basic Edition - advanced Edition</p>
     * @param WatermarkModel <p>Watermark removal model. basic Edition: provides average effects and high cost performance. It applies to animations or videos with clean backgrounds. advanced Edition: offers better effectiveness and is suitable for mini-dramas or reality-style videos. - basic Edition - advanced Edition</p>
     */
    public void setWatermarkModel(String WatermarkModel) {
        this.WatermarkModel = WatermarkModel;
    }

    /**
     * Get <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets. Note: When the erase method is set to custom, this parameter will not take effect. To clear regions, input []. If not provided, the template region information remains unchanged.</p> 
     * @return AutoAreas <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets. Note: When the erase method is set to custom, this parameter will not take effect. To clear regions, input []. If not provided, the template region information remains unchanged.</p>
     */
    public MPSEraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets. Note: When the erase method is set to custom, this parameter will not take effect. To clear regions, input []. If not provided, the template region information remains unchanged.</p>
     * @param AutoAreas <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets. Note: When the erase method is set to custom, this parameter will not take effect. To clear regions, input []. If not provided, the template region information remains unchanged.</p>
     */
    public void setAutoAreas(MPSEraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get <p>Specify the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: Import [] to clear regions. The template region information remains unchanged if not imported.</p> 
     * @return CustomAreas <p>Specify the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: Import [] to clear regions. The template region information remains unchanged if not imported.</p>
     */
    public MPSEraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set <p>Specify the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: Import [] to clear regions. The template region information remains unchanged if not imported.</p>
     * @param CustomAreas <p>Specify the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: Import [] to clear regions. The template region information remains unchanged if not imported.</p>
     */
    public void setCustomAreas(MPSEraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public MPSSmartEraseWatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSmartEraseWatermarkConfig(MPSSmartEraseWatermarkConfig source) {
        if (source.WatermarkEraseMethod != null) {
            this.WatermarkEraseMethod = new String(source.WatermarkEraseMethod);
        }
        if (source.WatermarkModel != null) {
            this.WatermarkModel = new String(source.WatermarkModel);
        }
        if (source.AutoAreas != null) {
            this.AutoAreas = new MPSEraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new MPSEraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new MPSEraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new MPSEraseTimeArea(source.CustomAreas[i]);
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

