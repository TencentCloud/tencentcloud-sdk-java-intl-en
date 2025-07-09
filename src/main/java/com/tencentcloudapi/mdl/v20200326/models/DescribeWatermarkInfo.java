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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWatermarkInfo extends AbstractModel {

    /**
    * Watermark ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Watermark name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Watermark type. Valid values: STATIC_IMAGE, TEXT.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ImageSettings")
    @Expose
    private DescribeImageSettings ImageSettings;

    /**
    * Watermark text settings. This parameter is valid if `Type` is `TEXT`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TextSettings")
    @Expose
    private DescribeTextSettings TextSettings;

    /**
    * Last modified time (UTC+0) of the watermark, in the format of `2020-01-01T12:00:00Z`
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * List of channel IDs the watermark is bound to
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AttachedChannels")
    @Expose
    private String [] AttachedChannels;

    /**
     * Get Watermark ID 
     * @return Id Watermark ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Watermark ID
     * @param Id Watermark ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Watermark name 
     * @return Name Watermark name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Watermark name
     * @param Name Watermark name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Watermark type. Valid values: STATIC_IMAGE, TEXT. 
     * @return Type Watermark type. Valid values: STATIC_IMAGE, TEXT.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Watermark type. Valid values: STATIC_IMAGE, TEXT.
     * @param Type Watermark type. Valid values: STATIC_IMAGE, TEXT.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ImageSettings Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DescribeImageSettings getImageSettings() {
        return this.ImageSettings;
    }

    /**
     * Set Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param ImageSettings Watermark image settings. This parameter is valid if `Type` is `STATIC_IMAGE`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setImageSettings(DescribeImageSettings ImageSettings) {
        this.ImageSettings = ImageSettings;
    }

    /**
     * Get Watermark text settings. This parameter is valid if `Type` is `TEXT`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TextSettings Watermark text settings. This parameter is valid if `Type` is `TEXT`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DescribeTextSettings getTextSettings() {
        return this.TextSettings;
    }

    /**
     * Set Watermark text settings. This parameter is valid if `Type` is `TEXT`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param TextSettings Watermark text settings. This parameter is valid if `Type` is `TEXT`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTextSettings(DescribeTextSettings TextSettings) {
        this.TextSettings = TextSettings;
    }

    /**
     * Get Last modified time (UTC+0) of the watermark, in the format of `2020-01-01T12:00:00Z`
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UpdateTime Last modified time (UTC+0) of the watermark, in the format of `2020-01-01T12:00:00Z`
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time (UTC+0) of the watermark, in the format of `2020-01-01T12:00:00Z`
Note: This field may return `null`, indicating that no valid value was found.
     * @param UpdateTime Last modified time (UTC+0) of the watermark, in the format of `2020-01-01T12:00:00Z`
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get List of channel IDs the watermark is bound to
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AttachedChannels List of channel IDs the watermark is bound to
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getAttachedChannels() {
        return this.AttachedChannels;
    }

    /**
     * Set List of channel IDs the watermark is bound to
Note: This field may return `null`, indicating that no valid value was found.
     * @param AttachedChannels List of channel IDs the watermark is bound to
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAttachedChannels(String [] AttachedChannels) {
        this.AttachedChannels = AttachedChannels;
    }

    public DescribeWatermarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWatermarkInfo(DescribeWatermarkInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImageSettings != null) {
            this.ImageSettings = new DescribeImageSettings(source.ImageSettings);
        }
        if (source.TextSettings != null) {
            this.TextSettings = new DescribeTextSettings(source.TextSettings);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AttachedChannels != null) {
            this.AttachedChannels = new String[source.AttachedChannels.length];
            for (int i = 0; i < source.AttachedChannels.length; i++) {
                this.AttachedChannels[i] = new String(source.AttachedChannels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ImageSettings.", this.ImageSettings);
        this.setParamObj(map, prefix + "TextSettings.", this.TextSettings);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "AttachedChannels.", this.AttachedChannels);

    }
}

