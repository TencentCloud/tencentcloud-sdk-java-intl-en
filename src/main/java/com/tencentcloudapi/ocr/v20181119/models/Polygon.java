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

public class Polygon extends AbstractModel{

    /**
    * The coordinates of the upper-left vertex.
    */
    @SerializedName("LeftTop")
    @Expose
    private Coord LeftTop;

    /**
    * The coordinates of the upper-right vertex.
    */
    @SerializedName("RightTop")
    @Expose
    private Coord RightTop;

    /**
    * The coordinates of the lower-left vertex.
    */
    @SerializedName("RightBottom")
    @Expose
    private Coord RightBottom;

    /**
    * The coordinates of the lower-right vertex.
    */
    @SerializedName("LeftBottom")
    @Expose
    private Coord LeftBottom;

    /**
     * Get The coordinates of the upper-left vertex. 
     * @return LeftTop The coordinates of the upper-left vertex.
     */
    public Coord getLeftTop() {
        return this.LeftTop;
    }

    /**
     * Set The coordinates of the upper-left vertex.
     * @param LeftTop The coordinates of the upper-left vertex.
     */
    public void setLeftTop(Coord LeftTop) {
        this.LeftTop = LeftTop;
    }

    /**
     * Get The coordinates of the upper-right vertex. 
     * @return RightTop The coordinates of the upper-right vertex.
     */
    public Coord getRightTop() {
        return this.RightTop;
    }

    /**
     * Set The coordinates of the upper-right vertex.
     * @param RightTop The coordinates of the upper-right vertex.
     */
    public void setRightTop(Coord RightTop) {
        this.RightTop = RightTop;
    }

    /**
     * Get The coordinates of the lower-left vertex. 
     * @return RightBottom The coordinates of the lower-left vertex.
     */
    public Coord getRightBottom() {
        return this.RightBottom;
    }

    /**
     * Set The coordinates of the lower-left vertex.
     * @param RightBottom The coordinates of the lower-left vertex.
     */
    public void setRightBottom(Coord RightBottom) {
        this.RightBottom = RightBottom;
    }

    /**
     * Get The coordinates of the lower-right vertex. 
     * @return LeftBottom The coordinates of the lower-right vertex.
     */
    public Coord getLeftBottom() {
        return this.LeftBottom;
    }

    /**
     * Set The coordinates of the lower-right vertex.
     * @param LeftBottom The coordinates of the lower-right vertex.
     */
    public void setLeftBottom(Coord LeftBottom) {
        this.LeftBottom = LeftBottom;
    }

    public Polygon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Polygon(Polygon source) {
        if (source.LeftTop != null) {
            this.LeftTop = new Coord(source.LeftTop);
        }
        if (source.RightTop != null) {
            this.RightTop = new Coord(source.RightTop);
        }
        if (source.RightBottom != null) {
            this.RightBottom = new Coord(source.RightBottom);
        }
        if (source.LeftBottom != null) {
            this.LeftBottom = new Coord(source.LeftBottom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LeftTop.", this.LeftTop);
        this.setParamObj(map, prefix + "RightTop.", this.RightTop);
        this.setParamObj(map, prefix + "RightBottom.", this.RightBottom);
        this.setParamObj(map, prefix + "LeftBottom.", this.LeftBottom);

    }
}

