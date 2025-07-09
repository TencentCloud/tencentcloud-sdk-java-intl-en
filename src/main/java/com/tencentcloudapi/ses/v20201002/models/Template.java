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

public class Template extends AbstractModel {

    /**
    * Template ID. If you don’t have any template, please create one.
    */
    @SerializedName("TemplateID")
    @Expose
    private Long TemplateID;

    /**
    * Variable parameters in the template. Please use `json.dump` to format the JSON object into a string type. The object is a set of key-value pairs. Each key denotes a variable, which is represented by {{key}}. The key will be replaced with the corresponding value (represented by {{value}}) when sending the email.
Note: The parameter value cannot be data of a complex type such as HTML.
Example: {"name":"xxx","age":"xx"}
    */
    @SerializedName("TemplateData")
    @Expose
    private String TemplateData;

    /**
     * Get Template ID. If you don’t have any template, please create one. 
     * @return TemplateID Template ID. If you don’t have any template, please create one.
     */
    public Long getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set Template ID. If you don’t have any template, please create one.
     * @param TemplateID Template ID. If you don’t have any template, please create one.
     */
    public void setTemplateID(Long TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get Variable parameters in the template. Please use `json.dump` to format the JSON object into a string type. The object is a set of key-value pairs. Each key denotes a variable, which is represented by {{key}}. The key will be replaced with the corresponding value (represented by {{value}}) when sending the email.
Note: The parameter value cannot be data of a complex type such as HTML.
Example: {"name":"xxx","age":"xx"} 
     * @return TemplateData Variable parameters in the template. Please use `json.dump` to format the JSON object into a string type. The object is a set of key-value pairs. Each key denotes a variable, which is represented by {{key}}. The key will be replaced with the corresponding value (represented by {{value}}) when sending the email.
Note: The parameter value cannot be data of a complex type such as HTML.
Example: {"name":"xxx","age":"xx"}
     */
    public String getTemplateData() {
        return this.TemplateData;
    }

    /**
     * Set Variable parameters in the template. Please use `json.dump` to format the JSON object into a string type. The object is a set of key-value pairs. Each key denotes a variable, which is represented by {{key}}. The key will be replaced with the corresponding value (represented by {{value}}) when sending the email.
Note: The parameter value cannot be data of a complex type such as HTML.
Example: {"name":"xxx","age":"xx"}
     * @param TemplateData Variable parameters in the template. Please use `json.dump` to format the JSON object into a string type. The object is a set of key-value pairs. Each key denotes a variable, which is represented by {{key}}. The key will be replaced with the corresponding value (represented by {{value}}) when sending the email.
Note: The parameter value cannot be data of a complex type such as HTML.
Example: {"name":"xxx","age":"xx"}
     */
    public void setTemplateData(String TemplateData) {
        this.TemplateData = TemplateData;
    }

    public Template() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Template(Template source) {
        if (source.TemplateID != null) {
            this.TemplateID = new Long(source.TemplateID);
        }
        if (source.TemplateData != null) {
            this.TemplateData = new String(source.TemplateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "TemplateData", this.TemplateData);

    }
}

