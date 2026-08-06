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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransDetail extends AbstractModel {

    /**
    * <p>Original text of the current row</p>
    */
    @SerializedName("SourceLineText")
    @Expose
    private String SourceLineText;

    /**
    * <p>Translation of the current row</p>
    */
    @SerializedName("TargetLineText")
    @Expose
    private String TargetLineText;

    /**
    * <p>Paragraph text box location</p>
    */
    @SerializedName("BoundingBox")
    @Expose
    private BoundingBox BoundingBox;

    /**
    * <p>Row count</p>
    */
    @SerializedName("LinesCount")
    @Expose
    private Long LinesCount;

    /**
    * <p>Line height.</p><p>Unit: px.</p>
    */
    @SerializedName("LineHeight")
    @Expose
    private Long LineHeight;

    /**
    * <p>The spam_code field is 0 in a normal paragraph; if the spam_code field exists and its value is above 0 (1: hit garbage check; 2: hit security policy; 3: another.), then the security check hit is filtered.</p>
    */
    @SerializedName("SpamCode")
    @Expose
    private Long SpamCode;

    /**
    * <p>Rotation information of paragraph text. Coordinates are valid only when valid is true.</p>
    */
    @SerializedName("RotateParagraphRect")
    @Expose
    private RotateParagraphRect RotateParagraphRect;

    /**
     * Get <p>Original text of the current row</p> 
     * @return SourceLineText <p>Original text of the current row</p>
     */
    public String getSourceLineText() {
        return this.SourceLineText;
    }

    /**
     * Set <p>Original text of the current row</p>
     * @param SourceLineText <p>Original text of the current row</p>
     */
    public void setSourceLineText(String SourceLineText) {
        this.SourceLineText = SourceLineText;
    }

    /**
     * Get <p>Translation of the current row</p> 
     * @return TargetLineText <p>Translation of the current row</p>
     */
    public String getTargetLineText() {
        return this.TargetLineText;
    }

    /**
     * Set <p>Translation of the current row</p>
     * @param TargetLineText <p>Translation of the current row</p>
     */
    public void setTargetLineText(String TargetLineText) {
        this.TargetLineText = TargetLineText;
    }

    /**
     * Get <p>Paragraph text box location</p> 
     * @return BoundingBox <p>Paragraph text box location</p>
     */
    public BoundingBox getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set <p>Paragraph text box location</p>
     * @param BoundingBox <p>Paragraph text box location</p>
     */
    public void setBoundingBox(BoundingBox BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    /**
     * Get <p>Row count</p> 
     * @return LinesCount <p>Row count</p>
     */
    public Long getLinesCount() {
        return this.LinesCount;
    }

    /**
     * Set <p>Row count</p>
     * @param LinesCount <p>Row count</p>
     */
    public void setLinesCount(Long LinesCount) {
        this.LinesCount = LinesCount;
    }

    /**
     * Get <p>Line height.</p><p>Unit: px.</p> 
     * @return LineHeight <p>Line height.</p><p>Unit: px.</p>
     */
    public Long getLineHeight() {
        return this.LineHeight;
    }

    /**
     * Set <p>Line height.</p><p>Unit: px.</p>
     * @param LineHeight <p>Line height.</p><p>Unit: px.</p>
     */
    public void setLineHeight(Long LineHeight) {
        this.LineHeight = LineHeight;
    }

    /**
     * Get <p>The spam_code field is 0 in a normal paragraph; if the spam_code field exists and its value is above 0 (1: hit garbage check; 2: hit security policy; 3: another.), then the security check hit is filtered.</p> 
     * @return SpamCode <p>The spam_code field is 0 in a normal paragraph; if the spam_code field exists and its value is above 0 (1: hit garbage check; 2: hit security policy; 3: another.), then the security check hit is filtered.</p>
     */
    public Long getSpamCode() {
        return this.SpamCode;
    }

    /**
     * Set <p>The spam_code field is 0 in a normal paragraph; if the spam_code field exists and its value is above 0 (1: hit garbage check; 2: hit security policy; 3: another.), then the security check hit is filtered.</p>
     * @param SpamCode <p>The spam_code field is 0 in a normal paragraph; if the spam_code field exists and its value is above 0 (1: hit garbage check; 2: hit security policy; 3: another.), then the security check hit is filtered.</p>
     */
    public void setSpamCode(Long SpamCode) {
        this.SpamCode = SpamCode;
    }

    /**
     * Get <p>Rotation information of paragraph text. Coordinates are valid only when valid is true.</p> 
     * @return RotateParagraphRect <p>Rotation information of paragraph text. Coordinates are valid only when valid is true.</p>
     */
    public RotateParagraphRect getRotateParagraphRect() {
        return this.RotateParagraphRect;
    }

    /**
     * Set <p>Rotation information of paragraph text. Coordinates are valid only when valid is true.</p>
     * @param RotateParagraphRect <p>Rotation information of paragraph text. Coordinates are valid only when valid is true.</p>
     */
    public void setRotateParagraphRect(RotateParagraphRect RotateParagraphRect) {
        this.RotateParagraphRect = RotateParagraphRect;
    }

    public TransDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransDetail(TransDetail source) {
        if (source.SourceLineText != null) {
            this.SourceLineText = new String(source.SourceLineText);
        }
        if (source.TargetLineText != null) {
            this.TargetLineText = new String(source.TargetLineText);
        }
        if (source.BoundingBox != null) {
            this.BoundingBox = new BoundingBox(source.BoundingBox);
        }
        if (source.LinesCount != null) {
            this.LinesCount = new Long(source.LinesCount);
        }
        if (source.LineHeight != null) {
            this.LineHeight = new Long(source.LineHeight);
        }
        if (source.SpamCode != null) {
            this.SpamCode = new Long(source.SpamCode);
        }
        if (source.RotateParagraphRect != null) {
            this.RotateParagraphRect = new RotateParagraphRect(source.RotateParagraphRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceLineText", this.SourceLineText);
        this.setParamSimple(map, prefix + "TargetLineText", this.TargetLineText);
        this.setParamObj(map, prefix + "BoundingBox.", this.BoundingBox);
        this.setParamSimple(map, prefix + "LinesCount", this.LinesCount);
        this.setParamSimple(map, prefix + "LineHeight", this.LineHeight);
        this.setParamSimple(map, prefix + "SpamCode", this.SpamCode);
        this.setParamObj(map, prefix + "RotateParagraphRect.", this.RotateParagraphRect);

    }
}

