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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnInfo extends AbstractModel {

    /**
    * Field type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Field name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Field length.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * Field description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Field order.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Is partition field.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

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
     * Get Field name 
     * @return Name Field name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field name
     * @param Name Field name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Field length.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Length Field length.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set Field length.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Length Field length.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get Field description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Field description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Field description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Field description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Field order.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Position Field order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Field order.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Position Field order.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Is partition field.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPartition Is partition field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Is partition field.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPartition Is partition field.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    public ColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnInfo(ColumnInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}

