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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrategyForAntiInfoLeak extends AbstractModel {

    /**
    * Matching Criteria, returncode (Response Code), keywords (Keywords), information (Sensitive Information)
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Logical operator, fixed value: contains
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * Matching content
The following options are available when Field is set to information:
idcard (ID card), phone (phone number), and bankcard (bank card).
The following options are available when Field is set to returncode:
400 (status code 400), 403 (status code 403), 404 (status code 404), 4xx (other 4xx status codes), 500 (status code 500), 501 (status code 501), 502 (status code 502), 504 (status code 504), and 5xx (other 5xx status codes).
When Field is set to keywords, users need to input the matching content themselves.

    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Matching Criteria, returncode (Response Code), keywords (Keywords), information (Sensitive Information) 
     * @return Field Matching Criteria, returncode (Response Code), keywords (Keywords), information (Sensitive Information)
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Matching Criteria, returncode (Response Code), keywords (Keywords), information (Sensitive Information)
     * @param Field Matching Criteria, returncode (Response Code), keywords (Keywords), information (Sensitive Information)
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Logical operator, fixed value: contains 
     * @return CompareFunc Logical operator, fixed value: contains
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set Logical operator, fixed value: contains
     * @param CompareFunc Logical operator, fixed value: contains
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get Matching content
The following options are available when Field is set to information:
idcard (ID card), phone (phone number), and bankcard (bank card).
The following options are available when Field is set to returncode:
400 (status code 400), 403 (status code 403), 404 (status code 404), 4xx (other 4xx status codes), 500 (status code 500), 501 (status code 501), 502 (status code 502), 504 (status code 504), and 5xx (other 5xx status codes).
When Field is set to keywords, users need to input the matching content themselves.
 
     * @return Content Matching content
The following options are available when Field is set to information:
idcard (ID card), phone (phone number), and bankcard (bank card).
The following options are available when Field is set to returncode:
400 (status code 400), 403 (status code 403), 404 (status code 404), 4xx (other 4xx status codes), 500 (status code 500), 501 (status code 501), 502 (status code 502), 504 (status code 504), and 5xx (other 5xx status codes).
When Field is set to keywords, users need to input the matching content themselves.

     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Matching content
The following options are available when Field is set to information:
idcard (ID card), phone (phone number), and bankcard (bank card).
The following options are available when Field is set to returncode:
400 (status code 400), 403 (status code 403), 404 (status code 404), 4xx (other 4xx status codes), 500 (status code 500), 501 (status code 501), 502 (status code 502), 504 (status code 504), and 5xx (other 5xx status codes).
When Field is set to keywords, users need to input the matching content themselves.

     * @param Content Matching content
The following options are available when Field is set to information:
idcard (ID card), phone (phone number), and bankcard (bank card).
The following options are available when Field is set to returncode:
400 (status code 400), 403 (status code 403), 404 (status code 404), 4xx (other 4xx status codes), 500 (status code 500), 501 (status code 501), 502 (status code 502), 504 (status code 504), and 5xx (other 5xx status codes).
When Field is set to keywords, users need to input the matching content themselves.

     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public StrategyForAntiInfoLeak() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyForAntiInfoLeak(StrategyForAntiInfoLeak source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.CompareFunc != null) {
            this.CompareFunc = new String(source.CompareFunc);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "CompareFunc", this.CompareFunc);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

