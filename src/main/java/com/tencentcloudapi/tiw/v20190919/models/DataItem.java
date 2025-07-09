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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataItem extends AbstractModel {

    /**
    * Time. The following formats are supported:
yyyy-mm
yyyy-mm-dd
yyyy-mm-dd HH:MM:SS
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Values required for drawing charts.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Details of the values.
    */
    @SerializedName("Details")
    @Expose
    private Detail [] Details;

    /**
     * Get Time. The following formats are supported:
yyyy-mm
yyyy-mm-dd
yyyy-mm-dd HH:MM:SS 
     * @return Time Time. The following formats are supported:
yyyy-mm
yyyy-mm-dd
yyyy-mm-dd HH:MM:SS
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time. The following formats are supported:
yyyy-mm
yyyy-mm-dd
yyyy-mm-dd HH:MM:SS
     * @param Time Time. The following formats are supported:
yyyy-mm
yyyy-mm-dd
yyyy-mm-dd HH:MM:SS
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Values required for drawing charts. 
     * @return Value Values required for drawing charts.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Values required for drawing charts.
     * @param Value Values required for drawing charts.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Details of the values. 
     * @return Details Details of the values.
     */
    public Detail [] getDetails() {
        return this.Details;
    }

    /**
     * Set Details of the values.
     * @param Details Details of the values.
     */
    public void setDetails(Detail [] Details) {
        this.Details = Details;
    }

    public DataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataItem(DataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Details != null) {
            this.Details = new Detail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new Detail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

