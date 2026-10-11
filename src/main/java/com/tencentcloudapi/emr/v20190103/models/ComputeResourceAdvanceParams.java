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
    * <p>Node Label array.</p>
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * <p>Node taint.</p>
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>Base64-encoded user script, which is executed before node initialization.</p>
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
    * <p>Base64-encoded user script, which is executed after the Kubernetes component starts. You need to guarantee the script reentrancy and retry logic. The script and generated log files can be viewed in the /data/ccs_userscript/ directory on the node.</p>
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * <p>Node group ID.</p>
    */
    @SerializedName("TkeClusterNodePool")
    @Expose
    private String TkeClusterNodePool;

    /**
    * <p>Mode of joining a node pool.</p><p>Enumeration values:</p><ul><li>Inherit: inherits the configuration from the node pool.</li><li>OnlyJoin: joins the node pool only without inheriting the configuration.</li></ul><p>Default value: Inherit.</p>
    */
    @SerializedName("NodePoolJoinMode")
    @Expose
    private String NodePoolJoinMode;

    /**
     * Get <p>Node Label array.</p> 
     * @return Labels <p>Node Label array.</p>
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Node Label array.</p>
     * @param Labels <p>Node Label array.</p>
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Node taint.</p> 
     * @return Taints <p>Node taint.</p>
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>Node taint.</p>
     * @param Taints <p>Node taint.</p>
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>Base64-encoded user script, which is executed before node initialization.</p> 
     * @return PreStartUserScript <p>Base64-encoded user script, which is executed before node initialization.</p>
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set <p>Base64-encoded user script, which is executed before node initialization.</p>
     * @param PreStartUserScript <p>Base64-encoded user script, which is executed before node initialization.</p>
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    /**
     * Get <p>Base64-encoded user script, which is executed after the Kubernetes component starts. You need to guarantee the script reentrancy and retry logic. The script and generated log files can be viewed in the /data/ccs_userscript/ directory on the node.</p> 
     * @return UserScript <p>Base64-encoded user script, which is executed after the Kubernetes component starts. You need to guarantee the script reentrancy and retry logic. The script and generated log files can be viewed in the /data/ccs_userscript/ directory on the node.</p>
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set <p>Base64-encoded user script, which is executed after the Kubernetes component starts. You need to guarantee the script reentrancy and retry logic. The script and generated log files can be viewed in the /data/ccs_userscript/ directory on the node.</p>
     * @param UserScript <p>Base64-encoded user script, which is executed after the Kubernetes component starts. You need to guarantee the script reentrancy and retry logic. The script and generated log files can be viewed in the /data/ccs_userscript/ directory on the node.</p>
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get <p>Node group ID.</p> 
     * @return TkeClusterNodePool <p>Node group ID.</p>
     */
    public String getTkeClusterNodePool() {
        return this.TkeClusterNodePool;
    }

    /**
     * Set <p>Node group ID.</p>
     * @param TkeClusterNodePool <p>Node group ID.</p>
     */
    public void setTkeClusterNodePool(String TkeClusterNodePool) {
        this.TkeClusterNodePool = TkeClusterNodePool;
    }

    /**
     * Get <p>Mode of joining a node pool.</p><p>Enumeration values:</p><ul><li>Inherit: inherits the configuration from the node pool.</li><li>OnlyJoin: joins the node pool only without inheriting the configuration.</li></ul><p>Default value: Inherit.</p> 
     * @return NodePoolJoinMode <p>Mode of joining a node pool.</p><p>Enumeration values:</p><ul><li>Inherit: inherits the configuration from the node pool.</li><li>OnlyJoin: joins the node pool only without inheriting the configuration.</li></ul><p>Default value: Inherit.</p>
     */
    public String getNodePoolJoinMode() {
        return this.NodePoolJoinMode;
    }

    /**
     * Set <p>Mode of joining a node pool.</p><p>Enumeration values:</p><ul><li>Inherit: inherits the configuration from the node pool.</li><li>OnlyJoin: joins the node pool only without inheriting the configuration.</li></ul><p>Default value: Inherit.</p>
     * @param NodePoolJoinMode <p>Mode of joining a node pool.</p><p>Enumeration values:</p><ul><li>Inherit: inherits the configuration from the node pool.</li><li>OnlyJoin: joins the node pool only without inheriting the configuration.</li></ul><p>Default value: Inherit.</p>
     */
    public void setNodePoolJoinMode(String NodePoolJoinMode) {
        this.NodePoolJoinMode = NodePoolJoinMode;
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
        if (source.TkeClusterNodePool != null) {
            this.TkeClusterNodePool = new String(source.TkeClusterNodePool);
        }
        if (source.NodePoolJoinMode != null) {
            this.NodePoolJoinMode = new String(source.NodePoolJoinMode);
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
        this.setParamSimple(map, prefix + "TkeClusterNodePool", this.TkeClusterNodePool);
        this.setParamSimple(map, prefix + "NodePoolJoinMode", this.NodePoolJoinMode);

    }
}

