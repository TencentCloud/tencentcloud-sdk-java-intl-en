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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfs extends AbstractModel {

    /**
    * Whether to enable database inspection. Valid values: Yes, No.
    */
    @SerializedName("DailyInspection")
    @Expose
    private String DailyInspection;

    /**
    * Whether to enable instance overview. Valid values: Yes, No.
    */
    @SerializedName("OverviewDisplay")
    @Expose
    private String OverviewDisplay;

    /**
    * Custom big key analysis separator for Redis only
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyDelimiters")
    @Expose
    private String [] KeyDelimiters;

    /**
     * Get Whether to enable database inspection. Valid values: Yes, No. 
     * @return DailyInspection Whether to enable database inspection. Valid values: Yes, No.
     */
    public String getDailyInspection() {
        return this.DailyInspection;
    }

    /**
     * Set Whether to enable database inspection. Valid values: Yes, No.
     * @param DailyInspection Whether to enable database inspection. Valid values: Yes, No.
     */
    public void setDailyInspection(String DailyInspection) {
        this.DailyInspection = DailyInspection;
    }

    /**
     * Get Whether to enable instance overview. Valid values: Yes, No. 
     * @return OverviewDisplay Whether to enable instance overview. Valid values: Yes, No.
     */
    public String getOverviewDisplay() {
        return this.OverviewDisplay;
    }

    /**
     * Set Whether to enable instance overview. Valid values: Yes, No.
     * @param OverviewDisplay Whether to enable instance overview. Valid values: Yes, No.
     */
    public void setOverviewDisplay(String OverviewDisplay) {
        this.OverviewDisplay = OverviewDisplay;
    }

    /**
     * Get Custom big key analysis separator for Redis only
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyDelimiters Custom big key analysis separator for Redis only
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeyDelimiters() {
        return this.KeyDelimiters;
    }

    /**
     * Set Custom big key analysis separator for Redis only
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyDelimiters Custom big key analysis separator for Redis only
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyDelimiters(String [] KeyDelimiters) {
        this.KeyDelimiters = KeyDelimiters;
    }

    public InstanceConfs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfs(InstanceConfs source) {
        if (source.DailyInspection != null) {
            this.DailyInspection = new String(source.DailyInspection);
        }
        if (source.OverviewDisplay != null) {
            this.OverviewDisplay = new String(source.OverviewDisplay);
        }
        if (source.KeyDelimiters != null) {
            this.KeyDelimiters = new String[source.KeyDelimiters.length];
            for (int i = 0; i < source.KeyDelimiters.length; i++) {
                this.KeyDelimiters[i] = new String(source.KeyDelimiters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DailyInspection", this.DailyInspection);
        this.setParamSimple(map, prefix + "OverviewDisplay", this.OverviewDisplay);
        this.setParamArraySimple(map, prefix + "KeyDelimiters.", this.KeyDelimiters);

    }
}

