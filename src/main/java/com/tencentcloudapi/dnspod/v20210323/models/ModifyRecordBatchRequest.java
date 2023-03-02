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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordBatchRequest extends AbstractModel{

    /**
    * Array of record IDs. You can view all DNS records and their IDs via the `DescribeRecordList` API.
    */
    @SerializedName("RecordIdList")
    @Expose
    private Long [] RecordIdList;

    /**
    * The field to be modified. Valid values: `sub_domain`, `record_type`, `area`, `value`, `mx`, `ttl`, `status`.
    */
    @SerializedName("Change")
    @Expose
    private String Change;

    /**
    * The value to be changed to, which is required and subject to the `change` field.
    */
    @SerializedName("ChangeTo")
    @Expose
    private String ChangeTo;

    /**
    * The record value to be changed to, which is required only if the `change` field is `record_type`.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * MX record priority, which is required only if the `Change` field is `mx`.
    */
    @SerializedName("MX")
    @Expose
    private String MX;

    /**
     * Get Array of record IDs. You can view all DNS records and their IDs via the `DescribeRecordList` API. 
     * @return RecordIdList Array of record IDs. You can view all DNS records and their IDs via the `DescribeRecordList` API.
     */
    public Long [] getRecordIdList() {
        return this.RecordIdList;
    }

    /**
     * Set Array of record IDs. You can view all DNS records and their IDs via the `DescribeRecordList` API.
     * @param RecordIdList Array of record IDs. You can view all DNS records and their IDs via the `DescribeRecordList` API.
     */
    public void setRecordIdList(Long [] RecordIdList) {
        this.RecordIdList = RecordIdList;
    }

    /**
     * Get The field to be modified. Valid values: `sub_domain`, `record_type`, `area`, `value`, `mx`, `ttl`, `status`. 
     * @return Change The field to be modified. Valid values: `sub_domain`, `record_type`, `area`, `value`, `mx`, `ttl`, `status`.
     */
    public String getChange() {
        return this.Change;
    }

    /**
     * Set The field to be modified. Valid values: `sub_domain`, `record_type`, `area`, `value`, `mx`, `ttl`, `status`.
     * @param Change The field to be modified. Valid values: `sub_domain`, `record_type`, `area`, `value`, `mx`, `ttl`, `status`.
     */
    public void setChange(String Change) {
        this.Change = Change;
    }

    /**
     * Get The value to be changed to, which is required and subject to the `change` field. 
     * @return ChangeTo The value to be changed to, which is required and subject to the `change` field.
     */
    public String getChangeTo() {
        return this.ChangeTo;
    }

    /**
     * Set The value to be changed to, which is required and subject to the `change` field.
     * @param ChangeTo The value to be changed to, which is required and subject to the `change` field.
     */
    public void setChangeTo(String ChangeTo) {
        this.ChangeTo = ChangeTo;
    }

    /**
     * Get The record value to be changed to, which is required only if the `change` field is `record_type`. 
     * @return Value The record value to be changed to, which is required only if the `change` field is `record_type`.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set The record value to be changed to, which is required only if the `change` field is `record_type`.
     * @param Value The record value to be changed to, which is required only if the `change` field is `record_type`.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get MX record priority, which is required only if the `Change` field is `mx`. 
     * @return MX MX record priority, which is required only if the `Change` field is `mx`.
     */
    public String getMX() {
        return this.MX;
    }

    /**
     * Set MX record priority, which is required only if the `Change` field is `mx`.
     * @param MX MX record priority, which is required only if the `Change` field is `mx`.
     */
    public void setMX(String MX) {
        this.MX = MX;
    }

    public ModifyRecordBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordBatchRequest(ModifyRecordBatchRequest source) {
        if (source.RecordIdList != null) {
            this.RecordIdList = new Long[source.RecordIdList.length];
            for (int i = 0; i < source.RecordIdList.length; i++) {
                this.RecordIdList[i] = new Long(source.RecordIdList[i]);
            }
        }
        if (source.Change != null) {
            this.Change = new String(source.Change);
        }
        if (source.ChangeTo != null) {
            this.ChangeTo = new String(source.ChangeTo);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.MX != null) {
            this.MX = new String(source.MX);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RecordIdList.", this.RecordIdList);
        this.setParamSimple(map, prefix + "Change", this.Change);
        this.setParamSimple(map, prefix + "ChangeTo", this.ChangeTo);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "MX", this.MX);

    }
}

