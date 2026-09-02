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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdrAlertCategoryCount extends AbstractModel {

    /**
    * <p>Major category of alarm</p>
    */
    @SerializedName("AlertCategory")
    @Expose
    private String AlertCategory;

    /**
    * <p>Number of alarms.</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>Major category of alarm</p> 
     * @return AlertCategory <p>Major category of alarm</p>
     */
    public String getAlertCategory() {
        return this.AlertCategory;
    }

    /**
     * Set <p>Major category of alarm</p>
     * @param AlertCategory <p>Major category of alarm</p>
     */
    public void setAlertCategory(String AlertCategory) {
        this.AlertCategory = AlertCategory;
    }

    /**
     * Get <p>Number of alarms.</p> 
     * @return Count <p>Number of alarms.</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>Number of alarms.</p>
     * @param Count <p>Number of alarms.</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public EdrAlertCategoryCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertCategoryCount(EdrAlertCategoryCount source) {
        if (source.AlertCategory != null) {
            this.AlertCategory = new String(source.AlertCategory);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlertCategory", this.AlertCategory);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

