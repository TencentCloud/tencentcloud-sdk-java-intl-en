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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeResourceAdvanceParams extends AbstractModel {

    /**
    * Node label array.
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * Node taint.
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * Base64-encoded user script: executed before node initializing.
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
    * Base64-encoded user script. This script executes after Kubernetes components initialize. Users should ensure script reentrancy and implement retry logic. Both the script and its generated log files are accessible at the node path: /data/ccs_userscript/.
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
     * Get Node label array. 
     * @return Labels Node label array.
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Node label array.
     * @param Labels Node label array.
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Node taint. 
     * @return Taints Node taint.
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Node taint.
     * @param Taints Node taint.
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get Base64-encoded user script: executed before node initializing. 
     * @return PreStartUserScript Base64-encoded user script: executed before node initializing.
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set Base64-encoded user script: executed before node initializing.
     * @param PreStartUserScript Base64-encoded user script: executed before node initializing.
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    /**
     * Get Base64-encoded user script. This script executes after Kubernetes components initialize. Users should ensure script reentrancy and implement retry logic. Both the script and its generated log files are accessible at the node path: /data/ccs_userscript/. 
     * @return UserScript Base64-encoded user script. This script executes after Kubernetes components initialize. Users should ensure script reentrancy and implement retry logic. Both the script and its generated log files are accessible at the node path: /data/ccs_userscript/.
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set Base64-encoded user script. This script executes after Kubernetes components initialize. Users should ensure script reentrancy and implement retry logic. Both the script and its generated log files are accessible at the node path: /data/ccs_userscript/.
     * @param UserScript Base64-encoded user script. This script executes after Kubernetes components initialize. Users should ensure script reentrancy and implement retry logic. Both the script and its generated log files are accessible at the node path: /data/ccs_userscript/.
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    public ComputeResourceAdvanceParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeResourceAdvanceParams(ComputeResourceAdvanceParams source) {
        if (source.Labels != null) {
            this.Labels = new TkeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TkeLabel(source.Labels[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);

    }
}

