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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapshotByTimeOffsetTemplateRequest extends AbstractModel{

    /**
    * Unique ID of a time point screencapturing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Name of a time point screencapturing template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Image width in px. Value range: [128, 4,096].
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Image height in px. Value range: [128, 4,096].
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Image format. Valid values: jpg, png.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * Get Unique ID of a time point screencapturing template. 
     * @return Definition Unique ID of a time point screencapturing template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a time point screencapturing template.
     * @param Definition Unique ID of a time point screencapturing template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Name of a time point screencapturing template. Length limit: 64 characters. 
     * @return Name Name of a time point screencapturing template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a time point screencapturing template. Length limit: 64 characters.
     * @param Name Name of a time point screencapturing template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Image width in px. Value range: [128, 4,096]. 
     * @return Width Image width in px. Value range: [128, 4,096].
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Image width in px. Value range: [128, 4,096].
     * @param Width Image width in px. Value range: [128, 4,096].
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Image height in px. Value range: [128, 4,096]. 
     * @return Height Image height in px. Value range: [128, 4,096].
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Image height in px. Value range: [128, 4,096].
     * @param Height Image height in px. Value range: [128, 4,096].
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get  
     * @return ResolutionAdaptive 
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 
     * @param ResolutionAdaptive 
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Image format. Valid values: jpg, png. 
     * @return Format Image format. Valid values: jpg, png.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Image format. Valid values: jpg, png.
     * @param Format Image format. Valid values: jpg, png.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return FillType 
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set 
     * @param FillType 
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

