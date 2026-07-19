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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgeRatingItemReq extends AbstractModel {

    /**
    * <p>Age rating standard.</p><p>Valid values:</p><ul><li>apple: Apple</li><li>iarc: Android.</li></ul>
    */
    @SerializedName("StandardId")
    @Expose
    private String StandardId;

    /**
    * <p>Applicable age for age rating.</p>
    */
    @SerializedName("AgeRating")
    @Expose
    private Long AgeRating;

    /**
     * Get <p>Age rating standard.</p><p>Valid values:</p><ul><li>apple: Apple</li><li>iarc: Android.</li></ul> 
     * @return StandardId <p>Age rating standard.</p><p>Valid values:</p><ul><li>apple: Apple</li><li>iarc: Android.</li></ul>
     */
    public String getStandardId() {
        return this.StandardId;
    }

    /**
     * Set <p>Age rating standard.</p><p>Valid values:</p><ul><li>apple: Apple</li><li>iarc: Android.</li></ul>
     * @param StandardId <p>Age rating standard.</p><p>Valid values:</p><ul><li>apple: Apple</li><li>iarc: Android.</li></ul>
     */
    public void setStandardId(String StandardId) {
        this.StandardId = StandardId;
    }

    /**
     * Get <p>Applicable age for age rating.</p> 
     * @return AgeRating <p>Applicable age for age rating.</p>
     */
    public Long getAgeRating() {
        return this.AgeRating;
    }

    /**
     * Set <p>Applicable age for age rating.</p>
     * @param AgeRating <p>Applicable age for age rating.</p>
     */
    public void setAgeRating(Long AgeRating) {
        this.AgeRating = AgeRating;
    }

    public AgeRatingItemReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgeRatingItemReq(AgeRatingItemReq source) {
        if (source.StandardId != null) {
            this.StandardId = new String(source.StandardId);
        }
        if (source.AgeRating != null) {
            this.AgeRating = new Long(source.AgeRating);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StandardId", this.StandardId);
        this.setParamSimple(map, prefix + "AgeRating", this.AgeRating);

    }
}

