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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeCapacityPieGraphDetail extends AbstractModel {

    /**
    * Current application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Number of characters used by the current application.
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * Proportion of the current application in total usage.
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

    /**
     * Get Current application name. 
     * @return AppName Current application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Current application name.
     * @param AppName Current application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Number of characters used by the current application. 
     * @return UsedCharSize Number of characters used by the current application.
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set Number of characters used by the current application.
     * @param UsedCharSize Number of characters used by the current application.
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get Proportion of the current application in total usage. 
     * @return Proportion Proportion of the current application in total usage.
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set Proportion of the current application in total usage.
     * @param Proportion Proportion of the current application in total usage.
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
    }

    public KnowledgeCapacityPieGraphDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeCapacityPieGraphDetail(KnowledgeCapacityPieGraphDetail source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.Proportion != null) {
            this.Proportion = new Float(source.Proportion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);

    }
}

