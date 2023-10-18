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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Value extends AbstractModel {

    /**
    * The value of the recognized field.
    */
    @SerializedName("AutoContent")
    @Expose
    private String AutoContent;

    /**
    * The coordinates of the four vertices.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Coord")
    @Expose
    private Polygon Coord;

    /**
     * Get The value of the recognized field. 
     * @return AutoContent The value of the recognized field.
     */
    public String getAutoContent() {
        return this.AutoContent;
    }

    /**
     * Set The value of the recognized field.
     * @param AutoContent The value of the recognized field.
     */
    public void setAutoContent(String AutoContent) {
        this.AutoContent = AutoContent;
    }

    /**
     * Get The coordinates of the four vertices.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Coord The coordinates of the four vertices.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Polygon getCoord() {
        return this.Coord;
    }

    /**
     * Set The coordinates of the four vertices.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Coord The coordinates of the four vertices.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoord(Polygon Coord) {
        this.Coord = Coord;
    }

    public Value() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Value(Value source) {
        if (source.AutoContent != null) {
            this.AutoContent = new String(source.AutoContent);
        }
        if (source.Coord != null) {
            this.Coord = new Polygon(source.Coord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoContent", this.AutoContent);
        this.setParamObj(map, prefix + "Coord.", this.Coord);

    }
}

