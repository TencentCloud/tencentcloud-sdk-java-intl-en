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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeObjectsRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Data subscription type. Valid values for non-mongo task: 0 (full instance update); 1 (data update); 2 (structure update); 3 (data + structure update). Valid values for mongo task: 0 (full instance update); 4 (subscribe to a table); 5 (subscribe to a collection).
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * Modified subscription database table information. It will replace the original subscription object, this field is required unless SubscribeObjectType = 0 or 2.
    */
    @SerializedName("Objects")
    @Expose
    private ModifiedSubscribeObject [] Objects;

    /**
    * Kafka partitioning policy. If left blank, it will remain unchanged by default. If filled, it will replace the original policy.
    */
    @SerializedName("DistributeRules")
    @Expose
    private DistributeRule [] DistributeRules;

    /**
    * Default partitioning policy. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Default strategies supported by non-mongo products: table - partitioned by table name, pk - partitioned by table name + primary key. Mongo's default strategy only supports: collection-partitioned by collection name.This field is used in conjunction with DistributeRules. If DistributeRules is configured, this field is also required. If this field is configured, it is considered as configuring a DistributeRules, and the original partitioning policy will also be overwritten.
    */
    @SerializedName("DefaultRuleType")
    @Expose
    private String DefaultRuleType;

    /**
    * Mongo output aggregation settings, optional for Mongo tasks. If left blank, no modification will be made by default.
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Data subscription type. Valid values for non-mongo task: 0 (full instance update); 1 (data update); 2 (structure update); 3 (data + structure update). Valid values for mongo task: 0 (full instance update); 4 (subscribe to a table); 5 (subscribe to a collection). 
     * @return SubscribeObjectType Data subscription type. Valid values for non-mongo task: 0 (full instance update); 1 (data update); 2 (structure update); 3 (data + structure update). Valid values for mongo task: 0 (full instance update); 4 (subscribe to a table); 5 (subscribe to a collection).
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set Data subscription type. Valid values for non-mongo task: 0 (full instance update); 1 (data update); 2 (structure update); 3 (data + structure update). Valid values for mongo task: 0 (full instance update); 4 (subscribe to a table); 5 (subscribe to a collection).
     * @param SubscribeObjectType Data subscription type. Valid values for non-mongo task: 0 (full instance update); 1 (data update); 2 (structure update); 3 (data + structure update). Valid values for mongo task: 0 (full instance update); 4 (subscribe to a table); 5 (subscribe to a collection).
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get Modified subscription database table information. It will replace the original subscription object, this field is required unless SubscribeObjectType = 0 or 2. 
     * @return Objects Modified subscription database table information. It will replace the original subscription object, this field is required unless SubscribeObjectType = 0 or 2.
     */
    public ModifiedSubscribeObject [] getObjects() {
        return this.Objects;
    }

    /**
     * Set Modified subscription database table information. It will replace the original subscription object, this field is required unless SubscribeObjectType = 0 or 2.
     * @param Objects Modified subscription database table information. It will replace the original subscription object, this field is required unless SubscribeObjectType = 0 or 2.
     */
    public void setObjects(ModifiedSubscribeObject [] Objects) {
        this.Objects = Objects;
    }

    /**
     * Get Kafka partitioning policy. If left blank, it will remain unchanged by default. If filled, it will replace the original policy. 
     * @return DistributeRules Kafka partitioning policy. If left blank, it will remain unchanged by default. If filled, it will replace the original policy.
     */
    public DistributeRule [] getDistributeRules() {
        return this.DistributeRules;
    }

    /**
     * Set Kafka partitioning policy. If left blank, it will remain unchanged by default. If filled, it will replace the original policy.
     * @param DistributeRules Kafka partitioning policy. If left blank, it will remain unchanged by default. If filled, it will replace the original policy.
     */
    public void setDistributeRules(DistributeRule [] DistributeRules) {
        this.DistributeRules = DistributeRules;
    }

    /**
     * Get Default partitioning policy. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Default strategies supported by non-mongo products: table - partitioned by table name, pk - partitioned by table name + primary key. Mongo's default strategy only supports: collection-partitioned by collection name.This field is used in conjunction with DistributeRules. If DistributeRules is configured, this field is also required. If this field is configured, it is considered as configuring a DistributeRules, and the original partitioning policy will also be overwritten. 
     * @return DefaultRuleType Default partitioning policy. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Default strategies supported by non-mongo products: table - partitioned by table name, pk - partitioned by table name + primary key. Mongo's default strategy only supports: collection-partitioned by collection name.This field is used in conjunction with DistributeRules. If DistributeRules is configured, this field is also required. If this field is configured, it is considered as configuring a DistributeRules, and the original partitioning policy will also be overwritten.
     */
    public String getDefaultRuleType() {
        return this.DefaultRuleType;
    }

    /**
     * Set Default partitioning policy. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Default strategies supported by non-mongo products: table - partitioned by table name, pk - partitioned by table name + primary key. Mongo's default strategy only supports: collection-partitioned by collection name.This field is used in conjunction with DistributeRules. If DistributeRules is configured, this field is also required. If this field is configured, it is considered as configuring a DistributeRules, and the original partitioning policy will also be overwritten.
     * @param DefaultRuleType Default partitioning policy. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Default strategies supported by non-mongo products: table - partitioned by table name, pk - partitioned by table name + primary key. Mongo's default strategy only supports: collection-partitioned by collection name.This field is used in conjunction with DistributeRules. If DistributeRules is configured, this field is also required. If this field is configured, it is considered as configuring a DistributeRules, and the original partitioning policy will also be overwritten.
     */
    public void setDefaultRuleType(String DefaultRuleType) {
        this.DefaultRuleType = DefaultRuleType;
    }

    /**
     * Get Mongo output aggregation settings, optional for Mongo tasks. If left blank, no modification will be made by default. 
     * @return PipelineInfo Mongo output aggregation settings, optional for Mongo tasks. If left blank, no modification will be made by default.
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set Mongo output aggregation settings, optional for Mongo tasks. If left blank, no modification will be made by default.
     * @param PipelineInfo Mongo output aggregation settings, optional for Mongo tasks. If left blank, no modification will be made by default.
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    public ModifySubscribeObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubscribeObjectsRequest(ModifySubscribeObjectsRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeObjectType != null) {
            this.SubscribeObjectType = new Long(source.SubscribeObjectType);
        }
        if (source.Objects != null) {
            this.Objects = new ModifiedSubscribeObject[source.Objects.length];
            for (int i = 0; i < source.Objects.length; i++) {
                this.Objects[i] = new ModifiedSubscribeObject(source.Objects[i]);
            }
        }
        if (source.DistributeRules != null) {
            this.DistributeRules = new DistributeRule[source.DistributeRules.length];
            for (int i = 0; i < source.DistributeRules.length; i++) {
                this.DistributeRules[i] = new DistributeRule(source.DistributeRules[i]);
            }
        }
        if (source.DefaultRuleType != null) {
            this.DefaultRuleType = new String(source.DefaultRuleType);
        }
        if (source.PipelineInfo != null) {
            this.PipelineInfo = new PipelineInfo[source.PipelineInfo.length];
            for (int i = 0; i < source.PipelineInfo.length; i++) {
                this.PipelineInfo[i] = new PipelineInfo(source.PipelineInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamArrayObj(map, prefix + "Objects.", this.Objects);
        this.setParamArrayObj(map, prefix + "DistributeRules.", this.DistributeRules);
        this.setParamSimple(map, prefix + "DefaultRuleType", this.DefaultRuleType);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);

    }
}

