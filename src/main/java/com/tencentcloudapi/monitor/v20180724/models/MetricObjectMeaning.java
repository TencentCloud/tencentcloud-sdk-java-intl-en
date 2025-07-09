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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricObjectMeaning extends AbstractModel {

    /**
    * Meaning of the metric in English
    */
    @SerializedName("En")
    @Expose
    private String En;

    /**
    * Meaning of the metric in Chinese
    */
    @SerializedName("Zh")
    @Expose
    private String Zh;

    /**
     * Get Meaning of the metric in English 
     * @return En Meaning of the metric in English
     */
    public String getEn() {
        return this.En;
    }

    /**
     * Set Meaning of the metric in English
     * @param En Meaning of the metric in English
     */
    public void setEn(String En) {
        this.En = En;
    }

    /**
     * Get Meaning of the metric in Chinese 
     * @return Zh Meaning of the metric in Chinese
     */
    public String getZh() {
        return this.Zh;
    }

    /**
     * Set Meaning of the metric in Chinese
     * @param Zh Meaning of the metric in Chinese
     */
    public void setZh(String Zh) {
        this.Zh = Zh;
    }

    public MetricObjectMeaning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricObjectMeaning(MetricObjectMeaning source) {
        if (source.En != null) {
            this.En = new String(source.En);
        }
        if (source.Zh != null) {
            this.Zh = new String(source.Zh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "En", this.En);
        this.setParamSimple(map, prefix + "Zh", this.Zh);

    }
}

