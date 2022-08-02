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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel{

    /**
    * Column name, which is case-insensitive and can contain up to 25 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Column type. Valid values:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Class comment.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Length of the entire numeric value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * Length of the decimal part
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * Whether the column is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nullable")
    @Expose
    private String Nullable;

    /**
    * Field position
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Field creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Field modification time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Whether the column is the partition field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
     * Get Column name, which is case-insensitive and can contain up to 25 characters. 
     * @return Name Column name, which is case-insensitive and can contain up to 25 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Column name, which is case-insensitive and can contain up to 25 characters.
     * @param Name Column name, which is case-insensitive and can contain up to 25 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Column type. Valid values:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>. 
     * @return Type Column type. Valid values:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Column type. Valid values:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>.
     * @param Type Column type. Valid values:
string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array<data_type>|map<primitive_type, data_type>|struct<col_name : data_type [COMMENT col_comment], ...>|uniontype<data_type, data_type, ...>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Class comment.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Class comment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Class comment.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Class comment.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Length of the entire numeric value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Precision Length of the entire numeric value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set Length of the entire numeric value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Precision Length of the entire numeric value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get Length of the decimal part
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scale Length of the decimal part
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Length of the decimal part
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scale Length of the decimal part
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Whether the column is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nullable Whether the column is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNullable() {
        return this.Nullable;
    }

    /**
     * Set Whether the column is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nullable Whether the column is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNullable(String Nullable) {
        this.Nullable = Nullable;
    }

    /**
     * Get Field position
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Position Field position
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Field position
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Position Field position
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Field creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Field creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Field creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Field creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Field modification time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Field modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Field modification time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Field modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Whether the column is the partition field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPartition Whether the column is the partition field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Whether the column is the partition field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPartition Whether the column is the partition field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    public Column() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Column(Column source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Nullable != null) {
            this.Nullable = new String(source.Nullable);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "Nullable", this.Nullable);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}

