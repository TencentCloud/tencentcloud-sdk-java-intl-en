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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenTrendsChart extends AbstractModel {

    /**
    * Time on the X-axis
    */
    @SerializedName("X")
    @Expose
    private String X;

    /**
    * Numerical value on the Y-axis
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * Statistical type: defense count, attack count
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Time on the X-axis 
     * @return X Time on the X-axis
     */
    public String getX() {
        return this.X;
    }

    /**
     * Set Time on the X-axis
     * @param X Time on the X-axis
     */
    public void setX(String X) {
        this.X = X;
    }

    /**
     * Get Numerical value on the Y-axis 
     * @return Y Numerical value on the Y-axis
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Numerical value on the Y-axis
     * @param Y Numerical value on the Y-axis
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get Statistical type: defense count, attack count 
     * @return Type Statistical type: defense count, attack count
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Statistical type: defense count, attack count
     * @param Type Statistical type: defense count, attack count
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ScreenTrendsChart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenTrendsChart(ScreenTrendsChart source) {
        if (source.X != null) {
            this.X = new String(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

