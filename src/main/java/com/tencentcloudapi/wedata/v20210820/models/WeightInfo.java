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

public class WeightInfo extends AbstractModel {

    /**
    * Weight
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Dimension Type 1:Accuracy, 2:Uniqueness, 3:Integrity, 4:Consistency, 5:Timeliness, 6:Validity
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
     * Get Weight 
     * @return Weight Weight
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight
     * @param Weight Weight
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Dimension Type 1:Accuracy, 2:Uniqueness, 3:Integrity, 4:Consistency, 5:Timeliness, 6:Validity 
     * @return QualityDim Dimension Type 1:Accuracy, 2:Uniqueness, 3:Integrity, 4:Consistency, 5:Timeliness, 6:Validity
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Dimension Type 1:Accuracy, 2:Uniqueness, 3:Integrity, 4:Consistency, 5:Timeliness, 6:Validity
     * @param QualityDim Dimension Type 1:Accuracy, 2:Uniqueness, 3:Integrity, 4:Consistency, 5:Timeliness, 6:Validity
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    public WeightInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WeightInfo(WeightInfo source) {
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);

    }
}

