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

public class AccessKeyParamConfig extends AbstractModel {

    /**
    * <p>Access Key field type. 1: AccessKeyId, 2: AccessKeySecret, 3: SessionToken</p>
    */
    @SerializedName("FieldType")
    @Expose
    private Long FieldType;

    /**
    * <p>Required or not</p>
    */
    @SerializedName("IsRequired")
    @Expose
    private Boolean IsRequired;

    /**
    * <p>header/query field name</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>Default value of the AccessKey, which can be empty.</p>
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
     * Get <p>Access Key field type. 1: AccessKeyId, 2: AccessKeySecret, 3: SessionToken</p> 
     * @return FieldType <p>Access Key field type. 1: AccessKeyId, 2: AccessKeySecret, 3: SessionToken</p>
     */
    public Long getFieldType() {
        return this.FieldType;
    }

    /**
     * Set <p>Access Key field type. 1: AccessKeyId, 2: AccessKeySecret, 3: SessionToken</p>
     * @param FieldType <p>Access Key field type. 1: AccessKeyId, 2: AccessKeySecret, 3: SessionToken</p>
     */
    public void setFieldType(Long FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get <p>Required or not</p> 
     * @return IsRequired <p>Required or not</p>
     */
    public Boolean getIsRequired() {
        return this.IsRequired;
    }

    /**
     * Set <p>Required or not</p>
     * @param IsRequired <p>Required or not</p>
     */
    public void setIsRequired(Boolean IsRequired) {
        this.IsRequired = IsRequired;
    }

    /**
     * Get <p>header/query field name</p> 
     * @return ParamName <p>header/query field name</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>header/query field name</p>
     * @param ParamName <p>header/query field name</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>Default value of the AccessKey, which can be empty.</p> 
     * @return ParamValue <p>Default value of the AccessKey, which can be empty.</p>
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set <p>Default value of the AccessKey, which can be empty.</p>
     * @param ParamValue <p>Default value of the AccessKey, which can be empty.</p>
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    public AccessKeyParamConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyParamConfig(AccessKeyParamConfig source) {
        if (source.FieldType != null) {
            this.FieldType = new Long(source.FieldType);
        }
        if (source.IsRequired != null) {
            this.IsRequired = new Boolean(source.IsRequired);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "IsRequired", this.IsRequired);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);

    }
}

