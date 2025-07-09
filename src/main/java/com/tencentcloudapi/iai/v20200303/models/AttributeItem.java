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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeItem extends AbstractModel {

    /**
    * Attribute value
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Probability of recognizing `Type`, which indicates the probability of correct recognition. Value range: [0,1].
    */
    @SerializedName("Probability")
    @Expose
    private Float Probability;

    /**
     * Get Attribute value 
     * @return Type Attribute value
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Attribute value
     * @param Type Attribute value
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Probability of recognizing `Type`, which indicates the probability of correct recognition. Value range: [0,1]. 
     * @return Probability Probability of recognizing `Type`, which indicates the probability of correct recognition. Value range: [0,1].
     */
    public Float getProbability() {
        return this.Probability;
    }

    /**
     * Set Probability of recognizing `Type`, which indicates the probability of correct recognition. Value range: [0,1].
     * @param Probability Probability of recognizing `Type`, which indicates the probability of correct recognition. Value range: [0,1].
     */
    public void setProbability(Float Probability) {
        this.Probability = Probability;
    }

    public AttributeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeItem(AttributeItem source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Probability != null) {
            this.Probability = new Float(source.Probability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Probability", this.Probability);

    }
}

