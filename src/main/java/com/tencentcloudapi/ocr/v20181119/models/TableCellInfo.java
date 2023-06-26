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

public class TableCellInfo extends AbstractModel{

    /**
    * Column index of the upper-left corner of the cell
    */
    @SerializedName("ColTl")
    @Expose
    private Long ColTl;

    /**
    * Row index of the upper-left corner of the cell
    */
    @SerializedName("RowTl")
    @Expose
    private Long RowTl;

    /**
    * Column index of the lower-right corner of the cell
    */
    @SerializedName("ColBr")
    @Expose
    private Long ColBr;

    /**
    * Row index of the lower-right corner of the cell
    */
    @SerializedName("RowBr")
    @Expose
    private Long RowBr;

    /**
    * Recognized string text within the cell. If there are multiple lines, they are separated by "\n".
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Cell type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cell confidence
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Four-point coordinates of the cell in the image
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
     * Get Column index of the upper-left corner of the cell 
     * @return ColTl Column index of the upper-left corner of the cell
     */
    public Long getColTl() {
        return this.ColTl;
    }

    /**
     * Set Column index of the upper-left corner of the cell
     * @param ColTl Column index of the upper-left corner of the cell
     */
    public void setColTl(Long ColTl) {
        this.ColTl = ColTl;
    }

    /**
     * Get Row index of the upper-left corner of the cell 
     * @return RowTl Row index of the upper-left corner of the cell
     */
    public Long getRowTl() {
        return this.RowTl;
    }

    /**
     * Set Row index of the upper-left corner of the cell
     * @param RowTl Row index of the upper-left corner of the cell
     */
    public void setRowTl(Long RowTl) {
        this.RowTl = RowTl;
    }

    /**
     * Get Column index of the lower-right corner of the cell 
     * @return ColBr Column index of the lower-right corner of the cell
     */
    public Long getColBr() {
        return this.ColBr;
    }

    /**
     * Set Column index of the lower-right corner of the cell
     * @param ColBr Column index of the lower-right corner of the cell
     */
    public void setColBr(Long ColBr) {
        this.ColBr = ColBr;
    }

    /**
     * Get Row index of the lower-right corner of the cell 
     * @return RowBr Row index of the lower-right corner of the cell
     */
    public Long getRowBr() {
        return this.RowBr;
    }

    /**
     * Set Row index of the lower-right corner of the cell
     * @param RowBr Row index of the lower-right corner of the cell
     */
    public void setRowBr(Long RowBr) {
        this.RowBr = RowBr;
    }

    /**
     * Get Recognized string text within the cell. If there are multiple lines, they are separated by "\n". 
     * @return Text Recognized string text within the cell. If there are multiple lines, they are separated by "\n".
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Recognized string text within the cell. If there are multiple lines, they are separated by "\n".
     * @param Text Recognized string text within the cell. If there are multiple lines, they are separated by "\n".
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Cell type 
     * @return Type Cell type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Cell type
     * @param Type Cell type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cell confidence 
     * @return Confidence Cell confidence
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Cell confidence
     * @param Confidence Cell confidence
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Four-point coordinates of the cell in the image 
     * @return Polygon Four-point coordinates of the cell in the image
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set Four-point coordinates of the cell in the image
     * @param Polygon Four-point coordinates of the cell in the image
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    public TableCellInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableCellInfo(TableCellInfo source) {
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
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Polygon != null) {
            this.Polygon = new Coord[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Coord(source.Polygon[i]);
            }
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

    }
}

