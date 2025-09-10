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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZHToneWordsInfo extends AbstractModel {

    /**
    * Specifies the word list.
    */
    @SerializedName("Neutral")
    @Expose
    private String [] Neutral;

    /**
    * Positive word list.
    */
    @SerializedName("Positive")
    @Expose
    private String [] Positive;

    /**
    * Negative word list.
    */
    @SerializedName("Negative")
    @Expose
    private String [] Negative;

    /**
     * Get Specifies the word list. 
     * @return Neutral Specifies the word list.
     */
    public String [] getNeutral() {
        return this.Neutral;
    }

    /**
     * Set Specifies the word list.
     * @param Neutral Specifies the word list.
     */
    public void setNeutral(String [] Neutral) {
        this.Neutral = Neutral;
    }

    /**
     * Get Positive word list. 
     * @return Positive Positive word list.
     */
    public String [] getPositive() {
        return this.Positive;
    }

    /**
     * Set Positive word list.
     * @param Positive Positive word list.
     */
    public void setPositive(String [] Positive) {
        this.Positive = Positive;
    }

    /**
     * Get Negative word list. 
     * @return Negative Negative word list.
     */
    public String [] getNegative() {
        return this.Negative;
    }

    /**
     * Set Negative word list.
     * @param Negative Negative word list.
     */
    public void setNegative(String [] Negative) {
        this.Negative = Negative;
    }

    public ZHToneWordsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZHToneWordsInfo(ZHToneWordsInfo source) {
        if (source.Neutral != null) {
            this.Neutral = new String[source.Neutral.length];
            for (int i = 0; i < source.Neutral.length; i++) {
                this.Neutral[i] = new String(source.Neutral[i]);
            }
        }
        if (source.Positive != null) {
            this.Positive = new String[source.Positive.length];
            for (int i = 0; i < source.Positive.length; i++) {
                this.Positive[i] = new String(source.Positive[i]);
            }
        }
        if (source.Negative != null) {
            this.Negative = new String[source.Negative.length];
            for (int i = 0; i < source.Negative.length; i++) {
                this.Negative[i] = new String(source.Negative[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Neutral.", this.Neutral);
        this.setParamArraySimple(map, prefix + "Positive.", this.Positive);
        this.setParamArraySimple(map, prefix + "Negative.", this.Negative);

    }
}

