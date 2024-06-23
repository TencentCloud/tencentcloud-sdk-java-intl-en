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

public class SearchColumnDocVO extends AbstractModel {

    /**
    * Field NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * Field TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Field Type Length
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * Field Type Precision
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * Field Type scale
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Field Order
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * Index Type on the column Primary Key: PRI, Unique Index: UNI, General Index: MUL
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnKey")
    @Expose
    private String ColumnKey;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get Field NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Field NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Field NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChineseName Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChineseName Field Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get Field TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type Field TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Field Type Length
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Length Field Type Length
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set Field Type Length
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Length Field Type Length
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get Field Type Precision
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Precision Field Type Precision
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set Field Type Precision
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Precision Field Type Precision
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get Field Type scale
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Scale Field Type scale
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Field Type scale
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Scale Field Type scale
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Field Default Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DefaultValue Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DefaultValue Field Default Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get Field DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Field DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Field Order
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Position Field Order
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Field Order
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Position Field Order
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IsPartition Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IsPartition Is Partition Field
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get Index Type on the column Primary Key: PRI, Unique Index: UNI, General Index: MUL
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnKey Index Type on the column Primary Key: PRI, Unique Index: UNI, General Index: MUL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnKey() {
        return this.ColumnKey;
    }

    /**
     * Set Index Type on the column Primary Key: PRI, Unique Index: UNI, General Index: MUL
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnKey Index Type on the column Primary Key: PRI, Unique Index: UNI, General Index: MUL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnKey(String ColumnKey) {
        this.ColumnKey = ColumnKey;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifiedTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ModifiedTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public SearchColumnDocVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchColumnDocVO(SearchColumnDocVO source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
        if (source.ColumnKey != null) {
            this.ColumnKey = new String(source.ColumnKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamSimple(map, prefix + "ColumnKey", this.ColumnKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

