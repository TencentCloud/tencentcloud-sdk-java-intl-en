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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexOptionsField extends AbstractModel {

    /**
    * Max age for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ExpireMaxAge")
    @Expose
    private String ExpireMaxAge;

    /**
    * Max size for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ExpireMaxSize")
    @Expose
    private String ExpireMaxSize;

    /**
    * Rollover cycle
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RolloverMaxAge")
    @Expose
    private String RolloverMaxAge;

    /**
    * Whether to enable the dynamic rollover
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RolloverDynamic")
    @Expose
    private String RolloverDynamic;

    /**
    * Whether to enable dynamic sharding
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ShardNumDynamic")
    @Expose
    private String ShardNumDynamic;

    /**
    * Timestamp field
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
    * Write mode
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WriteMode")
    @Expose
    private String WriteMode;

    /**
     * Get Max age for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ExpireMaxAge Max age for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getExpireMaxAge() {
        return this.ExpireMaxAge;
    }

    /**
     * Set Max age for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ExpireMaxAge Max age for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setExpireMaxAge(String ExpireMaxAge) {
        this.ExpireMaxAge = ExpireMaxAge;
    }

    /**
     * Get Max size for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ExpireMaxSize Max size for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getExpireMaxSize() {
        return this.ExpireMaxSize;
    }

    /**
     * Set Max size for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ExpireMaxSize Max size for expiry purpose
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setExpireMaxSize(String ExpireMaxSize) {
        this.ExpireMaxSize = ExpireMaxSize;
    }

    /**
     * Get Rollover cycle
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RolloverMaxAge Rollover cycle
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRolloverMaxAge() {
        return this.RolloverMaxAge;
    }

    /**
     * Set Rollover cycle
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RolloverMaxAge Rollover cycle
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRolloverMaxAge(String RolloverMaxAge) {
        this.RolloverMaxAge = RolloverMaxAge;
    }

    /**
     * Get Whether to enable the dynamic rollover
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RolloverDynamic Whether to enable the dynamic rollover
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRolloverDynamic() {
        return this.RolloverDynamic;
    }

    /**
     * Set Whether to enable the dynamic rollover
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RolloverDynamic Whether to enable the dynamic rollover
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRolloverDynamic(String RolloverDynamic) {
        this.RolloverDynamic = RolloverDynamic;
    }

    /**
     * Get Whether to enable dynamic sharding
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ShardNumDynamic Whether to enable dynamic sharding
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getShardNumDynamic() {
        return this.ShardNumDynamic;
    }

    /**
     * Set Whether to enable dynamic sharding
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ShardNumDynamic Whether to enable dynamic sharding
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setShardNumDynamic(String ShardNumDynamic) {
        this.ShardNumDynamic = ShardNumDynamic;
    }

    /**
     * Get Timestamp field
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TimestampField Timestamp field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set Timestamp field
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TimestampField Timestamp field
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    /**
     * Get Write mode
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return WriteMode Write mode
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getWriteMode() {
        return this.WriteMode;
    }

    /**
     * Set Write mode
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param WriteMode Write mode
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWriteMode(String WriteMode) {
        this.WriteMode = WriteMode;
    }

    public IndexOptionsField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexOptionsField(IndexOptionsField source) {
        if (source.ExpireMaxAge != null) {
            this.ExpireMaxAge = new String(source.ExpireMaxAge);
        }
        if (source.ExpireMaxSize != null) {
            this.ExpireMaxSize = new String(source.ExpireMaxSize);
        }
        if (source.RolloverMaxAge != null) {
            this.RolloverMaxAge = new String(source.RolloverMaxAge);
        }
        if (source.RolloverDynamic != null) {
            this.RolloverDynamic = new String(source.RolloverDynamic);
        }
        if (source.ShardNumDynamic != null) {
            this.ShardNumDynamic = new String(source.ShardNumDynamic);
        }
        if (source.TimestampField != null) {
            this.TimestampField = new String(source.TimestampField);
        }
        if (source.WriteMode != null) {
            this.WriteMode = new String(source.WriteMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpireMaxAge", this.ExpireMaxAge);
        this.setParamSimple(map, prefix + "ExpireMaxSize", this.ExpireMaxSize);
        this.setParamSimple(map, prefix + "RolloverMaxAge", this.RolloverMaxAge);
        this.setParamSimple(map, prefix + "RolloverDynamic", this.RolloverDynamic);
        this.setParamSimple(map, prefix + "ShardNumDynamic", this.ShardNumDynamic);
        this.setParamSimple(map, prefix + "TimestampField", this.TimestampField);
        this.setParamSimple(map, prefix + "WriteMode", this.WriteMode);

    }
}

