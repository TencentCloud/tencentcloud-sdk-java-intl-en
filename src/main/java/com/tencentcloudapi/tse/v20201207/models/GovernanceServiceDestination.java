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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceServiceDestination extends AbstractModel {

    /**
    * Namespace
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Service.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private RoutingDestinationRuleLabel [] Labels;

    /**
     * Get Namespace
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Namespace Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Namespace Namespace
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Service.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Service Service.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Service Service.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Instance tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RoutingDestinationRuleLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(RoutingDestinationRuleLabel [] Labels) {
        this.Labels = Labels;
    }

    public GovernanceServiceDestination() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceServiceDestination(GovernanceServiceDestination source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Labels != null) {
            this.Labels = new RoutingDestinationRuleLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new RoutingDestinationRuleLabel(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

