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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodSpecInfo extends AbstractModel {

    /**
    * The specified information such as pod spec and source for scale-out with pod resources.
    */
    @SerializedName("PodSpec")
    @Expose
    private PodNewSpec PodSpec;

    /**
    * The custom pod permission and parameter.
    */
    @SerializedName("PodParameter")
    @Expose
    private PodNewParameter PodParameter;

    /**
     * Get The specified information such as pod spec and source for scale-out with pod resources. 
     * @return PodSpec The specified information such as pod spec and source for scale-out with pod resources.
     */
    public PodNewSpec getPodSpec() {
        return this.PodSpec;
    }

    /**
     * Set The specified information such as pod spec and source for scale-out with pod resources.
     * @param PodSpec The specified information such as pod spec and source for scale-out with pod resources.
     */
    public void setPodSpec(PodNewSpec PodSpec) {
        this.PodSpec = PodSpec;
    }

    /**
     * Get The custom pod permission and parameter. 
     * @return PodParameter The custom pod permission and parameter.
     */
    public PodNewParameter getPodParameter() {
        return this.PodParameter;
    }

    /**
     * Set The custom pod permission and parameter.
     * @param PodParameter The custom pod permission and parameter.
     */
    public void setPodParameter(PodNewParameter PodParameter) {
        this.PodParameter = PodParameter;
    }

    public PodSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodSpecInfo(PodSpecInfo source) {
        if (source.PodSpec != null) {
            this.PodSpec = new PodNewSpec(source.PodSpec);
        }
        if (source.PodParameter != null) {
            this.PodParameter = new PodNewParameter(source.PodParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PodSpec.", this.PodSpec);
        this.setParamObj(map, prefix + "PodParameter.", this.PodParameter);

    }
}

