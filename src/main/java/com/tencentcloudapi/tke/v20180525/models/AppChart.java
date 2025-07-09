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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppChart extends AbstractModel {

    /**
    * chart name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag of the chart.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Version of the chart.
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
     * Get chart name. 
     * @return Name chart name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set chart name.
     * @param Name chart name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag of the chart. 
     * @return Label Tag of the chart.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of the chart.
     * @param Label Tag of the chart.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Version of the chart. 
     * @return LatestVersion Version of the chart.
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set Version of the chart.
     * @param LatestVersion Version of the chart.
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    public AppChart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppChart(AppChart source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);

    }
}

