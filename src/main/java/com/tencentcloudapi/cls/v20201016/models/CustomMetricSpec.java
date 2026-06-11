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

public class CustomMetricSpec extends AbstractModel {

    /**
    * Port. Value range: [1,65535].
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Metric address. Verification format: ^/[a-zA-Z0-9-_./]*$.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Namespace list.
-Supports up to 100.
-Check format of namespace `[a-z0-9]([-a-z0-9]*[a-z0-9])?`. Length cannot exceed 63.
-namespace must be unique
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * Pod tag.
-supports a maximum of 100

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodLabel")
    @Expose
    private Label [] PodLabel;

    /**
     * Get Port. Value range: [1,65535].
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Port. Value range: [1,65535].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port. Value range: [1,65535].
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Port. Value range: [1,65535].
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Metric address. Verification format: ^/[a-zA-Z0-9-_./]*$.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Metric address. Verification format: ^/[a-zA-Z0-9-_./]*$.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Metric address. Verification format: ^/[a-zA-Z0-9-_./]*$.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Metric address. Verification format: ^/[a-zA-Z0-9-_./]*$.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Namespace list.
-Supports up to 100.
-Check format of namespace `[a-z0-9]([-a-z0-9]*[a-z0-9])?`. Length cannot exceed 63.
-namespace must be unique
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespaces Namespace list.
-Supports up to 100.
-Check format of namespace `[a-z0-9]([-a-z0-9]*[a-z0-9])?`. Length cannot exceed 63.
-namespace must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set Namespace list.
-Supports up to 100.
-Check format of namespace `[a-z0-9]([-a-z0-9]*[a-z0-9])?`. Length cannot exceed 63.
-namespace must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespaces Namespace list.
-Supports up to 100.
-Check format of namespace `[a-z0-9]([-a-z0-9]*[a-z0-9])?`. Length cannot exceed 63.
-namespace must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get Pod tag.
-supports a maximum of 100

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodLabel Pod tag.
-supports a maximum of 100

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Label [] getPodLabel() {
        return this.PodLabel;
    }

    /**
     * Set Pod tag.
-supports a maximum of 100

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodLabel Pod tag.
-supports a maximum of 100

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodLabel(Label [] PodLabel) {
        this.PodLabel = PodLabel;
    }

    public CustomMetricSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMetricSpec(CustomMetricSpec source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.PodLabel != null) {
            this.PodLabel = new Label[source.PodLabel.length];
            for (int i = 0; i < source.PodLabel.length; i++) {
                this.PodLabel[i] = new Label(source.PodLabel[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamArrayObj(map, prefix + "PodLabel.", this.PodLabel);

    }
}

