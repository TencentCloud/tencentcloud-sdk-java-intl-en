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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionFieldConfigDetail extends AbstractModel {

    /**
    * Component type
The options are as follows:
input: text box
textarea: multi-line text box
number: number input box
select: selector
cascader: cascade selector
radio: single choice
time: time selection
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Component label
    */
    @SerializedName("Lable")
    @Expose
    private String Lable;

    /**
    * Unique identifier of the component, key when it is sent back to the backend
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Default value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * The supported configuration items are as follows. You can select the configuration items as needed. If no configuration is required, set the value to {}.

{  placeholder: string (placeholder)

  tooltip: string (prompt message)

  reg: RegExp (regular expression for the input content format)

  max: number (maximum number of input characters for text boxes and upper limit of the input number for number input boxes)

  min: number (lower limit of the input number for number input boxes)

  step: number (step size for number input boxes; default value: 1)

  format: string (format for time selection, for example YYYY-MM-DD and YYYY-MM-DD HH:mm:ss)

  separator: string[] (separator for multi-line input boxes. If it is left blank, no separator is used, and the text string entered by the user is returned directly.)

  multiple: boolean (multiple-choice or not, valid for selectors and cascade selectors)

  options: selector options (support the following two forms)

Directly provide the option array: { value: string; label: string }[]
Obtain options by calling the API: { api: string (API URL), params: string[] (interface parameters, corresponding to field of the parameter configuration. The frontend uses the input values of all components corresponding to field as parameters to query data. If no value is input, the frontend directly requests data when components are loaded.) 
}
}
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * Whether it is required (0: no; 1: yes)
    */
    @SerializedName("Required")
    @Expose
    private Long Required;

    /**
    * The compute configuration passes the verification when other fields that it depends on meet the conditions. (For example, at least one of the three form items must be filled in.)

[fieldName,

{ config: This item is retained and will be refined based on subsequent scenes. }

]
    */
    @SerializedName("Validate")
    @Expose
    private String Validate;

    /**
    * Whether it is visible
    */
    @SerializedName("Visible")
    @Expose
    private String Visible;

    /**
     * Get Component type
The options are as follows:
input: text box
textarea: multi-line text box
number: number input box
select: selector
cascader: cascade selector
radio: single choice
time: time selection 
     * @return Type Component type
The options are as follows:
input: text box
textarea: multi-line text box
number: number input box
select: selector
cascader: cascade selector
radio: single choice
time: time selection
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Component type
The options are as follows:
input: text box
textarea: multi-line text box
number: number input box
select: selector
cascader: cascade selector
radio: single choice
time: time selection
     * @param Type Component type
The options are as follows:
input: text box
textarea: multi-line text box
number: number input box
select: selector
cascader: cascade selector
radio: single choice
time: time selection
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Component label 
     * @return Lable Component label
     */
    public String getLable() {
        return this.Lable;
    }

    /**
     * Set Component label
     * @param Lable Component label
     */
    public void setLable(String Lable) {
        this.Lable = Lable;
    }

    /**
     * Get Unique identifier of the component, key when it is sent back to the backend 
     * @return Field Unique identifier of the component, key when it is sent back to the backend
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Unique identifier of the component, key when it is sent back to the backend
     * @param Field Unique identifier of the component, key when it is sent back to the backend
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Default value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultValue Default value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Default value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultValue Default value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get The supported configuration items are as follows. You can select the configuration items as needed. If no configuration is required, set the value to {}.

{  placeholder: string (placeholder)

  tooltip: string (prompt message)

  reg: RegExp (regular expression for the input content format)

  max: number (maximum number of input characters for text boxes and upper limit of the input number for number input boxes)

  min: number (lower limit of the input number for number input boxes)

  step: number (step size for number input boxes; default value: 1)

  format: string (format for time selection, for example YYYY-MM-DD and YYYY-MM-DD HH:mm:ss)

  separator: string[] (separator for multi-line input boxes. If it is left blank, no separator is used, and the text string entered by the user is returned directly.)

  multiple: boolean (multiple-choice or not, valid for selectors and cascade selectors)

  options: selector options (support the following two forms)

Directly provide the option array: { value: string; label: string }[]
Obtain options by calling the API: { api: string (API URL), params: string[] (interface parameters, corresponding to field of the parameter configuration. The frontend uses the input values of all components corresponding to field as parameters to query data. If no value is input, the frontend directly requests data when components are loaded.) 
}
} 
     * @return Config The supported configuration items are as follows. You can select the configuration items as needed. If no configuration is required, set the value to {}.

{  placeholder: string (placeholder)

  tooltip: string (prompt message)

  reg: RegExp (regular expression for the input content format)

  max: number (maximum number of input characters for text boxes and upper limit of the input number for number input boxes)

  min: number (lower limit of the input number for number input boxes)

  step: number (step size for number input boxes; default value: 1)

  format: string (format for time selection, for example YYYY-MM-DD and YYYY-MM-DD HH:mm:ss)

  separator: string[] (separator for multi-line input boxes. If it is left blank, no separator is used, and the text string entered by the user is returned directly.)

  multiple: boolean (multiple-choice or not, valid for selectors and cascade selectors)

  options: selector options (support the following two forms)

Directly provide the option array: { value: string; label: string }[]
Obtain options by calling the API: { api: string (API URL), params: string[] (interface parameters, corresponding to field of the parameter configuration. The frontend uses the input values of all components corresponding to field as parameters to query data. If no value is input, the frontend directly requests data when components are loaded.) 
}
}
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set The supported configuration items are as follows. You can select the configuration items as needed. If no configuration is required, set the value to {}.

{  placeholder: string (placeholder)

  tooltip: string (prompt message)

  reg: RegExp (regular expression for the input content format)

  max: number (maximum number of input characters for text boxes and upper limit of the input number for number input boxes)

  min: number (lower limit of the input number for number input boxes)

  step: number (step size for number input boxes; default value: 1)

  format: string (format for time selection, for example YYYY-MM-DD and YYYY-MM-DD HH:mm:ss)

  separator: string[] (separator for multi-line input boxes. If it is left blank, no separator is used, and the text string entered by the user is returned directly.)

  multiple: boolean (multiple-choice or not, valid for selectors and cascade selectors)

  options: selector options (support the following two forms)

Directly provide the option array: { value: string; label: string }[]
Obtain options by calling the API: { api: string (API URL), params: string[] (interface parameters, corresponding to field of the parameter configuration. The frontend uses the input values of all components corresponding to field as parameters to query data. If no value is input, the frontend directly requests data when components are loaded.) 
}
}
     * @param Config The supported configuration items are as follows. You can select the configuration items as needed. If no configuration is required, set the value to {}.

{  placeholder: string (placeholder)

  tooltip: string (prompt message)

  reg: RegExp (regular expression for the input content format)

  max: number (maximum number of input characters for text boxes and upper limit of the input number for number input boxes)

  min: number (lower limit of the input number for number input boxes)

  step: number (step size for number input boxes; default value: 1)

  format: string (format for time selection, for example YYYY-MM-DD and YYYY-MM-DD HH:mm:ss)

  separator: string[] (separator for multi-line input boxes. If it is left blank, no separator is used, and the text string entered by the user is returned directly.)

  multiple: boolean (multiple-choice or not, valid for selectors and cascade selectors)

  options: selector options (support the following two forms)

Directly provide the option array: { value: string; label: string }[]
Obtain options by calling the API: { api: string (API URL), params: string[] (interface parameters, corresponding to field of the parameter configuration. The frontend uses the input values of all components corresponding to field as parameters to query data. If no value is input, the frontend directly requests data when components are loaded.) 
}
}
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get Whether it is required (0: no; 1: yes) 
     * @return Required Whether it is required (0: no; 1: yes)
     */
    public Long getRequired() {
        return this.Required;
    }

    /**
     * Set Whether it is required (0: no; 1: yes)
     * @param Required Whether it is required (0: no; 1: yes)
     */
    public void setRequired(Long Required) {
        this.Required = Required;
    }

    /**
     * Get The compute configuration passes the verification when other fields that it depends on meet the conditions. (For example, at least one of the three form items must be filled in.)

[fieldName,

{ config: This item is retained and will be refined based on subsequent scenes. }

] 
     * @return Validate The compute configuration passes the verification when other fields that it depends on meet the conditions. (For example, at least one of the three form items must be filled in.)

[fieldName,

{ config: This item is retained and will be refined based on subsequent scenes. }

]
     */
    public String getValidate() {
        return this.Validate;
    }

    /**
     * Set The compute configuration passes the verification when other fields that it depends on meet the conditions. (For example, at least one of the three form items must be filled in.)

[fieldName,

{ config: This item is retained and will be refined based on subsequent scenes. }

]
     * @param Validate The compute configuration passes the verification when other fields that it depends on meet the conditions. (For example, at least one of the three form items must be filled in.)

[fieldName,

{ config: This item is retained and will be refined based on subsequent scenes. }

]
     */
    public void setValidate(String Validate) {
        this.Validate = Validate;
    }

    /**
     * Get Whether it is visible 
     * @return Visible Whether it is visible
     */
    public String getVisible() {
        return this.Visible;
    }

    /**
     * Set Whether it is visible
     * @param Visible Whether it is visible
     */
    public void setVisible(String Visible) {
        this.Visible = Visible;
    }

    public ActionFieldConfigDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionFieldConfigDetail(ActionFieldConfigDetail source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Lable != null) {
            this.Lable = new String(source.Lable);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Required != null) {
            this.Required = new Long(source.Required);
        }
        if (source.Validate != null) {
            this.Validate = new String(source.Validate);
        }
        if (source.Visible != null) {
            this.Visible = new String(source.Visible);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Lable", this.Lable);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Validate", this.Validate);
        this.setParamSimple(map, prefix + "Visible", this.Visible);

    }
}

