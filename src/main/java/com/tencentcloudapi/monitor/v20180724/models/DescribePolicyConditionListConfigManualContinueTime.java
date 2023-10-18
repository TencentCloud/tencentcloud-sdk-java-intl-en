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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManualContinueTime extends AbstractModel {

    /**
    * Default duration in seconds.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Default")
    @Expose
    private Long Default;

    /**
    * Custom durations in seconds.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Keys")
    @Expose
    private Long [] Keys;

    /**
    * Required or not.
    */
    @SerializedName("Need")
    @Expose
    private Boolean Need;

    /**
     * Get Default duration in seconds.
Note: This field may return null, indicating that no valid value was found. 
     * @return Default Default duration in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getDefault() {
        return this.Default;
    }

    /**
     * Set Default duration in seconds.
Note: This field may return null, indicating that no valid value was found.
     * @param Default Default duration in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDefault(Long Default) {
        this.Default = Default;
    }

    /**
     * Get Custom durations in seconds.
Note: This field may return null, indicating that no valid value was found. 
     * @return Keys Custom durations in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Custom durations in seconds.
Note: This field may return null, indicating that no valid value was found.
     * @param Keys Custom durations in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setKeys(Long [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Required or not. 
     * @return Need Required or not.
     */
    public Boolean getNeed() {
        return this.Need;
    }

    /**
     * Set Required or not.
     * @param Need Required or not.
     */
    public void setNeed(Boolean Need) {
        this.Need = Need;
    }

    public DescribePolicyConditionListConfigManualContinueTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListConfigManualContinueTime(DescribePolicyConditionListConfigManualContinueTime source) {
        if (source.Default != null) {
            this.Default = new Long(source.Default);
        }
        if (source.Keys != null) {
            this.Keys = new Long[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new Long(source.Keys[i]);
            }
        }
        if (source.Need != null) {
            this.Need = new Boolean(source.Need);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Need", this.Need);

    }
}

