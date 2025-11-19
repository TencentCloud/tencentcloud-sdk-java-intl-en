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

public class ApmServiceMetric extends AbstractModel {

    /**
    * Field array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fields")
    @Expose
    private ApmField [] Fields;

    /**
    * Tag array
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Application information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDetail")
    @Expose
    private ServiceDetail ServiceDetail;

    /**
     * Get Field array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fields Field array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmField [] getFields() {
        return this.Fields;
    }

    /**
     * Set Field array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fields Field array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFields(ApmField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get Tag array
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Application information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDetail Application information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceDetail getServiceDetail() {
        return this.ServiceDetail;
    }

    /**
     * Set Application information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceDetail Application information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDetail(ServiceDetail ServiceDetail) {
        this.ServiceDetail = ServiceDetail;
    }

    public ApmServiceMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmServiceMetric(ApmServiceMetric source) {
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
        if (source.ServiceDetail != null) {
            this.ServiceDetail = new ServiceDetail(source.ServiceDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ServiceDetail.", this.ServiceDetail);

    }
}

