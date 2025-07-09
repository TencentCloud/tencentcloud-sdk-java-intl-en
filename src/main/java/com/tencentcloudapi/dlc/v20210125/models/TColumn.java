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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TColumn extends AbstractModel {

    /**
    * Field name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Field type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Field description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Field default values
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * Is the field non-empty?
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotNull")
    @Expose
    private Boolean NotNull;

    /**
    * Indicate the length of the entire numeric with a value of 1-38
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * Indicates the length of the decimal part.
Scale is smaller than Precision.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * Field position: Fields with smaller values need to be placed first.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Whether it is a partition field
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
     * Get Field name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Field name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Field name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Field type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Field type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Field type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Field type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Field description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Field description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Field description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Field description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Field default values
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Default Field default values
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set Field default values
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Default Field default values
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get Is the field non-empty?
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NotNull Is the field non-empty?
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNotNull() {
        return this.NotNull;
    }

    /**
     * Set Is the field non-empty?
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NotNull Is the field non-empty?
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNotNull(Boolean NotNull) {
        this.NotNull = NotNull;
    }

    /**
     * Get Indicate the length of the entire numeric with a value of 1-38
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Precision Indicate the length of the entire numeric with a value of 1-38
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set Indicate the length of the entire numeric with a value of 1-38
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Precision Indicate the length of the entire numeric with a value of 1-38
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get Indicates the length of the decimal part.
Scale is smaller than Precision.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scale Indicates the length of the decimal part.
Scale is smaller than Precision.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set Indicates the length of the decimal part.
Scale is smaller than Precision.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scale Indicates the length of the decimal part.
Scale is smaller than Precision.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get Field position: Fields with smaller values need to be placed first.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Position Field position: Fields with smaller values need to be placed first.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Field position: Fields with smaller values need to be placed first.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Position Field position: Fields with smaller values need to be placed first.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Whether it is a partition field
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPartition Whether it is a partition field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Whether it is a partition field
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPartition Whether it is a partition field
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    public TColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TColumn(TColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.NotNull != null) {
            this.NotNull = new Boolean(source.NotNull);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
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
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "NotNull", this.NotNull);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}

