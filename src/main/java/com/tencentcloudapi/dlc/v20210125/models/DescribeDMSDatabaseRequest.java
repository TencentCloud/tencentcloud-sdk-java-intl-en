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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDMSDatabaseRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Schema name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Match rules
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Schema name 
     * @return SchemaName Schema name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema name
     * @param SchemaName Schema name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Match rules 
     * @return Pattern Match rules
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Match rules
     * @param Pattern Match rules
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    public DescribeDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDMSDatabaseRequest(DescribeDMSDatabaseRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);

    }
}

