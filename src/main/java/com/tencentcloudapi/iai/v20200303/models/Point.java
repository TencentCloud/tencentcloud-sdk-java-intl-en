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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Point extends AbstractModel {

    /**
    * X coordinate
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * Y coordinate
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * Get X coordinate 
     * @return X X coordinate
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set X coordinate
     * @param X X coordinate
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y coordinate 
     * @return Y Y coordinate
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y coordinate
     * @param Y Y coordinate
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    public Point() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Point(Point source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

