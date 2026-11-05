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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerParamSchema extends AbstractModel {

    /**
    * <p>Parameter name</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>String array</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Integer array</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Floating-point number array</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Boolean value array</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
    */
    @SerializedName("ParamType")
    @Expose
    private Long ParamType;

    /**
    * <p>Required or optional</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>Sub-parameter list</p>
    */
    @SerializedName("SubParamList")
    @Expose
    private AppTriggerParamSchema [] SubParamList;

    /**
     * Get <p>Parameter name</p> 
     * @return ParamName <p>Parameter name</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>Parameter name</p>
     * @param ParamName <p>Parameter name</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>String array</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Integer array</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Floating-point number array</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Boolean value array</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table> 
     * @return ParamType <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>String array</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Integer array</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Floating-point number array</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Boolean value array</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
     */
    public Long getParamType() {
        return this.ParamType;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>String array</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Integer array</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Floating-point number array</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Boolean value array</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
     * @param ParamType <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>String array</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Integer array</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Floating-point number array</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Boolean value array</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
     */
    public void setParamType(Long ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>Required or optional</p> 
     * @return Required <p>Required or optional</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>Required or optional</p>
     * @param Required <p>Required or optional</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>Sub-parameter list</p> 
     * @return SubParamList <p>Sub-parameter list</p>
     */
    public AppTriggerParamSchema [] getSubParamList() {
        return this.SubParamList;
    }

    /**
     * Set <p>Sub-parameter list</p>
     * @param SubParamList <p>Sub-parameter list</p>
     */
    public void setSubParamList(AppTriggerParamSchema [] SubParamList) {
        this.SubParamList = SubParamList;
    }

    public AppTriggerParamSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerParamSchema(AppTriggerParamSchema source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamType != null) {
            this.ParamType = new Long(source.ParamType);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.SubParamList != null) {
            this.SubParamList = new AppTriggerParamSchema[source.SubParamList.length];
            for (int i = 0; i < source.SubParamList.length; i++) {
                this.SubParamList[i] = new AppTriggerParamSchema(source.SubParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamArrayObj(map, prefix + "SubParamList.", this.SubParamList);

    }
}

