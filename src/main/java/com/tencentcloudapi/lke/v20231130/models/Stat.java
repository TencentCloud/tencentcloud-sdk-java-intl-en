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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Stat extends AbstractModel {

    /**
    * X-axis: time zone; return three interval ranges of "minute/hour/day" according to the granularity of the query condition.
    */
    @SerializedName("X")
    @Expose
    private String X;

    /**
    * Y-axis: statistical values in this time period, such as token consumption, call count, or usage information.
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
     * Get X-axis: time zone; return three interval ranges of "minute/hour/day" according to the granularity of the query condition. 
     * @return X X-axis: time zone; return three interval ranges of "minute/hour/day" according to the granularity of the query condition.
     */
    public String getX() {
        return this.X;
    }

    /**
     * Set X-axis: time zone; return three interval ranges of "minute/hour/day" according to the granularity of the query condition.
     * @param X X-axis: time zone; return three interval ranges of "minute/hour/day" according to the granularity of the query condition.
     */
    public void setX(String X) {
        this.X = X;
    }

    /**
     * Get Y-axis: statistical values in this time period, such as token consumption, call count, or usage information. 
     * @return Y Y-axis: statistical values in this time period, such as token consumption, call count, or usage information.
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set Y-axis: statistical values in this time period, such as token consumption, call count, or usage information.
     * @param Y Y-axis: statistical values in this time period, such as token consumption, call count, or usage information.
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    public Stat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Stat(Stat source) {
        if (source.X != null) {
            this.X = new String(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
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

