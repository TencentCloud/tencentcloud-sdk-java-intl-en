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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RetrievalLivenessExtraInfo")
    @Expose
    private RetrievalLivenessExtraInfo [] RetrievalLivenessExtraInfo;

    /**
     * Get  
     * @return RetrievalLivenessExtraInfo 
     */
    public RetrievalLivenessExtraInfo [] getRetrievalLivenessExtraInfo() {
        return this.RetrievalLivenessExtraInfo;
    }

    /**
     * Set 
     * @param RetrievalLivenessExtraInfo 
     */
    public void setRetrievalLivenessExtraInfo(RetrievalLivenessExtraInfo [] RetrievalLivenessExtraInfo) {
        this.RetrievalLivenessExtraInfo = RetrievalLivenessExtraInfo;
    }

    public ExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraInfo(ExtraInfo source) {
        if (source.RetrievalLivenessExtraInfo != null) {
            this.RetrievalLivenessExtraInfo = new RetrievalLivenessExtraInfo[source.RetrievalLivenessExtraInfo.length];
            for (int i = 0; i < source.RetrievalLivenessExtraInfo.length; i++) {
                this.RetrievalLivenessExtraInfo[i] = new RetrievalLivenessExtraInfo(source.RetrievalLivenessExtraInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RetrievalLivenessExtraInfo.", this.RetrievalLivenessExtraInfo);

    }
}

