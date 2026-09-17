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

public class MPSUpdateSmartEraseSubtitleConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * 
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * 
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * 
    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * 
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * 
    */
    @SerializedName("TransDstLang")
    @Expose
    private String TransDstLang;

    /**
    * 
    */
    @SerializedName("AutoAreas")
    @Expose
    private MPSEraseArea [] AutoAreas;

    /**
    * 
    */
    @SerializedName("CustomAreas")
    @Expose
    private MPSEraseTimeArea [] CustomAreas;

    /**
     * Get  
     * @return SubtitleEraseMethod 
     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set 
     * @param SubtitleEraseMethod 
     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get  
     * @return SubtitleModel 
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set 
     * @param SubtitleModel 
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get  
     * @return OcrSwitch 
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set 
     * @param OcrSwitch 
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get  
     * @return SubtitleLang 
     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set 
     * @param SubtitleLang 
     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get  
     * @return SubtitleFormat 
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 
     * @param SubtitleFormat 
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get  
     * @return TransSwitch 
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set 
     * @param TransSwitch 
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get  
     * @return TransDstLang 
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set 
     * @param TransDstLang 
     */
    public void setTransDstLang(String TransDstLang) {
        this.TransDstLang = TransDstLang;
    }

    /**
     * Get  
     * @return AutoAreas 
     */
    public MPSEraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set 
     * @param AutoAreas 
     */
    public void setAutoAreas(MPSEraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get  
     * @return CustomAreas 
     */
    public MPSEraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set 
     * @param CustomAreas 
     */
    public void setCustomAreas(MPSEraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public MPSUpdateSmartEraseSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSUpdateSmartEraseSubtitleConfig(MPSUpdateSmartEraseSubtitleConfig source) {
        if (source.SubtitleEraseMethod != null) {
            this.SubtitleEraseMethod = new String(source.SubtitleEraseMethod);
        }
        if (source.SubtitleModel != null) {
            this.SubtitleModel = new String(source.SubtitleModel);
        }
        if (source.OcrSwitch != null) {
            this.OcrSwitch = new String(source.OcrSwitch);
        }
        if (source.SubtitleLang != null) {
            this.SubtitleLang = new String(source.SubtitleLang);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TransSwitch != null) {
            this.TransSwitch = new String(source.TransSwitch);
        }
        if (source.TransDstLang != null) {
            this.TransDstLang = new String(source.TransDstLang);
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
        this.setParamSimple(map, prefix + "SubtitleEraseMethod", this.SubtitleEraseMethod);
        this.setParamSimple(map, prefix + "SubtitleModel", this.SubtitleModel);
        this.setParamSimple(map, prefix + "OcrSwitch", this.OcrSwitch);
        this.setParamSimple(map, prefix + "SubtitleLang", this.SubtitleLang);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TransSwitch", this.TransSwitch);
        this.setParamSimple(map, prefix + "TransDstLang", this.TransDstLang);
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamArrayObj(map, prefix + "CustomAreas.", this.CustomAreas);

    }
}

