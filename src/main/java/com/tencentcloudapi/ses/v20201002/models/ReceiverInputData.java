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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverInputData extends AbstractModel {

    /**
    * Recipient email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * For variable parameters in template, please use json.dump to format the json object into string type. the object is a set of Key-value pairs. each Key represents a variable in template. variable usage in template is represented by {{Key}}. the appropriate value will be replaced with {{value}} when sent.
Note: the parameter value cannot be data of complex type such as html. the entire JSON structure of TemplateData has a length limit of 800 bytes.
    */
    @SerializedName("TemplateData")
    @Expose
    private String TemplateData;

    /**
     * Get Recipient email. 
     * @return Email Recipient email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Recipient email.
     * @param Email Recipient email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get For variable parameters in template, please use json.dump to format the json object into string type. the object is a set of Key-value pairs. each Key represents a variable in template. variable usage in template is represented by {{Key}}. the appropriate value will be replaced with {{value}} when sent.
Note: the parameter value cannot be data of complex type such as html. the entire JSON structure of TemplateData has a length limit of 800 bytes. 
     * @return TemplateData For variable parameters in template, please use json.dump to format the json object into string type. the object is a set of Key-value pairs. each Key represents a variable in template. variable usage in template is represented by {{Key}}. the appropriate value will be replaced with {{value}} when sent.
Note: the parameter value cannot be data of complex type such as html. the entire JSON structure of TemplateData has a length limit of 800 bytes.
     */
    public String getTemplateData() {
        return this.TemplateData;
    }

    /**
     * Set For variable parameters in template, please use json.dump to format the json object into string type. the object is a set of Key-value pairs. each Key represents a variable in template. variable usage in template is represented by {{Key}}. the appropriate value will be replaced with {{value}} when sent.
Note: the parameter value cannot be data of complex type such as html. the entire JSON structure of TemplateData has a length limit of 800 bytes.
     * @param TemplateData For variable parameters in template, please use json.dump to format the json object into string type. the object is a set of Key-value pairs. each Key represents a variable in template. variable usage in template is represented by {{Key}}. the appropriate value will be replaced with {{value}} when sent.
Note: the parameter value cannot be data of complex type such as html. the entire JSON structure of TemplateData has a length limit of 800 bytes.
     */
    public void setTemplateData(String TemplateData) {
        this.TemplateData = TemplateData;
    }

    public ReceiverInputData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverInputData(ReceiverInputData source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.TemplateData != null) {
            this.TemplateData = new String(source.TemplateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "TemplateData", this.TemplateData);

    }
}

