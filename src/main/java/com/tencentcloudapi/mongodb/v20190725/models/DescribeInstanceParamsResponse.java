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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamsResponse extends AbstractModel {

    /**
    * The collection of enum parameters
    */
    @SerializedName("InstanceEnumParam")
    @Expose
    private InstanceEnumParam [] InstanceEnumParam;

    /**
    * The collection of integer parameters
    */
    @SerializedName("InstanceIntegerParam")
    @Expose
    private InstanceIntegerParam [] InstanceIntegerParam;

    /**
    * The collection of text parameters
    */
    @SerializedName("InstanceTextParam")
    @Expose
    private InstanceTextParam [] InstanceTextParam;

    /**
    * The collection of string parameters used to represent time ranges
    */
    @SerializedName("InstanceMultiParam")
    @Expose
    private InstanceMultiParam [] InstanceMultiParam;

    /**
    * The total number of modifiable parameters of the instance, such as 0
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The collection of enum parameters 
     * @return InstanceEnumParam The collection of enum parameters
     */
    public InstanceEnumParam [] getInstanceEnumParam() {
        return this.InstanceEnumParam;
    }

    /**
     * Set The collection of enum parameters
     * @param InstanceEnumParam The collection of enum parameters
     */
    public void setInstanceEnumParam(InstanceEnumParam [] InstanceEnumParam) {
        this.InstanceEnumParam = InstanceEnumParam;
    }

    /**
     * Get The collection of integer parameters 
     * @return InstanceIntegerParam The collection of integer parameters
     */
    public InstanceIntegerParam [] getInstanceIntegerParam() {
        return this.InstanceIntegerParam;
    }

    /**
     * Set The collection of integer parameters
     * @param InstanceIntegerParam The collection of integer parameters
     */
    public void setInstanceIntegerParam(InstanceIntegerParam [] InstanceIntegerParam) {
        this.InstanceIntegerParam = InstanceIntegerParam;
    }

    /**
     * Get The collection of text parameters 
     * @return InstanceTextParam The collection of text parameters
     */
    public InstanceTextParam [] getInstanceTextParam() {
        return this.InstanceTextParam;
    }

    /**
     * Set The collection of text parameters
     * @param InstanceTextParam The collection of text parameters
     */
    public void setInstanceTextParam(InstanceTextParam [] InstanceTextParam) {
        this.InstanceTextParam = InstanceTextParam;
    }

    /**
     * Get The collection of string parameters used to represent time ranges 
     * @return InstanceMultiParam The collection of string parameters used to represent time ranges
     */
    public InstanceMultiParam [] getInstanceMultiParam() {
        return this.InstanceMultiParam;
    }

    /**
     * Set The collection of string parameters used to represent time ranges
     * @param InstanceMultiParam The collection of string parameters used to represent time ranges
     */
    public void setInstanceMultiParam(InstanceMultiParam [] InstanceMultiParam) {
        this.InstanceMultiParam = InstanceMultiParam;
    }

    /**
     * Get The total number of modifiable parameters of the instance, such as 0 
     * @return TotalCount The total number of modifiable parameters of the instance, such as 0
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of modifiable parameters of the instance, such as 0
     * @param TotalCount The total number of modifiable parameters of the instance, such as 0
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeInstanceParamsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceParamsResponse(DescribeInstanceParamsResponse source) {
        if (source.InstanceEnumParam != null) {
            this.InstanceEnumParam = new InstanceEnumParam[source.InstanceEnumParam.length];
            for (int i = 0; i < source.InstanceEnumParam.length; i++) {
                this.InstanceEnumParam[i] = new InstanceEnumParam(source.InstanceEnumParam[i]);
            }
        }
        if (source.InstanceIntegerParam != null) {
            this.InstanceIntegerParam = new InstanceIntegerParam[source.InstanceIntegerParam.length];
            for (int i = 0; i < source.InstanceIntegerParam.length; i++) {
                this.InstanceIntegerParam[i] = new InstanceIntegerParam(source.InstanceIntegerParam[i]);
            }
        }
        if (source.InstanceTextParam != null) {
            this.InstanceTextParam = new InstanceTextParam[source.InstanceTextParam.length];
            for (int i = 0; i < source.InstanceTextParam.length; i++) {
                this.InstanceTextParam[i] = new InstanceTextParam(source.InstanceTextParam[i]);
            }
        }
        if (source.InstanceMultiParam != null) {
            this.InstanceMultiParam = new InstanceMultiParam[source.InstanceMultiParam.length];
            for (int i = 0; i < source.InstanceMultiParam.length; i++) {
                this.InstanceMultiParam[i] = new InstanceMultiParam(source.InstanceMultiParam[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceEnumParam.", this.InstanceEnumParam);
        this.setParamArrayObj(map, prefix + "InstanceIntegerParam.", this.InstanceIntegerParam);
        this.setParamArrayObj(map, prefix + "InstanceTextParam.", this.InstanceTextParam);
        this.setParamArrayObj(map, prefix + "InstanceMultiParam.", this.InstanceMultiParam);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

