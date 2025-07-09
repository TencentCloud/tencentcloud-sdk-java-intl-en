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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationStrategyInfo extends AbstractModel {

    /**
    * The ID of the incremental migration strategy.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * The name of the incremental migration strategy.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The bucket ID where the strategy takes effect.
    */
    @SerializedName("BucketId")
    @Expose
    private String BucketId;

    /**
    * Source type.
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Incremental migration HTTP origin source configuration.
    */
    @SerializedName("HttpOriginConfig")
    @Expose
    private IncrementalMigrationHttpOriginConfig HttpOriginConfig;

    /**
     * Get The ID of the incremental migration strategy. 
     * @return StrategyId The ID of the incremental migration strategy.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set The ID of the incremental migration strategy.
     * @param StrategyId The ID of the incremental migration strategy.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get The name of the incremental migration strategy. 
     * @return StrategyName The name of the incremental migration strategy.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set The name of the incremental migration strategy.
     * @param StrategyName The name of the incremental migration strategy.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b> 
     * @return SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     * @param SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The bucket ID where the strategy takes effect. 
     * @return BucketId The bucket ID where the strategy takes effect.
     */
    public String getBucketId() {
        return this.BucketId;
    }

    /**
     * Set The bucket ID where the strategy takes effect.
     * @param BucketId The bucket ID where the strategy takes effect.
     */
    public void setBucketId(String BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get Source type. 
     * @return OriginType Source type.
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Source type.
     * @param OriginType Source type.
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Incremental migration HTTP origin source configuration. 
     * @return HttpOriginConfig Incremental migration HTTP origin source configuration.
     */
    public IncrementalMigrationHttpOriginConfig getHttpOriginConfig() {
        return this.HttpOriginConfig;
    }

    /**
     * Set Incremental migration HTTP origin source configuration.
     * @param HttpOriginConfig Incremental migration HTTP origin source configuration.
     */
    public void setHttpOriginConfig(IncrementalMigrationHttpOriginConfig HttpOriginConfig) {
        this.HttpOriginConfig = HttpOriginConfig;
    }

    public IncrementalMigrationStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationStrategyInfo(IncrementalMigrationStrategyInfo source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.HttpOriginConfig != null) {
            this.HttpOriginConfig = new IncrementalMigrationHttpOriginConfig(source.HttpOriginConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamObj(map, prefix + "HttpOriginConfig.", this.HttpOriginConfig);

    }
}

