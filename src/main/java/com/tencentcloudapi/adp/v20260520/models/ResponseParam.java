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

public class ResponseParam extends AbstractModel {

    /**
    * <p>Variable description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Parameter name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>OUTPUT_RENDER_REPLACE</td><td>0</td><td>Overwrite (full replacement)</td></tr><tr><td>OUTPUT_RENDER_APPEND</td><td>1</td><td>Incremental append</td></tr></tbody></table>
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * <p>Only useful for OBJECT or ARRAY_OBJECT types</p>
    */
    @SerializedName("SubParams")
    @Expose
    private ResponseParam [] SubParams;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>Array of strings</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Array of integers</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Array of floating-point numbers</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Array of boolean values</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null value</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>Variable description</p> 
     * @return Description <p>Variable description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Variable description</p>
     * @param Description <p>Variable description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Parameter name</p> 
     * @return Name <p>Parameter name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Parameter name</p>
     * @param Name <p>Parameter name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>OUTPUT_RENDER_REPLACE</td><td>0</td><td>Overwrite (full replacement)</td></tr><tr><td>OUTPUT_RENDER_APPEND</td><td>1</td><td>Incremental append</td></tr></tbody></table> 
     * @return RenderMode <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>OUTPUT_RENDER_REPLACE</td><td>0</td><td>Overwrite (full replacement)</td></tr><tr><td>OUTPUT_RENDER_APPEND</td><td>1</td><td>Incremental append</td></tr></tbody></table>
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>OUTPUT_RENDER_REPLACE</td><td>0</td><td>Overwrite (full replacement)</td></tr><tr><td>OUTPUT_RENDER_APPEND</td><td>1</td><td>Incremental append</td></tr></tbody></table>
     * @param RenderMode <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>OUTPUT_RENDER_REPLACE</td><td>0</td><td>Overwrite (full replacement)</td></tr><tr><td>OUTPUT_RENDER_APPEND</td><td>1</td><td>Incremental append</td></tr></tbody></table>
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get <p>Only useful for OBJECT or ARRAY_OBJECT types</p> 
     * @return SubParams <p>Only useful for OBJECT or ARRAY_OBJECT types</p>
     */
    public ResponseParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set <p>Only useful for OBJECT or ARRAY_OBJECT types</p>
     * @param SubParams <p>Only useful for OBJECT or ARRAY_OBJECT types</p>
     */
    public void setSubParams(ResponseParam [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>Array of strings</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Array of integers</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Array of floating-point numbers</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Array of boolean values</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null value</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table> 
     * @return Type <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>Array of strings</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Array of integers</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Array of floating-point numbers</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Array of boolean values</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null value</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>Array of strings</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Array of integers</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Array of floating-point numbers</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Array of boolean values</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null value</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
     * @param Type <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>PARAM_TYPE_STRING</td><td>0</td><td>String</td></tr><tr><td>PARAM_TYPE_INT</td><td>1</td><td>Integer</td></tr><tr><td>PARAM_TYPE_FLOAT</td><td>2</td><td>Floating-point number</td></tr><tr><td>PARAM_TYPE_BOOL</td><td>3</td><td>Boolean value</td></tr><tr><td>PARAM_TYPE_OBJECT</td><td>4</td><td>Object</td></tr><tr><td>PARAM_TYPE_ARRAY_STRING</td><td>5</td><td>Array of strings</td></tr><tr><td>PARAM_TYPE_ARRAY_INT</td><td>6</td><td>Array of integers</td></tr><tr><td>PARAM_TYPE_ARRAY_FLOAT</td><td>7</td><td>Array of floating-point numbers</td></tr><tr><td>PARAM_TYPE_ARRAY_BOOL</td><td>8</td><td>Array of boolean values</td></tr><tr><td>PARAM_TYPE_ARRAY_OBJECT</td><td>9</td><td>Object array</td></tr><tr><td>PARAM_TYPE_ARRAY_ARRAY</td><td>20</td><td>Nested array</td></tr><tr><td>PARAM_TYPE_NULL</td><td>99</td><td>Null value</td></tr><tr><td>PARAM_TYPE_UNSPECIFIED</td><td>100</td><td>Unspecified type, used for OneOf and AnyOf scenarios</td></tr></tbody></table>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ResponseParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseParam(ResponseParam source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.SubParams != null) {
            this.SubParams = new ResponseParam[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new ResponseParam(source.SubParams[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

