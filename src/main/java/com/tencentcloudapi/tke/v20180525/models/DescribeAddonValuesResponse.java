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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddonValuesResponse extends AbstractModel{

    /**
    * Parameters in a JSON string. If the add-on has been installed, the configured parameters are used for rendering.
    */
    @SerializedName("Values")
    @Expose
    private String Values;

    /**
    * List of parameters supported by the add-on in a JSON string. The default values are used.
    */
    @SerializedName("DefaultValues")
    @Expose
    private String DefaultValues;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Parameters in a JSON string. If the add-on has been installed, the configured parameters are used for rendering. 
     * @return Values Parameters in a JSON string. If the add-on has been installed, the configured parameters are used for rendering.
     */
    public String getValues() {
        return this.Values;
    }

    /**
     * Set Parameters in a JSON string. If the add-on has been installed, the configured parameters are used for rendering.
     * @param Values Parameters in a JSON string. If the add-on has been installed, the configured parameters are used for rendering.
     */
    public void setValues(String Values) {
        this.Values = Values;
    }

    /**
     * Get List of parameters supported by the add-on in a JSON string. The default values are used. 
     * @return DefaultValues List of parameters supported by the add-on in a JSON string. The default values are used.
     */
    public String getDefaultValues() {
        return this.DefaultValues;
    }

    /**
     * Set List of parameters supported by the add-on in a JSON string. The default values are used.
     * @param DefaultValues List of parameters supported by the add-on in a JSON string. The default values are used.
     */
    public void setDefaultValues(String DefaultValues) {
        this.DefaultValues = DefaultValues;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAddonValuesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddonValuesResponse(DescribeAddonValuesResponse source) {
        if (source.Values != null) {
            this.Values = new String(source.Values);
        }
        if (source.DefaultValues != null) {
            this.DefaultValues = new String(source.DefaultValues);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Values", this.Values);
        this.setParamSimple(map, prefix + "DefaultValues", this.DefaultValues);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

