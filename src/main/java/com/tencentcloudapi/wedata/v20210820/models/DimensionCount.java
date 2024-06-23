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

public class DimensionCount extends AbstractModel {

    /**
    * Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DimType")
    @Expose
    private Long DimType;

    /**
    * Statistics value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
     * Get Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DimType Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     * @deprecated
     */
    @Deprecated
    public Long getDimType() {
        return this.DimType;
    }

    /**
     * Set Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DimType Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setDimType(Long DimType) {
        this.DimType = DimType;
    }

    /**
     * Get Statistics value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Count Statistics value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Statistics value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Count Statistics value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityDim Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityDim Dimension types 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    public DimensionCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionCount(DimensionCount source) {
        if (source.DimType != null) {
            this.DimType = new Long(source.DimType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimType", this.DimType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);

    }
}

