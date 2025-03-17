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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SampleStream extends AbstractModel {

    /**
    * Metric labels.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Array of metric values.
    */
    @SerializedName("Values")
    @Expose
    private SamplePair [] Values;

    /**
    * Metric name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Metric labels.

Note: This field may return null, indicating that no valid value is found. 
     * @return Labels Metric labels.

Note: This field may return null, indicating that no valid value is found.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Metric labels.

Note: This field may return null, indicating that no valid value is found.
     * @param Labels Metric labels.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Array of metric values. 
     * @return Values Array of metric values.
     */
    public SamplePair [] getValues() {
        return this.Values;
    }

    /**
     * Set Array of metric values.
     * @param Values Array of metric values.
     */
    public void setValues(SamplePair [] Values) {
        this.Values = Values;
    }

    /**
     * Get Metric name.

Note: This field may return null, indicating that no valid value is found. 
     * @return Name Metric name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Metric name.

Note: This field may return null, indicating that no valid value is found.
     * @param Name Metric name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public SampleStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SampleStream(SampleStream source) {
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new SamplePair[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new SamplePair(source.Values[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

