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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexOptionsField extends AbstractModel {

    /**
    * <p>Expiration time.</p>
    */
    @SerializedName("ExpireMaxAge")
    @Expose
    private String ExpireMaxAge;

    /**
    * <p>Expiration size</p>
    */
    @SerializedName("ExpireMaxSize")
    @Expose
    private String ExpireMaxSize;

    /**
    * <p>Rollover period</p>
    */
    @SerializedName("RolloverMaxAge")
    @Expose
    private String RolloverMaxAge;

    /**
    * <p>Whether to enable dynamic scrolling</p>
    */
    @SerializedName("RolloverDynamic")
    @Expose
    private String RolloverDynamic;

    /**
    * <p>Whether to enable dynamic sharding</p>
    */
    @SerializedName("ShardNumDynamic")
    @Expose
    private String ShardNumDynamic;

    /**
    * <p>Time partition field</p>
    */
    @SerializedName("TimestampField")
    @Expose
    private String TimestampField;

    /**
    * <p>Write mode</p>
    */
    @SerializedName("WriteMode")
    @Expose
    private String WriteMode;

    /**
    * <p>Whether to enable complete uninstallation</p><p>Enumeration values:</p><ul><li>true: enable complete uninstallation</li><li>false: disable complete uninstallation</li></ul>
    */
    @SerializedName("FullOffloadedEnable")
    @Expose
    private String FullOffloadedEnable;

    /**
    * <p>Full uninstall lifecycle</p>
    */
    @SerializedName("FullOffloadedMaxAge")
    @Expose
    private String FullOffloadedMaxAge;

    /**
    * <p>Completely uninstall the lifecycle after backup index retrieval</p>
    */
    @SerializedName("FullOffloadedRetrieveMaxAge")
    @Expose
    private String FullOffloadedRetrieveMaxAge;

    /**
     * Get <p>Expiration time.</p> 
     * @return ExpireMaxAge <p>Expiration time.</p>
     */
    public String getExpireMaxAge() {
        return this.ExpireMaxAge;
    }

    /**
     * Set <p>Expiration time.</p>
     * @param ExpireMaxAge <p>Expiration time.</p>
     */
    public void setExpireMaxAge(String ExpireMaxAge) {
        this.ExpireMaxAge = ExpireMaxAge;
    }

    /**
     * Get <p>Expiration size</p> 
     * @return ExpireMaxSize <p>Expiration size</p>
     */
    public String getExpireMaxSize() {
        return this.ExpireMaxSize;
    }

    /**
     * Set <p>Expiration size</p>
     * @param ExpireMaxSize <p>Expiration size</p>
     */
    public void setExpireMaxSize(String ExpireMaxSize) {
        this.ExpireMaxSize = ExpireMaxSize;
    }

    /**
     * Get <p>Rollover period</p> 
     * @return RolloverMaxAge <p>Rollover period</p>
     */
    public String getRolloverMaxAge() {
        return this.RolloverMaxAge;
    }

    /**
     * Set <p>Rollover period</p>
     * @param RolloverMaxAge <p>Rollover period</p>
     */
    public void setRolloverMaxAge(String RolloverMaxAge) {
        this.RolloverMaxAge = RolloverMaxAge;
    }

    /**
     * Get <p>Whether to enable dynamic scrolling</p> 
     * @return RolloverDynamic <p>Whether to enable dynamic scrolling</p>
     */
    public String getRolloverDynamic() {
        return this.RolloverDynamic;
    }

    /**
     * Set <p>Whether to enable dynamic scrolling</p>
     * @param RolloverDynamic <p>Whether to enable dynamic scrolling</p>
     */
    public void setRolloverDynamic(String RolloverDynamic) {
        this.RolloverDynamic = RolloverDynamic;
    }

    /**
     * Get <p>Whether to enable dynamic sharding</p> 
     * @return ShardNumDynamic <p>Whether to enable dynamic sharding</p>
     */
    public String getShardNumDynamic() {
        return this.ShardNumDynamic;
    }

    /**
     * Set <p>Whether to enable dynamic sharding</p>
     * @param ShardNumDynamic <p>Whether to enable dynamic sharding</p>
     */
    public void setShardNumDynamic(String ShardNumDynamic) {
        this.ShardNumDynamic = ShardNumDynamic;
    }

    /**
     * Get <p>Time partition field</p> 
     * @return TimestampField <p>Time partition field</p>
     */
    public String getTimestampField() {
        return this.TimestampField;
    }

    /**
     * Set <p>Time partition field</p>
     * @param TimestampField <p>Time partition field</p>
     */
    public void setTimestampField(String TimestampField) {
        this.TimestampField = TimestampField;
    }

    /**
     * Get <p>Write mode</p> 
     * @return WriteMode <p>Write mode</p>
     */
    public String getWriteMode() {
        return this.WriteMode;
    }

    /**
     * Set <p>Write mode</p>
     * @param WriteMode <p>Write mode</p>
     */
    public void setWriteMode(String WriteMode) {
        this.WriteMode = WriteMode;
    }

    /**
     * Get <p>Whether to enable complete uninstallation</p><p>Enumeration values:</p><ul><li>true: enable complete uninstallation</li><li>false: disable complete uninstallation</li></ul> 
     * @return FullOffloadedEnable <p>Whether to enable complete uninstallation</p><p>Enumeration values:</p><ul><li>true: enable complete uninstallation</li><li>false: disable complete uninstallation</li></ul>
     */
    public String getFullOffloadedEnable() {
        return this.FullOffloadedEnable;
    }

    /**
     * Set <p>Whether to enable complete uninstallation</p><p>Enumeration values:</p><ul><li>true: enable complete uninstallation</li><li>false: disable complete uninstallation</li></ul>
     * @param FullOffloadedEnable <p>Whether to enable complete uninstallation</p><p>Enumeration values:</p><ul><li>true: enable complete uninstallation</li><li>false: disable complete uninstallation</li></ul>
     */
    public void setFullOffloadedEnable(String FullOffloadedEnable) {
        this.FullOffloadedEnable = FullOffloadedEnable;
    }

    /**
     * Get <p>Full uninstall lifecycle</p> 
     * @return FullOffloadedMaxAge <p>Full uninstall lifecycle</p>
     */
    public String getFullOffloadedMaxAge() {
        return this.FullOffloadedMaxAge;
    }

    /**
     * Set <p>Full uninstall lifecycle</p>
     * @param FullOffloadedMaxAge <p>Full uninstall lifecycle</p>
     */
    public void setFullOffloadedMaxAge(String FullOffloadedMaxAge) {
        this.FullOffloadedMaxAge = FullOffloadedMaxAge;
    }

    /**
     * Get <p>Completely uninstall the lifecycle after backup index retrieval</p> 
     * @return FullOffloadedRetrieveMaxAge <p>Completely uninstall the lifecycle after backup index retrieval</p>
     */
    public String getFullOffloadedRetrieveMaxAge() {
        return this.FullOffloadedRetrieveMaxAge;
    }

    /**
     * Set <p>Completely uninstall the lifecycle after backup index retrieval</p>
     * @param FullOffloadedRetrieveMaxAge <p>Completely uninstall the lifecycle after backup index retrieval</p>
     */
    public void setFullOffloadedRetrieveMaxAge(String FullOffloadedRetrieveMaxAge) {
        this.FullOffloadedRetrieveMaxAge = FullOffloadedRetrieveMaxAge;
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
        if (source.FullOffloadedEnable != null) {
            this.FullOffloadedEnable = new String(source.FullOffloadedEnable);
        }
        if (source.FullOffloadedMaxAge != null) {
            this.FullOffloadedMaxAge = new String(source.FullOffloadedMaxAge);
        }
        if (source.FullOffloadedRetrieveMaxAge != null) {
            this.FullOffloadedRetrieveMaxAge = new String(source.FullOffloadedRetrieveMaxAge);
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
        this.setParamSimple(map, prefix + "FullOffloadedEnable", this.FullOffloadedEnable);
        this.setParamSimple(map, prefix + "FullOffloadedMaxAge", this.FullOffloadedMaxAge);
        this.setParamSimple(map, prefix + "FullOffloadedRetrieveMaxAge", this.FullOffloadedRetrieveMaxAge);

    }
}

