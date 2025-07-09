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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmMetricRecord extends AbstractModel {

    /**
    * Field array, used for the query result of indicators.
    */
    @SerializedName("Fields")
    @Expose
    private ApmField [] Fields;

    /**
    * Tag array, used to distinguish the objects of groupby.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
     * Get Field array, used for the query result of indicators. 
     * @return Fields Field array, used for the query result of indicators.
     */
    public ApmField [] getFields() {
        return this.Fields;
    }

    /**
     * Set Field array, used for the query result of indicators.
     * @param Fields Field array, used for the query result of indicators.
     */
    public void setFields(ApmField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get Tag array, used to distinguish the objects of groupby. 
     * @return Tags Tag array, used to distinguish the objects of groupby.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array, used to distinguish the objects of groupby.
     * @param Tags Tag array, used to distinguish the objects of groupby.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    public ApmMetricRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmMetricRecord(ApmMetricRecord source) {
        if (source.Fields != null) {
            this.Fields = new ApmField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new ApmField(source.Fields[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

