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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchAttribute extends AbstractModel {

    /**
    * Attribute name. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Attribute type. 0: number, 1: string. Default value: 0
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Numeric attribute value. Default value: 0.0
    */
    @SerializedName("NumberValue")
    @Expose
    private Float NumberValue;

    /**
    * String attribute value. Up to 128 characters are allowed. Default value: ""
    */
    @SerializedName("StringValue")
    @Expose
    private String StringValue;

    /**
    * List attribute value
    */
    @SerializedName("ListValue")
    @Expose
    private String [] ListValue;

    /**
    * Map attribute value
    */
    @SerializedName("MapValue")
    @Expose
    private AttributeMap [] MapValue;

    /**
     * Get Attribute name. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*. 
     * @return Name Attribute name. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Attribute name. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
     * @param Name Attribute name. It can contain up to 128 characters, supporting [a-zA-Z0-9-\.]*.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Attribute type. 0: number, 1: string. Default value: 0 
     * @return Type Attribute type. 0: number, 1: string. Default value: 0
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Attribute type. 0: number, 1: string. Default value: 0
     * @param Type Attribute type. 0: number, 1: string. Default value: 0
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Numeric attribute value. Default value: 0.0 
     * @return NumberValue Numeric attribute value. Default value: 0.0
     */
    public Float getNumberValue() {
        return this.NumberValue;
    }

    /**
     * Set Numeric attribute value. Default value: 0.0
     * @param NumberValue Numeric attribute value. Default value: 0.0
     */
    public void setNumberValue(Float NumberValue) {
        this.NumberValue = NumberValue;
    }

    /**
     * Get String attribute value. Up to 128 characters are allowed. Default value: "" 
     * @return StringValue String attribute value. Up to 128 characters are allowed. Default value: ""
     */
    public String getStringValue() {
        return this.StringValue;
    }

    /**
     * Set String attribute value. Up to 128 characters are allowed. Default value: ""
     * @param StringValue String attribute value. Up to 128 characters are allowed. Default value: ""
     */
    public void setStringValue(String StringValue) {
        this.StringValue = StringValue;
    }

    /**
     * Get List attribute value 
     * @return ListValue List attribute value
     */
    public String [] getListValue() {
        return this.ListValue;
    }

    /**
     * Set List attribute value
     * @param ListValue List attribute value
     */
    public void setListValue(String [] ListValue) {
        this.ListValue = ListValue;
    }

    /**
     * Get Map attribute value 
     * @return MapValue Map attribute value
     */
    public AttributeMap [] getMapValue() {
        return this.MapValue;
    }

    /**
     * Set Map attribute value
     * @param MapValue Map attribute value
     */
    public void setMapValue(AttributeMap [] MapValue) {
        this.MapValue = MapValue;
    }

    public MatchAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchAttribute(MatchAttribute source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NumberValue != null) {
            this.NumberValue = new Float(source.NumberValue);
        }
        if (source.StringValue != null) {
            this.StringValue = new String(source.StringValue);
        }
        if (source.ListValue != null) {
            this.ListValue = new String[source.ListValue.length];
            for (int i = 0; i < source.ListValue.length; i++) {
                this.ListValue[i] = new String(source.ListValue[i]);
            }
        }
        if (source.MapValue != null) {
            this.MapValue = new AttributeMap[source.MapValue.length];
            for (int i = 0; i < source.MapValue.length; i++) {
                this.MapValue[i] = new AttributeMap(source.MapValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NumberValue", this.NumberValue);
        this.setParamSimple(map, prefix + "StringValue", this.StringValue);
        this.setParamArraySimple(map, prefix + "ListValue.", this.ListValue);
        this.setParamArrayObj(map, prefix + "MapValue.", this.MapValue);

    }
}

