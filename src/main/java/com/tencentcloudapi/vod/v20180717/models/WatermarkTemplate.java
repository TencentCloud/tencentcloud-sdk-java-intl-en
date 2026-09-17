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

public class WatermarkTemplate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 
    */
    @SerializedName("ImageTemplate")
    @Expose
    private ImageWatermarkTemplate ImageTemplate;

    /**
    * 
    */
    @SerializedName("TextTemplate")
    @Expose
    private TextWatermarkTemplateInput TextTemplate;

    /**
    * 
    */
    @SerializedName("SvgTemplate")
    @Expose
    private SvgWatermarkInput SvgTemplate;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return XPos 
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 
     * @param XPos 
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get  
     * @return YPos 
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 
     * @param YPos 
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get  
     * @return ImageTemplate 
     */
    public ImageWatermarkTemplate getImageTemplate() {
        return this.ImageTemplate;
    }

    /**
     * Set 
     * @param ImageTemplate 
     */
    public void setImageTemplate(ImageWatermarkTemplate ImageTemplate) {
        this.ImageTemplate = ImageTemplate;
    }

    /**
     * Get  
     * @return TextTemplate 
     */
    public TextWatermarkTemplateInput getTextTemplate() {
        return this.TextTemplate;
    }

    /**
     * Set 
     * @param TextTemplate 
     */
    public void setTextTemplate(TextWatermarkTemplateInput TextTemplate) {
        this.TextTemplate = TextTemplate;
    }

    /**
     * Get  
     * @return SvgTemplate 
     */
    public SvgWatermarkInput getSvgTemplate() {
        return this.SvgTemplate;
    }

    /**
     * Set 
     * @param SvgTemplate 
     */
    public void setSvgTemplate(SvgWatermarkInput SvgTemplate) {
        this.SvgTemplate = SvgTemplate;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return CoordinateOrigin 
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set 
     * @param CoordinateOrigin 
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    public WatermarkTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkTemplate(WatermarkTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.ImageTemplate != null) {
            this.ImageTemplate = new ImageWatermarkTemplate(source.ImageTemplate);
        }
        if (source.TextTemplate != null) {
            this.TextTemplate = new TextWatermarkTemplateInput(source.TextTemplate);
        }
        if (source.SvgTemplate != null) {
            this.SvgTemplate = new SvgWatermarkInput(source.SvgTemplate);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamObj(map, prefix + "ImageTemplate.", this.ImageTemplate);
        this.setParamObj(map, prefix + "TextTemplate.", this.TextTemplate);
        this.setParamObj(map, prefix + "SvgTemplate.", this.SvgTemplate);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);

    }
}

