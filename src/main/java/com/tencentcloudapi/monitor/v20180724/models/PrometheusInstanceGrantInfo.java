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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstanceGrantInfo extends AbstractModel {

    /**
    * Whether there is permission to operate on the billing information. Valid values: 1 (yes), 2 (no).
    */
    @SerializedName("HasChargeOperation")
    @Expose
    private Long HasChargeOperation;

    /**
    * Whether there is permission to display the VPC information. Valid values: 1 (yes), 2 (no).
    */
    @SerializedName("HasVpcDisplay")
    @Expose
    private Long HasVpcDisplay;

    /**
    * Whether there is permission to change the Grafana status. Valid values: 1 (yes), 2 (no).
    */
    @SerializedName("HasGrafanaStatusChange")
    @Expose
    private Long HasGrafanaStatusChange;

    /**
    * Whether there is permission to manage agents. Valid values: 1 (yes), 2 (no).
    */
    @SerializedName("HasAgentManage")
    @Expose
    private Long HasAgentManage;

    /**
    * Whether there is permission to manage TKE integrations. Valid values: 1 (yes), 2 (no).
    */
    @SerializedName("HasTkeManage")
    @Expose
    private Long HasTkeManage;

    /**
    * Whether there is permission to display the API information. Valid values: 1 (yes), 2 (no).
    */
    @SerializedName("HasApiOperation")
    @Expose
    private Long HasApiOperation;

    /**
     * Get Whether there is permission to operate on the billing information. Valid values: 1 (yes), 2 (no). 
     * @return HasChargeOperation Whether there is permission to operate on the billing information. Valid values: 1 (yes), 2 (no).
     */
    public Long getHasChargeOperation() {
        return this.HasChargeOperation;
    }

    /**
     * Set Whether there is permission to operate on the billing information. Valid values: 1 (yes), 2 (no).
     * @param HasChargeOperation Whether there is permission to operate on the billing information. Valid values: 1 (yes), 2 (no).
     */
    public void setHasChargeOperation(Long HasChargeOperation) {
        this.HasChargeOperation = HasChargeOperation;
    }

    /**
     * Get Whether there is permission to display the VPC information. Valid values: 1 (yes), 2 (no). 
     * @return HasVpcDisplay Whether there is permission to display the VPC information. Valid values: 1 (yes), 2 (no).
     */
    public Long getHasVpcDisplay() {
        return this.HasVpcDisplay;
    }

    /**
     * Set Whether there is permission to display the VPC information. Valid values: 1 (yes), 2 (no).
     * @param HasVpcDisplay Whether there is permission to display the VPC information. Valid values: 1 (yes), 2 (no).
     */
    public void setHasVpcDisplay(Long HasVpcDisplay) {
        this.HasVpcDisplay = HasVpcDisplay;
    }

    /**
     * Get Whether there is permission to change the Grafana status. Valid values: 1 (yes), 2 (no). 
     * @return HasGrafanaStatusChange Whether there is permission to change the Grafana status. Valid values: 1 (yes), 2 (no).
     */
    public Long getHasGrafanaStatusChange() {
        return this.HasGrafanaStatusChange;
    }

    /**
     * Set Whether there is permission to change the Grafana status. Valid values: 1 (yes), 2 (no).
     * @param HasGrafanaStatusChange Whether there is permission to change the Grafana status. Valid values: 1 (yes), 2 (no).
     */
    public void setHasGrafanaStatusChange(Long HasGrafanaStatusChange) {
        this.HasGrafanaStatusChange = HasGrafanaStatusChange;
    }

    /**
     * Get Whether there is permission to manage agents. Valid values: 1 (yes), 2 (no). 
     * @return HasAgentManage Whether there is permission to manage agents. Valid values: 1 (yes), 2 (no).
     */
    public Long getHasAgentManage() {
        return this.HasAgentManage;
    }

    /**
     * Set Whether there is permission to manage agents. Valid values: 1 (yes), 2 (no).
     * @param HasAgentManage Whether there is permission to manage agents. Valid values: 1 (yes), 2 (no).
     */
    public void setHasAgentManage(Long HasAgentManage) {
        this.HasAgentManage = HasAgentManage;
    }

    /**
     * Get Whether there is permission to manage TKE integrations. Valid values: 1 (yes), 2 (no). 
     * @return HasTkeManage Whether there is permission to manage TKE integrations. Valid values: 1 (yes), 2 (no).
     */
    public Long getHasTkeManage() {
        return this.HasTkeManage;
    }

    /**
     * Set Whether there is permission to manage TKE integrations. Valid values: 1 (yes), 2 (no).
     * @param HasTkeManage Whether there is permission to manage TKE integrations. Valid values: 1 (yes), 2 (no).
     */
    public void setHasTkeManage(Long HasTkeManage) {
        this.HasTkeManage = HasTkeManage;
    }

    /**
     * Get Whether there is permission to display the API information. Valid values: 1 (yes), 2 (no). 
     * @return HasApiOperation Whether there is permission to display the API information. Valid values: 1 (yes), 2 (no).
     */
    public Long getHasApiOperation() {
        return this.HasApiOperation;
    }

    /**
     * Set Whether there is permission to display the API information. Valid values: 1 (yes), 2 (no).
     * @param HasApiOperation Whether there is permission to display the API information. Valid values: 1 (yes), 2 (no).
     */
    public void setHasApiOperation(Long HasApiOperation) {
        this.HasApiOperation = HasApiOperation;
    }

    public PrometheusInstanceGrantInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceGrantInfo(PrometheusInstanceGrantInfo source) {
        if (source.HasChargeOperation != null) {
            this.HasChargeOperation = new Long(source.HasChargeOperation);
        }
        if (source.HasVpcDisplay != null) {
            this.HasVpcDisplay = new Long(source.HasVpcDisplay);
        }
        if (source.HasGrafanaStatusChange != null) {
            this.HasGrafanaStatusChange = new Long(source.HasGrafanaStatusChange);
        }
        if (source.HasAgentManage != null) {
            this.HasAgentManage = new Long(source.HasAgentManage);
        }
        if (source.HasTkeManage != null) {
            this.HasTkeManage = new Long(source.HasTkeManage);
        }
        if (source.HasApiOperation != null) {
            this.HasApiOperation = new Long(source.HasApiOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasChargeOperation", this.HasChargeOperation);
        this.setParamSimple(map, prefix + "HasVpcDisplay", this.HasVpcDisplay);
        this.setParamSimple(map, prefix + "HasGrafanaStatusChange", this.HasGrafanaStatusChange);
        this.setParamSimple(map, prefix + "HasAgentManage", this.HasAgentManage);
        this.setParamSimple(map, prefix + "HasTkeManage", this.HasTkeManage);
        this.setParamSimple(map, prefix + "HasApiOperation", this.HasApiOperation);

    }
}

