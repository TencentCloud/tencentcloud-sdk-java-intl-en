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

public class CreateIncrementalMigrationStrategyRequest extends AbstractModel {

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
    * Incremental migration strategy name. The name length should not exceed 100 characters. Allowed characters include: Chinese characters, English characters, `0-9`,` _` and ` -`.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Source type. Valid values: 
<li>HTTP: the source type is HTTP.</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Incremental migration HTTP origin source configuration. This field is required when the OriginType value is `HTTP`.
    */
    @SerializedName("HttpOriginConfig")
    @Expose
    private IncrementalMigrationHttpOriginConfig HttpOriginConfig;

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
     * Get Incremental migration strategy name. The name length should not exceed 100 characters. Allowed characters include: Chinese characters, English characters, `0-9`,` _` and ` -`. 
     * @return StrategyName Incremental migration strategy name. The name length should not exceed 100 characters. Allowed characters include: Chinese characters, English characters, `0-9`,` _` and ` -`.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Incremental migration strategy name. The name length should not exceed 100 characters. Allowed characters include: Chinese characters, English characters, `0-9`,` _` and ` -`.
     * @param StrategyName Incremental migration strategy name. The name length should not exceed 100 characters. Allowed characters include: Chinese characters, English characters, `0-9`,` _` and ` -`.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Source type. Valid values: 
<li>HTTP: the source type is HTTP.</li> 
     * @return OriginType Source type. Valid values: 
<li>HTTP: the source type is HTTP.</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Source type. Valid values: 
<li>HTTP: the source type is HTTP.</li>
     * @param OriginType Source type. Valid values: 
<li>HTTP: the source type is HTTP.</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Incremental migration HTTP origin source configuration. This field is required when the OriginType value is `HTTP`. 
     * @return HttpOriginConfig Incremental migration HTTP origin source configuration. This field is required when the OriginType value is `HTTP`.
     */
    public IncrementalMigrationHttpOriginConfig getHttpOriginConfig() {
        return this.HttpOriginConfig;
    }

    /**
     * Set Incremental migration HTTP origin source configuration. This field is required when the OriginType value is `HTTP`.
     * @param HttpOriginConfig Incremental migration HTTP origin source configuration. This field is required when the OriginType value is `HTTP`.
     */
    public void setHttpOriginConfig(IncrementalMigrationHttpOriginConfig HttpOriginConfig) {
        this.HttpOriginConfig = HttpOriginConfig;
    }

    public CreateIncrementalMigrationStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIncrementalMigrationStrategyRequest(CreateIncrementalMigrationStrategyRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamObj(map, prefix + "HttpOriginConfig.", this.HttpOriginConfig);

    }
}

