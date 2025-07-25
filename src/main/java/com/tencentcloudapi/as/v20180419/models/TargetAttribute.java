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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetAttribute extends AbstractModel {

    /**
    * Port. value range: [1,65535]. as an input parameter, this parameter is required.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Weight. value range: [0,100]. this parameter is required as an input parameter.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Port. value range: [1,65535]. as an input parameter, this parameter is required. 
     * @return Port Port. value range: [1,65535]. as an input parameter, this parameter is required.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port. value range: [1,65535]. as an input parameter, this parameter is required.
     * @param Port Port. value range: [1,65535]. as an input parameter, this parameter is required.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Weight. value range: [0,100]. this parameter is required as an input parameter. 
     * @return Weight Weight. value range: [0,100]. this parameter is required as an input parameter.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight. value range: [0,100]. this parameter is required as an input parameter.
     * @param Weight Weight. value range: [0,100]. this parameter is required as an input parameter.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetAttribute(TargetAttribute source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

