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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4RuleSource extends AbstractModel {

    /**
    * Intermediate IP or domain name
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Weight value. Value range: [0,100]
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Intermediate IP or domain name 
     * @return Source Intermediate IP or domain name
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Intermediate IP or domain name
     * @param Source Intermediate IP or domain name
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Weight value. Value range: [0,100] 
     * @return Weight Weight value. Value range: [0,100]
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight value. Value range: [0,100]
     * @param Weight Weight value. Value range: [0,100]
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public L4RuleSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4RuleSource(L4RuleSource source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

