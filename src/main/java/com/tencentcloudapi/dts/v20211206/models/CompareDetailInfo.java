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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareDetailInfo extends AbstractModel{

    /**
    * Details of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Difference")
    @Expose
    private DifferenceDetail Difference;

    /**
    * Details of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Skipped")
    @Expose
    private SkippedDetail Skipped;

    /**
     * Get Details of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Difference Details of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DifferenceDetail getDifference() {
        return this.Difference;
    }

    /**
     * Set Details of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Difference Details of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDifference(DifferenceDetail Difference) {
        this.Difference = Difference;
    }

    /**
     * Get Details of skipped tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Skipped Details of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SkippedDetail getSkipped() {
        return this.Skipped;
    }

    /**
     * Set Details of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Skipped Details of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkipped(SkippedDetail Skipped) {
        this.Skipped = Skipped;
    }

    public CompareDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareDetailInfo(CompareDetailInfo source) {
        if (source.Difference != null) {
            this.Difference = new DifferenceDetail(source.Difference);
        }
        if (source.Skipped != null) {
            this.Skipped = new SkippedDetail(source.Skipped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Difference.", this.Difference);
        this.setParamObj(map, prefix + "Skipped.", this.Skipped);

    }
}

