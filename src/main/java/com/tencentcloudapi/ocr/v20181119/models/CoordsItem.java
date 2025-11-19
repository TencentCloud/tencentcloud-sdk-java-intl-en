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

public class CoordsItem extends AbstractModel {

    /**
    * Coordinates of four points in the image.
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon Polygon;

    /**
    * Coordinates of two points in the image.
    */
    @SerializedName("Coords")
    @Expose
    private ItemCoord Coords;

    /**
     * Get Coordinates of four points in the image. 
     * @return Polygon Coordinates of four points in the image.
     */
    public Polygon getPolygon() {
        return this.Polygon;
    }

    /**
     * Set Coordinates of four points in the image.
     * @param Polygon Coordinates of four points in the image.
     */
    public void setPolygon(Polygon Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get Coordinates of two points in the image. 
     * @return Coords Coordinates of two points in the image.
     */
    public ItemCoord getCoords() {
        return this.Coords;
    }

    /**
     * Set Coordinates of two points in the image.
     * @param Coords Coordinates of two points in the image.
     */
    public void setCoords(ItemCoord Coords) {
        this.Coords = Coords;
    }

    public CoordsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoordsItem(CoordsItem source) {
        if (source.Polygon != null) {
            this.Polygon = new Polygon(source.Polygon);
        }
        if (source.Coords != null) {
            this.Coords = new ItemCoord(source.Coords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamObj(map, prefix + "Coords.", this.Coords);

    }
}

