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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureSubscribeJobRequest extends AbstractModel {

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Data subscription type. Valid values for non-mongo DatabaseType: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo DatabaseType: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).
    */
    @SerializedName("SubscribeMode")
    @Expose
    private String SubscribeMode;

    /**
    * Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * Database node information
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * Kafka configuration
    */
    @SerializedName("KafkaConfig")
    @Expose
    private SubscribeKafkaConfig KafkaConfig;

    /**
    * Subscription database table information. When SubscribeMode is not all or ddl, SubscribeObjects is a required parameter.
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * Subscription data format, such as: protobuf, json, avro. Note: The specific optional values depend on the current link support capabilities. For details on the data format, please refer to the consumption demo documentation on the official website.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * mongo optional parameter: output aggregation settings.
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
    * Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. If true is filled in, it will be processed. If it is left blank or filled with other values, it will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported. If not filled in, the default is changeStream.Other businesses currently have no optional parameters.
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

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
     * Get Data subscription type. Valid values for non-mongo DatabaseType: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo DatabaseType: all (full instance update); database (subscribe to a table); collection (subscribe to a collection). 
     * @return SubscribeMode Data subscription type. Valid values for non-mongo DatabaseType: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo DatabaseType: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).
     */
    public String getSubscribeMode() {
        return this.SubscribeMode;
    }

    /**
     * Set Data subscription type. Valid values for non-mongo DatabaseType: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo DatabaseType: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).
     * @param SubscribeMode Data subscription type. Valid values for non-mongo DatabaseType: all (full instance update); dml (data update); ddl (structure update); dmlAndDdl (data + structure update). Valid values for mongo DatabaseType: all (full instance update); database (subscribe to a table); collection (subscribe to a collection).
     */
    public void setSubscribeMode(String SubscribeMode) {
        this.SubscribeMode = SubscribeMode;
    }

    /**
     * Get Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities. 
     * @return AccessType Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.
     * @param AccessType Source database access type. Valid values: extranet (public network); vpncloud (VPN access); dcg (Direct Connect); ccn (CCN); cdb (database); cvm (self-build on CVM); intranet (intranet); vpc (VPC). Note: The specific optional values depend on the current link support capabilities.
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Database node information 
     * @return Endpoints Database node information
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set Database node information
     * @param Endpoints Database node information
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get Kafka configuration 
     * @return KafkaConfig Kafka configuration
     */
    public SubscribeKafkaConfig getKafkaConfig() {
        return this.KafkaConfig;
    }

    /**
     * Set Kafka configuration
     * @param KafkaConfig Kafka configuration
     */
    public void setKafkaConfig(SubscribeKafkaConfig KafkaConfig) {
        this.KafkaConfig = KafkaConfig;
    }

    /**
     * Get Subscription database table information. When SubscribeMode is not all or ddl, SubscribeObjects is a required parameter. 
     * @return SubscribeObjects Subscription database table information. When SubscribeMode is not all or ddl, SubscribeObjects is a required parameter.
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set Subscription database table information. When SubscribeMode is not all or ddl, SubscribeObjects is a required parameter.
     * @param SubscribeObjects Subscription database table information. When SubscribeMode is not all or ddl, SubscribeObjects is a required parameter.
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get Subscription data format, such as: protobuf, json, avro. Note: The specific optional values depend on the current link support capabilities. For details on the data format, please refer to the consumption demo documentation on the official website. 
     * @return Protocol Subscription data format, such as: protobuf, json, avro. Note: The specific optional values depend on the current link support capabilities. For details on the data format, please refer to the consumption demo documentation on the official website.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Subscription data format, such as: protobuf, json, avro. Note: The specific optional values depend on the current link support capabilities. For details on the data format, please refer to the consumption demo documentation on the official website.
     * @param Protocol Subscription data format, such as: protobuf, json, avro. Note: The specific optional values depend on the current link support capabilities. For details on the data format, please refer to the consumption demo documentation on the official website.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get mongo optional parameter: output aggregation settings. 
     * @return PipelineInfo mongo optional parameter: output aggregation settings.
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set mongo optional parameter: output aggregation settings.
     * @param PipelineInfo mongo optional parameter: output aggregation settings.
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    /**
     * Get Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. If true is filled in, it will be processed. If it is left blank or filled with other values, it will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported. If not filled in, the default is changeStream.Other businesses currently have no optional parameters. 
     * @return ExtraAttr Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. If true is filled in, it will be processed. If it is left blank or filled with other values, it will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported. If not filled in, the default is changeStream.Other businesses currently have no optional parameters.
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. If true is filled in, it will be processed. If it is left blank or filled with other values, it will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported. If not filled in, the default is changeStream.Other businesses currently have no optional parameters.
     * @param ExtraAttr Additional information added for the business. The parameter name is called key, and the parameter value is called value.Optional parameters for mysql: ProcessXA. If true is filled in, it will be processed. If it is left blank or filled with other values, it will not be processed.Optional parameters for mongo: SubscribeType. Currently only changeStream is supported. If not filled in, the default is changeStream.Other businesses currently have no optional parameters.
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    public ConfigureSubscribeJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureSubscribeJobRequest(ConfigureSubscribeJobRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeMode != null) {
            this.SubscribeMode = new String(source.SubscribeMode);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointItem[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointItem(source.Endpoints[i]);
            }
        }
        if (source.KafkaConfig != null) {
            this.KafkaConfig = new SubscribeKafkaConfig(source.KafkaConfig);
        }
        if (source.SubscribeObjects != null) {
            this.SubscribeObjects = new SubscribeObject[source.SubscribeObjects.length];
            for (int i = 0; i < source.SubscribeObjects.length; i++) {
                this.SubscribeObjects[i] = new SubscribeObject(source.SubscribeObjects[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PipelineInfo != null) {
            this.PipelineInfo = new PipelineInfo[source.PipelineInfo.length];
            for (int i = 0; i < source.PipelineInfo.length; i++) {
                this.PipelineInfo[i] = new PipelineInfo(source.PipelineInfo[i]);
            }
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeMode", this.SubscribeMode);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamObj(map, prefix + "KafkaConfig.", this.KafkaConfig);
        this.setParamArrayObj(map, prefix + "SubscribeObjects.", this.SubscribeObjects);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);

    }
}

