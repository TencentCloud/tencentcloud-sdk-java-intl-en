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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextDetectionResult extends AbstractModel {

    /**
    * The recognized text line content.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * The coordinates, represented in the coordinates of the four points.
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
     * Get The recognized text line content. 
     * @return Value The recognized text line content.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set The recognized text line content.
     * @param Value The recognized text line content.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get The coordinates, represented in the coordinates of the four points. 
     * @return Polygon The coordinates, represented in the coordinates of the four points.
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set The coordinates, represented in the coordinates of the four points.
     * @param Polygon The coordinates, represented in the coordinates of the four points.
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    public TextDetectionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextDetectionResult(TextDetectionResult source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
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
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);

    }
}

