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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricConfigLabel extends AbstractModel {

    /**
    * Metadata.
support
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metadata")
    @Expose
    private String [] Metadata;

    /**
    * Metadata Pod label information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private AppointLabel Label;

    /**
    * Custom label information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomLabels")
    @Expose
    private CustomLabel [] CustomLabels;

    /**
     * Get Metadata.
support
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Metadata Metadata.
support
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Metadata.
support
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Metadata Metadata.
support
- `namespace`
- `pod_name`
- `pod_ip`
- `pod_uid`
- `container_name`
- `container_id`
- `image_name`
- `cluster_id`
- `node_id`
- `node_ip`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetadata(String [] Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get Metadata Pod label information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label Metadata Pod label information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AppointLabel getLabel() {
        return this.Label;
    }

    /**
     * Set Metadata Pod label information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label Metadata Pod label information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(AppointLabel Label) {
        this.Label = Label;
    }

    /**
     * Get Custom label information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomLabels Custom label information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CustomLabel [] getCustomLabels() {
        return this.CustomLabels;
    }

    /**
     * Set Custom label information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomLabels Custom label information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomLabels(CustomLabel [] CustomLabels) {
        this.CustomLabels = CustomLabels;
    }

    public MetricConfigLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricConfigLabel(MetricConfigLabel source) {
        if (source.Metadata != null) {
            this.Metadata = new String[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new String(source.Metadata[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new AppointLabel(source.Label);
        }
        if (source.CustomLabels != null) {
            this.CustomLabels = new CustomLabel[source.CustomLabels.length];
            for (int i = 0; i < source.CustomLabels.length; i++) {
                this.CustomLabels[i] = new CustomLabel(source.CustomLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "Label.", this.Label);
        this.setParamArrayObj(map, prefix + "CustomLabels.", this.CustomLabels);

    }
}

