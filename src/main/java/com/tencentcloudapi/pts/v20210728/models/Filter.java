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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * Equals: 0, not equals: 1.
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * Tag name, optional values include:
1. method, request method name;
2. proto: protocol name;
3. service: service name;
4. status: response status code;
5.result: response details
6.check: check name.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Tag value, optional values include:
1.method: request method name, for example, GET, POST, PUT, etc.
2.proto: protocol name, for example, HTTP/1.1, HTTP/2, etc.
3.service: service name, for example, the request URL such as http://httpbin.org/get
4.status: response status code, for example, 200, 404, 500, etc.
5.result: response details, used to determine whether the request was successful or failed; if successful, the result Tag value is ok; if failed, the result Tag carries an error code and description.
6.check: check name, the Tag value is the checkpoint name set by the user.
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get Equals: 0, not equals: 1. 
     * @return Operator Equals: 0, not equals: 1.
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set Equals: 0, not equals: 1.
     * @param Operator Equals: 0, not equals: 1.
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Tag name, optional values include:
1. method, request method name;
2. proto: protocol name;
3. service: service name;
4. status: response status code;
5.result: response details
6.check: check name. 
     * @return LabelName Tag name, optional values include:
1. method, request method name;
2. proto: protocol name;
3. service: service name;
4. status: response status code;
5.result: response details
6.check: check name.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Tag name, optional values include:
1. method, request method name;
2. proto: protocol name;
3. service: service name;
4. status: response status code;
5.result: response details
6.check: check name.
     * @param LabelName Tag name, optional values include:
1. method, request method name;
2. proto: protocol name;
3. service: service name;
4. status: response status code;
5.result: response details
6.check: check name.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get Tag value, optional values include:
1.method: request method name, for example, GET, POST, PUT, etc.
2.proto: protocol name, for example, HTTP/1.1, HTTP/2, etc.
3.service: service name, for example, the request URL such as http://httpbin.org/get
4.status: response status code, for example, 200, 404, 500, etc.
5.result: response details, used to determine whether the request was successful or failed; if successful, the result Tag value is ok; if failed, the result Tag carries an error code and description.
6.check: check name, the Tag value is the checkpoint name set by the user. 
     * @return LabelValue Tag value, optional values include:
1.method: request method name, for example, GET, POST, PUT, etc.
2.proto: protocol name, for example, HTTP/1.1, HTTP/2, etc.
3.service: service name, for example, the request URL such as http://httpbin.org/get
4.status: response status code, for example, 200, 404, 500, etc.
5.result: response details, used to determine whether the request was successful or failed; if successful, the result Tag value is ok; if failed, the result Tag carries an error code and description.
6.check: check name, the Tag value is the checkpoint name set by the user.
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set Tag value, optional values include:
1.method: request method name, for example, GET, POST, PUT, etc.
2.proto: protocol name, for example, HTTP/1.1, HTTP/2, etc.
3.service: service name, for example, the request URL such as http://httpbin.org/get
4.status: response status code, for example, 200, 404, 500, etc.
5.result: response details, used to determine whether the request was successful or failed; if successful, the result Tag value is ok; if failed, the result Tag carries an error code and description.
6.check: check name, the Tag value is the checkpoint name set by the user.
     * @param LabelValue Tag value, optional values include:
1.method: request method name, for example, GET, POST, PUT, etc.
2.proto: protocol name, for example, HTTP/1.1, HTTP/2, etc.
3.service: service name, for example, the request URL such as http://httpbin.org/get
4.status: response status code, for example, 200, 404, 500, etc.
5.result: response details, used to determine whether the request was successful or failed; if successful, the result Tag value is ok; if failed, the result Tag carries an error code and description.
6.check: check name, the Tag value is the checkpoint name set by the user.
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

