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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConstraintRange extends AbstractModel{

    /**
    * Minimum value when constraint type is `section`
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Maximum value when constraint type is `section`
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
     * Get Minimum value when constraint type is `section` 
     * @return Min Minimum value when constraint type is `section`
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value when constraint type is `section`
     * @param Min Minimum value when constraint type is `section`
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum value when constraint type is `section` 
     * @return Max Maximum value when constraint type is `section`
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value when constraint type is `section`
     * @param Max Maximum value when constraint type is `section`
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

