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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcRewriteDataInfo extends AbstractModel {

    /**
    * Whether to enable data layout governance item: enable (start), disable (do not enable, default)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RewriteDataEnable")
    @Expose
    private String RewriteDataEnable;

    /**
    * Engine name used to run data layout governance item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Number of files executed by the rearrangement task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MinInputFiles")
    @Expose
    private Long MinInputFiles;

    /**
    * Data file size after data rearrangement, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetFileSizeBytes")
    @Expose
    private Long TargetFileSizeBytes;

    /**
    * Data layout governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get Whether to enable data layout governance item: enable (start), disable (do not enable, default)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RewriteDataEnable Whether to enable data layout governance item: enable (start), disable (do not enable, default)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRewriteDataEnable() {
        return this.RewriteDataEnable;
    }

    /**
     * Set Whether to enable data layout governance item: enable (start), disable (do not enable, default)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RewriteDataEnable Whether to enable data layout governance item: enable (start), disable (do not enable, default)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRewriteDataEnable(String RewriteDataEnable) {
        this.RewriteDataEnable = RewriteDataEnable;
    }

    /**
     * Get Engine name used to run data layout governance item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Engine Engine name used to run data layout governance item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine name used to run data layout governance item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Engine Engine name used to run data layout governance item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Number of files executed by the rearrangement task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MinInputFiles Number of files executed by the rearrangement task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMinInputFiles() {
        return this.MinInputFiles;
    }

    /**
     * Set Number of files executed by the rearrangement task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MinInputFiles Number of files executed by the rearrangement task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMinInputFiles(Long MinInputFiles) {
        this.MinInputFiles = MinInputFiles;
    }

    /**
     * Get Data file size after data rearrangement, in bytes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetFileSizeBytes Data file size after data rearrangement, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTargetFileSizeBytes() {
        return this.TargetFileSizeBytes;
    }

    /**
     * Set Data file size after data rearrangement, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetFileSizeBytes Data file size after data rearrangement, in bytes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetFileSizeBytes(Long TargetFileSizeBytes) {
        this.TargetFileSizeBytes = TargetFileSizeBytes;
    }

    /**
     * Get Data layout governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IntervalMin Data layout governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set Data layout governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IntervalMin Data layout governance runtime cycle, in minutes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcRewriteDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcRewriteDataInfo(DlcRewriteDataInfo source) {
        if (source.RewriteDataEnable != null) {
            this.RewriteDataEnable = new String(source.RewriteDataEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.MinInputFiles != null) {
            this.MinInputFiles = new Long(source.MinInputFiles);
        }
        if (source.TargetFileSizeBytes != null) {
            this.TargetFileSizeBytes = new Long(source.TargetFileSizeBytes);
        }
        if (source.IntervalMin != null) {
            this.IntervalMin = new Long(source.IntervalMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RewriteDataEnable", this.RewriteDataEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "MinInputFiles", this.MinInputFiles);
        this.setParamSimple(map, prefix + "TargetFileSizeBytes", this.TargetFileSizeBytes);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

