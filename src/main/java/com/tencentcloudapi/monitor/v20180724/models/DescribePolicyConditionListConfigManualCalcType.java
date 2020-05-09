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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManualCalcType extends AbstractModel{

    /**
    * Value of CalcType.
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
     * Get Value of CalcType.
Note: This field may return null, indicating that no valid value was found. 
     * @return Keys Value of CalcType.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Value of CalcType.
Note: This field may return null, indicating that no valid value was found.
     * @param Keys Value of CalcType.
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Need", this.Need);

    }
}

