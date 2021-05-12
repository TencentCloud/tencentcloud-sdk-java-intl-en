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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTable extends AbstractModel{

    /**
    * Column index of the top-left corner of the cell.
    */
    @SerializedName("ColTl")
    @Expose
    private Long ColTl;

    /**
    * Row index of the top-left corner of the cell.
    */
    @SerializedName("RowTl")
    @Expose
    private Long RowTl;

    /**
    * Column index of the bottom-right corner of the cell.
    */
    @SerializedName("ColBr")
    @Expose
    private Long ColBr;

    /**
    * Row index of the bottom-right corner of the cell.
    */
    @SerializedName("RowBr")
    @Expose
    private Long RowBr;

    /**
    * Cell text
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Cell type. Valid values: body, header, footer
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Confidence. Value range: 0–100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * Text line coordinates, which are represented as 4 vertex coordinates.
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * Extended field
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
     * Get Column index of the top-left corner of the cell. 
     * @return ColTl Column index of the top-left corner of the cell.
     */
    public Long getColTl() {
        return this.ColTl;
    }

    /**
     * Set Column index of the top-left corner of the cell.
     * @param ColTl Column index of the top-left corner of the cell.
     */
    public void setColTl(Long ColTl) {
        this.ColTl = ColTl;
    }

    /**
     * Get Row index of the top-left corner of the cell. 
     * @return RowTl Row index of the top-left corner of the cell.
     */
    public Long getRowTl() {
        return this.RowTl;
    }

    /**
     * Set Row index of the top-left corner of the cell.
     * @param RowTl Row index of the top-left corner of the cell.
     */
    public void setRowTl(Long RowTl) {
        this.RowTl = RowTl;
    }

    /**
     * Get Column index of the bottom-right corner of the cell. 
     * @return ColBr Column index of the bottom-right corner of the cell.
     */
    public Long getColBr() {
        return this.ColBr;
    }

    /**
     * Set Column index of the bottom-right corner of the cell.
     * @param ColBr Column index of the bottom-right corner of the cell.
     */
    public void setColBr(Long ColBr) {
        this.ColBr = ColBr;
    }

    /**
     * Get Row index of the bottom-right corner of the cell. 
     * @return RowBr Row index of the bottom-right corner of the cell.
     */
    public Long getRowBr() {
        return this.RowBr;
    }

    /**
     * Set Row index of the bottom-right corner of the cell.
     * @param RowBr Row index of the bottom-right corner of the cell.
     */
    public void setRowBr(Long RowBr) {
        this.RowBr = RowBr;
    }

    /**
     * Get Cell text 
     * @return Text Cell text
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Cell text
     * @param Text Cell text
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Cell type. Valid values: body, header, footer 
     * @return Type Cell type. Valid values: body, header, footer
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Cell type. Valid values: body, header, footer
     * @param Type Cell type. Valid values: body, header, footer
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Confidence. Value range: 0–100 
     * @return Confidence Confidence. Value range: 0–100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence. Value range: 0–100
     * @param Confidence Confidence. Value range: 0–100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Text line coordinates, which are represented as 4 vertex coordinates. 
     * @return Polygon Text line coordinates, which are represented as 4 vertex coordinates.
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set Text line coordinates, which are represented as 4 vertex coordinates.
     * @param Polygon Text line coordinates, which are represented as 4 vertex coordinates.
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get Extended field 
     * @return AdvancedInfo Extended field
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set Extended field
     * @param AdvancedInfo Extended field
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    public TextTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTable(TextTable source) {
        if (source.ColTl != null) {
            this.ColTl = new Long(source.ColTl);
        }
        if (source.RowTl != null) {
            this.RowTl = new Long(source.RowTl);
        }
        if (source.ColBr != null) {
            this.ColBr = new Long(source.ColBr);
        }
        if (source.RowBr != null) {
            this.RowBr = new Long(source.RowBr);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Polygon != null) {
            this.Polygon = new Coord[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Coord(source.Polygon[i]);
            }
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColTl", this.ColTl);
        this.setParamSimple(map, prefix + "RowTl", this.RowTl);
        this.setParamSimple(map, prefix + "ColBr", this.ColBr);
        this.setParamSimple(map, prefix + "RowBr", this.RowBr);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);

    }
}

