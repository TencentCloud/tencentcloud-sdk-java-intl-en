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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetFilterConfig extends AbstractModel {

    /**
    * <p>Query attributes</p>
    */
    @SerializedName("Attr")
    @Expose
    private String Attr;

    /**
    * <p>Show</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>Style</p>
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
    * <p>Value.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>Show in English</p>
    */
    @SerializedName("LabelEn")
    @Expose
    private String LabelEn;

    /**
    * <p>Asset private field filter</p>
    */
    @SerializedName("Options")
    @Expose
    private AssetFilterOptions [] Options;

    /**
     * Get <p>Query attributes</p> 
     * @return Attr <p>Query attributes</p>
     */
    public String getAttr() {
        return this.Attr;
    }

    /**
     * Set <p>Query attributes</p>
     * @param Attr <p>Query attributes</p>
     */
    public void setAttr(String Attr) {
        this.Attr = Attr;
    }

    /**
     * Get <p>Show</p> 
     * @return Label <p>Show</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Show</p>
     * @param Label <p>Show</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>Style</p> 
     * @return Style <p>Style</p>
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set <p>Style</p>
     * @param Style <p>Style</p>
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    /**
     * Get <p>Value.</p> 
     * @return Value <p>Value.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Value.</p>
     * @param Value <p>Value.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>Show in English</p> 
     * @return LabelEn <p>Show in English</p>
     */
    public String getLabelEn() {
        return this.LabelEn;
    }

    /**
     * Set <p>Show in English</p>
     * @param LabelEn <p>Show in English</p>
     */
    public void setLabelEn(String LabelEn) {
        this.LabelEn = LabelEn;
    }

    /**
     * Get <p>Asset private field filter</p> 
     * @return Options <p>Asset private field filter</p>
     */
    public AssetFilterOptions [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>Asset private field filter</p>
     * @param Options <p>Asset private field filter</p>
     */
    public void setOptions(AssetFilterOptions [] Options) {
        this.Options = Options;
    }

    public AssetFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetFilterConfig(AssetFilterConfig source) {
        if (source.Attr != null) {
            this.Attr = new String(source.Attr);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.LabelEn != null) {
            this.LabelEn = new String(source.LabelEn);
        }
        if (source.Options != null) {
            this.Options = new AssetFilterOptions[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new AssetFilterOptions(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attr", this.Attr);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Style", this.Style);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "LabelEn", this.LabelEn);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

