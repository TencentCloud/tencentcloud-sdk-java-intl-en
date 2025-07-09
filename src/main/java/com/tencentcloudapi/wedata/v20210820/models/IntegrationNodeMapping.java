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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntegrationNodeMapping extends AbstractModel {

    /**
    * Source Node ID
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * Target Node ID
    */
    @SerializedName("SinkId")
    @Expose
    private String SinkId;

    /**
    * Source Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceSchema")
    @Expose
    private IntegrationNodeSchema [] SourceSchema;

    /**
    * Node Schema Mapping
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchemaMappings")
    @Expose
    private IntegrationNodeSchemaMapping [] SchemaMappings;

    /**
    * Node Mapping Extended Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
     * Get Source Node ID 
     * @return SourceId Source Node ID
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set Source Node ID
     * @param SourceId Source Node ID
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get Target Node ID 
     * @return SinkId Target Node ID
     */
    public String getSinkId() {
        return this.SinkId;
    }

    /**
     * Set Target Node ID
     * @param SinkId Target Node ID
     */
    public void setSinkId(String SinkId) {
        this.SinkId = SinkId;
    }

    /**
     * Get Source Node Schema
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceSchema Source Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationNodeSchema [] getSourceSchema() {
        return this.SourceSchema;
    }

    /**
     * Set Source Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceSchema Source Node Schema
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceSchema(IntegrationNodeSchema [] SourceSchema) {
        this.SourceSchema = SourceSchema;
    }

    /**
     * Get Node Schema Mapping
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchemaMappings Node Schema Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IntegrationNodeSchemaMapping [] getSchemaMappings() {
        return this.SchemaMappings;
    }

    /**
     * Set Node Schema Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchemaMappings Node Schema Mapping
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchemaMappings(IntegrationNodeSchemaMapping [] SchemaMappings) {
        this.SchemaMappings = SchemaMappings;
    }

    /**
     * Get Node Mapping Extended Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExtConfig Node Mapping Extended Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set Node Mapping Extended Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExtConfig Node Mapping Extended Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    public IntegrationNodeMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeMapping(IntegrationNodeMapping source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SinkId != null) {
            this.SinkId = new String(source.SinkId);
        }
        if (source.SourceSchema != null) {
            this.SourceSchema = new IntegrationNodeSchema[source.SourceSchema.length];
            for (int i = 0; i < source.SourceSchema.length; i++) {
                this.SourceSchema[i] = new IntegrationNodeSchema(source.SourceSchema[i]);
            }
        }
        if (source.SchemaMappings != null) {
            this.SchemaMappings = new IntegrationNodeSchemaMapping[source.SchemaMappings.length];
            for (int i = 0; i < source.SchemaMappings.length; i++) {
                this.SchemaMappings[i] = new IntegrationNodeSchemaMapping(source.SchemaMappings[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SinkId", this.SinkId);
        this.setParamArrayObj(map, prefix + "SourceSchema.", this.SourceSchema);
        this.setParamArrayObj(map, prefix + "SchemaMappings.", this.SchemaMappings);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);

    }
}

