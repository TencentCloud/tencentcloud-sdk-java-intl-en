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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricDataPoint extends AbstractModel {

    /**
    * Combination of instance object dimensions
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * Data point list
    */
    @SerializedName("Values")
    @Expose
    private Point [] Values;

    /**
     * Get Combination of instance object dimensions 
     * @return Dimensions Combination of instance object dimensions
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Combination of instance object dimensions
     * @param Dimensions Combination of instance object dimensions
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Data point list 
     * @return Values Data point list
     */
    public Point [] getValues() {
        return this.Values;
    }

    /**
     * Set Data point list
     * @param Values Data point list
     */
    public void setValues(Point [] Values) {
        this.Values = Values;
    }

    public MetricDataPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDataPoint(MetricDataPoint source) {
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Point[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Point(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);

    }
}

