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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSearchTopics extends AbstractModel {

    /**
    * <p>Error information.</p>
    */
    @SerializedName("Errors")
    @Expose
    private LogSearchErrors [] Errors;

    /**
    * <p>Normal information</p>
    */
    @SerializedName("Infos")
    @Expose
    private LogSearchInfos [] Infos;

    /**
     * Get <p>Error information.</p> 
     * @return Errors <p>Error information.</p>
     */
    public LogSearchErrors [] getErrors() {
        return this.Errors;
    }

    /**
     * Set <p>Error information.</p>
     * @param Errors <p>Error information.</p>
     */
    public void setErrors(LogSearchErrors [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get <p>Normal information</p> 
     * @return Infos <p>Normal information</p>
     */
    public LogSearchInfos [] getInfos() {
        return this.Infos;
    }

    /**
     * Set <p>Normal information</p>
     * @param Infos <p>Normal information</p>
     */
    public void setInfos(LogSearchInfos [] Infos) {
        this.Infos = Infos;
    }

    public LogSearchTopics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSearchTopics(LogSearchTopics source) {
        if (source.Errors != null) {
            this.Errors = new LogSearchErrors[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new LogSearchErrors(source.Errors[i]);
            }
        }
        if (source.Infos != null) {
            this.Infos = new LogSearchInfos[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new LogSearchInfos(source.Infos[i]);
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

