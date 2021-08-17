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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedApiSummary extends AbstractModel{

    /**
    * Number of APIs bound with the plugin
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information of the API bound with the plugin
    */
    @SerializedName("AttachedApis")
    @Expose
    private AttachedApiInfo [] AttachedApis;

    /**
     * Get Number of APIs bound with the plugin 
     * @return TotalCount Number of APIs bound with the plugin
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of APIs bound with the plugin
     * @param TotalCount Number of APIs bound with the plugin
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information of the API bound with the plugin 
     * @return AttachedApis Information of the API bound with the plugin
     */
    public AttachedApiInfo [] getAttachedApis() {
        return this.AttachedApis;
    }

    /**
     * Set Information of the API bound with the plugin
     * @param AttachedApis Information of the API bound with the plugin
     */
    public void setAttachedApis(AttachedApiInfo [] AttachedApis) {
        this.AttachedApis = AttachedApis;
    }

    public AttachedApiSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedApiSummary(AttachedApiSummary source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AttachedApis != null) {
            this.AttachedApis = new AttachedApiInfo[source.AttachedApis.length];
            for (int i = 0; i < source.AttachedApis.length; i++) {
                this.AttachedApis[i] = new AttachedApiInfo(source.AttachedApis[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AttachedApis.", this.AttachedApis);

    }
}

