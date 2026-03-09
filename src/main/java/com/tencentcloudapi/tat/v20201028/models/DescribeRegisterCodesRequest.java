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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegisterCodesRequest extends AbstractModel {

    /**
    * Registration code ID.

The maximum per request is 100.

Parameters must not be specified simultaneously `RegisterCodeIds` and `Filters`.
    */
    @SerializedName("RegisterCodeIds")
    @Expose
    private String [] RegisterCodeIds;

    /**
    * Offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results, defaults to 20, maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Registration code ID.

The maximum per request is 100.

Parameters must not be specified simultaneously `RegisterCodeIds` and `Filters`. 
     * @return RegisterCodeIds Registration code ID.

The maximum per request is 100.

Parameters must not be specified simultaneously `RegisterCodeIds` and `Filters`.
     */
    public String [] getRegisterCodeIds() {
        return this.RegisterCodeIds;
    }

    /**
     * Set Registration code ID.

The maximum per request is 100.

Parameters must not be specified simultaneously `RegisterCodeIds` and `Filters`.
     * @param RegisterCodeIds Registration code ID.

The maximum per request is 100.

Parameters must not be specified simultaneously `RegisterCodeIds` and `Filters`.
     */
    public void setRegisterCodeIds(String [] RegisterCodeIds) {
        this.RegisterCodeIds = RegisterCodeIds;
    }

    /**
     * Get Offset. default value: 0. 
     * @return Offset Offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. default value: 0.
     * @param Offset Offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results, defaults to 20, maximum value is 100. 
     * @return Limit Number of returned results, defaults to 20, maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results, defaults to 20, maximum value is 100.
     * @param Limit Number of returned results, defaults to 20, maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRegisterCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegisterCodesRequest(DescribeRegisterCodesRequest source) {
        if (source.RegisterCodeIds != null) {
            this.RegisterCodeIds = new String[source.RegisterCodeIds.length];
            for (int i = 0; i < source.RegisterCodeIds.length; i++) {
                this.RegisterCodeIds[i] = new String(source.RegisterCodeIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RegisterCodeIds.", this.RegisterCodeIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

