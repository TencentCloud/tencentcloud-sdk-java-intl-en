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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeDetail extends AbstractModel {

    /**
    * Application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Number of used characters.
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * Usage proportion.
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

    /**
    * Exceeding character count.
    */
    @SerializedName("ExceedCharSize")
    @Expose
    private String ExceedCharSize;

    /**
     * Get Application name. 
     * @return AppName Application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name.
     * @param AppName Application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Number of used characters. 
     * @return UsedCharSize Number of used characters.
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set Number of used characters.
     * @param UsedCharSize Number of used characters.
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    /**
     * Get Usage proportion. 
     * @return Proportion Usage proportion.
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set Usage proportion.
     * @param Proportion Usage proportion.
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
    }

    /**
     * Get Exceeding character count. 
     * @return ExceedCharSize Exceeding character count.
     */
    public String getExceedCharSize() {
        return this.ExceedCharSize;
    }

    /**
     * Set Exceeding character count.
     * @param ExceedCharSize Exceeding character count.
     */
    public void setExceedCharSize(String ExceedCharSize) {
        this.ExceedCharSize = ExceedCharSize;
    }

    public KnowledgeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeDetail(KnowledgeDetail source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.Proportion != null) {
            this.Proportion = new Float(source.Proportion);
        }
        if (source.ExceedCharSize != null) {
            this.ExceedCharSize = new String(source.ExceedCharSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);
        this.setParamSimple(map, prefix + "ExceedCharSize", this.ExceedCharSize);

    }
}

