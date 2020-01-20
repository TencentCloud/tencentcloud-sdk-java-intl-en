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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataPoint extends AbstractModel{

    /**
    * Combination of instance object dimensions
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * The array of timestamps indicating at which points in time there is data. Missing timestamps have no data points (i.e., missed)
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * The array of monitoring values, which is in one-to-one correspondence to Timestamps
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

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
     * Get The array of timestamps indicating at which points in time there is data. Missing timestamps have no data points (i.e., missed) 
     * @return Timestamps The array of timestamps indicating at which points in time there is data. Missing timestamps have no data points (i.e., missed)
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set The array of timestamps indicating at which points in time there is data. Missing timestamps have no data points (i.e., missed)
     * @param Timestamps The array of timestamps indicating at which points in time there is data. Missing timestamps have no data points (i.e., missed)
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get The array of monitoring values, which is in one-to-one correspondence to Timestamps 
     * @return Values The array of monitoring values, which is in one-to-one correspondence to Timestamps
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set The array of monitoring values, which is in one-to-one correspondence to Timestamps
     * @param Values The array of monitoring values, which is in one-to-one correspondence to Timestamps
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

