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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSchemaRsp extends AbstractModel {

    /**
    * schema information
    */
    @SerializedName("Schema")
    @Expose
    private Schema Schema;

    /**
     * Get schema information 
     * @return Schema schema information
     */
    public Schema getSchema() {
        return this.Schema;
    }

    /**
     * Set schema information
     * @param Schema schema information
     */
    public void setSchema(Schema Schema) {
        this.Schema = Schema;
    }

    public CreateSchemaRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSchemaRsp(CreateSchemaRsp source) {
        if (source.Schema != null) {
            this.Schema = new Schema(source.Schema);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Schema.", this.Schema);

    }
}

