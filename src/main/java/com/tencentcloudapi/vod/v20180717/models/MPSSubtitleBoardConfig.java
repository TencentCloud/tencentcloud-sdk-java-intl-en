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

public class MPSSubtitleBoardConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubtitleBoardConfigSwitch")
    @Expose
    private Long SubtitleBoardConfigSwitch;

    /**
    * 
    */
    @SerializedName("BoardX")
    @Expose
    private Long BoardX;

    /**
    * 
    */
    @SerializedName("BoardXUnit")
    @Expose
    private Long BoardXUnit;

    /**
    * 
    */
    @SerializedName("BoardY")
    @Expose
    private Long BoardY;

    /**
    * 
    */
    @SerializedName("BoardYUnit")
    @Expose
    private Long BoardYUnit;

    /**
    * 
    */
    @SerializedName("BoardWidth")
    @Expose
    private Long BoardWidth;

    /**
    * 
    */
    @SerializedName("BoardWidthUnit")
    @Expose
    private Long BoardWidthUnit;

    /**
    * 
    */
    @SerializedName("BoardHeight")
    @Expose
    private Long BoardHeight;

    /**
    * 
    */
    @SerializedName("BoardHeightUnit")
    @Expose
    private Long BoardHeightUnit;

    /**
    * 
    */
    @SerializedName("BoardColor")
    @Expose
    private String BoardColor;

    /**
    * 
    */
    @SerializedName("BoardAlpha")
    @Expose
    private Float BoardAlpha;

    /**
     * Get  
     * @return SubtitleBoardConfigSwitch 
     */
    public Long getSubtitleBoardConfigSwitch() {
        return this.SubtitleBoardConfigSwitch;
    }

    /**
     * Set 
     * @param SubtitleBoardConfigSwitch 
     */
    public void setSubtitleBoardConfigSwitch(Long SubtitleBoardConfigSwitch) {
        this.SubtitleBoardConfigSwitch = SubtitleBoardConfigSwitch;
    }

    /**
     * Get  
     * @return BoardX 
     */
    public Long getBoardX() {
        return this.BoardX;
    }

    /**
     * Set 
     * @param BoardX 
     */
    public void setBoardX(Long BoardX) {
        this.BoardX = BoardX;
    }

    /**
     * Get  
     * @return BoardXUnit 
     */
    public Long getBoardXUnit() {
        return this.BoardXUnit;
    }

    /**
     * Set 
     * @param BoardXUnit 
     */
    public void setBoardXUnit(Long BoardXUnit) {
        this.BoardXUnit = BoardXUnit;
    }

    /**
     * Get  
     * @return BoardY 
     */
    public Long getBoardY() {
        return this.BoardY;
    }

    /**
     * Set 
     * @param BoardY 
     */
    public void setBoardY(Long BoardY) {
        this.BoardY = BoardY;
    }

    /**
     * Get  
     * @return BoardYUnit 
     */
    public Long getBoardYUnit() {
        return this.BoardYUnit;
    }

    /**
     * Set 
     * @param BoardYUnit 
     */
    public void setBoardYUnit(Long BoardYUnit) {
        this.BoardYUnit = BoardYUnit;
    }

    /**
     * Get  
     * @return BoardWidth 
     */
    public Long getBoardWidth() {
        return this.BoardWidth;
    }

    /**
     * Set 
     * @param BoardWidth 
     */
    public void setBoardWidth(Long BoardWidth) {
        this.BoardWidth = BoardWidth;
    }

    /**
     * Get  
     * @return BoardWidthUnit 
     */
    public Long getBoardWidthUnit() {
        return this.BoardWidthUnit;
    }

    /**
     * Set 
     * @param BoardWidthUnit 
     */
    public void setBoardWidthUnit(Long BoardWidthUnit) {
        this.BoardWidthUnit = BoardWidthUnit;
    }

    /**
     * Get  
     * @return BoardHeight 
     */
    public Long getBoardHeight() {
        return this.BoardHeight;
    }

    /**
     * Set 
     * @param BoardHeight 
     */
    public void setBoardHeight(Long BoardHeight) {
        this.BoardHeight = BoardHeight;
    }

    /**
     * Get  
     * @return BoardHeightUnit 
     */
    public Long getBoardHeightUnit() {
        return this.BoardHeightUnit;
    }

    /**
     * Set 
     * @param BoardHeightUnit 
     */
    public void setBoardHeightUnit(Long BoardHeightUnit) {
        this.BoardHeightUnit = BoardHeightUnit;
    }

    /**
     * Get  
     * @return BoardColor 
     */
    public String getBoardColor() {
        return this.BoardColor;
    }

    /**
     * Set 
     * @param BoardColor 
     */
    public void setBoardColor(String BoardColor) {
        this.BoardColor = BoardColor;
    }

    /**
     * Get  
     * @return BoardAlpha 
     */
    public Float getBoardAlpha() {
        return this.BoardAlpha;
    }

    /**
     * Set 
     * @param BoardAlpha 
     */
    public void setBoardAlpha(Float BoardAlpha) {
        this.BoardAlpha = BoardAlpha;
    }

    public MPSSubtitleBoardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleBoardConfig(MPSSubtitleBoardConfig source) {
        if (source.SubtitleBoardConfigSwitch != null) {
            this.SubtitleBoardConfigSwitch = new Long(source.SubtitleBoardConfigSwitch);
        }
        if (source.BoardX != null) {
            this.BoardX = new Long(source.BoardX);
        }
        if (source.BoardXUnit != null) {
            this.BoardXUnit = new Long(source.BoardXUnit);
        }
        if (source.BoardY != null) {
            this.BoardY = new Long(source.BoardY);
        }
        if (source.BoardYUnit != null) {
            this.BoardYUnit = new Long(source.BoardYUnit);
        }
        if (source.BoardWidth != null) {
            this.BoardWidth = new Long(source.BoardWidth);
        }
        if (source.BoardWidthUnit != null) {
            this.BoardWidthUnit = new Long(source.BoardWidthUnit);
        }
        if (source.BoardHeight != null) {
            this.BoardHeight = new Long(source.BoardHeight);
        }
        if (source.BoardHeightUnit != null) {
            this.BoardHeightUnit = new Long(source.BoardHeightUnit);
        }
        if (source.BoardColor != null) {
            this.BoardColor = new String(source.BoardColor);
        }
        if (source.BoardAlpha != null) {
            this.BoardAlpha = new Float(source.BoardAlpha);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleBoardConfigSwitch", this.SubtitleBoardConfigSwitch);
        this.setParamSimple(map, prefix + "BoardX", this.BoardX);
        this.setParamSimple(map, prefix + "BoardXUnit", this.BoardXUnit);
        this.setParamSimple(map, prefix + "BoardY", this.BoardY);
        this.setParamSimple(map, prefix + "BoardYUnit", this.BoardYUnit);
        this.setParamSimple(map, prefix + "BoardWidth", this.BoardWidth);
        this.setParamSimple(map, prefix + "BoardWidthUnit", this.BoardWidthUnit);
        this.setParamSimple(map, prefix + "BoardHeight", this.BoardHeight);
        this.setParamSimple(map, prefix + "BoardHeightUnit", this.BoardHeightUnit);
        this.setParamSimple(map, prefix + "BoardColor", this.BoardColor);
        this.setParamSimple(map, prefix + "BoardAlpha", this.BoardAlpha);

    }
}

