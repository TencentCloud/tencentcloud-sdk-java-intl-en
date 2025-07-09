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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeAPI extends AbstractModel {

    /**
    * Request method, such as get/post.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Request address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Header parameter.
    */
    @SerializedName("HeaderValues")
    @Expose
    private StrValue [] HeaderValues;

    /**
    * Input parameter Query.
    */
    @SerializedName("QueryValues")
    @Expose
    private StrValue [] QueryValues;

    /**
    * Original data of a Post request.
    */
    @SerializedName("RequestPostBody")
    @Expose
    private String RequestPostBody;

    /**
    * Returned original data.
    */
    @SerializedName("ResponseBody")
    @Expose
    private String ResponseBody;

    /**
    * Output parameter.
    */
    @SerializedName("ResponseValues")
    @Expose
    private ValueInfo [] ResponseValues;

    /**
    * Exception information.
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
     * Get Request method, such as get/post. 
     * @return Method Request method, such as get/post.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Request method, such as get/post.
     * @param Method Request method, such as get/post.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Request address. 
     * @return Url Request address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Request address.
     * @param Url Request address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Header parameter. 
     * @return HeaderValues Header parameter.
     */
    public StrValue [] getHeaderValues() {
        return this.HeaderValues;
    }

    /**
     * Set Header parameter.
     * @param HeaderValues Header parameter.
     */
    public void setHeaderValues(StrValue [] HeaderValues) {
        this.HeaderValues = HeaderValues;
    }

    /**
     * Get Input parameter Query. 
     * @return QueryValues Input parameter Query.
     */
    public StrValue [] getQueryValues() {
        return this.QueryValues;
    }

    /**
     * Set Input parameter Query.
     * @param QueryValues Input parameter Query.
     */
    public void setQueryValues(StrValue [] QueryValues) {
        this.QueryValues = QueryValues;
    }

    /**
     * Get Original data of a Post request. 
     * @return RequestPostBody Original data of a Post request.
     */
    public String getRequestPostBody() {
        return this.RequestPostBody;
    }

    /**
     * Set Original data of a Post request.
     * @param RequestPostBody Original data of a Post request.
     */
    public void setRequestPostBody(String RequestPostBody) {
        this.RequestPostBody = RequestPostBody;
    }

    /**
     * Get Returned original data. 
     * @return ResponseBody Returned original data.
     */
    public String getResponseBody() {
        return this.ResponseBody;
    }

    /**
     * Set Returned original data.
     * @param ResponseBody Returned original data.
     */
    public void setResponseBody(String ResponseBody) {
        this.ResponseBody = ResponseBody;
    }

    /**
     * Get Output parameter. 
     * @return ResponseValues Output parameter.
     */
    public ValueInfo [] getResponseValues() {
        return this.ResponseValues;
    }

    /**
     * Set Output parameter.
     * @param ResponseValues Output parameter.
     */
    public void setResponseValues(ValueInfo [] ResponseValues) {
        this.ResponseValues = ResponseValues;
    }

    /**
     * Get Exception information. 
     * @return FailMessage Exception information.
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set Exception information.
     * @param FailMessage Exception information.
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    public InvokeAPI() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeAPI(InvokeAPI source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.HeaderValues != null) {
            this.HeaderValues = new StrValue[source.HeaderValues.length];
            for (int i = 0; i < source.HeaderValues.length; i++) {
                this.HeaderValues[i] = new StrValue(source.HeaderValues[i]);
            }
        }
        if (source.QueryValues != null) {
            this.QueryValues = new StrValue[source.QueryValues.length];
            for (int i = 0; i < source.QueryValues.length; i++) {
                this.QueryValues[i] = new StrValue(source.QueryValues[i]);
            }
        }
        if (source.RequestPostBody != null) {
            this.RequestPostBody = new String(source.RequestPostBody);
        }
        if (source.ResponseBody != null) {
            this.ResponseBody = new String(source.ResponseBody);
        }
        if (source.ResponseValues != null) {
            this.ResponseValues = new ValueInfo[source.ResponseValues.length];
            for (int i = 0; i < source.ResponseValues.length; i++) {
                this.ResponseValues[i] = new ValueInfo(source.ResponseValues[i]);
            }
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "HeaderValues.", this.HeaderValues);
        this.setParamArrayObj(map, prefix + "QueryValues.", this.QueryValues);
        this.setParamSimple(map, prefix + "RequestPostBody", this.RequestPostBody);
        this.setParamSimple(map, prefix + "ResponseBody", this.ResponseBody);
        this.setParamArrayObj(map, prefix + "ResponseValues.", this.ResponseValues);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);

    }
}

