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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcMergeManifestsInfo extends AbstractModel {

    /**
    * Whether to enable merging metadata Manifests file governance items: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MergeManifestsEnable")
    @Expose
    private String MergeManifestsEnable;

    /**
    * Engine name used to run merging metadata Manifests file governance items
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Merge Metadata Manifests file governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get Whether to enable merging metadata Manifests file governance items: enable, none
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MergeManifestsEnable Whether to enable merging metadata Manifests file governance items: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMergeManifestsEnable() {
        return this.MergeManifestsEnable;
    }

    /**
     * Set Whether to enable merging metadata Manifests file governance items: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MergeManifestsEnable Whether to enable merging metadata Manifests file governance items: enable, none
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMergeManifestsEnable(String MergeManifestsEnable) {
        this.MergeManifestsEnable = MergeManifestsEnable;
    }

    /**
     * Get Engine name used to run merging metadata Manifests file governance items
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Engine Engine name used to run merging metadata Manifests file governance items
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine name used to run merging metadata Manifests file governance items
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Engine Engine name used to run merging metadata Manifests file governance items
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Merge Metadata Manifests file governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IntervalMin Merge Metadata Manifests file governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set Merge Metadata Manifests file governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IntervalMin Merge Metadata Manifests file governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcMergeManifestsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcMergeManifestsInfo(DlcMergeManifestsInfo source) {
        if (source.MergeManifestsEnable != null) {
            this.MergeManifestsEnable = new String(source.MergeManifestsEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.IntervalMin != null) {
            this.IntervalMin = new Long(source.IntervalMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MergeManifestsEnable", this.MergeManifestsEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

