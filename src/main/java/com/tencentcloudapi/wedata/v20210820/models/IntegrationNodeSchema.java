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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeSchema extends AbstractModel {

    /**
    * Schema ID Random Unique
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Schema Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Schema Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Schema Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Schema Extended Attributes
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Properties")
    @Expose
    private RecordField [] Properties;

    /**
    * Schema Alias
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Field Remarks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get Schema ID Random Unique 
     * @return Id Schema ID Random Unique
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Schema ID Random Unique
     * @param Id Schema ID Random Unique
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Schema Name 
     * @return Name Schema Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Schema Name
     * @param Name Schema Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Schema Type 
     * @return Type Schema Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Schema Type
     * @param Type Schema Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Schema Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Value Schema Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Schema Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Value Schema Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Schema Extended Attributes
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Properties Schema Extended Attributes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getProperties() {
        return this.Properties;
    }

    /**
     * Set Schema Extended Attributes
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Properties Schema Extended Attributes
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProperties(RecordField [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get Schema Alias
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Alias Schema Alias
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Schema Alias
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Alias Schema Alias
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Field Remarks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Comment Field Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Field Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Comment Field Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public IntegrationNodeSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeSchema(IntegrationNodeSchema source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Properties != null) {
            this.Properties = new RecordField[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new RecordField(source.Properties[i]);
            }
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

