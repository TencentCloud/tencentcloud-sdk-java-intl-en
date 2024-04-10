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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogTopics extends AbstractModel {

    /**
    * Error information for multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private SearchLogErrors [] Errors;

    /**
    * Information for each log topic in multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Infos")
    @Expose
    private SearchLogInfos [] Infos;

    /**
     * Get Error information for multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Errors Error information for multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
     */
    public SearchLogErrors [] getErrors() {
        return this.Errors;
    }

    /**
     * Set Error information for multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
     * @param Errors Error information for multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrors(SearchLogErrors [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get Information for each log topic in multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Infos Information for each log topic in multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
     */
    public SearchLogInfos [] getInfos() {
        return this.Infos;
    }

    /**
     * Set Information for each log topic in multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
     * @param Infos Information for each log topic in multi-log topic searchNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInfos(SearchLogInfos [] Infos) {
        this.Infos = Infos;
    }

    public SearchLogTopics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogTopics(SearchLogTopics source) {
        if (source.Errors != null) {
            this.Errors = new SearchLogErrors[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SearchLogErrors(source.Errors[i]);
            }
        }
        if (source.Infos != null) {
            this.Infos = new SearchLogInfos[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new SearchLogInfos(source.Infos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

